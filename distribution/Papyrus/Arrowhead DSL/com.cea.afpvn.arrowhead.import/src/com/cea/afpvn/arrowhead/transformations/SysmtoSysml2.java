package com.cea.afpvn.arrowhead.transformations;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.sysml16.blocks.Block;
import org.eclipse.papyrus.sysml16.blocks.util.BlocksSwitch;
import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;
import com.cea.afpvn.arrowhead.xtend.Attribute;
import com.cea.afpvn.arrowhead.xtend.ConnectorPart;
import com.cea.afpvn.arrowhead.xtend.InterfaceBlok;
import com.cea.afpvn.arrowhead.xtend.Partdef;
import com.cea.afpvn.arrowhead.xtend.PartdefProp;
import com.cea.afpvn.arrowhead.xtend.Port;

public class SysmtoSysml2 extends BlocksSwitch<EObject> {
	/** The uml resource. */
	public Resource umlResource;
	public String sysmlResourceString;
	public String sysmlResourceStringTransi;

	public String doTransformSysml1toSysml2(Resource umlResource) {
		this.umlResource = umlResource;
		this.sysmlResourceString = "import ScalarValues::*;\r\n"
				+ "import ISQBase::*;\n";
		String result;
		umlResource.getClass().getName();
		Iterator<EObject> iter = umlResource.getAllContents();

		// call transfo for all diagrams
		while (iter.hasNext()) {
			EObject eObject = iter.next();
			eObject.getClass().getTypeName();
			if (eObject instanceof InterfaceBlock) {
				caseInterfaceBlock((InterfaceBlock) eObject);

			} else if (eObject instanceof Block) {
				caseBlock((Block) eObject);

			} else if (eObject instanceof Connector) {
				caseConnector((Connector) eObject);

			}
		}

		return sysmlResourceString ;
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
		if (eObject != null) {
			EList<Property> props = eObject.getBase_Class().getOwnedAttributes();
			String strprop = "";
			if (props != null) {
				for (Property prop : props) {
					prop.getName();
					prop.getStereotypeApplications();
					prop.getType();
					String tempprovisoir="ThermodynamicTemperatureValue";
					strprop = strprop.concat("\n");
					strprop = strprop.concat(createAttribute(prop.getName(),tempprovisoir ));
					strprop = strprop.concat("\n");

				}
			}

			this.sysmlResourceString = this.sysmlResourceString.concat(createInterfaceBlok(eObject, strprop));
			this.sysmlResourceString = this.sysmlResourceString.concat("\n");
		}

	}

	public EObject caseBlock(Block object) {
		EObject result = null;
		System.out.println("contenue " + object.getParts());
		if (object != null) {
			EList<Property> props = object.getBase_Class().getOwnedAttributes();
			System.out
					.println("les OwnedElement de l'object " + object.getBase_Class().getOwnedAttributes().toString());
			String strprop = "";
			object.getBase_Class().getOwnedConnectors();
			if (props != null) {
				for (Property prop : props) {
					if (prop.eClass().getName().equals("Port")) {
						System.out.println("C'est un Port ");
						System.out.println("les OwnedElement du bloc : port " + prop.allOwnedElements());
						strprop = strprop.concat("\n");
						strprop = strprop.concat(createPort(prop.getName(), prop.getType().getName()));
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
			this.sysmlResourceString = this.sysmlResourceString.concat(createPartDefinition(name, strprop));
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

	private String createInterfaceBlok(InterfaceBlock eObject, String attributs) {
		String name = eObject.getBase_Class().getName();
		InterfaceBlok interfaceBlok = new InterfaceBlok();
		String element = interfaceBlok.createInterfaceBlok(name, attributs);
		return element;

	}

}
