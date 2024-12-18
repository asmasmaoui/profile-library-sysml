package com.cea.afpvn.arrowhead.transformations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.blocks.util.BlocksSwitch;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.tools.commands.ApplyStereotypeCommand;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.xtext.SysMLStandaloneSetupGenerated;
import com.cea.afpvn.arrowhead.wizards.ImportAFPVNWizard;
import com.cea.afpvn.arrowhead.xtend.Attribute;
import com.cea.afpvn.arrowhead.xtend.Partdef;
import com.google.inject.Injector;

public class SysmtoSysml2 extends  BlocksSwitch<EObject> {
	/** The uml resource. */
	public Resource umlResource;
	public String sysmlResourceString ;
	public String sysmlResourceStringTransi;
	
	public String doTransformSysml1toSysml2( Resource umlResource) {
	    this.umlResource=umlResource;
	    this.sysmlResourceString="";
	    String result;
	    umlResource.getClass().getName();
		Iterator<EObject> iter = umlResource.getAllContents();
	     // call transfo for all diagrams
			while (iter.hasNext()) {
				EObject eObject = iter.next();
				//System.out.println(eObject.toString());
				//if (eObject instanceof Block)
				//{
					//System.out.println("block"+eObject.toString());
				//}
				transform(eObject);
			}
			
			return sysmlResourceString;
		}

	private EObject transform(EObject object) {
		EObject ret = null;
		if (object != null) {
			if (ret == null) {
				ret = doSwitch(object);

			}
		}

		return ret;
	}
	
	@Override
	public EObject caseBlock(Block object) { 
				EObject result = null;
				if (object != null) {
					EList<Property> props =object.getBase_Class().getOwnedAttributes();
					String strprop="";
					if (props!=null){
						for (Property prop : props) {
							prop.getName();
							prop.getType();
							System.out.println(prop.getName());
							System.out.println(prop.getType().getName());
							strprop =strprop.concat("\n");
							strprop =strprop.concat(createAttribute(prop.getName(),prop.getType().getName()));
							strprop =strprop.concat("\n");
							System.out.println("la valeur de la prop est "+strprop);
							
						}
					}
						else
						{
							
						}
					
				this.sysmlResourceString=this.sysmlResourceString.concat(createPartDefinition(object,strprop));
				this.sysmlResourceString=this.sysmlResourceString.concat("\n");	
				}
				return result;
	}
	
	


	private String createPartDefinition(Block object, String attributs ) {
		String name = object.getBase_Class().getName();
		Partdef partdef=new Partdef();
		String element = partdef.createPartDef(name,attributs);
		return element;
	}
	private String createAttribute(String name, String type) {
		//prop.getName();
		//prop.getType();
		Attribute attr= new Attribute();
		String element = attr.createAttribute(name,type);
		return element;
	}

}
