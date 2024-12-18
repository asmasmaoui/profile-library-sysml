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

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.io.File;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.papyrus.uml.m2m.qvto.common.MigrationParameters.ThreadConfig;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.AbstractImportTransformation;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.IDependencyAnalysisHelper;
import org.eclipse.papyrus.uml.m2m.qvto.common.transformation.MigrationResourceSetImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

import com.cea.afpvn.arrowhead.wizards.ImportAFPVNWizard;
import com.cea.afpvn.arrowhead.xtend.Partdef;



public class Sysml2FromSysml1Transformation extends AbstractImportTransformation {

	protected URI sysmlResourceURI;
	protected Resource umlResource;
	protected String sysmlResourcestr;
	protected IResource project;

	/**
	 * Constructor.
	 *
	 * @param sourceURI      The source URI.
	 * @param config         The thread config.
	 * @param analysisHelper The analyses helper.
	 */
	public Sysml2FromSysml1Transformation(final URI sourceURI, final ThreadConfig config,
			final IDependencyAnalysisHelper analysisHelper) {
		super(sourceURI, config, analysisHelper);
		DEBUG = true;
	}

	/**
	 * Constructor.
	 *
	 * @param sourceURI The source URI.
	 */
	public Sysml2FromSysml1Transformation(final URI sourceURI) {
		super(sourceURI);
	}

	public Sysml2FromSysml1Transformation(final URI sourceURI, final ThreadConfig config,
			final IDependencyAnalysisHelper analysisHelper, IResource project) {
		super(sourceURI, config, analysisHelper);
		this.project = project;
		DEBUG = true;
	}

