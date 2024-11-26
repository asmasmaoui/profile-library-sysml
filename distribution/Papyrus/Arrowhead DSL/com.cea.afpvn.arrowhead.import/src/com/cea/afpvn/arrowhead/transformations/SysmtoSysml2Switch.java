package com.cea.afpvn.arrowhead.transformations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.util.BlocksSwitch;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.tools.commands.ApplyStereotypeCommand;
import org.eclipse.uml2.uml.Model;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.xtext.SysMLStandaloneSetupGenerated;
import com.cea.afpvn.arrowhead.wizards.ImportAFPVNWizard;
import com.google.inject.Injector;

public class SysmtoSysml2Switch extends  BlocksSwitch<EObject> {
	/** The transformed map. */
	public Map<EObject, EObject> transformedMap = new HashMap<>();
	/** The uml resource. */
	public Resource umlResource;

	/** The aasx resource. */
	public Resource sysmlResource;
	
	/** The domain. */
	public EditingDomain domain;
	/** The sysml elements. */
	List<EObject> sysmlElements = new ArrayList<>();
	Namespace namesapce = null;
	public Resource doTransform( Resource umlResource, Resource sysmlResource) {
	    
	    this.umlResource=umlResource;
	    this.sysmlResource= sysmlResource;
		
		Iterator<EObject> iter = umlResource.getAllContents();
	    System.out.println("Sysml transformation");
	    
		
		System.out.println(sysmlResource.toString());
		
		// load the xtext ressource
		Injector injector = new SysMLStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// charger resources(parser the DSL file with the grammar we have defined) using
		// URI
		Resource resource = resourceSet.getResource(sysmlResource.getURI(), true);
		if (resource.getContents()!=null && !resource.getContents().isEmpty())
		{
			namesapce = (Namespace) resource.getContents().get(0);
			
//				domain = getEditingDomainFor(namespace);
//				PartDefinition element = createPartDef(name);
//				addMemberTo(namespace, element);
			
		}
	
	
	     // call transfo for all diagrams
			while (iter.hasNext()) {
				// IK appel a la fonction de transformation selon l'objet
				EObject eObject = iter.next();
				transform(eObject);
			}
			//resource.getContents().addAll(sysmlElements);

			try {
				resource.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// deleteTemporaryFiles();
			return resource;
		}


	
	private EObject transform(EObject object) {
		EObject ret = null;
		if (object != null) {
			ret = transformedMap.get(object);
			if (ret == null) {
				ret = doSwitch(object); /// le point a comprendre 

			}
		}

		return ret;
	}
	
	/**
	 * Do switch.
	 *
	 * @param object the object
	 * @param result the result
	 * @return the e object
	 */
	private EObject doSwitch(EObject object, EObject result) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public EObject caseBlock(Block object) {
		
				EObject result = null;
				if (object != null) {

					result = createPartDefinition(object);

				}
				transformedMap.put(object, result);
				sysmlElements.add(result);
				return result;
	}
	
	


	private EObject createPartDefinition(Block object) {
		String name = object.getBase_Class().getName();
		
		PartDefinition element = createPartDef(name);
		
	
		addOwnedMemberTo(namesapce, element);
		
		Model model = getModel();
		String modelname = model.getName();
		
		Namespace nameSpace = SysMLFactory.eINSTANCE.createNamespace();
		
	
		RecordingCommand setName = new RecordingCommand((TransactionalEditingDomain) domain,
				"") {
			PartDefinition element2;
			@SuppressWarnings("unchecked")
			@Override
			protected void doExecute() {
				try {
					nameSpace.setName(modelname);
					PartDefinition element = createPartDef(name);
					addOwnedMemberTo(nameSpace, element);
					element2=element;
				} catch (ClassCastException e) {
					
				}

			}
		};
		domain.getCommandStack().execute(setName);
				
		;
		Collection<EObject> list =(Collection<EObject>) setName.getResult();
		return (EObject) list.toArray()[0];
		
		
		//return element;
	}
	/**
	 * Creates the class.
	 *
	 * @param name      the name
	 * @param container the container
	 * @return the class
	 */
	private PartDefinition createPartDef(String name) {

		PartDefinition result = SysMLFactory.eINSTANCE.createPartDefinition();
		result.setDeclaredName(name);
		
		
		return result;
	}
	
	public static OwningMembership addOwnedMemberTo(Namespace namespace, Element element) {
		Membership membership = SysMLFactory.eINSTANCE.createMembership();
	
		//element.setOwningNamespace(namespace);
		
		membership.setMemberElement(element);
		membership.getSource().add(namespace);
		membership.getTarget().add(element);
	
		namespace.getOwnedMembership().add(membership);
	
		namespace.getOwnedMember().add(element);
		namespace.getOwnedElement().add(element);
		element.setOwner(namespace);
		element.setOwningNamespace(namespace);
		return (OwningMembership) membership;
	}
	
	

	private Model getModel() {
		if (umlResource != null)

		{
			Iterator<EObject> iter = umlResource.getAllContents();

			while (iter.hasNext()) {
				EObject eObject = iter.next();
				if (eObject instanceof Model) {
					return (Model) eObject;
				}
			}
		}
		return null;
	}
	

	static public EditingDomain getEditingDomainFor(EObject object)
	{
	Resource resource = object.eResource();
	if (resource != null)
	{
	IEditingDomainProvider editingDomainProvider =

	(IEditingDomainProvider)EcoreUtil.getExistingAdapter(resource,
	IEditingDomainProvider.class);
	if (editingDomainProvider != null)
	{
	return editingDomainProvider.getEditingDomain();
	}
	else
	{
	ResourceSet resourceSet = resource.getResourceSet();
	if (resourceSet instanceof IEditingDomainProvider)
	{
	EditingDomain editingDomain =
	((IEditingDomainProvider)resourceSet).getEditingDomain();
	return editingDomain;
	}
	else if (resourceSet != null)
	{
	editingDomainProvider =
	(IEditingDomainProvider)EcoreUtil.getExistingAdapter(resourceSet,
	IEditingDomainProvider.class);
	if (editingDomainProvider != null)
	{
	return editingDomainProvider.getEditingDomain();
	}
	}
	}
	}

	return null;
	}




}
