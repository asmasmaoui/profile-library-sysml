package com.cea.afpvn.arrowhead.transformations;

import java.io.IOException;
import java.util.ArrayList;
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
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.util.BlocksSwitch;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.tools.commands.ApplyStereotypeCommand;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class SysmtoSysml2Switch extends  BlocksSwitch<EObject> {
	/** The transformed map. */
	public Map<EObject, EObject> transformedMap = new HashMap<>();
	/** The uml resource. */
	public Resource umlResource;

	/** The aasx resource. */
	public Resource sysmlResource;
	
	/** The domain. */
	public TransactionalEditingDomain domain;
	/** The sysml elements. */
	List<EObject> sysmlElements = new ArrayList<>();
	
	public Resource doTransform( IResource source, IFile destination) {
		Iterator<EObject> iter = umlResource.getAllContents();
	    System.out.println("Sysml transformation");
		
	    
	    umlResource.setURI((URI) source.getLocation()); //// ? ik 
		System.out.println(umlResource.toString());
		
		sysmlResource.setURI((URI) destination.getLocation());
		System.out.println(sysmlResource.toString());
		
		
	     // call transfo for all diagrams
			while (iter.hasNext()) {
				// IK appel a la fonction de transformation selon l'objet
				EObject eObject = iter.next();
				transform(eObject);
			}
			//sysmlResource.getContents().addAll(sysmlElements);

			try {
				sysmlResource.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// deleteTemporaryFiles();
			return sysmlResource;
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
		// we create an Asset
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
		Class element = createClass(name);
		// apply sysml::PartDefinition Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("sysml::PartDefinition");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		//setPropertiesValues(object, element);
		return element;
		
		
		
	}
	/**
	 * Creates the class.
	 *
	 * @param name      the name
	 * @param container the container
	 * @return the class
	 */
	private Class createClass(String name) {
		// we create a Class

		Class result = null;

			CreateElementRequest request = new CreateElementRequest(domain, UMLElementTypes.CLASS);
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(null);
			ICommand command = provider.getEditCommand(request);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
			result = (Class) request.getNewElement();
			SetRequest setRequest = new SetRequest(result, UMLPackage.eINSTANCE.getNamedElement_Name(), name);

			ICommand command2 = provider.getEditCommand(setRequest);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));

		

		return result;
	}
	
	private void applyRequiredStereotype(Element el, Stereotype stereotype) {

		ApplyStereotypeCommand applyCommand = new ApplyStereotypeCommand(el, stereotype, domain);
		domain.getCommandStack().execute(applyCommand);
	}


	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	@SuppressWarnings("unused")
	private Model getModel() {
		if (sysmlResource != null)

		{
			Iterator<EObject> iter = sysmlResource.getAllContents();

			while (iter.hasNext()) {
				EObject eObject = iter.next();
				if (eObject instanceof Model) {
					return (Model) eObject;
				}
			}
		}
		return null;
	}
	

	


}
