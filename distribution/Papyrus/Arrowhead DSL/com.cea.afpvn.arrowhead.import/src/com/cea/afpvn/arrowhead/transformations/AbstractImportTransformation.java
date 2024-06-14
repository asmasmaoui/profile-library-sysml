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
 * Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 * Asma Smaoui (CEA LIST) asma.smaoui@cea.fr - update for Java Transformation
 *
 *****************************************************************************/
package com.cea.afpvn.arrowhead.transformations;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.m2m.qvto.common.Activator;
import org.eclipse.papyrus.uml.m2m.qvto.common.MigrationParameters.MigrationParametersFactory;
import org.eclipse.papyrus.uml.m2m.qvto.common.MigrationParameters.ThreadConfig;
import org.eclipse.papyrus.uml.m2m.qvto.common.concurrent.ExecutorsPool;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.IDependencyAnalysisHelper;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.IImportTransformation;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.MigrationResourceSet;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.MigrationResourceSetImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Executes a single import-to-Papyrus transformation
 *
 *
 */
public abstract class AbstractImportTransformation implements IImportTransformation {
	/** For debug purpose */
	protected static boolean DEBUG = true;

	// SourceURI is the input
	protected final URI sourceURI;

	// targetURI is computed during the transformation
	protected URI targetURI;

	protected URI outUML, outNotation, outSashModel, inPapyrusProfiles;

	protected MigrationResourceSet resourceSet;

	protected Job job;

	protected ThreadConfig parameters;

	protected boolean complete = false;

	
	/** Execution time, in nano-seconds */
	protected long executionTime = 0L;

	/** Execution time of the initial model loading / ns */
	protected long loadingTime = 0L;

	/** Execution time for handling dangling references / ns */
	protected long danglingRefTime = 0L;

	/** Execution time for executing the transformation / ns */
	protected long importExtensionsTime = 0L;

	/** Source URI to Target URI map (For Models/Libraries/Fragments) */
	protected final Map<URI, URI> uriMappings = new HashMap<>();

	/** Source URI to Target URI map (For Profiles) */
	protected final Map<URI, URI> profileURIMappings = new HashMap<>();

	protected List<Diagram> diagramsToDelete = new LinkedList<>();

	protected static final ExecutorsPool executorsPool = new ExecutorsPool(2);

	
	/**
	 * EPackages corresponding to source native profiles with specific support in
	 * the transformation
	 */
	protected static final Set<EPackage> sourceEPackages = new HashSet<>();

	protected final IDependencyAnalysisHelper analysisHelper;

	/** Accumulation of incremental update traces from each transformation. */

	public AbstractImportTransformation(URI sourceURI) {
		this(sourceURI, MigrationParametersFactory.eINSTANCE.createThreadConfig(), null);
	}

	public AbstractImportTransformation(URI sourceURI, ThreadConfig config, IDependencyAnalysisHelper analysisHelper) {
		Assert.isNotNull(sourceURI);
		this.sourceURI = sourceURI;
		this.parameters = config;
		this.analysisHelper = analysisHelper;
		
	}

	

