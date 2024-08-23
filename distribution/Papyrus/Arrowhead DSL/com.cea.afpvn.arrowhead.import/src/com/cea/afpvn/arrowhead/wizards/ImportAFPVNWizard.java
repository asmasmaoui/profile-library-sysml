package com.cea.afpvn.arrowhead.wizards;
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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Asma Smaoui (CEA LIST) asma.smaoui@cea.fr - adapt for import Project
 *
 *****************************************************************************/


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.File;
import com.google.common.io.Files;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.uml.diagram.wizards.Activator;
import org.eclipse.papyrus.uml.diagram.wizards.pages.NewModelWizardData;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectArchitectureContextPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectStorageProviderPage;
import org.eclipse.papyrus.uml.diagram.wizards.providers.INewModelStorageProvider;
import org.eclipse.papyrus.uml.diagram.wizards.providers.NewModelStorageProviderRegistry;
import org.eclipse.papyrus.uml.diagram.wizards.providers.WorkspaceNewModelStorageProvider;
import org.eclipse.papyrus.uml.diagram.wizards.wizards.CreateModelWizard;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FileSystemElement;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.wizards.datatransfer.WizardFileSystemResourceImportPage1;
import org.eclipse.ui.services.IEvaluationService;

/**
 * Create new model file and initialize a selected diagram. This wizard create
 * several files :
 * <li>*.di : the DI file to store Di diagrams and references all external
 * diagrams like GMF diagrams.</li>
 * <li>*.notation : the file to store pure GMF diagrams</li>
 * <li>*.uml : the standard UML file to store UML semantics elements. (Model,
 * Package, Class,...)</li>
 *
 * Those files can be used with the PapyrusEditor (see plugin.xml).
 */
public class ImportAFPVNWizard extends CreateModelWizard  implements INewWizard {

	/** The Constant WIZARD_ID. */
	public static final String WIZARD_ID = "org.eclipse.papyrus.uml.diagram.wizards.createmodel"; //$NON-NLS-1$

	/** The Constant NEW_MODEL_SETTINGS. */
	public static final String NEW_MODEL_SETTINGS = "NewModelWizard"; //$NON-NLS-1$

	private SelectStorageProviderPage selectStorageProviderPage;

	/** Select kind of new diagram the wizard must create. */
	private SelectRepresentationKindPage selectRepresentationKindPage;

	/**
	 * The select architecture context page.
	 *
	 * @since 3.0
	 */
	protected SelectArchitectureContextPage selectArchitectureContextPage;

	/** Current workbench. */
	private IWorkbench workbench;

	private NewModelStorageProviderRegistry storageProviderRegistry;

	private INewModelStorageProvider selectedStorageProvider;

	private Map<INewModelStorageProvider, List<IWizardPage>> providerPages = new java.util.HashMap<>();

	private Map<IWizardPage, INewModelStorageProvider> providersByPage = new java.util.HashMap<>();

	private int startProviderPageIndex; // index of last page before provider pages

	private int endProviderPageIndex; // index of first page after provider pages

	protected IWizardPage newProjectPage;
	


	//private final NewModelWizardData wizardData = new NewModelWizardData();

	//protected static final String EXTENSION_POINT_ID = "org.eclipse.papyrus.uml.diagram.wizards.templates"; //$NON-NLS-1$

	private ImportFilePage importPage;

	private IProject project;
	private IFile file;
	private IStructuredSelection selection;

	private static final String[] allowedFiles = new String[] { "*.uml" }; /// IK which files types we have to allowed 
	/**
	 * Boolean to determinate if the dialog must be opened during the process.
	 */

	private IPath projectPath = null;

