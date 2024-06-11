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
 *  Asma Smaoui (CEA LIST) asma.smaoui@cea.fr - Initial API and implementation
 *  Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package com.cea.afpvn.arrowhead.transformations;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.tools.commands.ApplyStereotypeCommand;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * The Class AAS2UMLSwitch.
 */
public class AAS2UMLSwitch extends _0Switch<EObject> {

	/** The transformed map. */
	public Map<EObject, EObject> transformedMap = new HashMap<>();

	/** The uml resource. */
	public Resource umlResource;

	/** The aasx resource. */
	public Resource aasxResource;

	/** The domain. */
	public TransactionalEditingDomain domain;

	/** The uml elements. */
	List<EObject> umlElements = new ArrayList<>();

	/** The assenvironment. */
	public AasenvT assenvironment;

	/** The xml library path. */
	private String XML_LIBRARY_PATH = "pathmap://UML_LIBRARIES/XMLPrimitiveTypes.library.uml"; //$NON-NLS-1$

	/**
	 * Do transform.
	 *
	 * @param aasxResource the aasx resource
	 * @param umlResource  the uml resource
	 * @return the resource
	 */
	public Resource doTransform(Resource aasxResource, Resource umlResource) {
		this.umlResource = umlResource;
		this.aasxResource = aasxResource;
		ServicesRegistry registry = createServicesRegistry();
		this.domain = getTransactionalDomain(registry);
		Iterator<EObject> iter = aasxResource.getAllContents();

		// call transfo for all diagrams in the rhapsody project
		while (iter.hasNext()) {
			EObject eObject = iter.next();
			if (eObject instanceof DocumentRoot) {
				AasenvT aasenv = ((DocumentRoot) eObject).getAasenv();
				this.assenvironment = aasenv;
				transform(aasenv);
			}
		}
		// umlResource.getContents().addAll(umlElements);

		try {
			umlResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// deleteTemporaryFiles();
		return umlResource;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
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

	/**
	 * Transform.
	 *
	 * @param object the object
	 * @return the e object
	 */
	private EObject transform(EObject object) {

		// first called for AssetT , doswitch calls the case AssetT ovverriden here
		EObject ret = null;
		if (object != null) {
			ret = transformedMap.get(object);
			if (ret == null) {
				ret = doSwitch(object);

			}
		}

		return ret;
	}

	/**
	 * Transform.
	 *
	 * @param object    the object
	 * @param container the container
	 * @return the e object
	 */
	private EObject transform(PropertyT object, EObject container) {
		EObject ret = null;
		if (object != null) {
			ret = transformedMap.get(object);
			if (ret == null) {
				// do not call doSwith here because we need the container
				EObject result = null;
				if (object != null) {
					result = createProperty(object, container);
				}
				transformedMap.put(object, result);
				umlElements.add(result);
				ret = result;
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

	/**
	 * Case aasenv T.
	 *
	 * @param object the object
	 * @return the e object
	 */
	@Override
	public EObject caseAasenvT(AasenvT object) {
		// this is equivalent to Model root UML in UML
		// model already created, so we only return the Model, do not create any thing
		transform(object.getAssetAdministrationShells());
		transform(object.getAssets());
		transform(object.getSubmodels());
		transform(object.getConceptDescriptions());
		// Now that all objects are transformed, fill in the references
		// for references, the identification attribute should be filled
		addReferences();
		// add references to to fill in the 3 derived attributes,
		// AAS.submodel
		// Submodel.submodelElement
		// SEC.value
		setContainers();
		return null;
	}

	/**
	 * Case asset administration shells T.
	 *
	 * @param object the object
	 * @return the e object
	 */
	@Override
	public EObject caseAssetAdministrationShellsT(AssetAdministrationShellsT object) {

		EObject result = null;
		if (object != null) {
			result = createPackage("AAS");

		}
		transformedMap.put(object, result);
		umlElements.add(result);

		// transform the contents of AASsT
		EList<AssetAdministrationShellT> aasList = object.getAssetAdministrationShell();
		if (aasList != null && !aasList.isEmpty())
			for (AssetAdministrationShellT aas : aasList) {
				transform(aas);
			}
		return result;
	}

	/**
	 * Case asset administration shell T.
	 *
	 * @param object the object
	 * @return the e object
	 */
	@Override
	public EObject caseAssetAdministrationShellT(AssetAdministrationShellT object) {
		// we create an AAS
		EObject result = null;
		if (object != null) {

			result = createAssetAdministrationShell(object);

		}
		transformedMap.put(object, result);
		umlElements.add(result);
		return result;
	}

	/**
	 * Case assets T.
	 *
	 * @param object the object
	 * @return the e object
	 */
	@Override
	public EObject caseAssetsT(AssetsT object) {
		// we create a Package for Assets
		EObject result = null;
		if (object != null) {
			result = createPackage("Assets");

		}
		transformedMap.put(object, result);
		umlElements.add(result);

		// transform the contents of AssetsT
		EList<AssetT> assetList = object.getAsset();
		if (assetList != null && !assetList.isEmpty())
			for (AssetT asset : assetList) {
				transform(asset);
			}
		return result;
	}

	/**
	 * Case asset T.
	 *
	 * @param object the object
	 * @return the e object
	 */
	@Override
	public EObject caseAssetT(AssetT object) {
		// we create an Asset
		EObject result = null;
		if (object != null) {

			result = createAsset(object);

		}
		transformedMap.put(object, result);
		umlElements.add(result);
		return result;
	}

	@Override
	public EObject caseConceptDescriptionsT(ConceptDescriptionsT object) {
		// we create a Package for ConceptDescrptions
		EObject result = null;
		if (object != null) {
			result = createPackage("ConceptDescriptions");

		}
		transformedMap.put(object, result);
		umlElements.add(result);

		// transform the contents of AssetsT
		EList<ConceptDescriptionT> cdList = object.getConceptDescription();
		if (cdList != null && !cdList.isEmpty())
			for (ConceptDescriptionT asset : cdList) {
				transform(asset);
			}
		return result;
	}

	@Override
	public EObject caseConceptDescriptionT(ConceptDescriptionT object) {
		// we create a ConceptDescription
		EObject result = null;
		if (object != null) {

			result = createConceptDescription(object);

		}
		transformedMap.put(object, result);
		umlElements.add(result);
		return result;

	}

	/**
	 * Case submodels T.
	 *
	 * @param object the object
	 * @return the e object
	 */
	@Override
	public EObject caseSubmodelsT(SubmodelsT object) {
		// we create a Package for Submodels
		EObject result = null;
		if (object != null) {
			result = createPackage("Submodels");

		}
		transformedMap.put(object, result);
		umlElements.add(result);

		// transform the contents of Submodels
		EList<SubmodelT> submodelList = object.getSubmodel();
		if (submodelList != null && !submodelList.isEmpty())
			for (SubmodelT submodel : submodelList) {
				transform(submodel);
			}
		return result;
	}

	/**
	 * Case submodel T.
	 *
	 * @param object the object
	 * @return the e object
	 */
	@Override
	public EObject caseSubmodelT(SubmodelT object) {
		// we create an Submodel
		EObject result = null;
		if (object != null) {

			result = createSubModel(object);

		}
		transformedMap.put(object, result);
		umlElements.add(result);

		// parse the list of submodelelements then get submodelelementcollection
		SubmodelElementsT submodelElements = object.getSubmodelElements();
		transforms(submodelElements);

		// parse the list of other submodelElements and transform them with the submodel
		// as Container
		transforms(submodelElements, result);

		return result;
	}

	/**
	 * Case submodel element collection T.
	 *
	 * @param object the object
	 * @return the e object
	 */
	@Override
	public EObject caseSubmodelElementCollectionT(SubmodelElementCollectionT object) {

		EObject result = null;
		if (object != null) {

			result = createSubmodelElementCollection(object);

		}
		transformedMap.put(object, result);
		umlElements.add(result);

		SubmodelElementsT submodelElements = object.getValue();
		transforms(submodelElements, result);

		return result;
	}

	/**
	 * Sets the containers.
	 */
	private void setContainers() {

		CompositeTransactionalCommand command = new CompositeTransactionalCommand(domain,
				"Setting Submodel containers"); //$NON-NLS-1$

		for (Map.Entry<EObject, EObject> m : transformedMap.entrySet()) {

			List<EObject> eobjects = new ArrayList<EObject>();
			if (m.getKey() instanceof AssetAdministrationShellT) {

				AssetAdministrationShellT sourceAas = (AssetAdministrationShellT) (m.getKey());

				// get the list of the submodels
				EList<ReferenceT> referenceT = sourceAas.getSubmodelRefs().getSubmodelRef();

				for (ReferenceT reference : referenceT) {
					String keyuri = reference.getKeys().getKey().get(0).getValue();
					EObject eObject = getElementFromUri(keyuri, _0Package.Literals.SUBMODEL_T);
					eobjects.add(eObject);
				}

				// add submodels to the AAS
				if (!eobjects.isEmpty()) {
					AbstractTransactionalCommand setSubmodelContainer = SetContainer(sourceAas, eobjects);
					command.add(setSubmodelContainer);
				}
			}
			if (m.getKey() instanceof SubmodelT) {
				SubmodelT sourceSubmodel = (SubmodelT) (m.getKey());
				// get the list of the submodelelementElements
				SubmodelElementsT submodelElements = sourceSubmodel.getSubmodelElements();
				if (submodelElements != null) {
					for (SubmodelElementT submodelelement : submodelElements.getSubmodelElement()) {
						if (submodelelement.getSubmodelElementCollection() != null) {
							EObject eObject = submodelelement.getSubmodelElementCollection();
							eobjects.add(eObject);
						}

					}
				}
				// add SECs to Submodel
				if (!eobjects.isEmpty()) {
					AbstractTransactionalCommand setSubmolElementContainer = SetContainer(sourceSubmodel, eobjects);
					command.add(setSubmolElementContainer);
				}
			}

			if (m.getKey() instanceof SubmodelElementCollectionT) {

				SubmodelElementCollectionT sourceSubmodelElementCollection = (SubmodelElementCollectionT) (m.getKey());

				// get the list of the secs
				SubmodelElementsT submodelElements = sourceSubmodelElementCollection.getValue();
				if (submodelElements != null) {
					for (SubmodelElementT submodelelement : submodelElements.getSubmodelElement()) {
						if (submodelelement.getSubmodelElementCollection() != null) {
							EObject eObject = submodelelement.getSubmodelElementCollection();
							eobjects.add(eObject);
						}

					}
				}
				// add Secs to Sec
				if (!eobjects.isEmpty()) {
					AbstractTransactionalCommand setSECContainer = SetContainer(sourceSubmodelElementCollection,
							eobjects);
					command.add(setSECContainer);
				}
			}
		}

		// execute command
		if (command != null && command.canExecute())
			try {
				command.execute(null, null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	/**
	 * Adds the references.
	 */
	private void addReferences() {

		CompositeTransactionalCommand command = new CompositeTransactionalCommand(domain,
				"Setting Sterteotype References Value"); //$NON-NLS-1$
		for (Map.Entry<EObject, EObject> m : transformedMap.entrySet()) {

			// setting the asset and the submodel references
			if (m.getKey() instanceof AssetAdministrationShellT) {

				AssetAdministrationShellT sourceAas = (AssetAdministrationShellT) (m.getKey());

				// only one asset can be linked to an AAS
				if (sourceAas.getAssetRef() != null && sourceAas.getAssetRef().getKeys() != null
						&& sourceAas.getAssetRef().getKeys().getKey() != null
						&& !sourceAas.getAssetRef().getKeys().getKey().isEmpty()) {
					String uri = sourceAas.getAssetRef().getKeys().getKey().get(0).getValue();
					ArrayList<String> assetUris = new ArrayList<>();
					assetUris.add(uri);
					AbstractTransactionalCommand setAssetRef = SetReference(sourceAas, assetUris,
							_0Package.Literals.ASSET_T, AASPackage.Literals.ASSET,
							AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET);
					command.add(setAssetRef);
				}

				// add submodels to the AAS
				EList<ReferenceT> referenceT = sourceAas.getSubmodelRefs().getSubmodelRef();
				ArrayList<String> SubModelUris = new ArrayList<>();
				for (ReferenceT reference : referenceT) {
					String keyuri = reference.getKeys().getKey().get(0).getValue();
					SubModelUris.add(keyuri);

				}

			}
		}

		// execute command
		if (command != null && command.canExecute())
			try {
				command.execute(null, null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	/**
	 * Sets the container.
	 *
	 * @param container     the container
	 * @param sourceObjects the source objects
	 * @return the abstract transactional command
	 */
	private AbstractTransactionalCommand SetContainer(EObject container, List<EObject> sourceObjects) {

		List<EObject> targetEobjects = new ArrayList<EObject>();
		Element targetcontainer = (Element) transformedMap.get(container);

		for (int i = 0; i < sourceObjects.size(); i++) {
			EObject sourceObject = sourceObjects.get(i);
			Element targetObject = (Element) transformedMap.get(sourceObject);
			if (targetObject != null) {
				targetEobjects.add(targetObject);
			} else {
				System.out.println("this this the pb in this container" + container.toString()
						+ "and this list is not good " + sourceObjects.toString());
			}

		}

		AbstractTransactionalCommand c = new AbstractTransactionalCommand(domain, "setContainer", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1)
					throws ExecutionException {
				// set the container of the submodels to the targetAAS
				if (targetEobjects != null && !targetEobjects.isEmpty() && targetcontainer instanceof Class)
					((Class) targetcontainer).getNestedClassifiers()
							.addAll((Collection<? extends Classifier>) targetEobjects);

				return CommandResult.newOKCommandResult();
			}
		};
		return c;
	}

	/**
	 * Sets the reference.
	 *
	 * @param sourceAas                   the source aas
	 * @param uris                        the uris
	 * @param eclassSource                the eclass source
	 * @param eclasstarget                the eclasstarget
	 * @param assetAdministrationShellRef the asset administration shell ref
	 * @return the abstract transactional command
	 */
	private AbstractTransactionalCommand SetReference(AssetAdministrationShellT sourceAas, List<String> uris,
			EClass eclassSource, EClass eclasstarget, int assetAdministrationShellRef) {

		List<EObject> eobject = new ArrayList<EObject>();
		Element targetAas = (Element) transformedMap.get(sourceAas);
		Stereotype stereotype = targetAas.getAppliedStereotypes().get(0);
		String name = getTargetPropertyFromAASSource(assetAdministrationShellRef);

		if (uris.size() == 1) {
			EObject sourceObject = getElementFromUri(uris.get(0), eclassSource);
			Element targetObject = (Element) transformedMap.get(sourceObject);
			eobject.add(getStereotypeApplication(targetObject, eclasstarget));
			// add a list
		} else if (uris.size() > 1) {

			for (int i = 0; i < uris.size(); i++) {
				EObject sourceObject = getElementFromUri(uris.get(i), eclassSource);
				Element targetObject = (Element) transformedMap.get(sourceObject);
				eobject.add(getStereotypeApplication(targetObject, eclasstarget));

			}
		}

		AbstractTransactionalCommand c = new AbstractTransactionalCommand(domain, name, null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1)
					throws ExecutionException {
				if (eobject.get(0) instanceof Asset)
					targetAas.setValue(stereotype, name, eobject.get(0));
				else
					targetAas.setValue(stereotype, name, eobject);

				return CommandResult.newOKCommandResult();
			}
		};
		return c;
	}

	/**
	 * Gets the element from uri.
	 *
	 * @param uri    the uri
	 * @param eclass the eclass
	 * @return the element from uri
	 */
	private EObject getElementFromUri(String uri, EClass eclass) {

		if (eclass.equals(_0Package.Literals.ASSET_T)) {
			EList<AssetT> objectList = assenvironment.getAssets().getAsset();
			if (objectList != null && !objectList.isEmpty())
				for (AssetT asset : objectList) {
					if (asset.getIdentification().getValue().equals(uri))
						return asset;
				}
		} else if (eclass.equals(_0Package.Literals.SUBMODEL_T)) {
			EList<SubmodelT> objectList = assenvironment.getSubmodels().getSubmodel();

			if (objectList != null && !objectList.isEmpty())
				for (SubmodelT submodel : objectList) {
					if (submodel.getIdentification().getValue().equals(uri))
						return submodel;
				}
		}
		return null;
	}

	/**
	 * Gets the stereotype application.
	 *
	 * @param targetObject the target object
	 * @param eclass       the eclass
	 * @return the stereotype application
	 */
	private EObject getStereotypeApplication(Element targetObject, EClass eclass) {

		Object[] list = EcoreUtil.getObjectsByType(umlResource.getContents(), eclass).toArray();

		for (Object referable : list) {
			if (referable instanceof Referable && ((Referable) referable).getBase_Class().equals(targetObject)) {
				return (EObject) referable;
			}
		}
		return null;
	}

	/**
	 * Gets the target property from AAS source.
	 *
	 * @param attributeID the attribute ID
	 * @return the target property from AAS source
	 */
	private String getTargetPropertyFromAASSource(int attributeID) {
		switch (attributeID) {

		case AASPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
			return "asset";
		case AASPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
			return "submodel";

		default:
			return null;
		}
	}

	/**
	 * Transforms.
	 *
	 * @param submodelElements the submodel elements
	 * @param result           the result
	 */
	private void transforms(SubmodelElementsT submodelElements, EObject result) {
		if (submodelElements.getSubmodelElement() != null && !submodelElements.getSubmodelElement().isEmpty()) {

			for (SubmodelElementT submodelelement : submodelElements.getSubmodelElement()) {
				if (submodelelement.getProperty() != null) {
					PropertyT property = submodelelement.getProperty();
					transform(property, result);

				} else if (submodelelement.getOperation() != null) {
					OperationT operation = submodelelement.getOperation();
					transform(operation, result);

				} else if (submodelelement.getMultiLanguageProperty() != null) {
					MultiLanguagePropertyT mlp = submodelelement.getMultiLanguageProperty();
					transform(mlp, result);

				} else if (submodelelement.getFile() != null) {
					FileT file = submodelelement.getFile();
					transform(file, result);
				}

			}

		}

	}

	/**
	 * @param file
	 * @param result
	 */
	private EObject transform(FileT file, EObject container) {
		// TODO Auto-generated method stub
		EObject ret = null;
		if (file != null) {
			ret = transformedMap.get(file);
			if (ret == null) {
				// do not call doSwith here because we need the container
				EObject result = null;

				result = createFile(file, container);

				transformedMap.put(file, result);
				umlElements.add(result);
				ret = result;
			}
		}

		return ret;

	}

	/**
	 * @param file
	 * @param container
	 * @return
	 */
	private EObject createFile(FileT file, EObject container) {
		String name = "";
		if (file.getIdShort() != null) {
			name = file.getIdShort().getValue();
		}

		Property element = createProperty(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::File");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(file, element);

		return element;
	}

	/**
	 * @param mlp
	 * @param container
	 */
	private EObject transform(MultiLanguagePropertyT mlp, EObject container) {
		// TODO Auto-generated method stub
		EObject ret = null;
		if (mlp != null) {
			ret = transformedMap.get(mlp);
			if (ret == null) {
				// do not call doSwith here because we need the container
				EObject result = null;

				result = createMLP(mlp, container);

				transformedMap.put(mlp, result);
				umlElements.add(result);
				ret = result;
			}
		}

		return ret;

	}

	/**
	 * @param mlp
	 * @param container
	 * @return
	 */
	private EObject createMLP(MultiLanguagePropertyT mlp, EObject container) {
		String name = mlp.getIdShort().getValue();

		Property element = createProperty(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::MultiLanguageProperty");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(mlp, element);

		return element;
	}

	/**
	 * Transform.
	 *
	 * @param operation the operation
	 * @param container the container
	 * @return the e object
	 */
	private EObject transform(OperationT operation, EObject container) {
		EObject ret = null;
		if (operation != null) {
			ret = transformedMap.get(operation);
			if (ret == null) {
				// do not call doSwith here because we need the container
				EObject result = null;
				if (operation != null) {
					result = createOperation(operation, container);
				}
				transformedMap.put(operation, result);
				umlElements.add(result);
				ret = result;
			}
		}

		return ret;

	}

	/**
	 * Creates the operation.
	 *
	 * @param operation the operation
	 * @param container the container
	 * @return the e object
	 */
	private EObject createOperation(OperationT operation, EObject container) {
		String name = operation.getIdShort().getValue();

		Operation element = createOperation(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::Operation");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(operation, element);
		// set the parameters of the operation
		setOperationParameters(operation, element);
		return element;
	}

	/**
	 * Sets the operation parameters.
	 *
	 * @param operation the operation
	 * @param element   the element
	 */
	private void setOperationParameters(OperationT operation, Operation element) {

		// parse input parameters and create UML IN parameters
		for (OperationVariableT input : operation.getInputVariable()) {
			createOperationParameter(input, ParameterDirectionKind.IN_LITERAL, element);

		}

		// parse output parameters and create UML OUT parameters
		for (OperationVariableT output : operation.getOutputVariable()) {
			createOperationParameter(output, ParameterDirectionKind.OUT_LITERAL, element);

		}

		// parse inout parameters and create UML INOUT parameters
		for (OperationVariableT output : operation.getInoutputVariable()) {

			createOperationParameter(output, ParameterDirectionKind.INOUT_LITERAL, element);

		}

	}

	/**
	 * Creates the operation parameter.
	 *
	 * @param opvar     the opvar
	 * @param direction the direction
	 * @param op        the op
	 */
	private void createOperationParameter(OperationVariableT opvar, ParameterDirectionKind direction, Operation op) {
		String name = null;
		String type = null;

		// getting the name of the parameter
		if (opvar.getValue() != null && opvar.getValue().getProperty() != null
				&& opvar.getValue().getProperty().getIdShort() != null) {
			name = opvar.getValue().getProperty().getIdShort().getValue();
		}

		// getting the type of the parameter
		if (opvar.getValue() != null && opvar.getValue().getProperty() != null
				&& opvar.getValue().getProperty().getValueType() != null) {
			type = opvar.getValue().getProperty().getValueType().getValue();
		}

		if (name != null) {
			// creating the parameter of the uml operation
			Parameter p = createParameter(name, op);

			// setting the parameter type
			if (type != null && !type.isEmpty()) {
				setTypedElementType(p, type);
			}

			// setting the parameter direction
			setParameterDirection(p, direction);

		}
	}

	/**
	 * Sets the parameter direction.
	 *
	 * @param p  the p
	 * @param in the in
	 */
	private void setParameterDirection(Parameter p, ParameterDirectionKind in) {
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(domain,
				"Setting Parameter Direction"); //$NON-NLS-1$

		AbstractTransactionalCommand setParameterDirection = setParameterDirectionCmd(p, in);
		command.add(setParameterDirection);

		// execute command
		if (command != null && command.canExecute())
			try {
				command.execute(null, null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	/**
	 * Sets the parameter direction cmd.
	 *
	 * @param p         the p
	 * @param direction the direction
	 * @return the abstract transactional command
	 */
	private AbstractTransactionalCommand setParameterDirectionCmd(Parameter p, ParameterDirectionKind direction) {

		AbstractTransactionalCommand c = new AbstractTransactionalCommand(domain, "setParameterDirection", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1)
					throws ExecutionException {
				// set the parameter type

				p.setDirection(direction);

				return CommandResult.newOKCommandResult();
			}
		};
		return c;
	}

	/**
	 * Sets the typed element type.
	 *
	 * @param p    the p
	 * @param type the type
	 */
	private void setTypedElementType(TypedElement p, String type) {
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(domain, "Setting Element Type"); //$NON-NLS-1$

		AbstractTransactionalCommand setParameterDirection = setTypedElementTypeCmd(p, type);
		command.add(setParameterDirection);

		// execute command
		if (command != null && command.canExecute())
			try {
				command.execute(null, null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	/**
	 * Sets the typed element type.
	 *
	 * @param p    the p
	 * @param type
	 * @param type the type
	 */
	private void setPropertyDefaultValue(Property p, Object value, String type) {
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(domain, "Setting default value"); //$NON-NLS-1$

		AbstractTransactionalCommand setDefaultType = setDefaultValue(p, value, type);
		command.add(setDefaultType);

		// execute command
		if (command != null && command.canExecute())
			try {
				command.execute(null, null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	/**
	 * @param p
	 * @param value
	 * @param type
	 * @return
	 */
	private AbstractTransactionalCommand setDefaultValue(Property p, Object value, String type) {
		AbstractTransactionalCommand c = new AbstractTransactionalCommand(domain, "setTypedElementTypeCmd", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1)
					throws ExecutionException {

				String formattedType = String.valueOf(type.toLowerCase().trim());
				// set default type
				switch (formattedType) {
				case "string":
					// create a String Literal and set it to the DefaultValue
					ValueSpecification literalString = p.createDefaultValue(null, null,
							UMLPackage.Literals.LITERAL_STRING);
					literalString.eSet(UMLPackage.Literals.LITERAL_STRING__VALUE, value);
					p.setDefaultValue(literalString);
					break;
				case "int":
				case "integer":
				case "unsignedint":
				case "unsignedbyte":
				case "byte":
				case "positiveinteger":
				case "nonpositiveinteger":
				case "negativeinteger":
				case "nonnegativeinteger":
				case "long":
				case "short":
				case "unsignedshort":
				case "unsignedlong":
					// create an Integer Literal and set it to the DefaultValue
					ValueSpecification literalInteger = p.createDefaultValue(null, null,
							UMLPackage.Literals.LITERAL_INTEGER);
					int intValue;
					try {
						
						intValue = Integer.parseInt((String) value);
					} catch (NumberFormatException e) {
						intValue = 0;
					}
					literalInteger.eSet(UMLPackage.Literals.LITERAL_INTEGER__VALUE, intValue);
					p.setDefaultValue(literalInteger);
					break;
				case "double": case "decimal":
					// create a Real Literal and set it to the DefaultValue
					ValueSpecification literalReal = p.createDefaultValue(null, null, UMLPackage.Literals.LITERAL_REAL);
					double doubleValue;
					try {
						
						doubleValue = Double.parseDouble((String) value);
					} catch (NumberFormatException e) {
						doubleValue = 0;
					}
					literalReal.eSet(UMLPackage.Literals.LITERAL_REAL__VALUE, doubleValue);
					p.setDefaultValue(literalReal);
					break;
				case "boolean":
					// create a Boolean Literal and set it to the DefaultValue
					ValueSpecification literalBoolean = p.createDefaultValue(null, null,
							UMLPackage.Literals.LITERAL_BOOLEAN);
					Boolean boolValue;
					try {
						
						boolValue = Boolean.parseBoolean((String) value);
					} catch (NumberFormatException e) {
						boolValue = true;
					}
					literalBoolean.eSet(UMLPackage.Literals.LITERAL_BOOLEAN__VALUE, boolValue);
					p.setDefaultValue(literalBoolean);
					break;
				default:
					// create a String Literal and set it to the DefaultValue
					ValueSpecification literalDefault = p.createDefaultValue(null, null,
							UMLPackage.Literals.LITERAL_STRING);
					literalDefault.eSet(UMLPackage.Literals.LITERAL_STRING__VALUE, value);
					p.setDefaultValue(literalDefault);

				}

				return CommandResult.newOKCommandResult();

			}

		};
		return c;

	}

	/**
	 * Sets the typed element type cmd.
	 *
	 * @param element  the element
	 * @param typeName the type name
	 * @return the abstract transactional command
	 */
	private AbstractTransactionalCommand setTypedElementTypeCmd(TypedElement element, String typeName) {

		AbstractTransactionalCommand c = new AbstractTransactionalCommand(domain, "setTypedElementTypeCmd", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1)
					throws ExecutionException {
				String formattedTypeName =typeName;
				// set the parameter type
				if (typeName!=null && !typeName.isEmpty()) {
				   formattedTypeName = String.valueOf(typeName.toLowerCase().trim());
				}
				
				String umlTypeQName = ElementUtils.convertType(formattedTypeName);

				if (umlTypeQName != null) {
					URI LIBRARY_PATH_URI = URI.createURI(XML_LIBRARY_PATH);
					NamedElement ne = ElementUtils.getQualifiedTypeFromRS(element, LIBRARY_PATH_URI, umlTypeQName);

					Type umlType = null;

					if (ne instanceof Type) {

						umlType = (Type) ne;

					}

					element.setType(umlType);

					return CommandResult.newOKCommandResult();

				}

				return CommandResult.newWarningCommandResult("No equivalent datatype was found", null);
			}

		};
		return c;
	}

	
	/**
	 * Transforms.
	 *
	 * @param submodelElements the submodel elements
	 */
	private void transforms(SubmodelElementsT submodelElements) {
		if (submodelElements.getSubmodelElement() != null && !submodelElements.getSubmodelElement().isEmpty()) {
			// transform all the SEC Inside
			for (SubmodelElementT submodelelement : submodelElements.getSubmodelElement()) {
				if (submodelelement.getSubmodelElementCollection() != null) {
					SubmodelElementCollectionT sec = submodelelement.getSubmodelElementCollection();
					transform(sec);
					// get the inner SECs
					transforms(sec.getValue());
				}

			}

		}

	}

	/**
	 * Creates the class.
	 *
	 * @param name      the name
	 * @param container the container
	 * @return the class
	 */
	private Class createClass(String name, EObject container) {
		// we create a Class

		Class result = null;

		if (container != null) {

			CreateElementRequest request = new CreateElementRequest(domain, container, UMLElementTypes.CLASS);
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);
			ICommand command = provider.getEditCommand(request);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
			result = (Class) request.getNewElement();
			SetRequest setRequest = new SetRequest(result, UMLPackage.eINSTANCE.getNamedElement_Name(), name);

			ICommand command2 = provider.getEditCommand(setRequest);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));

		}

		return result;
	}

	/**
	 * Creates the Property.
	 *
	 * @param name      the name
	 * @param container the container
	 * @return the class
	 */
	private Property createProperty(String name, EObject container) {
		// we create a Class

		Property result = null;

		if (container != null) {

			CreateElementRequest request = new CreateElementRequest(domain, container, UMLElementTypes.PROPERTY);
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);
			ICommand command = provider.getEditCommand(request);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
			result = (Property) request.getNewElement();
			SetRequest setRequest = new SetRequest(result, UMLPackage.eINSTANCE.getNamedElement_Name(), name);

			ICommand command2 = provider.getEditCommand(setRequest);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));

		}

		return result;
	}

	/**
	 * Creates the Operation.
	 *
	 * @param name      the name
	 * @param container the container
	 * @return the class
	 */
	private Operation createOperation(String name, EObject container) {
		// we create a Class

		Operation result = null;

		if (container != null) {

			CreateElementRequest request = new CreateElementRequest(domain, container, UMLElementTypes.OPERATION);
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);
			ICommand command = provider.getEditCommand(request);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
			result = (Operation) request.getNewElement();
			SetRequest setRequest = new SetRequest(result, UMLPackage.eINSTANCE.getNamedElement_Name(), name);

			ICommand command2 = provider.getEditCommand(setRequest);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));

		}

		return result;
	}

	/**
	 * Creates the Operation.
	 *
	 * @param name      the name
	 * @param container the container
	 * @return the class
	 */
	private Parameter createParameter(String name, EObject container) {
		// we create a Class

		Parameter result = null;

		if (container != null) {

			CreateElementRequest request = new CreateElementRequest(domain, container, UMLElementTypes.PARAMETER);
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);
			ICommand command = provider.getEditCommand(request);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
			result = (Parameter) request.getNewElement();
			SetRequest setRequest = new SetRequest(result, UMLPackage.eINSTANCE.getNamedElement_Name(), name);

			ICommand command2 = provider.getEditCommand(setRequest);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));

		}

		return result;
	}

	/**
	 * Creates the package.
	 *
	 * @param name the name
	 * @return the package
	 */
	private Package createPackage(String name) {
		// we create a Package for Assets
		Model model = getModel();
		Package result = null;
		// Model model = (Model) ((UMLResource) umlResource).getContents().get(0);
		if (model != null) {
			// create a Package and name it AAS
			CreateElementRequest request = new CreateElementRequest(domain, model, UMLElementTypes.PACKAGE);
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(model);
			ICommand command = provider.getEditCommand(request);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
			result = (Package) request.getNewElement();
			if (name.equals("AAS")) {
				Stereotype stereotype = result.getApplicableStereotype("AAS::AssetAdministrationShell");
				applyRequiredStereotype(result, stereotype);
			}
			SetRequest setRequest = new SetRequest(result, UMLPackage.eINSTANCE.getNamedElement_Name(), name);

			ICommand command2 = provider.getEditCommand(setRequest);
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command2));

		}

		return result;
	}

	/**
	 * Creates the asset.
	 *
	 * @param object the object
	 * @return the e object
	 */
	private EObject createAsset(AssetT object) {

		String name = object.getIdShort().getValue();
		EObject container = getModel().getPackagedElement("Assets");
		Class element = createClass(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::Asset");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(object, element);
		return element;
	}

	/**
	 * Creates the asset.
	 *
	 * @param object the object
	 * @return the e object
	 */
	private EObject createConceptDescription(ConceptDescriptionT object) {

		String name = object.getIdShort().getValue();
		EObject container = getModel().getPackagedElement("ConceptDescriptions");
		Class element = createClass(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::ConceptDescription");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(object, element);
		return element;
	}

	/**
	 * Creates the sub model.
	 *
	 * @param object the object
	 * @return the e object
	 */
	private EObject createSubModel(SubmodelT object) {

		String name = object.getIdShort().getValue();
		EObject container = getModel().getPackagedElement("Submodels");
		Class element = createClass(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::Submodel");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(object, element);

		return element;
	}

	/**
	 * Creates the property.
	 *
	 * @param object    the object
	 * @param container the container
	 * @return the e object
	 */
	private EObject createProperty(PropertyT object, EObject container) {

		String name = object.getIdShort().getValue();

		Property element = createProperty(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::Property");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(object, element);

		// getting the type of the parameter
		String type = null;
		if (object.getValueType() != null) {
			type = object.getValueType().getValue();
		}

		// setting the property type
		if (type != null  && ! type.isEmpty()) {
			setTypedElementType(element, type);
		}

		// getting the default value of the property
		Object value = object.getValue().getValue();
		if(value!=null && !((String) value).isEmpty())
		setPropertyDefaultValue(element, value, type);
		return element;
	}

	/**
	 * Creates the asset administration shell.
	 *
	 * @param object the object
	 * @return the e object
	 */
	private EObject createAssetAdministrationShell(AssetAdministrationShellT object) {

		String name = object.getIdShort().getValue();
		EObject container = getModel().getPackagedElement("AAS");
		Class element = createClass(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::AssetAdministrationShell");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(object, element);
		return element;
	}

	/**
	 * Creates the submodel element collection.
	 *
	 * @param object the object
	 * @return the e object
	 */
	private EObject createSubmodelElementCollection(SubmodelElementCollectionT object) {

		String name = object.getIdShort().getValue();
		EObject container = getModel().getPackagedElement("Submodels");
		Class element = createClass(name, container);
		// apply AAS::AssetAdministrationShell Stereotype on Class
		Stereotype stereotype = element.getApplicableStereotype("AAS::SubmodelElementCollection");
		applyRequiredStereotype(element, stereotype);
		// set the stereotype properties Values
		setPropertiesValues(object, element);
		return element;
	}

	/**
	 * Apply required stereotype.
	 *
	 * @param el         the el
	 * @param stereotype the stereotype
	 */
	private void applyRequiredStereotype(Element el, Stereotype stereotype) {

		ApplyStereotypeCommand applyCommand = new ApplyStereotypeCommand(el, stereotype, domain);
		domain.getCommandStack().execute(applyCommand);
	}

	/**
	 * Sets the properties values.
	 *
	 * @param source the source
	 * @param target the target
	 */
	private void setPropertiesValues(EObject source, Element target) {

		EClass eCalss = source.eClass();
		EList<EStructuralFeature> eAllAttributes = eCalss.getEAllStructuralFeatures();
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(domain,
				"Setting Sterteotype Propeties Value"); //$NON-NLS-1$
		for (EStructuralFeature att : eAllAttributes) {
			// int attributeID = att.getFeatureID();
			// String name = getTargetPropertyFromSource(attributeID);
			String name = att.getName();
			if (name != null) {

				Object sourceValue = source.eGet(att);
				Object getsourceValue = null;
				if ((name.equals("description") || name.equals("value")) && sourceValue instanceof LangStringSetT) {

					LangStringSetT allStringSets = (LangStringSetT) sourceValue;
					EList<LangStringT> list = allStringSets.getLangString();
					ArrayList<LangString> aaslist = new ArrayList<LangString>();
					for (LangStringT langString : list) {
						LangString aasLangString = AASFactory.eINSTANCE.createLangString();
						String getLang = langString.getLang();
						String getValue = langString.getValue();
						aasLangString.setValue(getValue);
						if(getLang!=null && !getLang.isEmpty()) 
							getLang = String.valueOf(getLang.toLowerCase().trim());
						LangEnum transformedLangEnum = ElementUtils.transformLangEnumLiterals(getLang);
						aasLangString.setLang(transformedLangEnum);
						aaslist.add(aasLangString);

					}
					getsourceValue = aaslist;

				} else if (name.equals("identification") && sourceValue instanceof IdentificationT) {
					// create a new Object of type Identifier
					Identifier identifier = AASFactory.eINSTANCE.createIdentifier();
					String id = ((IdentificationT) sourceValue).getValue();
					IdTypeType idType = ((IdentificationT) sourceValue).getIdType();
					identifier.setId(id);
					IdentifierType transformedidType = IdentifierType.get(ElementUtils.transformIdTypeLiterals(idType));
					identifier.setIdType(transformedidType);
					getsourceValue = identifier;
				} else if (name.equals("kind") && source instanceof AssetT) {
					AssetKind assetKind = null;
					switch (sourceValue.toString()) {
					case "Type":
						assetKind = AssetKind.TYPE;
					case "Instance":
						assetKind = AssetKind.INSTANCE;

					}
					getsourceValue = assetKind;
				} else if (name.equals("kind")
						&& (source instanceof SubmodelT || source instanceof SubmodelElementAbstractT)) {
					ModelingKind modelingKind = null;
					switch (sourceValue.toString()) {
					case "Template":
						modelingKind = ModelingKind.TEMPLATE;
					case "Instance":
						modelingKind = ModelingKind.INSTANCE;

					}
					getsourceValue = modelingKind;
				} else if (name.equals("category")) {
					getsourceValue = sourceValue;
				}
				// setting the properties of submodelElementCollections
				else if (name.equals("ordered") && sourceValue instanceof SubmodelElementCollectionT) {
					getsourceValue = (boolean) sourceValue;

				} else if (name.equals("allowDuplicates") && sourceValue instanceof SubmodelElementCollectionT) {
					getsourceValue = (boolean) sourceValue;
				}

				// case semanticid
				else if (name.equals("semanticId")) {
					getsourceValue = setSemanticId(sourceValue, target);
				}

				// case isCaseOf
				else if (name.equals("isCaseOf")) {
					getsourceValue = setIsCaseOf(sourceValue, target);
				}

				// case MimeType from File
				else if (name.equals("mimeType")) {
					getsourceValue = ElementUtils.convertMimeType(sourceValue.toString());
				}
				// case value from File
				else if (name.equals("value") && source instanceof FileT) {
					if (sourceValue instanceof PathTypeT) {
						getsourceValue = ((PathTypeT) sourceValue).getValue();
						// change the name of the attribute to map to the AAS stereotype attribute name
						name = "path";
					}
				}
				String stereotypeAttName = name;

				if (getsourceValue != null) {
					final Object getsrcValue = getsourceValue;
					// Object sourceValue = StereotypeUtil.displayPropertyValue(stereotype,
					// property, target, "");
					AbstractTransactionalCommand c = new AbstractTransactionalCommand(domain, stereotypeAttName, null) {

						@Override
						protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1)
								throws ExecutionException {
							if (target != null) {
								Stereotype stereotype = null;
								if (target != null && target.getAppliedStereotypes() != null
										&& !target.getAppliedStereotypes().isEmpty()) {
									stereotype = target.getAppliedStereotypes().get(0);
								}
								target.setValue(stereotype, stereotypeAttName, getsrcValue);
							}
							return CommandResult.newOKCommandResult();
						}
					};

					command.add(c);
				}
			}
		}
		// execute command
		if (command != null && command.canExecute())
			try {
				command.execute(null, null);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @param sourceValue
	 * @param target
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Object setIsCaseOf(Object source, Element target) {
		List<Reference> referenceList = new ArrayList<Reference>();
		Element container = target.getModel();
		EditingDomain domain = EMFHelper.resolveEditingDomain(container);
		CompositeTransactionalCommand command = new CompositeTransactionalCommand((TransactionalEditingDomain) domain,
				"Creating List of References with Keys "); //$NON-NLS-1$
		IElementType referenceElementType = ElementTypeRegistry.getInstance().getType(IAASElementTypes.REFERENCE_ID);
		IElementType keyElementType = ElementTypeRegistry.getInstance().getType(IAASElementTypes.KEY_ID);
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);

		// Getting the list of references from isCaseOf attribute and creating UML
		// references
		if (source instanceof EList && !((EList) source).isEmpty()) {

			for (Iterator<EObject> i = ((List<EObject>) source).iterator(); i.hasNext();) {
				Reference reference = null;
				ReferenceT ref = (ReferenceT) i.next();

				// creating the reference
				CreateElementRequest request = new CreateElementRequest((TransactionalEditingDomain) domain, container,
						referenceElementType);
				ICommand createReference = provider.getEditCommand(request);

				domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(createReference));
				EObject result = (EObject) createReference.getCommandResult().getReturnValue();
				reference = getReference(result);

				// Creating the Keys inside the Reference

				KeysT keys = ref.getKeys();
				if (keys != null && !keys.getKey().isEmpty()) {
					for (KeyT key : keys.getKey()) {

						CreateElementRequest createKeyrequest = new CreateElementRequest(
								(TransactionalEditingDomain) domain, result, keyElementType);
						ICommand createKey = provider.getEditCommand(createKeyrequest);

						domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(createKey));
						EObject result2 = (EObject) createKey.getCommandResult().getReturnValue();
						Key newkey = getKeyApplication(result2);

						if (key.getType() != null) {
							KeyElements keyElement = ElementUtils.convertKeyType(key.getType());
							command.add(provider.getEditCommand(createSetRequest((TransactionalEditingDomain) domain,
									newkey, AASPackage.eINSTANCE.getKey_Type(), keyElement)));

						}
						if (key.getIdType() != null) {
							KeyType keyType = ElementUtils.convertIdType(key.getIdType());
							command.add(new SetValueCommand(
									new SetRequest(newkey, AASPackage.eINSTANCE.getKey_IdType(), keyType)));

						}

						if (key.getValue() != null) {
							String value = key.getValue();
							command.add(new SetValueCommand(
									new SetRequest(newkey, AASPackage.eINSTANCE.getKey_Value(), value)));

						}
						domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
					}
				}

				if (reference != null) {
					referenceList.add(reference);
				}
			}
		} else if (((EList) source).isEmpty()) {
			// create an empty reference
			Reference reference = null;

			// creating the reference
			CreateElementRequest request = new CreateElementRequest((TransactionalEditingDomain) domain, container,
					referenceElementType);
			ICommand createReference = provider.getEditCommand(request);

			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(createReference));
			EObject result = (EObject) createReference.getCommandResult().getReturnValue();
			reference = getReference(result);

			if (reference != null) {
				referenceList.add(reference);
			}

		}

		return referenceList;
	}

	/**
	 * @param source
	 * @param target
	 */
	private Reference setSemanticId(Object source, Element target) {

		Reference reference = null;
		// create a Reference
		Element container = target.getModel();
		EditingDomain domain = EMFHelper.resolveEditingDomain(container);
		CompositeTransactionalCommand command = new CompositeTransactionalCommand((TransactionalEditingDomain) domain,
				"Creating Reference with Key "); //$NON-NLS-1$
		IElementType referenceElementType = ElementTypeRegistry.getInstance().getType(IAASElementTypes.REFERENCE_ID);
		IElementType keyElementType = ElementTypeRegistry.getInstance().getType(IAASElementTypes.KEY_ID);
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);

		CreateElementRequest request = new CreateElementRequest((TransactionalEditingDomain) domain, container,
				referenceElementType);
		ICommand createReference = provider.getEditCommand(request);

		domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(createReference));
		EObject result = (EObject) createReference.getCommandResult().getReturnValue();
		reference = getReference(result);

		// Creating the Keys inside the Reference

		if (source instanceof SemanticIdT) {
			KeysT keys = ((SemanticIdT) source).getKeys();
			if (keys != null && !keys.getKey().isEmpty()) {
				for (KeyT key : keys.getKey()) {

					CompositeTransactionalCommand commandKey = new CompositeTransactionalCommand(
							(TransactionalEditingDomain) domain, "Creating Keys within the reference "); // $NON-NLS-
					CreateElementRequest createKeyrequest = new CreateElementRequest(
							(TransactionalEditingDomain) domain, result, keyElementType);
					ICommand createKey = provider.getEditCommand(createKeyrequest);

					domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(createKey));
					EObject result2 = (EObject) createKey.getCommandResult().getReturnValue();
					Key newkey = getKeyApplication(result2);

					if (key.getType() != null) {
						KeyElements keyElement = ElementUtils.convertKeyType(key.getType());
						commandKey.add(new SetValueCommand(
								new SetRequest(newkey, AASPackage.eINSTANCE.getKey_Type(), keyElement)));

					}
					if (key.getIdType() != null) {
						KeyType keyType = ElementUtils.convertIdType(key.getIdType());
						commandKey.add(new SetValueCommand(
								new SetRequest(newkey, AASPackage.eINSTANCE.getKey_IdType(), keyType)));

					}

					if (key.getValue() != null) {
						String value = key.getValue();
						commandKey.add(new SetValueCommand(
								new SetRequest(newkey, AASPackage.eINSTANCE.getKey_Value(), value)));

					}
					domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(commandKey));
				}
			}
		}

		return reference;
	}

	private Key getKeyApplication(Object commandresult) {
		Key key = null;
		if (commandresult != null) {
			key = UMLUtil.getStereotypeApplication((Element) commandresult, Key.class);
		}
		return key;
	}

	public static Reference getReference(EObject result) {
		Reference ref = null;
		if (result != null) {
			ref = UMLUtil.getStereotypeApplication((Element) result, Reference.class);
		}
		return ref;

	}

	protected IEditCommandRequest createSetRequest(TransactionalEditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		return new SetRequest(domain, owner, feature, value);
	}

	/**
	 * Gets the target property from source.
	 *
	 * @param attributeID the attribute ID
	 * @return the target property from source
	 */
	private String getTargetPropertyFromSource(int attributeID) {

		switch (attributeID) {

		case _0Package.ASSET_ADMINISTRATION_SHELL_T__CATEGORY:
			return "category";
		case _0Package.ASSET_ADMINISTRATION_SHELL_T__DESCRIPTION:
			return "description";
		case _0Package.ASSET_ADMINISTRATION_SHELL_T__IDENTIFICATION:
			return "identification";

		default:
			return null;
		}

	}

	/**
	 * Creates the services registry.
	 *
	 * @return the services registry
	 */
	protected ServicesRegistry createServicesRegistry() {

		ServicesRegistry result = null;

		try {
			result = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		} catch (ServiceException e) {
			// couldn't create the registry? Fatal problem
			e.printStackTrace();
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
	 * Inits the services registry.
	 *
	 * @param registry the registry
	 * @throws ServiceException the service exception
	 */
	protected void initServicesRegistry(ServicesRegistry registry) throws ServiceException {
		try {
			registry.startRegistry();
		} catch (ServiceException ex) {
			// Ignore this exception: some services may not have been loaded,
			// which is probably normal at this point
		}

		registry.getService(ModelSet.class);
	}

	/**
	 * Gets the transactional domain.
	 *
	 * @param registry the registry
	 * @return the transactional domain
	 */
	public TransactionalEditingDomain getTransactionalDomain(ServicesRegistry registry) {
		TransactionalEditingDomain domain = null;
		if (this.umlResource != null && this.umlResource.getResourceSet() != null) {
			ResourceSet res = this.umlResource.getResourceSet();
			domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(res);
		}

		if (domain == null && registry != null) {

			// have to create the model set and populate it with the DI model
			// before initializing other services that actually need the DI
			// model, such as the SashModel Manager service
			try {
				ModelSet modelSet = registry.getService(ModelSet.class);
				// initServicesRegistry(registry);
				domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(modelSet);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return domain;
	}

	

	
}
