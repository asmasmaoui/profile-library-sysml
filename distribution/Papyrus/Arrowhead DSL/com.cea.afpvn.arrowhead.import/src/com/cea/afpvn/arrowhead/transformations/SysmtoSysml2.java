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
import org.eclipse.papyrus.sysml16.blocks.BindingConnector;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml16.blocks.internal.impl.NestedConnectorEndImpl;
import org.eclipse.papyrus.sysml16.blocks.util.BlocksSwitch;
import org.eclipse.papyrus.sysml16.portsandflows.FullPort;
import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;
import org.eclipse.papyrus.sysml16.portsandflows.ProxyPort;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.tools.commands.ApplyStereotypeCommand;
import org.eclipse.uml2.uml.Connector;
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
import com.cea.afpvn.arrowhead.xtend.InterfaceBlok;
import com.cea.afpvn.arrowhead.xtend.Partdef;
import com.cea.afpvn.arrowhead.xtend.PartdefProp;
import com.cea.afpvn.arrowhead.xtend.Port;
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
				System.out.println("eObject type name "+eObject.getClass().getTypeName());
				System.out.println("eObject name "+eObject.toString());
				eObject.getClass().getTypeName();
				 if (eObject instanceof InterfaceBlock )
					{
						System.out.println("InterfaceBlock :"+eObject.toString());
						System.out.println("InterfaceBlock container:"+eObject.eContainer());
						caseInterfaceBlock((InterfaceBlock) eObject);
						
					}
				 else
				if (eObject instanceof Block)
				{
					System.out.println("block :"+eObject.toString());
					System.out.println("Block container:"+eObject.eContainer());
					caseBlock((Block) eObject);
					
				}
				else 
					if (eObject instanceof Connector)
					{
						System.out.println("Connector :"+eObject.toString());
						
						Connector val = ((Connector) eObject);
						//System.out.println("Connector base 1 "+ ((NestedConnectorEndImpl) eObject).getBase_Element());
						//System.out.println("Connector end  1"+ ((NestedConnectorEndImpl) eObject).basicGetBase_Element().getClass().getName());
						
					}
				 
					
				 
			  
			}
			
			return sysmlResourceString=sysmlResourceString.concat(";");
		}

	
	
	private void caseInterfaceBlock(InterfaceBlock eObject) {
		EObject result = null;
		if (eObject != null) {
			EList<Property> props =eObject.getBase_Class().getOwnedAttributes();
			String strprop="";
			if (props!=null){
				for (Property prop : props) {
					prop.getName();
					prop.getStereotypeApplications();
					prop.getType();
					//System.out.println(" name"+prop.getName());
					//System.out.println(" type name"+prop.getType().getName());
					//System.out.println(" Eclasse "+prop.eClass());
					//System.out.println(" streotype "+prop.getStereotypeApplications());
					strprop =strprop.concat("\n");
					strprop =strprop.concat(createAttribute(prop.getName(),prop.getType().getName()));
					strprop =strprop.concat("\n");
					//System.out.println("la valeur de la prop est "+strprop);
					
				}
			}
			
		this.sysmlResourceString=this.sysmlResourceString.concat(createInterfaceBlok(eObject,strprop));
		this.sysmlResourceString=this.sysmlResourceString.concat("\n");	
		}
	
		
	}	
	public EObject caseBlock(Block object) { 
				EObject result = null;
				System.out.println("eObject contenue "+object.getParts());
				if (object != null) {
					EList<Property> props =object.getBase_Class().getOwnedAttributes();
					String strprop="";
					if (props!=null){
						for (Property prop : props) {
							if (prop.eClass().getName().equals("Port"))
									{
								System.out.println("C'est un Port ");
								strprop =strprop.concat("\n");
								strprop =strprop.concat(createPort(prop.getName(),prop.getType().getName()));
								strprop =strprop.concat("\n");
									}
							else
							{
							System.out.println("C'est un attribut ");
							prop.getName();
							prop.allOwnedElements();
							System.out.println(prop.isComposite());
							if (prop.isComposite())
							{
								strprop =strprop.concat("\n");
								strprop =strprop.concat(createPartDefinitionPrperty(prop.getName()));
								strprop =strprop.concat("\n");
							}
							else
							{
							System.out.println(prop.allOwnedElements());
							prop.getStereotypeApplications();
							prop.getType();
							strprop =strprop.concat("\n");
							strprop =strprop.concat(createAttribute(prop.getName(),prop.getType().getName()));
							strprop =strprop.concat("\n");
							}
							}
							
						}
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
private String createPartDefinitionPrperty(String name ) {
	PartdefProp partdefPop=new PartdefProp();
	String element = partdefPop.createPartDefProp(name);
	return element;
}
private String createAttribute(String name, String type) {
		
		Attribute attr= new Attribute();
		String element = attr.createAttribute(name,type);
		return element;
	}
private String createPort(String name, String type) {
		Port port= new Port();
		String element = port.createPort(name,type);
		return element;
	}
private String createInterfaceBlok(InterfaceBlock eObject, String attributs) {
		String name = eObject.getBase_Class().getName();
		InterfaceBlok  interfaceBlok =new InterfaceBlok();
		String element = interfaceBlok.createInterfaceBlok(name,attributs);
		return element;
		
	}


}