	/**
	 * Adds the pages.
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {

		addPageIfNotNull(selectStorageProviderPage);
		//addPageIfNotNull(newProjectPage);

		startProviderPageIndex = getPageCount();
		for (INewModelStorageProvider next : getStorageProviders()) {
			List<IWizardPage> pageList = new java.util.ArrayList<>(3);
			for (IWizardPage page : next.createPages()) {
				if (page != null) {
					pageList.add(page);
					providersByPage.put(page, next);
					page.setDescription("Choise the project for Sysml2 transformation");
					if (!page.equals(getSelectedStorageProvider().getArchitectureContextPage())) {
						addPage(page);
					}
				}
			}
			providerPages.put(next, pageList);
		}
		endProviderPageIndex = getPageCount();

		

		projectPath = project.getFullPath();
	
		this.importPage = new ImportFilePage(workbench, selection, allowedFiles, projectPath);
		addPage(this.importPage);
	}

	protected void setNewProjectPage(IWizardPage page) {
	this.newProjectPage = page;
	}

	public boolean isInitModelWizard() {
		return false;
	}

	public boolean isCreateProjectWizard() {
		return false;
	}

	public boolean isCreateMultipleModelsWizard() {
		return false;
	}

	/**
	 * Inits the.
	 *
	 * @param workbench the workbench
	 * @param selection the selection {@inheritDoc}
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;

		this.selection = selection;
		initStorageProvider(workbench, selection);
		setWindowTitle("New Import for transformation"); 
		
		

		IDialogSettings workbenchSettings = Activator.getDefault().getDialogSettings();
		
				try {
					project = createNewProject();
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	/**
	 * Perform finish.
	 *
	 * @return true, if successful {@inheritDoc}
	 */
	@SuppressWarnings("restriction")
	@Override
	public boolean performFinish() {
		
		/////// IK
		/*
		WizardFileSystemResourceImportAFPVN pageInformation =new WizardFileSystemResourceImportAFPVN(DEFAULT_IMAGE, selection);
		Iterator<IResource> resourcesEnum = pageInformation.getSelectedResourcesAfpvn().iterator();
		List<IResource> fileSystemObjects = new ArrayList<IResource>();
		while (resourcesEnum.hasNext()) {
			fileSystemObjects.add((IResource) ((FileSystemElement) resourcesEnum.next())
					.getFileSystemObject());
			
			System.out.println(fileSystemObjects.toString());
		}
		*///
				importPage.finish();// import the UML file // IK
				
		//////		
				
				
				ImportSysml2Handler importer = new ImportSysml2Handler();
				
				try {
					((ImportSysml2Handler) importer).execute(project);
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		return true;

	}

	

	/**
	 * Gets the selected diagram kind descriptors.
	 *
	 * @return the selected diagram kind descriptors
	 */
	protected RepresentationKind[] getSelectedRepresentationKinds() {
		RepresentationKind[] result = new RepresentationKind[0];
		return result;
	}

	
	

	/**
	 * Creates the select architecture context page.
	 *
	 * @return the select architecture context page
	 * @since 3.0
	 */
	protected SelectArchitectureContextPage createSelectArchitectureContextPage() {
		return new SelectArchitectureContextPage();
	}

	

	
	protected IEditorInput createEditorInput(URI uri) {
		return getSelectedStorageProvider().createEditorInput(uri);
	}
	protected void initStorageProvider(IWorkbench workbench, IStructuredSelection selection) {

		NewModelStorageProviderRegistry registry = new NewModelStorageProviderRegistry(
				workbench.getService(IEvaluationService.class));

		// if we are creating a project, then it is in the workspace
		if (isCreateProjectWizard()) {
			setSelectedStorageProvider(new WorkspaceNewModelStorageProvider());
		} else {
			// look for a pre-determined selection
			INewModelStorageProvider firstProvider = null;
			for (INewModelStorageProvider next : registry) {
				if (firstProvider == null) {
					firstProvider = next;
				}

				// don't match on empty selections because there is
				// then no context to match against
				if (!selection.isEmpty() && next.canHandle(selection)) {
					setSelectedStorageProvider(next);
					break;
				}
			}

			// if the choice is pre-determined, don't show the selection page
			if (getSelectedStorageProvider() == null) {
				setSelectedStorageProvider(firstProvider);

				// don't need the selection page if only one choice
				if (registry.size() > 1) {
					this.storageProviderRegistry = registry;
				}
			}
		}
	}

	protected SelectStorageProviderPage createSelectStorageProviderPage() {
		SelectStorageProviderPage result = (storageProviderRegistry == null) ? null
				: new SelectStorageProviderPage(storageProviderRegistry);

		if (result != null) {
			result.addSelectionChangedListener(new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					INewModelStorageProvider provider = (INewModelStorageProvider) ((IStructuredSelection) event
							.getSelection()).getFirstElement();
					setSelectedStorageProvider(provider);
				}
			});
		}

