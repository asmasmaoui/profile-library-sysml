/*****************************************************************************
 * Copyright (c) 2023 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Asma Smaoui (CEA LIST) asma.smaoui@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package com.cea.afpvn.arrowhead.transformations;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.uml.m2m.qvto.common.Activator;
import org.eclipse.papyrus.uml.m2m.qvto.common.MigrationParameters.ThreadConfig;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.AbstractImportTransformationLauncher;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.IDependencyAnalysisHelper;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.IImportTransformation;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * The launcher of the SysML migration.
 */
public class Sysml2fromSysml1TransformationLauncher extends AbstractImportTransformationLauncher {


	public IResource project =null;
	/**
	 * Constructor.
	 *
	 * @param config
	 *            The thread config.
	 * @param baseControl
	 *            The base control.
	 * @param project 
	 */
	public Sysml2fromSysml1TransformationLauncher(final ThreadConfig config, final Control baseControl, IResource project) {
		super(null, baseControl);
		this.project=project;
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.migration.common.transformation.AbstractImportTransformationLauncher#createDependencyAnalysisHelper(org.eclipse.papyrus.migration.common.MigrationParameters.ThreadConfig)
	 */
	@Override
	protected IDependencyAnalysisHelper createDependencyAnalysisHelper(final ThreadConfig config) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.migration.common.transformation.AbstractImportTransformationLauncher#createTransformation(org.eclipse.emf.common.util.URI, org.eclipse.papyrus.migration.common.MigrationParameters.ThreadConfig,
	 *      org.eclipse.papyrus.migration.common.transformation.IDependencyAnalysisHelper)
	 */
	@Override
	protected IImportTransformation createTransformation(final URI transformationURI, final ThreadConfig config, final IDependencyAnalysisHelper analysisHelper) {
		return new Sysml2FromSysml1Transformation(transformationURI, null, analysisHelper,project);
	}
	
	/**
	 * Executes the transformation (Asynchronous)
	 *
	 * @param urisToImport
	 * @param project 
	 */
	public void run(List<URI> urisToImport, IResource project) {
		List<IImportTransformation> transformations = new LinkedList<IImportTransformation>();

		analysisHelper = createDependencyAnalysisHelper(config);

		for (URI uri : urisToImport) {
			IImportTransformation transformation = createTransformation(uri, config, analysisHelper);
			transformations.add(transformation);
		}

		// Always use the batch launcher, even if there is only 1 transformation (Bug 455012)
		importModels(transformations);
	}
	/**
	 * Start a Job and delegate to {@link #importModels(IProgressMonitor, List)}
	 *
	 * @param transformations
	 * @param  
	 */
	@Override
	protected void importModels(final List<IImportTransformation> transformations) {
		importDependenciesJob = new Job(IMPORT_MODELS_JOB_NAME) {

			
			protected IStatus run(IProgressMonitor monitor) {
				IStatus result = importModels(monitor, transformations);

				if (monitor.isCanceled()) {
					return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Operation Canceled");
				}

				long cumulatedLoadingTime = 0L;
				long cumulatedTransformationTime = 0L;
				long cumulatedHandleDanglingTime = 0L;
				long cumulatedImportExtensionsTime = 0L;
				for (IImportTransformation transformation : transformations) {
					cumulatedLoadingTime += transformation.getLoadingTime();
					cumulatedImportExtensionsTime += transformation.getImportExtensionsTime();
					cumulatedHandleDanglingTime += transformation.getHandleDanglingRefTime();

					cumulatedTransformationTime += transformation.getExecutionTime();

					log("Import " + transformation.getModelName());
					log("First phase (0-50%):");
					log("\tTotal loading time: " + timeFormat(transformation.getLoadingTime()));
					log("\tTotal Import Extensions time: " + timeFormat(transformation.getImportExtensionsTime()));
					log("\tTotal Handle Dangling References time: " + timeFormat(transformation.getHandleDanglingRefTime()));
					log("\tTotal execution time: " + timeFormat(transformation.getExecutionTime()));

					Long loadingTime = loadingTimeV2.get(transformation);
					Long repairProxiesTime = proxiesTime.get(transformation);
					Long repairStereoTime = stereoTime.get(transformation);
					Long totalPhase2 = totalTimeV2.get(transformation);

					log("Second phase (50-100%):");
					log("\tTotal loading time: " + timeFormat(loadingTime));
					log("\tTotal fix proxies time: " + timeFormat(repairProxiesTime));
					log("\tTotal fix stereotypes time: " + timeFormat(repairStereoTime));
					log("\tTotal execution time: " + timeFormat(totalPhase2));

					log("Total");
					log("\tTotal execution time: " + timeFormat(transformation.getExecutionTime() + (totalPhase2 == null ? 0 : totalPhase2)));
					log("\n");
				}

				int nbThreads = config !=null ? Math.max(1, config.getMaxThreads()): 1;
				
				log("First phase (0-50%) / " + nbThreads + " Threads");
				log("\tCumulated Transformation Time: " + timeFormat(cumulatedTransformationTime));
				log("\tCumulated Loading Time: " + timeFormat(cumulatedLoadingTime));
				log("\tCumulated Handle Dangling Refs Time: " + timeFormat(cumulatedHandleDanglingTime));
				log("\tCumulated Import Extensions Time: " + timeFormat(cumulatedImportExtensionsTime));
				log("\tTotal Transformation Time: " + timeFormat(transformationsExecutionTime));

				log("Second phase (50-100%) / " + nbThreads + " Threads");
				log("\tTotal Handle all Dangling References: " + timeFormat(resolveAllDependencies));
				log("\tCumulated Loading Time: " + timeFormat(ownLoadingTime));
				log("\tCumulated Fix Libraries Time: " + timeFormat(ownRepairLibrariesTime));
				log("\tCumulated Fix Stereotypes Time: " + timeFormat(ownRepairStereotypesTime));
				log("\tTotal Fix Dependencies Time: " + timeFormat(ownExecutionTime));

				log("Total");
				log("\tCumulated Total time: " + timeFormat(ownExecutionTime + cumulatedTransformationTime));
				log("\tTotal time: " + timeFormat(ownExecutionTime + transformationsExecutionTime));

				log("Import Complete");
				log("");

				return result;
			}

		};

		importDependenciesJob.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event) {

				MultiStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID, IStatus.OK, "", null);

