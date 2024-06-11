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
 * 
 *  Ansgar Radermacher  ansgar.radermacher@cea.fr, initial API and implementation
 *  Asma Smaoui (CEA LIST) asma.smaoui@cea.fr - implementation
 *  Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr - implementation
 *
 *****************************************************************************/

package com.cea.afpvn.arrowhead.transformations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;



// TODO: Auto-generated Javadoc
/**
 * A set of utility functions around elements.
 */
public class ElementUtils {

	/**
	 * Retrieve an element from a list of named elements via its name.
	 *
	 * @param elementList a list of EObjects, of which some are UML named elements
	 * @param name        the name to look for
	 * @return the first element from the list that has the same name, or null if
	 *         none exists
	 */
	public static NamedElement getNamedElementFromList(EList<? extends EObject> elementList, String name) {
		for (EObject element : elementList) {
			if (element instanceof NamedElement) {
				NamedElement namedElement = (NamedElement) element;
				if ((namedElement.getName() != null) && namedElement.getName().equals(name)) {
					return namedElement;
				}
			}
		}
		return null;
	}

	/**
	 * Gets the root.
	 *
	 * @param element   an element which is owned by a model.
	 * @param subfolder the name of a sub-folder within root (created, if not
	 *                  existent)
	 * @return a reference to the sub folder within the root of the model that
	 *         belongs to the passed element.
	 */
	public static Package getRoot(Element element, String subfolder) {
		Package root = PackageUtil.getRootPackage(element);
		if (root.getNestedPackage(subfolder) != null) {
			return root.getNestedPackage(subfolder);
		} else {
			return root.createNestedPackage(subfolder);
		}
	}

	/**
	 * this method returns the component type of an implementation. It is based on
	 * the modeling convention that implementations inherit from types. TODO: It
	 * currently returns the first abstract (direct) superclass
	 * 
	 * @param clazz A component implementation
	 * @return the first abstract superclass
	 */
	public static Class componentType(Class clazz) {
		if (clazz.isAbstract()) {
			return clazz;
		} else {
			for (Class superclass : clazz.getSuperClasses()) {
				if (superclass.isAbstract()) {
					return superclass;
				}
			}
			return null;
		}
	}

	/**
	 * Checks if is composite.
	 *
	 * @param is an instance specification
	 * @return true, if an instance specification is a composite, i.e. has more than
	 *         1 slots
	 */
	public static boolean isComposite(InstanceSpecification is) {
		return (is.getSlots().size() > 0);
	}

	/**
	 * Get an element via its qualified name. This function will find the first
	 * element with a matching qualified name within the resource set associated
	 * with the passed element
	 *
	 * @param element       An element within a resource which in turn is part of
	 *                      the search resource set
	 * @param qualifiedName the qualified name of an element
	 * @return the found element or null
	 */
	public static NamedElement getQualifiedElementFromRS(Element element, String qualifiedName) {
		return getQualifiedTypeFromRS(element.eResource().getResourceSet(), qualifiedName);
	}

	/**
	 * Get an element via its qualified name. This function will find the first
	 * element with a matching qualified name within the resource set associated
	 * with the passed element. If the element is not found, load the passed URI
	 * into the resource set and try again The loading is done in the UI thread (see
	 * bug 572601) in case of a Papyrus model-set
	 *
	 * @param element       An element within a resource which in turn is part of
	 *                      the search resource set
	 * @param uri           the uri
	 * @param qualifiedName the qualified name of an element
	 * @return the found element or null
	 */
	public static NamedElement getQualifiedTypeFromRS(Element element, URI uri, String qualifiedName) {
		ResourceSet set = element.eResource().getResourceSet();
		NamedElement ne = getQualifiedTypeFromRS(set, qualifiedName);
		if (ne == null) {
			loadPackage(uri, set);
			ne = getQualifiedTypeFromRS(set, qualifiedName);
		}
		return ne;
	}

	/**
	 * Provide a wrapper for the packageUtil functionality. The loading is done in
	 * the UI thread (see bug 572601) in case of a Papyrus model-set
	 * 
	 * @param uri     the URI of the resource to load
	 * @param element an element, used to determine resource set
	 * @return the contained package, or null, if not found
	 */
	public static Package loadPackage(URI uri, Element element) {
		return loadPackage(uri, element.eResource().getResourceSet());
	}

