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


import static org.eclipse.papyrus.uml.diagram.wizards.Activator.log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.papyrus.infra.architecture.ArchitectureDescriptionUtils;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureContext;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureViewpoint;
import org.eclipse.papyrus.infra.core.log.LogHelper;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.SashModelUtils;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.ui.util.EditorUtils;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;
import org.eclipse.papyrus.uml.diagram.wizards.Activator;
import org.eclipse.papyrus.uml.diagram.wizards.command.NewPapyrusModelCommand;
import org.eclipse.papyrus.uml.diagram.wizards.pages.INewPapyrusModelPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.NewModelFilePage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.NewModelWizardData;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectArchitectureContextPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage.ContextProvider;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectStorageProviderPage;
import org.eclipse.papyrus.uml.diagram.wizards.providers.INewModelStorageProvider;
import org.eclipse.papyrus.uml.diagram.wizards.providers.NewModelStorageProviderRegistry;
import org.eclipse.papyrus.uml.diagram.wizards.providers.WorkspaceNewModelStorageProvider;
import org.eclipse.papyrus.uml.diagram.wizards.wizards.CreateModelWizard;
import org.eclipse.papyrus.uml.tools.commands.ApplyProfileCommand;
import org.eclipse.papyrus.uml.tools.commands.RenameElementCommand;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.services.IEvaluationService;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;

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
public class ImportAFPVNWizard extends CreateModelWizard implements INewWizard {

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

	private final NewModelWizardData wizardData = new NewModelWizardData();

	protected static final String EXTENSION_POINT_ID = "org.eclipse.papyrus.uml.diagram.wizards.templates"; //$NON-NLS-1$

	private ImportFilePage importPage;

	private IProject project;

	private IStructuredSelection selection;

	private static final String[] allowedFiles = new String[] { "*.sysml" };
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
		// ModelCreation: the selectDiagramCategoryPage exists
		if (getSelectedStorageProvider().getArchitectureContextPage() != null) {
			// addPageIfNotNull(getSelectedStorageProvider().getArchitectureContextPage());
		} else {
			// addPageIfNotNull(selectArchitectureContextPage);
		}

		// The selectStorageProviderPage is only set if a model is created, cf
		// initStorageProvider(IWorkbench, IStructuredSelection)
		// The storage page for a project, newProjectPage, is handled by the
		// PapyrusProjectCreationPage
		addPageIfNotNull(selectStorageProviderPage);
		addPageIfNotNull(newProjectPage);

		startProviderPageIndex = getPageCount() - 1;
		for (INewModelStorageProvider next : getStorageProviders()) {
			List<IWizardPage> pageList = new java.util.ArrayList<>(3);
			for (IWizardPage page : next.createPages()) {
				if (page != null) {
					pageList.add(page);
					providersByPage.put(page, next);
					if (!page.equals(getSelectedStorageProvider().getArchitectureContextPage())) {
						addPage(page);
					}
				}
			}
			providerPages.put(next, pageList);
		}
		endProviderPageIndex = getPageCount();

		// addPageIfNotNull(selectRepresentationKindPage);

		INewPapyrusModelPage newModelPage = getNewModelPage();
		if (newModelPage != null) {
			newModelPage.setNewModelWizardData(wizardData);
		}

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

		IDialogSettings workbenchSettings = Activator.getDefault().getDialogSettings();
		IDialogSettings section = workbenchSettings.getSection(NEW_MODEL_SETTINGS);
		if (section == null) {
			section = workbenchSettings.addNewSection(NEW_MODEL_SETTINGS);
		}
		setDialogSettings(section);

		selectStorageProviderPage = createSelectStorageProviderPage();

		for (INewModelStorageProvider next : getStorageProviders()) {
			next.init(this, selection);
		}

		selectRepresentationKindPage = createSelectRepresentationKindPage();