	/**
	 * Executes the transformation
	 *
	 * The transformation will be executed asynchronously in a Job
	 */
	public void run(final boolean isUserJob) {

		job = new Job("Import du .uml") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				long begin = System.nanoTime();
				IStatus result = AbstractImportTransformation.this.run(monitor);
				long end = System.nanoTime();
				executionTime = end - begin;
				return result;
			}
		};

		job.setUser(isUserJob);

		job.addJobChangeListener(new JobChangeAdapter() {

			@Override
			public void done(IJobChangeEvent event) {
				complete = true;
				if (isUserJob) {
					if (event.getResult().getSeverity() == IStatus.OK) {
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								MessageDialog.openInformation(
										PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), job.getName(),
										String.format("Model %s has been successfully imported", getModelName()));
							}
						});

					} else if (event.getResult().getSeverity() == IStatus.CANCEL) {
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								MessageDialog.openInformation(
										PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), job.getName(),
										String.format("Operation canceled: %s", getModelName()));
							}
						});
					} else {
						StatusManager.getManager().handle(event.getResult(), StatusManager.BLOCK);
					}
				}
			}

		});

		job.schedule();
	}

	public void waitForCompletion() {
		try {
			job.join();
		} catch (InterruptedException ex) {
			Activator.log.error(ex);
		}
	}

	public boolean isComplete() {
		return complete;
	}

	public IStatus getStatus() {
		if (job == null) { // If job hasn't been created, the operation has probably been canceled before
							// the transformation is ran
			return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Operation canceled");
		}
		return job.getResult();
	}

	public long getExecutionTime() {
		return executionTime;
	}

	public long getLoadingTime() {
		return loadingTime;
	}

	public long getHandleDanglingRefTime() {
		return danglingRefTime;
	}

	public long getImportExtensionsTime() {
		
		return importExtensionsTime;
	}

	public URI getTargetURI() {
		return targetURI;
	}

	/**
	 * Initializes the resource set, and resolve all dependencies
	 */
	protected void initResourceSet(IProgressMonitor monitor) {
		resourceSet = new MigrationResourceSetImpl();
		synchronized (UMLUtil.class) {
			UMLUtil.init(resourceSet);
		}
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, true);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.FALSE);

		monitor.subTask("Loading source model " + getModelName());

		try {
			File resourceFile = new File(sourceURI.toFileString());
			if (resourceFile.exists()) {
				resourceSet.getResource(sourceURI, true);
			}
			
		} catch (Exception ex) {
			Activator.log.error("An error occurred while loading " + getModelName(), ex);
		}
	}

	protected abstract int countSupportedElements(); // TODO

	protected static IStatus createStatusFromDiagnostic(Diagnostic diagnostic) {
		return new Status(diagnostic.getSeverity(), diagnostic.getSource(), diagnostic.getMessage(),
				diagnostic.getException());
	}

	/**
	 * Actually runs the transformation (in the current thread)
	 *
	 * @param monitor
	 * @return The transformation IStatus
	 */
	
	protected abstract IStatus run(final IProgressMonitor monitor);

	public static MultiStatus aggregateStatus(List<IStatus> statuses) {
		return new MultiStatus(Activator.PLUGIN_ID, IStatus.OK, statuses.toArray(new IStatus[statuses.size()]), "",
				null);
	}

	/**
	 * @param resource
	 */
	protected void cleanMetadataAnnotations(Resource resource) {
		// Bug 471684: UML2.x to UML2.5 creates (invalid) Ecore Metadata EAnnotations,
		// which then cause OCL validation to fail
		// Remove these EAnnotations from the model to avoid side effects
		Iterator<EObject> rootElementsIterator = resource.getContents().iterator();
		while (rootElementsIterator.hasNext()) {
			EObject root = rootElementsIterator.next();
			if (root instanceof EAnnotation) {
				EAnnotation annotation = (EAnnotation) root;
				if (ExtendedMetaData.ANNOTATION_URI.equals(annotation.getSource())) {
					rootElementsIterator.remove();
				}
			}
		}
	}

	protected void handleDanglingURIs(Collection<Resource> resourcesToSave) {
		if (analysisHelper != null) {
			resourceSet.freeze();
			try {
				analysisHelper.computeURIMappings(resourcesToSave);
			} finally {
				resourceSet.unfreeze();
			}
		}
	}

	protected void unloadResourceSet(ResourceSet resourceSet) {
		EMFHelper.unload(resourceSet);
	}

	protected URI getInPapyrusProfiles() {
		if (inPapyrusProfiles == null) {
			loadInPapyrusProfiles();
		}

		return inPapyrusProfiles;
	}

	protected abstract Diagnostic loadInPapyrusProfiles(); // TODO : add path of profile are parameters ?

	protected void checkResource(Resource resource) {
		Assert.isNotNull(resource);
		Assert.isTrue(!resource.getContents().isEmpty(), "The resource " + resource.getURI() + " is empty");
		for (EObject rootElement : resource.getContents()) {
			Assert.isTrue(!rootElement.eIsProxy());
		}
	}

	protected abstract Resource createUMLResource(ResourceSet resourceSet, URI sourceResourceURI,
			URI targetResourceURI);

	protected void configureResource(XMIResource resource) {
		Map<Object, Object> saveOptions = new HashMap<>();

		// default save options.
		saveOptions.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");

		// see bug 397987: [Core][Save] The referenced plugin models are saved using
		// relative path
		saveOptions.put(XMLResource.OPTION_URI_HANDLER,
				new org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl.PlatformSchemeAware());

		resource.setEncoding("UTF-8");
		resource.getDefaultSaveOptions().putAll(saveOptions);
	}

	public abstract URI getInOutUMLModel();

	/*
	 * Notation model is initially empty, but will be filled successively by each
	 * transformation
	 */
	public URI getInoutNotationModel() {

		return outNotation;
	}

	protected URI getOutSashModel() {

		return outSashModel;
	}

	protected abstract Collection<URI> getDiagramTransformationURIs();

	protected abstract Collection<URI> getProfilesTransformationURI();

	public String getModelName() {
		return URI.decode(sourceURI.lastSegment());
	}

	public void cancel() {
		job.cancel();
	}

	

}