	/**
	 * Provide a wrapper for the packageUtil functionality. The loading is done in
	 * the UI thread (see bug 572601) in case of a Papyrus model-set
	 * 
	 * @param uri the URI of the resource to load
	 * @param set a resource set
	 * @return the contained package, or null, if not found
	 */
	public static Package loadPackage(URI uri, ResourceSet set) {
		// if a Papyrus model set, and not yet loaded
		if (set instanceof ModelSet && set.getResource(uri, false) == null) {
			// execute in UI thread
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					set.getResource(uri, true);
				}
			});
			// resource is now already loaded, invocation of PackageUtil is now safe
		}
		return PackageUtil.loadPackage(uri, set);
	}

	/**
	 * loadPackage Get an element via its qualified name. This function will find
	 * the first element in the resource set that has this qualified name (whether
	 * imported or not)
	 *
	 * @param rs            a resource set
	 * @param qualifiedName the qualified name of an element
	 * @return the found element or null
	 */
	public static NamedElement getQualifiedTypeFromRS(ResourceSet rs, String qualifiedName) {
		for (Resource resource : rs.getResources()) {
			if (resource instanceof UMLResource) {
				if (resource.getContents().size() > 0) {
					EObject topLevelElem = resource.getContents().get(0);
					if (topLevelElem instanceof Package) {
						NamedElement ne = getQualifiedType((Package) topLevelElem, qualifiedName);
						if (ne != null) {
							return ne;
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Get an element via its qualified name. It will ignore imports
	 *
	 * @param root          the root element (package) of a model
	 * @param qualifiedName the qualified name of an element
	 * @return the found element or null
	 */
	public static NamedElement getQualifiedType(Package root, String qualifiedName) {
		String[] path = qualifiedName.split(NamedElement.SEPARATOR);

		return getQualifiedType(root, path, 0);

	}

	/**
	 * Retrieve an element via its qualified name within a root package.
	 *
	 * @param root the root
	 * @param path the path
	 * @param pos  the pos
	 * @return the found element, if it exists
	 */
	public static NamedElement getQualifiedType(Package root, String[] path, int pos) {
		if (root == null) {
			return null;
		}
		if (pos == path.length) {
			return root;
		} else if (pos < path.length) {
			NamedElement segmentElem = root.getPackagedElement(path[pos++]);
			if (segmentElem == null) {
				segmentElem = root.getOwnedType(path[pos]);
			}
			if (segmentElem != null) {
				if (pos == path.length - 1) {
					// System.err.println("Found Data Type "+segmentElem.getName());
					return segmentElem;
				} else if (segmentElem instanceof Package) {
					// requires further recursion
					NamedElement foundElement = getQualifiedType((Package) segmentElem, path, pos);
					// return, if not found
					if (foundElement != null) {
						return foundElement;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Gets the checks for semantics application.
	 *
	 * @param element the element
	 * @return the checks for semantics application
	 */
	public static HasSemantics getHasSemanticsApplication(Element element) {
		HasSemantics hassemantics = null;
		if (element != null) {
			hassemantics = UMLUtil.getStereotypeApplication(element, HasSemantics.class);
		}
		return hassemantics;

	}

	/**
	 * Convert key elements.
	 *
	 * @param keyType the key type from XML document
	 * @return the key elements
	 */
	public static KeyElements convertKeyType(TypeType keyType) {

		if (keyType.getLiteral() != null) {
			switch (keyType.getLiteral()) {
			case "AccessPermissionRule":
				return KeyElements.GLOBAL_REFERENCE;
			case "ConceptDescription":
				return KeyElements.CONCEPT_DESCRIPTION;
			case "AnnotatedRelationshipElement":
				return KeyElements.ANNOTATED_RELATIONSHIP_ELEMENT;
			case "Asset":
				return KeyElements.ASSET;
			case "AssetAdministrationShell":
				return KeyElements.ASSET_ADMINISTRATION_SHELL;
			case "BasicEvent":
				return KeyElements.BASIC_EVENT;
			case "Blob":
				return KeyElements.BLOB;
			case "Capability":
				return KeyElements.CAPABILITY;
			case "ConceptDictionary":
				return KeyElements.CONCEPT_DICTIONARY;
			case "DataElement":
				return KeyElements.DATA_ELEMENT;
			case "Entity":
				return KeyElements.ENTITY;
			case "Event":
				return KeyElements.EVENT;
			case "File":
				return KeyElements.FILE;
			case "FragmentReference":
				return KeyElements.FRAGMENT_REFERENCE;

			case "GlobalReference":
				return KeyElements.GLOBAL_REFERENCE;

			case "Operation":
				return KeyElements.OPERATION;

			case "MultiLanguageProperty":
				return KeyElements.MULTI_LANGUAGE_PROPERTY;

			case "Property":
				return KeyElements.PROPERTY;
			case "Range":
				return KeyElements.RANGE;

			case "ReferenceElement":
				return KeyElements.REFERENCE_ELEMENT;

			case "RelationshipElement":
				return KeyElements.RELATIONSHIP_ELEMENT;
			case "Submodel":
				return KeyElements.SUBMODEL;
			case "SubmodelElement":
				return KeyElements.SUBMODEL_ELEMENT;
			case "SubmodelElementCollection":
				return KeyElements.SUBMODEL_ELEMENT_COLLECTION;
			case "View":
				return KeyElements.VIEW;
			default:
				return KeyElements.GLOBAL_REFERENCE;
			}
		}
		return KeyElements.GLOBAL_REFERENCE;

	}

	/**
	 * Convert key type from XML file.
	 *
	 * @param idType the id type
	 * @return the key type
	 */
	public static KeyType convertIdType(IdTypeType1 idType) {

		if (idType.getLiteral() != null) {
			switch (idType.getLiteral()) {
			case "Custom":
				return KeyType.CUSTOM;
			case "IRDI":
				return KeyType.IRDI;
			case "IRI":
				return KeyType.IRI;
			case "IdShort":
				return KeyType.ID_SHORT;
			case "FragmentId":
				return KeyType.FRAGMENT_ID;
			default:
				return KeyType.CUSTOM;
			}
		}
		return KeyType.CUSTOM;

	}

	/**
	 * Convert mime type from XML file.
	 *
	 * @param mimeType the mime type
	 * @return the mime type
	 */
	public static MimeType convertMimeType(String mimeType) {

		if (mimeType != null) {
			switch (mimeType) {
			case "application/json":
				return MimeType.APPLICATIONJSON;
			case "application/x-msexcel":
				return MimeType.APPLICATIONXLS;
			case "application/vnd.ms-excel":
				return MimeType.APPLICATIONXLS;
			case "image/jpeg":
				return MimeType.IMAGEJPEG;
			case "application/pdf":
				return MimeType.APPLICATIONPDF;
			case "application/zip":
				return MimeType.APPLICATIONZIP;
			case "image/bmp":
				return MimeType.IMAGEBMP;
			case "image/png":
				return MimeType.IMAGEPNG;
			case "image/gif":
				return MimeType.IMAGEGIF;
			case "text/html":
				return MimeType.TEXTHTML;
			case "text/xml":
				return MimeType.TEXTXML;
			case "text/plain":
				return MimeType.TEXTPLAIN;
			case "application/step":
				return MimeType.APPLICATIONSTEP;
			case "application/xml":
				return MimeType.APPLICATIONXML;
			case "application/iges":
				return MimeType.APPLICATIONIGES;
				

			}
		}
		return MimeType.OTHER;

	}
	
	/**
	 * Convert type.
	 *
	 * @param typeName the type name
	 * @return the string
	 */
	public static String convertType(String typeName) {
		// TODO Auto-generated method stub
		switch (typeName) {
		case "int":
			return "XMLPrimitiveTypes::Int";
			
		case "boolean":
			return "XMLPrimitiveTypes::Boolean";
			
		case "string":
			return "XMLPrimitiveTypes::String";
			
		case "float":
			return "XMLPrimitiveTypes::Float";
			
		case "double":
			return "XMLPrimitiveTypes::Double";
			
		case "short":
			return "XMLPrimitiveTypes::Short";
			
		case "unsignedshort":
			return "XMLPrimitiveTypes::UnsignedShort";
			
		case "unsignedint":
			return "XMLPrimitiveTypes::UnsignedInt";
			
		case "unsignedbyte":
			return "XMLPrimitiveTypes::UnsignedByte";
			
		case "unsignedlong":
			return "XMLPrimitiveTypes::UnsignedLong";
			
		case "unsignedintobject":
			return "XMLPrimitiveTypes::UnsignedIntObject";
			
		case "positiveinteger":
			return "XMLPrimitiveTypes::PositiveInteger";
			
		case "nonnegativeinteger":
			return "XMLPrimitiveTypes::NonNegativeInteger";
			
		case "nonpositiveinteger":
			return "XMLPrimitiveTypes::NonPositiveInteger";
			
		case "negativeinteger":
			return "XMLPrimitiveTypes::NegativeInteger";
			
		case "date":
			return "XMLPrimitiveTypes::Date";
			
		case "decimal":
			return "XMLPrimitiveTypes::Decimal";
			
		case "datetime":
			return "XMLPrimitiveTypes::DateTime";
			
		case "duration":
			return "XMLPrimitiveTypes::Duration";
			
		case "integer":
			return "XMLPrimitiveTypes::Integer";
			
		case "byte":
			return "XMLPrimitiveTypes::Byte";
			
		case "hexbinary":
			return "XMLPrimitiveTypes::HexBinary";
			
		case "anysimpletype":
			return "XMLPrimitiveTypes::AnySimpleType";
			
		case "anyuri":
			return "XMLPrimitiveTypes::AnyURI";
			
		case "base64binary":
			return "XMLPrimitiveTypes::Base64Binary";
			
		case "long":
			return "XMLPrimitiveTypes::Long";
			
		case "longobject":
			return "XMLPrimitiveTypes::LongObject";
			
		case "booleanobject":
			return "XMLPrimitiveTypes::BooleanObject";
			
		case "byteobject":
			return "XMLPrimitiveTypes::ByteObject";
			
		case "doubleobject":
			return "XMLPrimitiveTypes::DoubleObject";
			
		case "entities":
			return "XMLPrimitiveTypes::ENTITIES";
			
		case "entitiesbase":
			return "XMLPrimitiveTypes::ENTITIESBase";
			
		case "entity":
			return "XMLPrimitiveTypes::ENTITY";
		
		case "gday":
			return "XMLPrimitiveTypes::GDay";
			
		case "gmonth":
			return "XMLPrimitiveTypes::GMonth";
			
		case "gmonthday":
			return "XMLPrimitiveTypes::GMonthDay";
			
		case "gyear":
			return "XMLPrimitiveTypes::GYear";
			
		case "gyearmonth":
			return "XMLPrimitiveTypes::GYearMonth";
		
		case "id":
			return "XMLPrimitiveTypes::ID";
			
		case "idref":
			return "XMLPrimitiveTypes::IDREF";
			
		case "idrefs":
			return "XMLPrimitiveTypes::IDREFS";
			
		case "idrefsbase":
			return "XMLPrimitiveTypes::IDREFSBase";
			
		case "language":
			return "XMLPrimitiveTypes::Language";
			
		case "name":
			return "XMLPrimitiveTypes::Name";
			
		case "ncname":
			return "XMLPrimitiveTypes::NCName";
			
		case "nmtoken":
			return "XMLPrimitiveTypes::NMTOKEN";
			
		case "nmtokens":
			return "XMLPrimitiveTypes::NMTOKENS";
			
		case "nmtokensbase":
			return "XMLPrimitiveTypes::NMTOKENSBase";
			
		case "normalizedstring":
			return "XMLPrimitiveTypes::NormalizedString";
			
		case "notation":
			return "XMLPrimitiveTypes::NOTATION";
			
		case "qname":
			return "XMLPrimitiveTypes::QName";
			
		case "shortobject":
			return "XMLPrimitiveTypes::ShortObject";
			
		case "token":
			return "XMLPrimitiveTypes::Token";
			
		case "unsignedbyteobject":
			return "XMLPrimitiveTypes::UnsignedByteObject";
			
		case "unsignedshortobject":
			return "XMLPrimitiveTypes::UnsignedShortObject";
			
		}
		return "XMLPrimitiveTypes::String";
	}

	/**
	 * Transform lang enum literals.
	 *
	 * @param langEnum the lang enum
	 * @return the lang enum
	 */
	public static LangEnum transformLangEnumLiterals(String langEnum) {
		switch (langEnum) {
		//English
		case "en":
			return LangEnum.EN;
		//German
		case "de":
			return LangEnum.DE;
		//French
		case "fr":
			return LangEnum.FR;
		//Italian
		case "it":
			return LangEnum.IT;
		//Spanish
		case "es":
			return LangEnum.ES;
		//Polish
		case "pl":
			return LangEnum.PL;
		//Serbian
		case "sr":
			return LangEnum.SR;
		//Arabic
		case "ar":
			return LangEnum.AR;
		//Chinese
		case "cn": 
		case "zh":
			return LangEnum.ZH;
		//Korean
		case "ko":
		case "kr":
			return LangEnum.KO;
		//Japanese
		case "jp": 
		case "ja":
			return LangEnum.JA;
		//Czech
		case "cs":
			return LangEnum.CS;
		//Danish
		case "da":
			return LangEnum.DA;
		//Hindi
		case "hi":
			return LangEnum.HI;
		//Indonesian
		case "id":
			return LangEnum.ID;
		//Malayalam
		case "ml":
			return LangEnum.ML;
		//Dutch, Flemish
		case "nl":
			return LangEnum.NL;
		//Norwegian
		case "no":
			return LangEnum.NO;
		//Russian
		case "ru":
			return LangEnum.RU;
		//Swedish
		case "sv":
			return LangEnum.SV;
		//Thai
		case "th":
			return LangEnum.TH;
		//Turkish
		case "tr":
			return LangEnum.TR;
			
		default:
			return LangEnum.EN;
		}
	}
	
	/**
	 * Transform id type literals.
	 *
	 * @param idType1 the id type 1
	 * @return the int
	 */
	public static int transformIdTypeLiterals(IdTypeType idType1) {
		switch (idType1.getValue()) {

		case IdTypeType.CUSTOM_VALUE:
			return IdentifierType.CUSTOM_VALUE;
		case IdTypeType.IRDI_VALUE:
			return IdentifierType.IRDI_VALUE;
		case IdTypeType.IRI_VALUE:
			return IdentifierType.IRI_VALUE;
		default:
			return IdentifierType.CUSTOM_VALUE;
		}

	}

}