		try {

			TreeSelection treeselection = (TreeSelection) selection;

			if (treeselection != null && treeselection.getPaths() != null && treeselection.getFirstElement() != null
					&& treeselection.getFirstElement() instanceof IProject) {
				project = (IProject) treeselection.getFirstElement();

			} else {
				project = createNewProject();
			}
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
	@Override
	public boolean performFinish() {
		 String[] contextIds = getSelectedContexts();
		/*
		 * String aasContextId = "???????????";/// IK ???? String[] contextIds = {
		 * aasContextId }; if (contextIds.length == 0) { return false; }
		 */

		String contextId = contextIds[0];
		final URI newURI = createNewModelURI(contextId);
		String viewPointId = "com.cea.afpvn.arrowhead.viewpoint"; // IK ???
		String[] viewpointIds = { viewPointId };
		// String[] viewpointIds = getSelectedViewpoints(contextId);
		createAndOpenPapyrusModel(newURI, contextId, viewpointIds);

		// import the aasx file in the Papyrus folder
		importPage.finish();
		// execute the transformation /// IK ????
		/*
		 * ImportAASXHandler importer = new ImportAASXHandler(); try {
		 * importer.execute(project);
		 * 
		 * } catch (ExecutionException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); return false; }
		 */
		return true;

	}

	protected URI createNewModelURI(String contextId) {
		return getSelectedStorageProvider().createNewModelURI(contextId);
	}

	/**
	 * Creates the and open papyrus model.
	 *
	 * @param modelSet     the di resource set
	 * @param newURI       the URI of the new model's principal resource
	 * @param contextId    the architecture context id
	 * @param viewpointIds the architecture viewpoint ids
	 * @return true, if successful
	 * @since 3.0
	 */
	protected boolean createAndOpenPapyrusModel(URI newURI, String contextId, String[] viewpointIds) {

		if (newURI == null) {
			return false;
		}

		ServicesRegistry registry = createServicesRegistry();
		if (registry == null) {
			return false;
		}

		try {
			// have to create the model set and populate it with the DI model
			// before initializing other services that actually need the DI
			// model, such as the SashModel Manager service
			ModelSet modelSet = registry.getService(ModelSet.class);

			createPapyrusModels(modelSet, newURI);

			initServicesRegistry(registry);

			initDomainModel(modelSet, contextId, viewpointIds);

			initDiagramModel(modelSet, contextId);

			applyProfile(modelSet);

			// initTemplate(modelSet);

			saveDiagram(modelSet);

			// openDiagram(newURI);

		} catch (ServiceException e) {
			Activator.log.error(e);
			// this.selectRepresentationKindPage.setErrorMessage(e.getMessage());
			return false;

		} finally {
			try {
				registry.disposeRegistry();
			} catch (ServiceException ex) {
				// Ignore
			}
		}

		return true;
	}

	public List<RepresentationKind> getSelectedRepresentationKinds(String contextId) {
		MergedArchitectureContext context = ArchitectureDomainManager.getInstance()
				.getArchitectureContextById(contextId);
		Set<RepresentationKind> allowedKinds = new HashSet<>();
		for (MergedArchitectureViewpoint viewpoint : context.getViewpoints()) {
			allowedKinds.addAll(viewpoint.getRepresentationKinds());
		}
		List<RepresentationKind> selectedKinds = new ArrayList<>();
		for (RepresentationKind kind : getSelectedRepresentationKinds()) {
			if (allowedKinds.contains(kind)) {
				selectedKinds.add(kind);
			}
		}
		return selectedKinds;
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

	protected ServicesRegistry createServicesRegistry() {
		ServicesRegistry result = null;

		try {
			result = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		} catch (ServiceException e) {
			// couldn't create the registry? Fatal problem
			Activator.log.error(e);
		}

		try {
			// have to create the model set and populate it with the DI model
			// before initializing other services that actually need the DI
			// model, such as the SashModel Manager service
			result.startServicesByClassKeys(ModelSet.class);
		} catch (ServiceException ex) {
			// Ignore this exception: some services may not have been loaded,
			// which is probably normal at this point
		}

		return result;
	}

	protected void initServicesRegistry(ServicesRegistry registry) throws ServiceException {
		try {
			registry.startRegistry();
		} catch (ServiceException ex) {
			// Ignore this exception: some services may not have been loaded,
			// which is probably normal at this point
		}

		registry.getService(IPageManager.class);
	}

	/**
	 * Gets the diagram file extension.
	 *
	 * @param diagramCategoryId the diagram category id
	 * @return the diagram file extension
	 */
	public String getDiagramFileExtension(String contextId) {
		return getDiagramFileExtension(contextId, NewModelFilePage.DEFAULT_DIAGRAM_EXTENSION);
	}

	/**
	 * Gets the diagram file extension.
	 *
	 * @param contextId        the context id
	 * @param defaultExtension the default extension
	 * @return the diagram file extension
	 */
	public String getDiagramFileExtension(String contextId, String defaultExtension) {
		MergedArchitectureContext context = ArchitectureDomainManager.getInstance()
				.getArchitectureContextById(contextId);
		String extensionPrefix = context != null ? context.getExtensionPrefix() : null;
		return (extensionPrefix != null && !extensionPrefix.trim().isEmpty()) ? extensionPrefix + "." + defaultExtension //$NON-NLS-1$
				: defaultExtension;
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

	/**
	 * Creates the select representation kind page.
	 *
	 * @return the select representation kind page
	 * @since 3.0
	 */
	protected SelectRepresentationKindPage createSelectRepresentationKindPage() {
		SelectRepresentationKindPage result = doCreateSelectRepresentationKindPage();
		result.setNewModelWizardData(wizardData);
		return result;
	}

	protected SelectRepresentationKindPage doCreateSelectRepresentationKindPage() {
		return new SelectRepresentationKindPage(createContextProvider());
	}

	protected ContextProvider createContextProvider() {
		return new ContextProvider() {

			@Override
			public String[] getCurrentContexts() {
				return getSelectedContexts();
			}

			@Override
			public String[] getCurrentViewpoints() {
				return getSelectedViewpoints();
			}

		};
	}

	/**
	 * Inits the domain model.
	 *
	 * @param modelSet     the di resource set
	 * @param contextId    the architecture context id
	 * @param viewpointIds the architecture viewpoint ids
	 * @since 3.0
	 */
	protected void initDomainModel(ModelSet modelSet, String contextId, String[] viewpointIds) {

		createEmptyDomainModel(modelSet, contextId, viewpointIds);

	}

	protected void applyProfile(ModelSet modelSet) {
		// List<String> profilePath = selectRepresentationKindPage.getProfilesURI();
		URI profileURI = URI.createURI("");// IK ????
		CompoundCommand cc = new CompoundCommand();

		Resource resource = modelSet.getResource(profileURI, true);
		Profile profileToApply = (Profile) resource.getContents().get(0);

		Resource myModelUMLResource = UmlUtils.getUmlResource(modelSet);
		org.eclipse.uml2.uml.Package manipulatedModel = (org.eclipse.uml2.uml.Package) myModelUMLResource.getContents()
				.get(0);

		cc.append(new ApplyProfileCommand(manipulatedModel, profileToApply, modelSet.getTransactionalEditingDomain()));

		if (cc.canExecute()) {
			getCommandStack(modelSet).execute(cc);
		}
	}

	/**
	 * Inits the domain model from template.
	 *
	 * @param modelSet the di resource set
	 * @since 3.0
	 */

	/**
	 * Creates the empty domain model.
	 *
	 * @param modelSet     the di resource set
	 * @param contextId    the architecture context id
	 * @param viewpointIds the architecture viewpoint ids
	 * @since 3.0
	 */
	protected void createEmptyDomainModel(ModelSet modelSet, String contextId, String[] viewpointIds) {
		try {
			ArchitectureDescriptionUtils helper = new ArchitectureDescriptionUtils(modelSet);
			Command command = helper.createNewModel(contextId, viewpointIds);
			getCommandStack(modelSet).execute(command);
		} catch (Exception e) {
			log.error(e);
		}
	}

	/**
	 * Creates the papyrus models.
	 *
	 * @param modelSet the di resource set
	 * @param newURI   the URI of the new model's principal resource
	 */
	protected void createPapyrusModels(ModelSet modelSet, URI newURIs) {
		RecordingCommand command = new NewPapyrusModelCommand(modelSet, newURIs);
		getCommandStack(modelSet).execute(command);
	}

	/**
	 * Open diagram.
	 *
	 * @param newURI the URI of the new model's principal resource
	 */
	protected void openDiagram(final URI newURI) {
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		if (page != null) {
			try {
				IEditorInput editorInput = createEditorInput(newURI);
				IDE.openEditor(page, editorInput, getPreferredEditorID(editorInput), true);
			} catch (PartInitException e) {
				log.error(e);
			}
		}
	}

	protected IEditorInput createEditorInput(URI uri) {
		return getSelectedStorageProvider().createEditorInput(uri);
	}

	protected String getPreferredEditorID(IEditorInput input) throws PartInitException {
		IEditorDescriptor desc;

		if (input instanceof IFileEditorInput) {
			desc = IDE.getEditorDescriptor(((IFileEditorInput) input).getFile());
		} else {
			// try to get a URI
			URI uri = null;
			if (input instanceof IURIEditorInput) {
				uri = URI.createURI(((IURIEditorInput) input).getURI().toString(), true);
			} else if (input instanceof URIEditorInput) {
				uri = ((URIEditorInput) input).getURI();
			}

			if (uri != null) {
				desc = IDE.getEditorDescriptor(uri.lastSegment());
			} else {
				// hope that the input name is the file name
				desc = IDE.getEditorDescriptor(input.getName());
			}
		}

		return (desc == null) ? "org.eclipse.papyrus.infra.core.papyrusEditor" : desc.getId(); //$NON-NLS-1$
	}

	/**
	 * Inits the diagram model.
	 *
	 * @param modelSet  the di resource set
	 * @param contextId the architecture context id
	 */
	protected void initDiagramModel(ModelSet modelSet, String contextId) {
		initDiagrams(modelSet, contextId);
	}

	@Override
	protected void initDiagrams(ModelSet resourceSet, EObject root, String contextId) {
		UmlModel model = (UmlModel) resourceSet.getModel(UmlModel.MODEL_ID);
		EList<EObject> roots = model.getResource().getContents();
		if (!roots.isEmpty()) {
			root = roots.get(0);
			if (root instanceof NamedElement) {
				getCommandStack(resourceSet).execute(new RenameElementCommand(
						resourceSet.getTransactionalEditingDomain(), (NamedElement) root, getRootElementName()));

			}

		}
		List<RepresentationKind> creationCommands = getRepresentationKindsFor(contextId);
		List<String> diagramName = getDiagramNames();
		if (creationCommands.isEmpty()) {
			createEmptyDiagramEditor(resourceSet);
		} else {
			for (int i = 0; i < creationCommands.size(); i++) {
				RepresentationKind kind = creationCommands.get(i);
				if (kind instanceof PapyrusRepresentationKind) {
					ViewPrototype proto = ViewPrototype.get((PapyrusRepresentationKind) kind);
					proto.instantiateOn(root, diagramName.get(i));
				}
			}
		}
	}

	/**
	 * Save diagram.
	 *
	 * @param modelSet the di resource set
	 */
	private void saveDiagram(ModelSet modelSet) {
		// TODO verify that there are no conflicts with the existing files and the newly
		// created one
		try {
			modelSet.save(new NullProgressMonitor());
		} catch (IOException e) {
			log.error(e);
		}
	}

	protected String getRootElementName() {

		// return selectRepresentationKindPage.getRootElementName();
		return "model";
	}

	/**
	 * Creates the empty diagram editor.
	 *
	 * @param modelSet the model set
	 */
	private void createEmptyDiagramEditor(ModelSet modelSet) {
		// Create an empty editor (no diagrams opened)
		// Geting an IPageMngr is enough to initialize the
		// SashSystem.
		EditorUtils.getIPageMngr(SashModelUtils.getSashModel(modelSet).getResource());
	}

	protected List<RepresentationKind> getRepresentationKindsFor(String contextId) {
		return getSelectedRepresentationKinds(contextId);
	}

	protected List<String> getDiagramNames() {
		return Collections.emptyList();
	}

	/**
	 * Diagram category changed.
	 *
	 * @param newCategories the new categories
	 * @return the i status
	 * @since 3.0
	 */
	public IStatus architectureContextChanged(String... newContexts) {
		return getSelectedStorageProvider().validateArchitectureContexts(newContexts);
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
			if (index > 0) {
				result = pages.get(index - 1);
			} else {
				// get the last page before the provider pages
				if (startProviderPageIndex > 0) {
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

	private INewPapyrusModelPage getNewModelPage() {
		return getPage(INewPapyrusModelPage.class);
	}

	protected <P extends IWizardPage> P getPage(Class<P> type) {
		for (IWizardPage next : getPages()) {
			if (type.isInstance(next)) {
				return type.cast(next);
			}
		}
		return null;
	}

	/**
	 * Queries the user-presentable (translatable) name of the kind of model that I
	 * create. For example, "Papyrus UML" or "Papyrus SysML".
	 *
	 * @return my model kind name
	 */
	public String getModelKindName() {
		return "Papyrus"; //$NON-NLS-1$
	}

	public boolean isPapyrusRootWizard() {
		// this.getClass().getName().equals(anObject)
		return true;
	}

	protected IProject createNewProject() throws CoreException {
		// get a project handle

		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("ArrowheadImportedProject");
		IProjectDescription projectDescription = null;
		NullProgressMonitor progressMonitor = new NullProgressMonitor();
		// get a project descriptor
		if (!project.exists()) {
			projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription("ArrowheadImportedProject");
			project.create(projectDescription, new SubProgressMonitor(progressMonitor, 1));
			project.open(new SubProgressMonitor(progressMonitor, 1));
		} else {
			project.open(new SubProgressMonitor(progressMonitor, 1));
		}

		return project;
	}
}