	/**
	 * 
	 * 
	 * /** {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.migration.common.transformation.AbstractImportTransformation#loadInPapyrusProfiles()
	 */
	@Override
	protected Diagnostic loadInPapyrusProfiles() {
		resourceSet.getResource(sourceURI.trimFileExtension().appendFileExtension(UMLResource.FILE_EXTENSION), true);
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.migration.common.transformation.AbstractImportTransformation#countSupportedElements()
	 */
	@Override
	protected int countSupportedElements() {
		return -1;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.migration.common.transformation.AbstractImportTransformation#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		//
		// INITIALIZATION / LOADING
		//

		monitor.subTask("Loading source model " + getModelName());

		long startLoad = System.nanoTime();

		// load the AASX input file and the UML output file

		initResourceSet(monitor);

		int numberOfElements = countSupportedElements();

		monitor.beginTask("Importing " + getModelName(), numberOfElements);
		monitor.subTask("Loading transformations (This may take a few seconds for the first import)...");

		String statusMessage = String.format("Import %s", getModelName());
		MultiStatus generationStatus = new MultiStatus("com.cea.afpvn.arrowhead.import", IStatus.OK, statusMessage, null);

		try {

			long endLoad = System.nanoTime();
			loadingTime = endLoad - startLoad;

			//
			// TRANSFORMATIONS
			//

			long startExtensions = System.nanoTime();

			long endExtensions = System.nanoTime();

			this.importExtensionsTime = endExtensions - startExtensions;

			monitor.subTask("Importing semantic model...");

			SysmtoSysml2 Sysml2= new SysmtoSysml2();
			
			// create the sysml resource
		   // ImportAFPVNWizard  addfile = new ImportAFPVNWizard();
			IFile umlFile = findFileRecursively(project, "uml");
		    //IFile sysmlFile= ImportAFPVNWizard.saveInProject((IProject) project, umlFile.getName());
		   
		    //  sysmlResource= resourceSet.createResource(URI.createPlatformResourceURI(sysmlFile.getFullPath().toString(), true));

			sysmlResourcestr = Sysml2.doTransformSysml1toSysml2(umlResource);
			
			generateFile("Sysml2"+umlFile.getName().replaceAll(".uml", ".sysml"), sysmlResourcestr);
			final Collection<Resource> resourcesToSave = new HashSet<>();
			//resourcesToSave.add(umlResource);

			// save resources

			try {

				//sysmlResource.save(null);
			} catch (Exception ex) {
				//Activator.log.error(ex);
				generationStatus
						.add(new Status(IStatus.ERROR, "com.cea.afpvn.arrowhead.import", "An exception occurred during save", ex));
			}

			long startExtensionsAfter = System.nanoTime();

			long endExtensionsAfter = System.nanoTime();
			this.importExtensionsTime += endExtensionsAfter - startExtensionsAfter;

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Do nothing
		}

		monitor.subTask("Releasing memory...");
		// unloadResourceSet(this.resourceSet);
		dispose();

		monitor.done();
		
		return generationStatus;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.migration.common.transformation.AbstractImportTransformation#getProfilesTransformationURI()
	 *      Only Usefull for QVTO transfo
	 */
	@Override
	protected Collection<URI> getProfilesTransformationURI() {
		return Collections.emptyList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.migration.common.transformation.AbstractImportTransformation#getInOutUMLModel()
	 */
	
	

	protected void configureResource(XMLResource resource) {
		Map<Object, Object> saveOptions = new HashMap<>();

		// default save options.

		saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		resource.setEncoding("UTF-8");
		resource.getDefaultSaveOptions().putAll(saveOptions);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.migration.common.transformation.AbstractImportTransformation#createUMLResource(org.eclipse.emf.ecore.resource.ResourceSet,
	 *      org.eclipse.emf.common.util.URI, org.eclipse.emf.common.util.URI) Not
	 *      usefull we already have the UML Resource
	 */
	@Override
	protected Resource createUMLResource(final ResourceSet resourceSet, final URI sourceResourceURI,
			final URI targetResourceURI) {
		return resourceSet.createResource(targetResourceURI, UMLResource.UML_5_0_0_CONTENT_TYPE_IDENTIFIER);
	}

	/**
	 * Initializes the resource set, and resolve all dependencies
	 */

	@Override
	protected void initResourceSet(IProgressMonitor monitor) {
		resourceSet = new MigrationResourceSetImpl();
		synchronized (UMLUtil.class) {
			UMLUtil.init(resourceSet);
		}
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, true);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.TRUE);
		monitor.subTask("Loading source model " + getModelName());
		
		try {

			umlResource = resourceSet.getResource(sourceURI, true);
			if (umlResource != null) {
				configureResource((XMLResource) umlResource);
				IFile umlFile = findFileRecursively(project, "uml");
				sysmlResourceURI = URI.createPlatformResourceURI(umlFile.getFullPath().toString(), true);
				//sysmlResource = resourceSet.getResource(sysmlResourceURI, true);
				//configureResource((XMLResource) sysmlResource);
			}
		} catch (Exception ex) {
			
		}
	}
		

	public IFile findFileRecursively(IResource container, String extention) throws CoreException {
		if (container != null && container instanceof IContainer) {

			for (IResource r : ((IContainer) container).members()) {
				if (r instanceof IFile && r.getFileExtension().equals("uml")) {
					return (IFile) r;
				}
			}
		}
		return null;
	}

	/**
	 * This allows to dispose the needed variables.
	 */
	protected void dispose() {

		umlResource = null;
		outUML = null;
		outNotation = null;
		inPapyrusProfiles = null;
		outSashModel = null;
		resourceSet = null;
		// Set the context of the QvTo to null

	}

	@Override
	protected Collection<URI> getDiagramTransformationURIs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected URI convertToPapyrus(URI arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Collection<URI> getAllTransformationURIs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<ModelExtent> getModelExtents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected URI getSemanticTransformationURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void initTransformationProperties(ExecutionContextImpl arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ModelExtent getInOutUMLModel() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void generateFile(String fileName, String content) {
		
		if (project instanceof IProject )
		{
		IPFileSystemAccess fileSystemAccess = FileSystemAccessFactory.create((IProject) project);
			// make sure, the file exists
			if (fileSystemAccess instanceof IFileExists) {
				if (!((IFileExists) fileSystemAccess).existsFile(fileName)) {
					fileSystemAccess.generateFile(fileName, "");
				}
			} else {
				fileSystemAccess.generateFile(fileName, "");
			}
			// now write formatted content
			fileSystemAccess.generateFile(fileName, content);
		} 
	}
	
}