				multiStatus.merge(event.getResult());


				int severity = multiStatus.getSeverity();
				String message;

				switch (severity) {
				case IStatus.OK:
					message = "The selected models have been successfully imported";
					break;
				case IStatus.CANCEL:
					message = "Operation canceled";
					break;
				case IStatus.WARNING:
					message = "The selected models have been imported; some warnings have been reported";
					break;
				default:
					message = "Some errors occurred during model import";
					break;
				}


				handle(new MultiStatus(Activator.PLUGIN_ID, severity, multiStatus.getChildren(), message, null));
			}

			protected void handle(final IStatus status) {
				if (baseControl == null) {
					int severity = status.getSeverity();
					if (severity == IStatus.OK || severity == IStatus.CANCEL) {
						return;
					}

					StatusManager.getManager().handle(status, StatusManager.LOG);
					return;
				}

				Display display = baseControl.getDisplay();

				if (status.getSeverity() == IStatus.OK) {
					display.asyncExec(new Runnable() {

						@Override
						public void run() {
							//MessageDialog.openInformation(baseControl.getShell(), "Import models", status.getMessage());
						}
					});

				} else if (status.getSeverity() == IStatus.CANCEL) {
					display.asyncExec(new Runnable() {

						@Override
						public void run() {
							//MessageDialog.openInformation(baseControl.getShell(), "Import models", status.getMessage());
						}
					});
				} else {
					//StatusManager.getManager().handle(status, StatusManager.BLOCK);
				}
			}
		});

		importDependenciesJob.setUser(true);
		importDependenciesJob.schedule();
	}
	
	@Override
	protected IStatus importModels(IProgressMonitor monitor, List<IImportTransformation> transformations) {

		long begin = System.nanoTime();

		monitor.setTaskName("Waiting for import tasks to complete...");
		int numTasks = transformations.size() * 2; // For each transformation: wait for completion, then handle dependencies
		monitor.beginTask("Importing Models...", numTasks);

		for (IImportTransformation transformation : transformations) {
			transformation.run(true);
		}

		long end = System.nanoTime();
		transformationsExecutionTime = end - begin;

		if (monitor.isCanceled()) {
			return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Operation canceled");
		}

		handleModelDependencies(transformations, monitor);

		return Status.OK_STATUS;
	}

}
