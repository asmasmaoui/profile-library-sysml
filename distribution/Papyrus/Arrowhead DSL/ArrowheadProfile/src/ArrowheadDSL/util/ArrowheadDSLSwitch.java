/**
 */
package ArrowheadDSL.util;

import ArrowheadDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml16.blocks.Block;

import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;

import org.eclipse.papyrus.sysml16.requirements.AbstractRequirement;
import org.eclipse.papyrus.sysml16.requirements.Requirement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage
 * @generated
 */
public class ArrowheadDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArrowheadDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = ArrowheadDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArrowheadDSLPackage.SYS_D: {
				SysD sysD = (SysD)theEObject;
				T result = caseSysD(sysD);
				if (result == null) result = caseBlock(sysD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.SD: {
				SD sd = (SD)theEObject;
				T result = caseSD(sd);
				if (result == null) result = caseInterfaceBlock(sd);
				if (result == null) result = caseBlock(sd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN: {
				LocalCloudDesign localCloudDesign = (LocalCloudDesign)theEObject;
				T result = caseLocalCloudDesign(localCloudDesign);
				if (result == null) result = caseBlock(localCloudDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN: {
				System_of_LocalcloudsDesign system_of_LocalcloudsDesign = (System_of_LocalcloudsDesign)theEObject;
				T result = caseSystem_of_LocalcloudsDesign(system_of_LocalcloudsDesign);
				if (result == null) result = caseBlock(system_of_LocalcloudsDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT: {
				ArrowheadDSLRequirement arrowheadDSLRequirement = (ArrowheadDSLRequirement)theEObject;
				T result = caseArrowheadDSLRequirement(arrowheadDSLRequirement);
				if (result == null) result = caseRequirement(arrowheadDSLRequirement);
				if (result == null) result = caseAbstractRequirement(arrowheadDSLRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE: {
				ArrowheadUseCase arrowheadUseCase = (ArrowheadUseCase)theEObject;
				T result = caseArrowheadUseCase(arrowheadUseCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.DEVICE_DESIGN: {
				DeviceDesign deviceDesign = (DeviceDesign)theEObject;
				T result = caseDeviceDesign(deviceDesign);
				if (result == null) result = caseBlock(deviceDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN: {
				IntercloudNetworkDesign intercloudNetworkDesign = (IntercloudNetworkDesign)theEObject;
				T result = caseIntercloudNetworkDesign(intercloudNetworkDesign);
				if (result == null) result = caseBlock(intercloudNetworkDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN: {
				IntracloudNetworkDesign intracloudNetworkDesign = (IntracloudNetworkDesign)theEObject;
				T result = caseIntracloudNetworkDesign(intracloudNetworkDesign);
				if (result == null) result = caseBlock(intracloudNetworkDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION: {
				DeviceDesignDescription deviceDesignDescription = (DeviceDesignDescription)theEObject;
				T result = caseDeviceDesignDescription(deviceDesignDescription);
				if (result == null) result = caseDeviceDesign(deviceDesignDescription);
				if (result == null) result = caseBlock(deviceDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION: {
				IntercloudNetworkDesignDescription intercloudNetworkDesignDescription = (IntercloudNetworkDesignDescription)theEObject;
				T result = caseIntercloudNetworkDesignDescription(intercloudNetworkDesignDescription);
				if (result == null) result = caseIntercloudNetworkDesign(intercloudNetworkDesignDescription);
				if (result == null) result = caseBlock(intercloudNetworkDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION: {
				IntracloudNetworkDesignDescription intracloudNetworkDesignDescription = (IntracloudNetworkDesignDescription)theEObject;
				T result = caseIntracloudNetworkDesignDescription(intracloudNetworkDesignDescription);
				if (result == null) result = caseIntracloudNetworkDesign(intracloudNetworkDesignDescription);
				if (result == null) result = caseBlock(intracloudNetworkDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION: {
				LocalcloudDesignDescription localcloudDesignDescription = (LocalcloudDesignDescription)theEObject;
				T result = caseLocalcloudDesignDescription(localcloudDesignDescription);
				if (result == null) result = caseLocalCloudDesign(localcloudDesignDescription);
				if (result == null) result = caseBlock(localcloudDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION: {
				System_of_LocacloudsDesignDescription system_of_LocacloudsDesignDescription = (System_of_LocacloudsDesignDescription)theEObject;
				T result = caseSystem_of_LocacloudsDesignDescription(system_of_LocacloudsDesignDescription);
				if (result == null) result = caseSystem_of_LocalcloudsDesign(system_of_LocacloudsDesignDescription);
				if (result == null) result = caseBlock(system_of_LocacloudsDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.SYS_DD: {
				SysDD sysDD = (SysDD)theEObject;
				T result = caseSysDD(sysDD);
				if (result == null) result = caseSysD(sysDD);
				if (result == null) result = caseBlock(sysDD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.IDD: {
				IDD idd = (IDD)theEObject;
				T result = caseIDD(idd);
				if (result == null) result = caseSD(idd);
				if (result == null) result = caseInterfaceBlock(idd);
				if (result == null) result = caseBlock(idd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION: {
				System_of_LocalcloudsImplementation system_of_LocalcloudsImplementation = (System_of_LocalcloudsImplementation)theEObject;
				T result = caseSystem_of_LocalcloudsImplementation(system_of_LocalcloudsImplementation);
				if (result == null) result = caseSystem_of_LocacloudsDesignDescription(system_of_LocalcloudsImplementation);
				if (result == null) result = caseSystem_of_LocalcloudsDesign(system_of_LocalcloudsImplementation);
				if (result == null) result = caseBlock(system_of_LocalcloudsImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION: {
				LocalcloudImplementation localcloudImplementation = (LocalcloudImplementation)theEObject;
				T result = caseLocalcloudImplementation(localcloudImplementation);
				if (result == null) result = caseLocalcloudDesignDescription(localcloudImplementation);
				if (result == null) result = caseLocalCloudDesign(localcloudImplementation);
				if (result == null) result = caseBlock(localcloudImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION: {
				System_Implementation system_Implementation = (System_Implementation)theEObject;
				T result = caseSystem_Implementation(system_Implementation);
				if (result == null) result = caseSysDD(system_Implementation);
				if (result == null) result = caseSysD(system_Implementation);
				if (result == null) result = caseBlock(system_Implementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.IDD_IMPLEMENTATION: {
				IDD_Implementation idD_Implementation = (IDD_Implementation)theEObject;
				T result = caseIDD_Implementation(idD_Implementation);
				if (result == null) result = caseIDD(idD_Implementation);
				if (result == null) result = caseSD(idD_Implementation);
				if (result == null) result = caseInterfaceBlock(idD_Implementation);
				if (result == null) result = caseBlock(idD_Implementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP: {
				ArrowheadDSLOperationHTTP arrowheadDSLOperationHTTP = (ArrowheadDSLOperationHTTP)theEObject;
				T result = caseArrowheadDSLOperationHTTP(arrowheadDSLOperationHTTP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_MQTT: {
				ArrowheadDSLOperationMQTT arrowheadDSLOperationMQTT = (ArrowheadDSLOperationMQTT)theEObject;
				T result = caseArrowheadDSLOperationMQTT(arrowheadDSLOperationMQTT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_COAP: {
				ArrowheadDSLOperationCOAP arrowheadDSLOperationCOAP = (ArrowheadDSLOperationCOAP)theEObject;
				T result = caseArrowheadDSLOperationCOAP(arrowheadDSLOperationCOAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_WEBSOCKET: {
				ArrowheadDSLOperationWebsocket arrowheadDSLOperationWebsocket = (ArrowheadDSLOperationWebsocket)theEObject;
				T result = caseArrowheadDSLOperationWebsocket(arrowheadDSLOperationWebsocket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysD(SysD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSD(SD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Cloud Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Cloud Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCloudDesign(LocalCloudDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System of Localclouds Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System of Localclouds Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem_of_LocalcloudsDesign(System_of_LocalcloudsDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowheadDSLRequirement(ArrowheadDSLRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrowhead Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrowhead Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowheadUseCase(ArrowheadUseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDesign(DeviceDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercloud Network Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercloud Network Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntercloudNetworkDesign(IntercloudNetworkDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intracloud Network Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intracloud Network Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntracloudNetworkDesign(IntracloudNetworkDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDesignDescription(DeviceDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercloud Network Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercloud Network Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntercloudNetworkDesignDescription(IntercloudNetworkDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intracloud Network Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intracloud Network Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntracloudNetworkDesignDescription(IntracloudNetworkDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localcloud Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localcloud Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalcloudDesignDescription(LocalcloudDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System of Locaclouds Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System of Locaclouds Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem_of_LocacloudsDesignDescription(System_of_LocacloudsDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys DD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysDD(SysDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDD(IDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System of Localclouds Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System of Localclouds Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem_of_LocalcloudsImplementation(System_of_LocalcloudsImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localcloud Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localcloud Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalcloudImplementation(LocalcloudImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem_Implementation(System_Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDD Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDD Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDD_Implementation(IDD_Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation HTTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation HTTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowheadDSLOperationHTTP(ArrowheadDSLOperationHTTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation MQTT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation MQTT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowheadDSLOperationMQTT(ArrowheadDSLOperationMQTT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation COAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation COAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowheadDSLOperationCOAP(ArrowheadDSLOperationCOAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Websocket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Websocket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowheadDSLOperationWebsocket(ArrowheadDSLOperationWebsocket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceBlock(InterfaceBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRequirement(AbstractRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArrowheadDSLSwitch
