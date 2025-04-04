package com.cea.afpvn.arrowhead.transformations;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.util.BlocksSwitch;
import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;
import org.eclipse.papyrus.sysml16.requirements.Requirement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.internal.impl.UseCaseImpl;

import com.cea.afpvn.arrowhead.xtend.Attribute;
import com.cea.afpvn.arrowhead.xtend.ConnectorPart;
import com.cea.afpvn.arrowhead.xtend.InterfaceBlok;
import com.cea.afpvn.arrowhead.xtend.Operation;
import com.cea.afpvn.arrowhead.xtend.Partdef;
import com.cea.afpvn.arrowhead.xtend.PartdefProp;
import com.cea.afpvn.arrowhead.xtend.Port;
import com.cea.afpvn.arrowhead.xtend.Requirements;
import com.cea.afpvn.arrowhead.xtend.Usecase;

public class SysmtoSysml2AFPVN extends BlocksSwitch<EObject> {
	/** The uml resource. */
	public Resource umlResource;
	public String sysmlResourceString;
	public String sysmlResourceStringTransi;

	public String doTransformSysml1toSysml2(Resource umlResource) {
		this.umlResource = umlResource;
		this.sysmlResourceString = "import ScalarValues::*;\r\n"
				+ "import ISQBase::*;\r\n"
				+ "import AFPVNDatatypes::*;\r\n"
				+ "import ArrowheadProfile::*;\r\n";
		String result;
		umlResource.getClass().getName();
		Iterator<EObject> iter = umlResource.getAllContents();

		// call transfo for all diagrams
		while (iter.hasNext()) {
			EObject eObject = iter.next();
			eObject.eAllContents();
			eObject.eResource();
			System.out.println("elem " +eObject.toString()+"::::"+eObject.eResource());
			
			if (eObject instanceof UseCase) {
				//caseUseCase((UseCase) eObject);
				System.out.println("c'est un UseCase " );
			}
			else if(eObject instanceof InterfaceBlock) {
				caseInterfaceBlock((InterfaceBlock) eObject);

			}else if (eObject instanceof Block) {
				caseBlock((Block) eObject);

			} else if (eObject instanceof Connector) {
				caseConnector((Connector) eObject);

			}
			
			else if (eObject instanceof Requirement) {
				caseRequirement((Requirement) eObject);
				

			}
		}

		return sysmlResourceString ;
	}
	private void caseUseCase(UseCase eObject) {
		String strConnector = "";
		if (eObject != null) {
			strConnector=strConnector.concat(eObject.getName());
		}
		
		this.sysmlResourceString = this.sysmlResourceString.concat(createUsecase(strConnector));
		this.sysmlResourceString = this.sysmlResourceString.concat("\n");
	}
	private void caseRequirement(Requirement eObject) {
		String strConnector = "";
		if (eObject != null) {
			strConnector=strConnector.concat(eObject.getBase_Class().getName());
			String streotypeport = eObject.getBase_Class().getAppliedStereotypes().get(0).getName();
			strConnector=strConnector.concat(" {@"+streotypeport+";}");
		}
		
		this.sysmlResourceString = this.sysmlResourceString.concat(createRequirements(strConnector));
		this.sysmlResourceString = this.sysmlResourceString.concat("\n");
	}

	private String caseConnector(Connector eObject) {
		String strConnector = "";
		String ConnectStart = "";
		String ConnectEnd = "";
		if (eObject != null) {
			Connector val = ((Connector) eObject);
			EList<ConnectorEnd> connectorEnds = val.getEnds();
			connectorEnds.get(0).getPartWithPort().getName();
			connectorEnds.get(0).getRole().getName();
			// Start
			ConnectStart = ConnectStart.concat(
					connectorEnds.get(0).getPartWithPort().getName() + "." + connectorEnds.get(0).getRole().getName());

			connectorEnds.get(1).getPartWithPort().getName();
			connectorEnds.get(1).getRole().getName();
			// end
			ConnectEnd = ConnectEnd.concat(
					connectorEnds.get(1).getPartWithPort().getName() + "." + connectorEnds.get(1).getRole().getName());

		}

		strConnector = createConnector(ConnectStart, ConnectEnd);
		return strConnector;
	}

	private void caseInterfaceBlock(InterfaceBlock eObject) {
		System.out.println("elem " +eObject.toString()+"::::"+eObject.getClass().getSuperclass());
		if (eObject != null) {
			String generalization="";
			System.out.println("le stereotype appliqué est : "+ eObject.getBase_Class().getStereotypeApplications());
			/**** generalization***/
			if (!eObject.getBase_Class().getGeneralizations().isEmpty())
			{
			 generalization = ":>"+eObject.getBase_Class().getGeneralizations().get(0).getGeneral().getName();
			}
			/*****************/
			String streotype = eObject.getBase_Class().getAppliedStereotypes().get(0).getName();
			String strprop = "";
			strprop=strprop.concat("@"+streotype+";");
			EList<Property> props = eObject.getBase_Class().getOwnedAttributes();
			if (props != null) {
				for (Property prop : props) {
					if (prop.eClass().getName().equals("Port")) {
						System.out.println("C'est un Port ");
						System.out.println("les OwnedElement du bloc : port " + prop.allOwnedElements());
			
						strprop = strprop.concat("\n");	
						Property propPort = prop;
						if (prop.getType()==null){
							String typeName="";
							String streotypeport = prop.getAppliedStereotypes().get(0).getName();
							strprop = strprop.concat(createPort(prop.getName(), typeName));
							strprop=strprop.concat("{@"+streotypeport+";}");
						}
						else {
						strprop = strprop.concat(createPort(prop.getName(),":"+ prop.getType().getName()));
						String streotypeport = prop.getAppliedStereotypes().get(0).getName();
						strprop=strprop.concat("{@"+streotypeport+";}");
						strprop = strprop.concat("\n");
					} 
					}else {
					prop.getName();
					prop.getStereotypeApplications();
					prop.getType();
					String tempprovisoir="ThermodynamicTemperatureValue";
					strprop = strprop.concat("\n");
					strprop = strprop.concat(createAttribute(prop.getName(),tempprovisoir ));
					strprop = strprop.concat("\n");

				}
				}
			}
			String name = eObject.getBase_Class().getName();
			this.sysmlResourceString = this.sysmlResourceString.concat(createInterfaceBlok(name+generalization, strprop));
			this.sysmlResourceString = this.sysmlResourceString.concat("\n");
		}

	}

	public EObject caseBlock(Block object) {
		EObject result = null;
		String generalisation="";
		
		if (object != null) {
			System.out.println("le stereotype appliqué est : "+object.getBase_Class().getAppliedStereotypes().get(0).getName());
			String streotype = object.getBase_Class().getAppliedStereotypes().get(0).getName();
			/**** generalization***/
			if (!object.getBase_Class().getGeneralizations().isEmpty())
			{
			 generalisation = ":>"+object.getBase_Class().getGeneralizations().get(0).getGeneral().getName();
			}
			/*********************/
			String strprop = "";
			strprop=strprop.concat("@"+streotype+";");		
			EList<Property> props = object.getBase_Class().getOwnedAttributes();
			System.out.println("les OwnedElement de l'object " + object.getBase_Class().getOwnedAttributes().toString());
			object.getBase_Class().getOwnedConnectors();
			if (props != null) {
				for (Property prop : props) {
					if (prop.eClass().getName().equals("Port")) {
						System.out.println("C'est un Port ");
						System.out.println("les OwnedElement du bloc : port " + prop.allOwnedElements());
			
						strprop = strprop.concat("\n");	
						Property propPort = prop;
						if (prop.getType()==null){
							String typeName="";
							String streotypeport = prop.getAppliedStereotypes().get(0).getName();
							strprop = strprop.concat(createPort(prop.getName(), typeName));
						}
						else
						strprop = strprop.concat(createPort(prop.getName(),":"+ prop.getType().getName()));
						String streotypeport = prop.getAppliedStereotypes().get(0).getName();
						strprop=strprop.concat("{@"+streotypeport+";}");										
						strprop = strprop.concat("\n");
					} else {
						prop.getName();
						prop.allOwnedElements();

						if (prop.isComposite()) {
							prop.getType().getName();
							prop.getType().allOwnedElements();
							System.out.println(prop.getType().getName() + prop.getType().allOwnedElements());
							/******************* Port **************/
							if (prop.getType().allOwnedElements() != null) {

								/*
								 * if(prop.getType().allOwnedElements().get(0).eClass().getName().equals("Port")
								 * ) { org.eclipse.uml2.uml.Element elem=
								 * prop.getType().allOwnedElements().get(0); String name =((Property)
								 * prop.getType().allOwnedElements().get(0)).getName(); String type =((Property)
								 * prop.getType().allOwnedElements().get(0)).getType().getName(); String
								 * attribute=""; attribute =attribute.concat("\n"); attribute =
								 * attribute.concat(createPort(name,type)); strprop =strprop.concat("\n");
								 * System.out.println("c'est un port"+prop.getType().allOwnedElements().get(0));
								 * String nameprop =prop.getName()+":"+prop.getType().getName();
								 * strprop=strprop.concat(createPartDefinition(nameprop,attribute)); strprop
								 * =strprop.concat("\n");
								 *//*
																			 * } } else {
																			 */

								strprop = strprop.concat("\n");
								String name = prop.getName() + ":" + prop.getType().getName();
								strprop = strprop.concat(createPartDefinitionPrperty(name));
								strprop = strprop.concat("\n");
							}

						} else {
							// System.out.println("les OwnedElement du bloc "+prop.allOwnedElements());
							prop.getStereotypeApplications();
							prop.getType();
							strprop = strprop.concat("\n");
							strprop = strprop.concat(createAttribute(prop.getName(), prop.getType().getName()));
							strprop = strprop.concat("\n");
						}
					}

				}
				EList<Connector> connectors = object.getBase_Class().getOwnedConnectors();
				for (Connector conect : connectors) {
					strprop = strprop.concat("\n");
					strprop = strprop.concat(caseConnector(conect));
					strprop = strprop.concat("\n");

				}
			}
			String name = object.getBase_Class().getName();
			this.sysmlResourceString = this.sysmlResourceString.concat(createPartDefinition(name+generalisation, strprop));
			this.sysmlResourceString = this.sysmlResourceString.concat("\n");
		}
		return result;
	}

	private String createConnector(String connectStart, String connectEnd) {

		ConnectorPart connect = new ConnectorPart();
		String element = connect.createConnector(connectStart, connectEnd);
		return element;
	}

	private String createPartDefinition(String name, String attributs) {
		Partdef partdef = new Partdef();
		String element = partdef.createPartDef(name, attributs);
		return element;
	}

	private String createPartDefinitionPrperty(String name) {
		PartdefProp partdefPop = new PartdefProp();
		String element = partdefPop.createPartDefProp(name);
		return element;
	}

	private String createAttribute(String name, String type) {

		Attribute attr = new Attribute();
		String element = attr.createAttribute(name, type);
		return element;
	}

	private String createPort(String name, String type) {
		Port port = new Port();
		String element = port.createPort(name, type);
		return element;
	}
	private String createUsecase(String name) {
		Usecase usecase = new Usecase();
		String element = usecase.createUsecase(name);
		return element;
	}
	private String createRequirements(String name) {
		Requirements requirement = new Requirements();
		String element = requirement.createRequirement(name);
		return element;
	}
	private String createOperation(String name) {
		Operation operation = new Operation();
		String element = operation.createOperation(name);
		return element;
	}
	private String createInterfaceBlok(String name, String attributs) {
		InterfaceBlok interfaceBlok = new InterfaceBlok();
		String element = interfaceBlok.createInterfaceBlok(name, attributs);
		return element;

	}

}
