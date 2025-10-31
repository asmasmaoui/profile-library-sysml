/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrowheadDSLFactoryImpl extends EFactoryImpl implements ArrowheadDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArrowheadDSLFactory init() {
		try {
			ArrowheadDSLFactory theArrowheadDSLFactory = (ArrowheadDSLFactory)EPackage.Registry.INSTANCE.getEFactory(ArrowheadDSLPackage.eNS_URI);
			if (theArrowheadDSLFactory != null) {
				return theArrowheadDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArrowheadDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArrowheadDSLPackage.SYS_D: return createSysD();
			case ArrowheadDSLPackage.SD: return createSD();
			case ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT: return createArrowheadDSLRequirement();
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE: return createArrowheadUseCase();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN: return createLocalCloudDesign();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN: return createSystem_of_LocalcloudsDesign();
			case ArrowheadDSLPackage.DEVICE_DESIGN: return createDeviceDesign();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN: return createIntercloudNetworkDesign();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN: return createIntracloudNetworkDesign();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION: return createDeviceDesignDescription();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION: return createIntercloudNetworkDesignDescription();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION: return createIntracloudNetworkDesignDescription();
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION: return createLocalcloudDesignDescription();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION: return createSystem_of_LocacloudsDesignDescription();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION: return createSystem_of_LocalcloudsImplementation();
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION: return createLocalcloudImplementation();
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION: return createSystem_Implementation();
			case ArrowheadDSLPackage.SYS_DD: return createSysDD();
			case ArrowheadDSLPackage.IDD_IMPLEMENTATION: return createIDD_Implementation();
			case ArrowheadDSLPackage.IDD: return createIDD();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_HTTP: return createArrowHeadServiceInterfaceHTTP();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT: return createArrowHeadServiceInterfaceMQTT();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_COAP: return createArrowHeadServiceInterfaceCOAP();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_WEBSOCKET: return createArrowHeadServiceInterfaceWebsocket();
			case ArrowheadDSLPackage.FULL_PORT: return createFullPort();
			case ArrowheadDSLPackage.PROXY_PORT: return createProxyPort();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE: return createArrowHeadServiceInterface();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_AMQP: return createArrowHeadServiceInterfaceAMQP();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_DDS: return createArrowHeadServiceInterfaceDDS();
			case ArrowheadDSLPackage.DEVICE_IMPLEMENTATION: return createDeviceImplementation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArrowheadDSLPackage.SYSTEM_DATABASE_KIND:
				return createSystemDatabaseKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.BUSINESS_POLICY_KIND:
				return createBusinessPolicyKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.SECURITY_POLICY_KIND:
				return createSecurityPolicyKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.LIFECYCLE_POLICY_KIND:
				return createLifecyclePolicyKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.MAC_LAYER_KIND:
				return createMacLayerKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.OS_KIND:
				return createOSKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.ARROWHEAD_CERTIFICATE_KIND:
				return createArrowheadCertificateKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.TIME_FORMAT_KIND:
				return createTimeFormatKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.APPLICATION_PROTOCOL_KIND:
				return createApplicationProtocolKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.ENCODING_KIND:
				return createEncodingKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.ARROWHEAD_SECURITY_KIND:
				return createArrowheadSecurityKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.COMPRRESSION_KIND:
				return createComprressionKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.TOKEN_KIND:
				return createTokenKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.CRYPTO_ALGORITHM_KIND:
				return createCryptoAlgorithmKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.DATAMODEL_STANDARD_KIND:
				return createDatamodelStandardKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.CERTIFICATE_KIND:
				return createCertificateKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.CO_AP_METHOD_KIND:
				return createCoAPMethodKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.HTTP11_METHOD_KIND:
				return createHTTP11MethodKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.HTTP2_FRAME_KIND:
				return createHTTP2FrameKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.MAC_PROTOCOL_KIND:
				return createMACProtocolKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.MONITORING_POLICY_KIND:
				return createMonitoringPolicyKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.MQTT311_MESSAGE_TYPE_KIND:
				return createMQTT311MessageTypeKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.MQTT50_MESSAGE_TYPE_KIND:
				return createMQTT50MessageTypeKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.PAYLOAD_ENCRYPTION_KIND:
				return createPayloadEncryptionKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.PHYSICAL_LAYER_KIND:
				return createPhysicalLayerKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.TRANSPORT_LAYER_KIND:
				return createTransportLayerKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.WEBSOCKET_DATA_FRAMING_TYPE_KIND:
				return createWebsocketDataFramingTypeKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.WORKFLOW_KIND:
				return createWorkflowKindFromString(eDataType, initialValue);
			case ArrowheadDSLPackage.STATUS_KOD_KIND:
				return createStatusKodKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArrowheadDSLPackage.SYSTEM_DATABASE_KIND:
				return convertSystemDatabaseKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.BUSINESS_POLICY_KIND:
				return convertBusinessPolicyKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.SECURITY_POLICY_KIND:
				return convertSecurityPolicyKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.LIFECYCLE_POLICY_KIND:
				return convertLifecyclePolicyKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.MAC_LAYER_KIND:
				return convertMacLayerKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.OS_KIND:
				return convertOSKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.ARROWHEAD_CERTIFICATE_KIND:
				return convertArrowheadCertificateKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.TIME_FORMAT_KIND:
				return convertTimeFormatKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.APPLICATION_PROTOCOL_KIND:
				return convertApplicationProtocolKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.ENCODING_KIND:
				return convertEncodingKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.ARROWHEAD_SECURITY_KIND:
				return convertArrowheadSecurityKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.COMPRRESSION_KIND:
				return convertComprressionKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.TOKEN_KIND:
				return convertTokenKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.CRYPTO_ALGORITHM_KIND:
				return convertCryptoAlgorithmKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.DATAMODEL_STANDARD_KIND:
				return convertDatamodelStandardKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.CERTIFICATE_KIND:
				return convertCertificateKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.CO_AP_METHOD_KIND:
				return convertCoAPMethodKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.HTTP11_METHOD_KIND:
				return convertHTTP11MethodKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.HTTP2_FRAME_KIND:
				return convertHTTP2FrameKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.MAC_PROTOCOL_KIND:
				return convertMACProtocolKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.MONITORING_POLICY_KIND:
				return convertMonitoringPolicyKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.MQTT311_MESSAGE_TYPE_KIND:
				return convertMQTT311MessageTypeKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.MQTT50_MESSAGE_TYPE_KIND:
				return convertMQTT50MessageTypeKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.PAYLOAD_ENCRYPTION_KIND:
				return convertPayloadEncryptionKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.PHYSICAL_LAYER_KIND:
				return convertPhysicalLayerKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.TRANSPORT_LAYER_KIND:
				return convertTransportLayerKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.WEBSOCKET_DATA_FRAMING_TYPE_KIND:
				return convertWebsocketDataFramingTypeKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.WORKFLOW_KIND:
				return convertWorkflowKindToString(eDataType, instanceValue);
			case ArrowheadDSLPackage.STATUS_KOD_KIND:
				return convertStatusKodKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SysD createSysD() {
		SysDImpl sysD = new SysDImpl();
		return sysD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalCloudDesign createLocalCloudDesign() {
		LocalCloudDesignImpl localCloudDesign = new LocalCloudDesignImpl();
		return localCloudDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public System_of_LocalcloudsDesign createSystem_of_LocalcloudsDesign() {
		System_of_LocalcloudsDesignImpl system_of_LocalcloudsDesign = new System_of_LocalcloudsDesignImpl();
		return system_of_LocalcloudsDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SD createSD() {
		SDImpl sd = new SDImpl();
		return sd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowheadDSLRequirement createArrowheadDSLRequirement() {
		ArrowheadDSLRequirementImpl arrowheadDSLRequirement = new ArrowheadDSLRequirementImpl();
		return arrowheadDSLRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowheadUseCase createArrowheadUseCase() {
		ArrowheadUseCaseImpl arrowheadUseCase = new ArrowheadUseCaseImpl();
		return arrowheadUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDesign createDeviceDesign() {
		DeviceDesignImpl deviceDesign = new DeviceDesignImpl();
		return deviceDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntercloudNetworkDesign createIntercloudNetworkDesign() {
		IntercloudNetworkDesignImpl intercloudNetworkDesign = new IntercloudNetworkDesignImpl();
		return intercloudNetworkDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntracloudNetworkDesign createIntracloudNetworkDesign() {
		IntracloudNetworkDesignImpl intracloudNetworkDesign = new IntracloudNetworkDesignImpl();
		return intracloudNetworkDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDesignDescription createDeviceDesignDescription() {
		DeviceDesignDescriptionImpl deviceDesignDescription = new DeviceDesignDescriptionImpl();
		return deviceDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntercloudNetworkDesignDescription createIntercloudNetworkDesignDescription() {
		IntercloudNetworkDesignDescriptionImpl intercloudNetworkDesignDescription = new IntercloudNetworkDesignDescriptionImpl();
		return intercloudNetworkDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntracloudNetworkDesignDescription createIntracloudNetworkDesignDescription() {
		IntracloudNetworkDesignDescriptionImpl intracloudNetworkDesignDescription = new IntracloudNetworkDesignDescriptionImpl();
		return intracloudNetworkDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalcloudDesignDescription createLocalcloudDesignDescription() {
		LocalcloudDesignDescriptionImpl localcloudDesignDescription = new LocalcloudDesignDescriptionImpl();
		return localcloudDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public System_of_LocacloudsDesignDescription createSystem_of_LocacloudsDesignDescription() {
		System_of_LocacloudsDesignDescriptionImpl system_of_LocacloudsDesignDescription = new System_of_LocacloudsDesignDescriptionImpl();
		return system_of_LocacloudsDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SysDD createSysDD() {
		SysDDImpl sysDD = new SysDDImpl();
		return sysDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public System_of_LocalcloudsImplementation createSystem_of_LocalcloudsImplementation() {
		System_of_LocalcloudsImplementationImpl system_of_LocalcloudsImplementation = new System_of_LocalcloudsImplementationImpl();
		return system_of_LocalcloudsImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalcloudImplementation createLocalcloudImplementation() {
		LocalcloudImplementationImpl localcloudImplementation = new LocalcloudImplementationImpl();
		return localcloudImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public System_Implementation createSystem_Implementation() {
		System_ImplementationImpl system_Implementation = new System_ImplementationImpl();
		return system_Implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDD_Implementation createIDD_Implementation() {
		IDD_ImplementationImpl idD_Implementation = new IDD_ImplementationImpl();
		return idD_Implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDD createIDD() {
		IDDImpl idd = new IDDImpl();
		return idd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeadServiceInterfaceHTTP createArrowHeadServiceInterfaceHTTP() {
		ArrowHeadServiceInterfaceHTTPImpl arrowHeadServiceInterfaceHTTP = new ArrowHeadServiceInterfaceHTTPImpl();
		return arrowHeadServiceInterfaceHTTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeadServiceInterfaceMQTT createArrowHeadServiceInterfaceMQTT() {
		ArrowHeadServiceInterfaceMQTTImpl arrowHeadServiceInterfaceMQTT = new ArrowHeadServiceInterfaceMQTTImpl();
		return arrowHeadServiceInterfaceMQTT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeadServiceInterfaceCOAP createArrowHeadServiceInterfaceCOAP() {
		ArrowHeadServiceInterfaceCOAPImpl arrowHeadServiceInterfaceCOAP = new ArrowHeadServiceInterfaceCOAPImpl();
		return arrowHeadServiceInterfaceCOAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeadServiceInterfaceWebsocket createArrowHeadServiceInterfaceWebsocket() {
		ArrowHeadServiceInterfaceWebsocketImpl arrowHeadServiceInterfaceWebsocket = new ArrowHeadServiceInterfaceWebsocketImpl();
		return arrowHeadServiceInterfaceWebsocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FullPort createFullPort() {
		FullPortImpl fullPort = new FullPortImpl();
		return fullPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProxyPort createProxyPort() {
		ProxyPortImpl proxyPort = new ProxyPortImpl();
		return proxyPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeadServiceInterfaceAMQP createArrowHeadServiceInterfaceAMQP() {
		ArrowHeadServiceInterfaceAMQPImpl arrowHeadServiceInterfaceAMQP = new ArrowHeadServiceInterfaceAMQPImpl();
		return arrowHeadServiceInterfaceAMQP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeadServiceInterfaceDDS createArrowHeadServiceInterfaceDDS() {
		ArrowHeadServiceInterfaceDDSImpl arrowHeadServiceInterfaceDDS = new ArrowHeadServiceInterfaceDDSImpl();
		return arrowHeadServiceInterfaceDDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceImplementation createDeviceImplementation() {
		DeviceImplementationImpl deviceImplementation = new DeviceImplementationImpl();
		return deviceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeadServiceInterface createArrowHeadServiceInterface() {
		ArrowHeadServiceInterfaceImpl arrowHeadServiceInterface = new ArrowHeadServiceInterfaceImpl();
		return arrowHeadServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDatabaseKind createSystemDatabaseKindFromString(EDataType eDataType, String initialValue) {
		SystemDatabaseKind result = SystemDatabaseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemDatabaseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPolicyKind createBusinessPolicyKindFromString(EDataType eDataType, String initialValue) {
		BusinessPolicyKind result = BusinessPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusinessPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPolicyKind createSecurityPolicyKindFromString(EDataType eDataType, String initialValue) {
		SecurityPolicyKind result = SecurityPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecyclePolicyKind createLifecyclePolicyKindFromString(EDataType eDataType, String initialValue) {
		LifecyclePolicyKind result = LifecyclePolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifecyclePolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacLayerKind createMacLayerKindFromString(EDataType eDataType, String initialValue) {
		MacLayerKind result = MacLayerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMacLayerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSKind createOSKindFromString(EDataType eDataType, String initialValue) {
		OSKind result = OSKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadCertificateKind createArrowheadCertificateKindFromString(EDataType eDataType, String initialValue) {
		ArrowheadCertificateKind result = ArrowheadCertificateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrowheadCertificateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFormatKind createTimeFormatKindFromString(EDataType eDataType, String initialValue) {
		TimeFormatKind result = TimeFormatKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeFormatKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationProtocolKind createApplicationProtocolKindFromString(EDataType eDataType, String initialValue) {
		ApplicationProtocolKind result = ApplicationProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingKind createEncodingKindFromString(EDataType eDataType, String initialValue) {
		EncodingKind result = EncodingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadSecurityKind createArrowheadSecurityKindFromString(EDataType eDataType, String initialValue) {
		ArrowheadSecurityKind result = ArrowheadSecurityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrowheadSecurityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComprressionKind createComprressionKindFromString(EDataType eDataType, String initialValue) {
		ComprressionKind result = ComprressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComprressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenKind createTokenKindFromString(EDataType eDataType, String initialValue) {
		TokenKind result = TokenKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoAlgorithmKind createCryptoAlgorithmKindFromString(EDataType eDataType, String initialValue) {
		CryptoAlgorithmKind result = CryptoAlgorithmKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCryptoAlgorithmKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatamodelStandardKind createDatamodelStandardKindFromString(EDataType eDataType, String initialValue) {
		DatamodelStandardKind result = DatamodelStandardKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatamodelStandardKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateKind createCertificateKindFromString(EDataType eDataType, String initialValue) {
		CertificateKind result = CertificateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCertificateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoAPMethodKind createCoAPMethodKindFromString(EDataType eDataType, String initialValue) {
		CoAPMethodKind result = CoAPMethodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoAPMethodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTP11MethodKind createHTTP11MethodKindFromString(EDataType eDataType, String initialValue) {
		HTTP11MethodKind result = HTTP11MethodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTP11MethodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTP2FrameKind createHTTP2FrameKindFromString(EDataType eDataType, String initialValue) {
		HTTP2FrameKind result = HTTP2FrameKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTP2FrameKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MACProtocolKind createMACProtocolKindFromString(EDataType eDataType, String initialValue) {
		MACProtocolKind result = MACProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMACProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringPolicyKind createMonitoringPolicyKindFromString(EDataType eDataType, String initialValue) {
		MonitoringPolicyKind result = MonitoringPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MQTT311MessageTypeKind createMQTT311MessageTypeKindFromString(EDataType eDataType, String initialValue) {
		MQTT311MessageTypeKind result = MQTT311MessageTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMQTT311MessageTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MQTT50MessageTypeKind createMQTT50MessageTypeKindFromString(EDataType eDataType, String initialValue) {
		MQTT50MessageTypeKind result = MQTT50MessageTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMQTT50MessageTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadEncryptionKind createPayloadEncryptionKindFromString(EDataType eDataType, String initialValue) {
		PayloadEncryptionKind result = PayloadEncryptionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayloadEncryptionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLayerKind createPhysicalLayerKindFromString(EDataType eDataType, String initialValue) {
		PhysicalLayerKind result = PhysicalLayerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalLayerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportLayerKind createTransportLayerKindFromString(EDataType eDataType, String initialValue) {
		TransportLayerKind result = TransportLayerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportLayerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsocketDataFramingTypeKind createWebsocketDataFramingTypeKindFromString(EDataType eDataType, String initialValue) {
		WebsocketDataFramingTypeKind result = WebsocketDataFramingTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWebsocketDataFramingTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowKind createWorkflowKindFromString(EDataType eDataType, String initialValue) {
		WorkflowKind result = WorkflowKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkflowKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusKodKind createStatusKodKindFromString(EDataType eDataType, String initialValue) {
		StatusKodKind result = StatusKodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusKodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowheadDSLPackage getArrowheadDSLPackage() {
		return (ArrowheadDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArrowheadDSLPackage getPackage() {
		return ArrowheadDSLPackage.eINSTANCE;
	}

} //ArrowheadDSLFactoryImpl
