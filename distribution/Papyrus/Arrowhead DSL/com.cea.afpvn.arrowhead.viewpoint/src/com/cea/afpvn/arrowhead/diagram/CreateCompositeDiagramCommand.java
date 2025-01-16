package com.cea.afpvn.arrowhead.diagram;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
/*****************************************************************************
 * Copyright (c) 2009-2011 CEA LIST.
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
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Point;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.AbstractPapyrusGmfCreateDiagramCommandHandler;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.DiagramPrototype;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CompositeStructureDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * Define a command to create a new Composite Diagram. This command is used by
 * all UI (toolbar, outline, creation wizards) to create a new Composite
 * Diagram.
 *
 */
public class CreateCompositeDiagramCommand extends AbstractPapyrusGmfCreateDiagramCommandHandler {

	/** Domain Element referenced by canvas if it differs from {@link Package} */
	protected EObject canvasDomainElement = null;

	/** Default margin for the display of Domain Element referenced by canvas */
	protected static int DEFAULT_MARGIN = 40;

	/** Default height for the display of Domain Element referenced by canvas */
	protected static int DEFAULT_HEIGHT = 250;

	/** Default width for the display of Domain Element referenced by canvas */
	protected static int DEFAULT_WIDTH = 500;

	/**
	 * Name of the Diagram
	 */
	protected static final String CSD_DEFAULT_NAME = "CompositeDiagram"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getDefaultDiagramName() {
		return CSD_DEFAULT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getDiagramNotationID() {
		return CompositeStructureDiagramEditPart.MODEL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected PreferencesHint getPreferenceHint() {
		return UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * Initialize the diagram. The diagram is attached to the element selected on
	 * creation. Possible element types are: Class or Collaboration
	 */
	@Override
	protected void initializeDiagram(EObject diagram) {
		// NamedElement context = getSelectedElement();
		if (diagram instanceof Diagram) {
			Diagram currentDiagram = (Diagram) diagram;
			if (canvasDomainElement != null) {
				currentDiagram.setElement(canvasDomainElement);
				initializeDiagramContent(currentDiagram);
			}
		}
	}

	private NamedElement getSelectedElement() {
		final ISelectionService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection tmp = service.getSelection();
		if (tmp instanceof IStructuredSelection) {
			Object current = ((IStructuredSelection) tmp).getFirstElement();
			EObject eobject = EMFHelper.getEObject(current);
			if (eobject instanceof NamedElement) {
				return (NamedElement) eobject;
			}
		}
		return null;
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.AbstractPapyrusGmfCreateDiagramCommandHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	protected Diagram doCreateDiagram(Resource diagramResource, EObject owner, EObject element,
			DiagramPrototype prototype, String name) {
		Diagram diagram = null;

		if (element instanceof org.eclipse.uml2.uml.Class || (element instanceof Collaboration)) {
			canvasDomainElement = element;
			Package owningPackage = ((Element) element).getNearestPackage();
			diagram = super.doCreateDiagram(diagramResource, owner, owningPackage, prototype, name);

			// if (owner instanceof SD) {
			// Create the part
			// org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) owner;

			// }
			diagram.setElement(canvasDomainElement);
			initializeDiagramContent(diagram);

		} else if (element instanceof Package) {
			canvasDomainElement = null;
			diagram = super.doCreateDiagram(diagramResource, owner, element, prototype, name);
		}

		return diagram;
	}

	protected ServicesRegistry createServicesRegistry() {
		ServicesRegistry result = null;

		try {
			result = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		} catch (ServiceException e) {
			// couldn't create the registry? Fatal problem

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

	/**
	 * Initialize the diagram with the canvas domain element shown.
	 *
	 * @param diagram the diagram to initialize
	 */
	protected void initializeDiagramContent(Diagram diagram) {

		// Create a view for the canvasDomainElement in the new diagram
		View view = ViewService.getInstance().createView(Node.class, new EObjectAdapter(canvasDomainElement), diagram,
				null, ViewUtil.APPEND, true, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

		if (view instanceof Node) {
			// Update the view position and size (should adapt to canvas current size)
			Bounds viewBounds = (Bounds) ((Node) view).getLayoutConstraint();
			viewBounds.setX(DEFAULT_MARGIN);
			viewBounds.setY(DEFAULT_MARGIN);
			viewBounds.setHeight(DEFAULT_HEIGHT);
			viewBounds.setWidth(DEFAULT_WIDTH);
		}

		
		IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor()
				.getSite().getPart();
		//if (part instanceof IDiagramWorkbenchPart) {
		
		IDiagramGraphicalViewer viewer =null;
	//		IDiagramGraphicalViewer viewer =  ((IDiagramWorkbenchPart) part).getDiagramGraphicalViewer();
			//IDiagramGraphicalViewer viewer =  (IDiagramGraphicalViewer)((IDiagramWorkbenchPart) part).getDiagramGraphicalViewer();

			/* AFPVN Library: extract elemnts to add in the diagram */
			List<Element> elemsToAdd = new ArrayList<>();
			EObject owner = diagram.getElement();
			Package AFPVNLibrary = PackageUtil.loadPackage(URI.createURI("pathmap://AFPVN_LIB/Arrowhead-5.0.uml"),
					owner.eResource().getResourceSet());
			if (AFPVNLibrary != null) {
				PackageableElement microsystemPackage = AFPVNLibrary.getPackagedElement("Arrowhead.core.microsystem");
				EList<Element> microsystemPackageList = microsystemPackage.getOwnedElements();
				for (Element pack : microsystemPackageList) {
					EList<Element> PackageList = pack.allOwnedElements();
					for (Element packl : PackageList) {
						if (packl.getAppliedStereotype("ArrowheadDSL::SysD") != null) {
							elemsToAdd.add(packl);
						}
					}
				}
				for (Element sysd : elemsToAdd) {

				}

				// Create a view for the canvasDomainElement in the new diagram
				if (view instanceof Shape)
				{
					List<EObject> list = view.getPersistedChildren();
					for (EObject eo: list) {
						//if (eo instanceof Class_StructureCompartment)
						{
							
						}
					}
				}
				View view2 = ViewService.getInstance().createView(Node.class, new EObjectAdapter(canvasDomainElement), view ,
						"Property_Shape", ViewUtil.APPEND, true, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

				if (view2 instanceof Node) {
					// Update the view position and size (should adapt to canvas current size)
					Bounds viewBounds = (Bounds) ((Node) view).getLayoutConstraint();
					viewBounds.setX(DEFAULT_MARGIN);
					viewBounds.setY(DEFAULT_MARGIN);
					viewBounds.setHeight(DEFAULT_HEIGHT);
					viewBounds.setWidth(DEFAULT_WIDTH);
				}

				/***************/
				// diagram.insertChild(view, isListenerAttached());

				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);

				// 0 what is the context of this call
				// - drop from the model explorer
				// - drop intra diagram form its container to outside of this class
				// - the edit part of a the dropped element already exist?
				if (viewer!=null) {
				Element droppedElement = elemsToAdd.get(0);
				EditPart droppedElementEditPart = findEditPartFor(viewer.getEditPartRegistry(), elemsToAdd.get(0));
				// Is is contained into a class ?
				Element owner2 = (elemsToAdd.get(0)).getOwner();
				// the container editpart is the the class that can contained the dropped
				// element.
				// if it is not null we are in the context of drop intra diagram
				GraphicalEditPart containerEditpart = null;
				if (droppedElementEditPart != null) {
					GraphicalEditPart parentEP = (GraphicalEditPart) droppedElementEditPart.getParent();
					if (parentEP.resolveSemanticElement().equals(owner2)) {
						containerEditpart = parentEP;
					}
				}
				CompositeCommand cc = new CompositeCommand("drop");
				// in the context of a drop from the model explorer -> create only a view for
				// this element
				Point point = new Point(50, 50);
				if (containerEditpart == null) {
					Point point1 = new Point(50, 50);
					// Rectangle location = null ;
					// dropElementToDiagram(cc, droppedElement, getPreferenceHint(), new Point(x,y),
					// view);
					ViewDescriptor droppedElementDescriptor = new ViewDescriptor(new EObjectAdapter(droppedElement),
							Node.class, null, ViewUtil.APPEND, true, getPreferenceHint());
					CreateCommand containedNodeCreationCommand = new CreateCommand(domain, droppedElementDescriptor,
							view);
					cc.add(containedNodeCreationCommand);
					org.eclipse.draw2d.geometry.Rectangle location = null;
					cc.add(new SetBoundsCommand(domain, "move",
							(IAdaptable) containedNodeCreationCommand.getCommandResult().getReturnValue(), location));
				} else {
					// in the case of a drop intra diagram, remove view from the container and it
					// into the diagram
					org.eclipse.draw2d.geometry.Rectangle location = null;
					cc.add(new DeleteCommand(domain, (View) droppedElementEditPart.getModel()));
					// dropElementToDiagram(cc, droppedElement, getPreferenceHint(), new Point(x,y),
					// view);
					ViewDescriptor droppedElementDescriptor = new ViewDescriptor(new EObjectAdapter(droppedElement),
							Node.class, null, ViewUtil.APPEND, true, getPreferenceHint());
					CreateCommand containedNodeCreationCommand = new CreateCommand(domain, droppedElementDescriptor,
							view);
					cc.add(containedNodeCreationCommand);
					cc.add(new SetBoundsCommand(domain, "move",
							(IAdaptable) containedNodeCreationCommand.getCommandResult().getReturnValue(), location));

					domain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(cc));
				}
					// }
				}
			/*
        * EObject element = view.getElement();
		* IElementType elemtypEntity =
		* ElementTypeRegistry.getInstance().getType(
		* "org.eclipse.papyrus.uml.Property");
	    * ServicesRegistry registry =
		* createServicesRegistry(); ModelSet modelSet =
		* null; try { modelSet =
		* registry.getService(ModelSet.class); } catch
		* (ServiceException e) { // TODO Auto-generated
		* catch block e.printStackTrace(); }
		 */

			}
		}
	//}

	/*
	 * protected void dropElementToDiagram(CompositeCommand cc, PackageableElement
	 * droppedElement, PreferencesHint diagramPreferencesHint, Point location, View
	 * containerView) { ViewDescriptor droppedElementDescriptor = new
	 * ViewDescriptor(new EObjectAdapter(droppedElement), Node.class, null,
	 * ViewUtil.APPEND, true, diagramPreferencesHint); CreateCommand
	 * containedNodeCreationCommand = new CreateCommand(this.editDomain,
	 * droppedElementDescriptor, containerView);
	 * cc.add(containedNodeCreationCommand); cc.add(new
	 * SetBoundsCommand(getEditingDomain(), "move", (IAdaptable)
	 * containedNodeCreationCommand.getCommandResult().getReturnValue(), new
	 * Point(location.x, location.y - 100))); }
	 */
	/*************************************/

	/*******************************************/

	public EditPart findEditPartFor(Map<?, ?> editPartRegistry, Element droppedElement) {
		for (Object next : editPartRegistry.values()) {
			EditPart currentEditPart = (EditPart) next;

			View currentView = (View) currentEditPart.getModel();
			if (droppedElement.equals(currentView.getElement())) {
				return currentEditPart;
			}
		}

		return null;
	}
}