		return result;
	}

	protected Iterable<? extends INewModelStorageProvider> getStorageProviders() {
		Iterable<? extends INewModelStorageProvider> result;

		if (storageProviderRegistry != null) {
			result = storageProviderRegistry;
		} else if (getSelectedStorageProvider() != null) {
			result = Collections.singletonList(getSelectedStorageProvider());
		} else {
			result = Collections.emptyList();
		}

		return result;
	}

	protected INewModelStorageProvider getSelectedStorageProvider() {
		return selectedStorageProvider;
	}

	/**
	 * Set what is the storage {@code provider} selected implicitly or explicitly by
	 * the user.
	 *
	 * @param provider the selected storage provider
	 * @since 3.2
	 */
	protected void setSelectedStorageProvider(INewModelStorageProvider provider) {
		this.selectedStorageProvider = provider;

		if (getContainer() != null) {
			// recompute next/previous buttons
			getContainer().updateButtons();
		}
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		final List<IWizardPage> allPages = Arrays.asList(getPages());
		IWizardPage result = null;

		INewModelStorageProvider provider = providersByPage.get(page);
		if (provider != null) {
			// it's contributed by a provider. Get the next in the list
			List<IWizardPage> pages = providerPages.get(provider);
			int index = pages.indexOf(page);
			if ((index >= 0) && (index < (pages.size() - 1))) {
				result = pages.get(index + 1);
			} else {
				// get the first page after the provider pages
				if (endProviderPageIndex < allPages.size()) {
					result = allPages.get(endProviderPageIndex);
				}
			}
		} else if (allPages.indexOf(page) == startProviderPageIndex) {
			// get the first page of the selected provider
			List<IWizardPage> pages = providerPages.get(getSelectedStorageProvider());
			if (!pages.isEmpty()) {
				result = pages.get(0);
			} else {
				// get the first page after the provider pages
				if (endProviderPageIndex < allPages.size()) {
					result = allPages.get(endProviderPageIndex);
				}
			}
		} else {
			// somewhere away from the boundary of the provider pages
			result = super.getNextPage(page);
		}

		return result;
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		final List<IWizardPage> allPages = Arrays.asList(getPages());
		IWizardPage result = null;

		INewModelStorageProvider provider = providersByPage.get(page);
		if (provider != null) {
			// it's contributed by a provider. Get the previous in the list
			List<IWizardPage> pages = providerPages.get(provider);
			int index = pages.indexOf(page);
			if (index > 1) {
				result = pages.get(index - 1);
			} else {
				// get the last page before the provider pages
				if (startProviderPageIndex > 1) {
					result = allPages.get(startProviderPageIndex - 1);
				}
			}
		} else if (allPages.indexOf(page) == endProviderPageIndex) {
			// get the last page of the selected provider
			List<IWizardPage> pages = providerPages.get(getSelectedStorageProvider());
			if (!pages.isEmpty()) {
				result = pages.get(pages.size() - 1);
			} else {
				// get the last page before the provider pages
				if (startProviderPageIndex >= 0) {
					result = allPages.get(startProviderPageIndex);
				}
			}
		} else {
			// somewhere away from the boundary of the provider pages
			result = super.getPreviousPage(page);
		}

		return result;
	}

	@Override
	public boolean canFinish() {
		boolean result = true;
		final IWizardPage[] allPages = getPages();

		// only look at the universal pages and those contributed by the current
		// storage provider

		for (int i = 0; result && (i <= startProviderPageIndex); i++) {
			result = allPages[i].isPageComplete();
		}

		if (result) {
			for (IWizardPage next : providerPages.get(getSelectedStorageProvider())) {
				if (!next.isPageComplete()) {
					result = false;
					break;
				}
			}
		}

		for (int i = endProviderPageIndex; result && (i < allPages.length); i++) {
			result = allPages[i].isPageComplete();
		}

		return result;
	}

	
	protected <P extends IWizardPage> P getPage(Class<P> type) {
		for (IWizardPage next : getPages()) {
			if (type.isInstance(next)) {
				return type.cast(next);
			}
		}
		return null;
	}


	protected IProject createNewProject() throws CoreException {
		// get a project handle

		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("Sysml2Project");
		IProjectDescription projectDescription = null;
		NullProgressMonitor progressMonitor = new NullProgressMonitor();
		// get a project descriptor
		if (!project.exists()) {
			projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription("Sysml2Project");
			project.create(projectDescription, new SubProgressMonitor(progressMonitor, 1));
			project.open(new SubProgressMonitor(progressMonitor, 1));
		} else {
			project.open(new SubProgressMonitor(progressMonitor, 1));
		}
		/* to check the nature of the project and modify it according to needs. */
		 try {
			   if (!project.hasNature("org.eclipse.xtext.ui.shared.xtextNature")) {
			      IProjectDescription description = project.getDescription();
			      description.setNatureIds(new String[] { "org.eclipse.xtext.ui.shared.xtextNature" });
			      project.setDescription(description, null);
			      
			   }
			 } catch (CoreException e) {
			   e.printStackTrace();
		         }
		
		 
		return project;
	}
	/// save file into project//
	
	public static void saveInProject(IProject project,String fileName) {
		if( project!=null) {
			//String fileNameWithoutExtension = fileName.substring(1, fileName.lastIndexOf('.'));
			//String fileNameWithoutExtension = FilenameUtils.removeExtension(fileName);
			String fileNameWithoutExtension = Files.getNameWithoutExtension(fileName);
			IFile file = project.getFile("Sysml2"+fileNameWithoutExtension+".sysml");
			File myfile = new File(file.getLocationURI());

			generateFile(myfile, project);

			try {
				project.refreshLocal(0, new NullProgressMonitor());
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
		}
	}
	////file creation///
	private static void generateFile(File file, IProject project) {

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			project.refreshLocal(IResource.DEPTH_ONE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
