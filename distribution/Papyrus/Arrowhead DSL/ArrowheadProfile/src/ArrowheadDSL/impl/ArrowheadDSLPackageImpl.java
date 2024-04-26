/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ApplicationProtocolKind;
import ArrowheadDSL.ArrowHeadServiceInterfaceCOAP;
import ArrowheadDSL.ArrowHeadServiceInterfaceHTTP;
import ArrowheadDSL.ArrowHeadServiceInterfaceMQTT;
import ArrowheadDSL.ArrowHeadServiceInterfaceWebsocket;
import ArrowheadDSL.ArrowheadCertificateKind;
import ArrowheadDSL.ArrowheadDSLFactory;
import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.ArrowheadDSLRequirement;
import ArrowheadDSL.ArrowheadSecurityKind;
import ArrowheadDSL.ArrowheadUseCase;
import ArrowheadDSL.BusinessPolicyKind;
import ArrowheadDSL.CertificateKind;
import ArrowheadDSL.CoAPMethodKind;
import ArrowheadDSL.ComprressionKind;
import ArrowheadDSL.CryptoAlgorithmKind;
import ArrowheadDSL.DatamodelStandardKind;
import ArrowheadDSL.DeviceDesign;
import ArrowheadDSL.DeviceDesignDescription;
import ArrowheadDSL.EncodingKind;
import ArrowheadDSL.FullPort;
import ArrowheadDSL.HTTP11MethodKind;
import ArrowheadDSL.HTTP2FrameKind;
import ArrowheadDSL.IDD_Implementation;
import ArrowheadDSL.IntercloudNetworkDesign;
import ArrowheadDSL.IntercloudNetworkDesignDescription;
import ArrowheadDSL.IntracloudNetworkDesign;
import ArrowheadDSL.IntracloudNetworkDesignDescription;
import ArrowheadDSL.LifecyclePolicyKind;
import ArrowheadDSL.LocalCloudDesign;
import ArrowheadDSL.LocalcloudDesignDescription;
import ArrowheadDSL.LocalcloudImplementation;
import ArrowheadDSL.MACProtocolKind;
import ArrowheadDSL.MQTT311MessageTypeKind;
import ArrowheadDSL.MQTT50MessageTypeKind;
import ArrowheadDSL.MacLayerKind;
import ArrowheadDSL.MonitoringPolicyKind;
import ArrowheadDSL.OSKind;
import ArrowheadDSL.PayloadEncryptionKind;
import ArrowheadDSL.PhysicalLayerKind;
import ArrowheadDSL.ProxyPort;
import ArrowheadDSL.SecurityPolicyKind;
import ArrowheadDSL.SysD;
import ArrowheadDSL.SysDD;
import ArrowheadDSL.SystemDatabaseKind;
import ArrowheadDSL.System_Implementation;
import ArrowheadDSL.System_of_LocacloudsDesignDescription;
import ArrowheadDSL.System_of_LocalcloudsDesign;
import ArrowheadDSL.System_of_LocalcloudsImplementation;
import ArrowheadDSL.TimeFormatKind;
import ArrowheadDSL.TokenKind;
import ArrowheadDSL.TransportLayerKind;
import ArrowheadDSL.WebsocketDataFramingTypeKind;
import ArrowheadDSL.WorkflowKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;

import org.eclipse.papyrus.sysml16.sysml.SysMLPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrowheadDSLPackageImpl extends EPackageImpl implements ArrowheadDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localCloudDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass system_of_LocalcloudsDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowheadDSLRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowheadUseCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intercloudNetworkDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intracloudNetworkDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intercloudNetworkDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intracloudNetworkDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localcloudDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass system_of_LocacloudsDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysDDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass system_of_LocalcloudsImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localcloudImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass system_ImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idD_ImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowHeadServiceInterfaceHTTPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowHeadServiceInterfaceMQTTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowHeadServiceInterfaceCOAPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowHeadServiceInterfaceWebsocketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemDatabaseKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum businessPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifecyclePolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum macLayerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arrowheadCertificateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFormatKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationProtocolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arrowheadSecurityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comprressionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tokenKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cryptoAlgorithmKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datamodelStandardKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum certificateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coAPMethodKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum http11MethodKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum http2FrameKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum macProtocolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitoringPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mqtt311MessageTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mqtt50MessageTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payloadEncryptionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum physicalLayerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportLayerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum websocketDataFramingTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workflowKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ArrowheadDSL.ArrowheadDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArrowheadDSLPackageImpl() {
		super(eNS_URI, ArrowheadDSLFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArrowheadDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArrowheadDSLPackage init() {
		if (isInited) return (ArrowheadDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ArrowheadDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArrowheadDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArrowheadDSLPackageImpl theArrowheadDSLPackage = registeredArrowheadDSLPackage instanceof ArrowheadDSLPackageImpl ? (ArrowheadDSLPackageImpl)registeredArrowheadDSLPackage : new ArrowheadDSLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		SysMLPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArrowheadDSLPackage.createPackageContents();

		// Initialize created meta-data
		theArrowheadDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArrowheadDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArrowheadDSLPackage.eNS_URI, theArrowheadDSLPackage);
		return theArrowheadDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSysD() {
		return sysDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSysD_MicrosystemName() {
		return (EAttribute)sysDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSysD_FunctionalProperties() {
		return (EAttribute)sysDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSysD_SystemDatabase() {
		return (EAttribute)sysDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSysD_MicrosystemBehaviour() {
		return (EAttribute)sysDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSysD_Sd() {
		return (EReference)sysDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSysD_Localclouddesign() {
		return (EReference)sysDEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSD() {
		return sdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSD_MicroserviceName() {
		return (EAttribute)sdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSD_Sysd() {
		return (EReference)sdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSD__Operation() {
		return sdEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalCloudDesign() {
		return localCloudDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalCloudDesign_LC_Name() {
		return (EAttribute)localCloudDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalCloudDesign_FunctionalProperties() {
		return (EAttribute)localCloudDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalCloudDesign_LC_SecurityStrategy() {
		return (EAttribute)localCloudDesignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalCloudDesign_LC_BusinessStrategy() {
		return (EAttribute)localCloudDesignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalCloudDesign_LC_LifecycleStrategy() {
		return (EAttribute)localCloudDesignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalCloudDesign_System_of_localcloudsdesign() {
		return (EReference)localCloudDesignEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalCloudDesign_Sysd() {
		return (EReference)localCloudDesignEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem_of_LocalcloudsDesign() {
		return system_of_LocalcloudsDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_of_LocalcloudsDesign_SoLCName() {
		return (EAttribute)system_of_LocalcloudsDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_of_LocalcloudsDesign_SoLC_SecurityStrategy() {
		return (EAttribute)system_of_LocalcloudsDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_of_LocalcloudsDesign_SoLC_BusinessStrategy() {
		return (EAttribute)system_of_LocalcloudsDesignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_of_LocalcloudsDesign_SoLC_LifecycleStrategy() {
		return (EAttribute)system_of_LocalcloudsDesignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_of_LocalcloudsDesign_Localclouddesign() {
		return (EReference)system_of_LocalcloudsDesignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrowheadDSLRequirement() {
		return arrowheadDSLRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrowheadDSLRequirement_Arrowheadusecase() {
		return (EReference)arrowheadDSLRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrowheadUseCase() {
		return arrowheadUseCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrowheadUseCase_Base_UseCase() {
		return (EReference)arrowheadUseCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrowheadUseCase_Arrowheaddslrequirement() {
		return (EReference)arrowheadUseCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceDesign() {
		return deviceDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceDesign_DeviceName() {
		return (EAttribute)deviceDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceDesign_Intercloudnetworkdesign() {
		return (EReference)deviceDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceDesign_Intracloudnetworkdesign() {
		return (EReference)deviceDesignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntercloudNetworkDesign() {
		return intercloudNetworkDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntercloudNetworkDesign_InterNetworkDomainName() {
		return (EAttribute)intercloudNetworkDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntercloudNetworkDesign_InterNetworkMacLayer() {
		return (EAttribute)intercloudNetworkDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntercloudNetworkDesign_Devicedesign() {
		return (EReference)intercloudNetworkDesignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntracloudNetworkDesign() {
		return intracloudNetworkDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntracloudNetworkDesign_IntraNetworkDomain() {
		return (EAttribute)intracloudNetworkDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntracloudNetworkDesign_IntraNetworkMacLayer() {
		return (EAttribute)intracloudNetworkDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntracloudNetworkDesign_Devicedesign() {
		return (EReference)intracloudNetworkDesignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceDesignDescription() {
		return deviceDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceDesignDescription_IOports() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceDesignDescription_Memory() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceDesignDescription_Processor() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceDesignDescription_OperatingSystem() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceDesignDescription_ArrowheadCertificate() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceDesignDescription_Intercloudnetworkdesigndescription() {
		return (EReference)deviceDesignDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceDesignDescription_Intracloudnetworkdesigndescription() {
		return (EReference)deviceDesignDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntercloudNetworkDesignDescription() {
		return intercloudNetworkDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntercloudNetworkDesignDescription_InterNetworkRouter() {
		return (EAttribute)intercloudNetworkDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntercloudNetworkDesignDescription_InterNetworkRouterConfig() {
		return (EAttribute)intercloudNetworkDesignDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntercloudNetworkDesignDescription_Devicedesigndescription() {
		return (EReference)intercloudNetworkDesignDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntracloudNetworkDesignDescription() {
		return intracloudNetworkDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntracloudNetworkDesignDescription_IntraNetworkRouter() {
		return (EAttribute)intracloudNetworkDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntracloudNetworkDesignDescription_IntraNetworkRouterConfig() {
		return (EAttribute)intracloudNetworkDesignDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntracloudNetworkDesignDescription_Devicedesigndescription() {
		return (EReference)intracloudNetworkDesignDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalcloudDesignDescription() {
		return localcloudDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalcloudDesignDescription_LC_workflow() {
		return (EAttribute)localcloudDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalcloudDesignDescription_LC_orchestration() {
		return (EAttribute)localcloudDesignDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalcloudDesignDescription_Systemoflocaclouddesigndescription() {
		return (EReference)localcloudDesignDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalcloudDesignDescription_Sysdd() {
		return (EReference)localcloudDesignDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem_of_LocacloudsDesignDescription() {
		return system_of_LocacloudsDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_of_LocacloudsDesignDescription_SoLC_Orchestration() {
		return (EAttribute)system_of_LocacloudsDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_of_LocacloudsDesignDescription_SoLC_Workflow() {
		return (EAttribute)system_of_LocacloudsDesignDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_of_LocacloudsDesignDescription_Localclouddesigndescription() {
		return (EReference)system_of_LocacloudsDesignDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSysDD() {
		return sysDDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSysDD_Timeformat() {
		return (EAttribute)sysDDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSysDD_ArrowheadCertificate() {
		return (EAttribute)sysDDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSysDD_Idd() {
		return (EReference)sysDDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSysDD_Localclouddesigndescription() {
		return (EReference)sysDDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDD() {
		return iddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Port() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Protocol() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Encoding() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Security() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Compression() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Certificate_level() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Token() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Crypto_algorithm() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDD_Datamodel() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIDD_Sysdd() {
		return (EReference)iddEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem_of_LocalcloudsImplementation() {
		return system_of_LocalcloudsImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_of_LocalcloudsImplementation_SoLC_Documentation() {
		return (EAttribute)system_of_LocalcloudsImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_of_LocalcloudsImplementation_Localcloudimplementation() {
		return (EReference)system_of_LocalcloudsImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalcloudImplementation() {
		return localcloudImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalcloudImplementation_LC_Documentation() {
		return (EAttribute)localcloudImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalcloudImplementation_Systemimplementation() {
		return (EReference)localcloudImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalcloudImplementation_System_of_localcloudsimplementation() {
		return (EReference)localcloudImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem_Implementation() {
		return system_ImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Implementation_Idd_implementation() {
		return (EReference)system_ImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Implementation_Loclacloudimplementation() {
		return (EReference)system_ImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDD_Implementation() {
		return idD_ImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIDD_Implementation_Systemimplementation() {
		return (EReference)idD_ImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrowHeadServiceInterfaceHTTP() {
		return arrowHeadServiceInterfaceHTTPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrowHeadServiceInterfaceHTTP_Method() {
		return (EAttribute)arrowHeadServiceInterfaceHTTPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrowHeadServiceInterfaceHTTP_SubURL() {
		return (EAttribute)arrowHeadServiceInterfaceHTTPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrowHeadServiceInterfaceHTTP_Base_Operation() {
		return (EReference)arrowHeadServiceInterfaceHTTPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrowHeadServiceInterfaceMQTT() {
		return arrowHeadServiceInterfaceMQTTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrowHeadServiceInterfaceMQTT_Method() {
		return (EAttribute)arrowHeadServiceInterfaceMQTTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrowHeadServiceInterfaceMQTT_Topic() {
		return (EAttribute)arrowHeadServiceInterfaceMQTTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrowHeadServiceInterfaceMQTT_Base_Operation() {
		return (EReference)arrowHeadServiceInterfaceMQTTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrowHeadServiceInterfaceCOAP() {
		return arrowHeadServiceInterfaceCOAPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrowHeadServiceInterfaceCOAP_Method() {
		return (EAttribute)arrowHeadServiceInterfaceCOAPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrowHeadServiceInterfaceCOAP_Base_Operation() {
		return (EReference)arrowHeadServiceInterfaceCOAPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrowHeadServiceInterfaceCOAP_SubURL() {
		return (EAttribute)arrowHeadServiceInterfaceCOAPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrowHeadServiceInterfaceWebsocket() {
		return arrowHeadServiceInterfaceWebsocketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrowHeadServiceInterfaceWebsocket_Method() {
		return (EAttribute)arrowHeadServiceInterfaceWebsocketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrowHeadServiceInterfaceWebsocket_SubURL() {
		return (EAttribute)arrowHeadServiceInterfaceWebsocketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrowHeadServiceInterfaceWebsocket_Base_Operation() {
		return (EReference)arrowHeadServiceInterfaceWebsocketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFullPort() {
		return fullPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFullPort_Base_Port() {
		return (EReference)fullPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProxyPort() {
		return proxyPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProxyPort_Base_Port() {
		return (EReference)proxyPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSystemDatabaseKind() {
		return systemDatabaseKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBusinessPolicyKind() {
		return businessPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSecurityPolicyKind() {
		return securityPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLifecyclePolicyKind() {
		return lifecyclePolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMacLayerKind() {
		return macLayerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOSKind() {
		return osKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArrowheadCertificateKind() {
		return arrowheadCertificateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeFormatKind() {
		return timeFormatKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getApplicationProtocolKind() {
		return applicationProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEncodingKind() {
		return encodingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArrowheadSecurityKind() {
		return arrowheadSecurityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComprressionKind() {
		return comprressionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTokenKind() {
		return tokenKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCryptoAlgorithmKind() {
		return cryptoAlgorithmKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatamodelStandardKind() {
		return datamodelStandardKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCertificateKind() {
		return certificateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoAPMethodKind() {
		return coAPMethodKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHTTP11MethodKind() {
		return http11MethodKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHTTP2FrameKind() {
		return http2FrameKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMACProtocolKind() {
		return macProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMonitoringPolicyKind() {
		return monitoringPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMQTT311MessageTypeKind() {
		return mqtt311MessageTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMQTT50MessageTypeKind() {
		return mqtt50MessageTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPayloadEncryptionKind() {
		return payloadEncryptionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPhysicalLayerKind() {
		return physicalLayerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTransportLayerKind() {
		return transportLayerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWebsocketDataFramingTypeKind() {
		return websocketDataFramingTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWorkflowKind() {
		return workflowKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowheadDSLFactory getArrowheadDSLFactory() {
		return (ArrowheadDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sysDEClass = createEClass(SYS_D);
		createEAttribute(sysDEClass, SYS_D__MICROSYSTEM_NAME);
		createEAttribute(sysDEClass, SYS_D__FUNCTIONAL_PROPERTIES);
		createEAttribute(sysDEClass, SYS_D__SYSTEM_DATABASE);
		createEAttribute(sysDEClass, SYS_D__MICROSYSTEM_BEHAVIOUR);
		createEReference(sysDEClass, SYS_D__SD);
		createEReference(sysDEClass, SYS_D__LOCALCLOUDDESIGN);

		sdEClass = createEClass(SD);
		createEAttribute(sdEClass, SD__MICROSERVICE_NAME);
		createEReference(sdEClass, SD__SYSD);
		createEOperation(sdEClass, SD___OPERATION);

		localCloudDesignEClass = createEClass(LOCAL_CLOUD_DESIGN);
		createEAttribute(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__LC_NAME);
		createEAttribute(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES);
		createEAttribute(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY);
		createEAttribute(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY);
		createEAttribute(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY);
		createEReference(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN);
		createEReference(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__SYSD);

		system_of_LocalcloudsDesignEClass = createEClass(SYSTEM_OF_LOCALCLOUDS_DESIGN);
		createEAttribute(system_of_LocalcloudsDesignEClass, SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME);
		createEAttribute(system_of_LocalcloudsDesignEClass, SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY);
		createEAttribute(system_of_LocalcloudsDesignEClass, SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY);
		createEAttribute(system_of_LocalcloudsDesignEClass, SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY);
		createEReference(system_of_LocalcloudsDesignEClass, SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN);

		arrowheadDSLRequirementEClass = createEClass(ARROWHEAD_DSL_REQUIREMENT);
		createEReference(arrowheadDSLRequirementEClass, ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE);

		arrowheadUseCaseEClass = createEClass(ARROWHEAD_USE_CASE);
		createEReference(arrowheadUseCaseEClass, ARROWHEAD_USE_CASE__BASE_USE_CASE);
		createEReference(arrowheadUseCaseEClass, ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT);

		deviceDesignEClass = createEClass(DEVICE_DESIGN);
		createEAttribute(deviceDesignEClass, DEVICE_DESIGN__DEVICE_NAME);
		createEReference(deviceDesignEClass, DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN);
		createEReference(deviceDesignEClass, DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN);

		intercloudNetworkDesignEClass = createEClass(INTERCLOUD_NETWORK_DESIGN);
		createEAttribute(intercloudNetworkDesignEClass, INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME);
		createEAttribute(intercloudNetworkDesignEClass, INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER);
		createEReference(intercloudNetworkDesignEClass, INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN);

		intracloudNetworkDesignEClass = createEClass(INTRACLOUD_NETWORK_DESIGN);
		createEAttribute(intracloudNetworkDesignEClass, INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN);
		createEAttribute(intracloudNetworkDesignEClass, INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER);
		createEReference(intracloudNetworkDesignEClass, INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN);

		deviceDesignDescriptionEClass = createEClass(DEVICE_DESIGN_DESCRIPTION);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__IOPORTS);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__MEMORY);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__PROCESSOR);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__ARROWHEAD_CERTIFICATE);
		createEReference(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION);
		createEReference(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION);

		intercloudNetworkDesignDescriptionEClass = createEClass(INTERCLOUD_NETWORK_DESIGN_DESCRIPTION);
		createEAttribute(intercloudNetworkDesignDescriptionEClass, INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER);
		createEAttribute(intercloudNetworkDesignDescriptionEClass, INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG);
		createEReference(intercloudNetworkDesignDescriptionEClass, INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION);

		intracloudNetworkDesignDescriptionEClass = createEClass(INTRACLOUD_NETWORK_DESIGN_DESCRIPTION);
		createEAttribute(intracloudNetworkDesignDescriptionEClass, INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER);
		createEAttribute(intracloudNetworkDesignDescriptionEClass, INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG);
		createEReference(intracloudNetworkDesignDescriptionEClass, INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION);

		localcloudDesignDescriptionEClass = createEClass(LOCALCLOUD_DESIGN_DESCRIPTION);
		createEAttribute(localcloudDesignDescriptionEClass, LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW);
		createEAttribute(localcloudDesignDescriptionEClass, LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION);
		createEReference(localcloudDesignDescriptionEClass, LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION);
		createEReference(localcloudDesignDescriptionEClass, LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD);

		system_of_LocacloudsDesignDescriptionEClass = createEClass(SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION);
		createEAttribute(system_of_LocacloudsDesignDescriptionEClass, SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION);
		createEAttribute(system_of_LocacloudsDesignDescriptionEClass, SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW);
		createEReference(system_of_LocacloudsDesignDescriptionEClass, SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION);

		sysDDEClass = createEClass(SYS_DD);
		createEAttribute(sysDDEClass, SYS_DD__TIMEFORMAT);
		createEAttribute(sysDDEClass, SYS_DD__ARROWHEAD_CERTIFICATE);
		createEReference(sysDDEClass, SYS_DD__IDD);
		createEReference(sysDDEClass, SYS_DD__LOCALCLOUDDESIGNDESCRIPTION);

		iddEClass = createEClass(IDD);
		createEAttribute(iddEClass, IDD__PORT);
		createEAttribute(iddEClass, IDD__PROTOCOL);
		createEAttribute(iddEClass, IDD__ENCODING);
		createEAttribute(iddEClass, IDD__SECURITY);
		createEAttribute(iddEClass, IDD__COMPRESSION);
		createEAttribute(iddEClass, IDD__CERTIFICATE_LEVEL);
		createEAttribute(iddEClass, IDD__TOKEN);
		createEAttribute(iddEClass, IDD__CRYPTO_ALGORITHM);
		createEAttribute(iddEClass, IDD__DATAMODEL);
		createEReference(iddEClass, IDD__SYSDD);

		system_of_LocalcloudsImplementationEClass = createEClass(SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION);
		createEAttribute(system_of_LocalcloudsImplementationEClass, SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_DOCUMENTATION);
		createEReference(system_of_LocalcloudsImplementationEClass, SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION);

		localcloudImplementationEClass = createEClass(LOCALCLOUD_IMPLEMENTATION);
		createEAttribute(localcloudImplementationEClass, LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION);
		createEReference(localcloudImplementationEClass, LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION);
		createEReference(localcloudImplementationEClass, LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION);

		system_ImplementationEClass = createEClass(SYSTEM_IMPLEMENTATION);
		createEReference(system_ImplementationEClass, SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION);
		createEReference(system_ImplementationEClass, SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION);

		idD_ImplementationEClass = createEClass(IDD_IMPLEMENTATION);
		createEReference(idD_ImplementationEClass, IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION);

		arrowHeadServiceInterfaceHTTPEClass = createEClass(ARROW_HEAD_SERVICE_INTERFACE_HTTP);
		createEAttribute(arrowHeadServiceInterfaceHTTPEClass, ARROW_HEAD_SERVICE_INTERFACE_HTTP__METHOD);
		createEAttribute(arrowHeadServiceInterfaceHTTPEClass, ARROW_HEAD_SERVICE_INTERFACE_HTTP__SUB_URL);
		createEReference(arrowHeadServiceInterfaceHTTPEClass, ARROW_HEAD_SERVICE_INTERFACE_HTTP__BASE_OPERATION);

		arrowHeadServiceInterfaceMQTTEClass = createEClass(ARROW_HEAD_SERVICE_INTERFACE_MQTT);
		createEAttribute(arrowHeadServiceInterfaceMQTTEClass, ARROW_HEAD_SERVICE_INTERFACE_MQTT__METHOD);
		createEAttribute(arrowHeadServiceInterfaceMQTTEClass, ARROW_HEAD_SERVICE_INTERFACE_MQTT__TOPIC);
		createEReference(arrowHeadServiceInterfaceMQTTEClass, ARROW_HEAD_SERVICE_INTERFACE_MQTT__BASE_OPERATION);

		arrowHeadServiceInterfaceCOAPEClass = createEClass(ARROW_HEAD_SERVICE_INTERFACE_COAP);
		createEAttribute(arrowHeadServiceInterfaceCOAPEClass, ARROW_HEAD_SERVICE_INTERFACE_COAP__METHOD);
		createEReference(arrowHeadServiceInterfaceCOAPEClass, ARROW_HEAD_SERVICE_INTERFACE_COAP__BASE_OPERATION);
		createEAttribute(arrowHeadServiceInterfaceCOAPEClass, ARROW_HEAD_SERVICE_INTERFACE_COAP__SUB_URL);

		arrowHeadServiceInterfaceWebsocketEClass = createEClass(ARROW_HEAD_SERVICE_INTERFACE_WEBSOCKET);
		createEAttribute(arrowHeadServiceInterfaceWebsocketEClass, ARROW_HEAD_SERVICE_INTERFACE_WEBSOCKET__METHOD);
		createEAttribute(arrowHeadServiceInterfaceWebsocketEClass, ARROW_HEAD_SERVICE_INTERFACE_WEBSOCKET__SUB_URL);
		createEReference(arrowHeadServiceInterfaceWebsocketEClass, ARROW_HEAD_SERVICE_INTERFACE_WEBSOCKET__BASE_OPERATION);

		fullPortEClass = createEClass(FULL_PORT);
		createEReference(fullPortEClass, FULL_PORT__BASE_PORT);

		proxyPortEClass = createEClass(PROXY_PORT);
		createEReference(proxyPortEClass, PROXY_PORT__BASE_PORT);

		// Create enums
		systemDatabaseKindEEnum = createEEnum(SYSTEM_DATABASE_KIND);
		businessPolicyKindEEnum = createEEnum(BUSINESS_POLICY_KIND);
		securityPolicyKindEEnum = createEEnum(SECURITY_POLICY_KIND);
		lifecyclePolicyKindEEnum = createEEnum(LIFECYCLE_POLICY_KIND);
		macLayerKindEEnum = createEEnum(MAC_LAYER_KIND);
		osKindEEnum = createEEnum(OS_KIND);
		arrowheadCertificateKindEEnum = createEEnum(ARROWHEAD_CERTIFICATE_KIND);
		timeFormatKindEEnum = createEEnum(TIME_FORMAT_KIND);
		applicationProtocolKindEEnum = createEEnum(APPLICATION_PROTOCOL_KIND);
		encodingKindEEnum = createEEnum(ENCODING_KIND);
		arrowheadSecurityKindEEnum = createEEnum(ARROWHEAD_SECURITY_KIND);
		comprressionKindEEnum = createEEnum(COMPRRESSION_KIND);
		tokenKindEEnum = createEEnum(TOKEN_KIND);
		cryptoAlgorithmKindEEnum = createEEnum(CRYPTO_ALGORITHM_KIND);
		datamodelStandardKindEEnum = createEEnum(DATAMODEL_STANDARD_KIND);
		certificateKindEEnum = createEEnum(CERTIFICATE_KIND);
		coAPMethodKindEEnum = createEEnum(CO_AP_METHOD_KIND);
		http11MethodKindEEnum = createEEnum(HTTP11_METHOD_KIND);
		http2FrameKindEEnum = createEEnum(HTTP2_FRAME_KIND);
		macProtocolKindEEnum = createEEnum(MAC_PROTOCOL_KIND);
		monitoringPolicyKindEEnum = createEEnum(MONITORING_POLICY_KIND);
		mqtt311MessageTypeKindEEnum = createEEnum(MQTT311_MESSAGE_TYPE_KIND);
		mqtt50MessageTypeKindEEnum = createEEnum(MQTT50_MESSAGE_TYPE_KIND);
		payloadEncryptionKindEEnum = createEEnum(PAYLOAD_ENCRYPTION_KIND);
		physicalLayerKindEEnum = createEEnum(PHYSICAL_LAYER_KIND);
		transportLayerKindEEnum = createEEnum(TRANSPORT_LAYER_KIND);
		websocketDataFramingTypeKindEEnum = createEEnum(WEBSOCKET_DATA_FRAMING_TYPE_KIND);
		workflowKindEEnum = createEEnum(WORKFLOW_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		PortsAndFlowsPackage thePortsAndFlowsPackage = (PortsAndFlowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsAndFlowsPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sysDEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		sdEClass.getESuperTypes().add(thePortsAndFlowsPackage.getInterfaceBlock());
		localCloudDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		system_of_LocalcloudsDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		arrowheadDSLRequirementEClass.getESuperTypes().add(theRequirementsPackage.getRequirement());
		deviceDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		intercloudNetworkDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		intracloudNetworkDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceDesignDescriptionEClass.getESuperTypes().add(this.getDeviceDesign());
		intercloudNetworkDesignDescriptionEClass.getESuperTypes().add(this.getIntercloudNetworkDesign());
		intracloudNetworkDesignDescriptionEClass.getESuperTypes().add(this.getIntracloudNetworkDesign());
		localcloudDesignDescriptionEClass.getESuperTypes().add(this.getLocalCloudDesign());
		system_of_LocacloudsDesignDescriptionEClass.getESuperTypes().add(this.getSystem_of_LocalcloudsDesign());
		sysDDEClass.getESuperTypes().add(this.getSysD());
		iddEClass.getESuperTypes().add(this.getSD());
		system_of_LocalcloudsImplementationEClass.getESuperTypes().add(this.getSystem_of_LocacloudsDesignDescription());
		localcloudImplementationEClass.getESuperTypes().add(this.getLocalcloudDesignDescription());
		system_ImplementationEClass.getESuperTypes().add(this.getSysDD());
		idD_ImplementationEClass.getESuperTypes().add(this.getIDD());

		// Initialize classes, features, and operations; add parameters
		initEClass(sysDEClass, SysD.class, "SysD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSysD_MicrosystemName(), theTypesPackage.getString(), "MicrosystemName", null, 0, -1, SysD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSysD_FunctionalProperties(), theTypesPackage.getUnlimitedNatural(), "FunctionalProperties", null, 1, -1, SysD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSysD_SystemDatabase(), this.getSystemDatabaseKind(), "SystemDatabase", null, 1, 1, SysD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSysD_MicrosystemBehaviour(), this.getBusinessPolicyKind(), "MicrosystemBehaviour", null, 1, -1, SysD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysD_Sd(), this.getSD(), this.getSD_Sysd(), "sd", null, 0, -1, SysD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysD_Localclouddesign(), this.getLocalCloudDesign(), this.getLocalCloudDesign_Sysd(), "localclouddesign", null, 0, -1, SysD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sdEClass, ArrowheadDSL.SD.class, "SD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSD_MicroserviceName(), theTypesPackage.getString(), "MicroserviceName", null, 1, 1, ArrowheadDSL.SD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSD_Sysd(), this.getSysD(), this.getSysD_Sd(), "sysd", null, 0, -1, ArrowheadDSL.SD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSD__Operation(), null, "Operation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(localCloudDesignEClass, LocalCloudDesign.class, "LocalCloudDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalCloudDesign_LC_Name(), theTypesPackage.getString(), "LC_Name", null, 1, 1, LocalCloudDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalCloudDesign_FunctionalProperties(), theTypesPackage.getUnlimitedNatural(), "FunctionalProperties", null, 1, 1, LocalCloudDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalCloudDesign_LC_SecurityStrategy(), this.getSecurityPolicyKind(), "LC_SecurityStrategy", null, 0, -1, LocalCloudDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalCloudDesign_LC_BusinessStrategy(), this.getBusinessPolicyKind(), "LC_BusinessStrategy", null, 0, -1, LocalCloudDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalCloudDesign_LC_LifecycleStrategy(), this.getLifecyclePolicyKind(), "LC_LifecycleStrategy", null, 1, 1, LocalCloudDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalCloudDesign_System_of_localcloudsdesign(), this.getSystem_of_LocalcloudsDesign(), this.getSystem_of_LocalcloudsDesign_Localclouddesign(), "system_of_localcloudsdesign", null, 0, -1, LocalCloudDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalCloudDesign_Sysd(), this.getSysD(), this.getSysD_Localclouddesign(), "sysd", null, 0, -1, LocalCloudDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(system_of_LocalcloudsDesignEClass, System_of_LocalcloudsDesign.class, "System_of_LocalcloudsDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_of_LocalcloudsDesign_SoLCName(), theTypesPackage.getString(), "SoLCName", null, 1, 1, System_of_LocalcloudsDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystem_of_LocalcloudsDesign_SoLC_SecurityStrategy(), this.getSecurityPolicyKind(), "SoLC_SecurityStrategy", null, 0, -1, System_of_LocalcloudsDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystem_of_LocalcloudsDesign_SoLC_BusinessStrategy(), this.getBusinessPolicyKind(), "SoLC_BusinessStrategy", null, 0, -1, System_of_LocalcloudsDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystem_of_LocalcloudsDesign_SoLC_LifecycleStrategy(), this.getLifecyclePolicyKind(), "SoLC_LifecycleStrategy", null, 1, 1, System_of_LocalcloudsDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystem_of_LocalcloudsDesign_Localclouddesign(), this.getLocalCloudDesign(), this.getLocalCloudDesign_System_of_localcloudsdesign(), "localclouddesign", null, 0, -1, System_of_LocalcloudsDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrowheadDSLRequirementEClass, ArrowheadDSLRequirement.class, "ArrowheadDSLRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrowheadDSLRequirement_Arrowheadusecase(), this.getArrowheadUseCase(), this.getArrowheadUseCase_Arrowheaddslrequirement(), "arrowheadusecase", null, 0, -1, ArrowheadDSLRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrowheadUseCaseEClass, ArrowheadUseCase.class, "ArrowheadUseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrowheadUseCase_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, ArrowheadUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrowheadUseCase_Arrowheaddslrequirement(), this.getArrowheadDSLRequirement(), this.getArrowheadDSLRequirement_Arrowheadusecase(), "arrowheaddslrequirement", null, 0, -1, ArrowheadUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceDesignEClass, DeviceDesign.class, "DeviceDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceDesign_DeviceName(), theTypesPackage.getString(), "DeviceName", null, 1, -1, DeviceDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceDesign_Intercloudnetworkdesign(), this.getIntercloudNetworkDesign(), this.getIntercloudNetworkDesign_Devicedesign(), "intercloudnetworkdesign", null, 0, -1, DeviceDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceDesign_Intracloudnetworkdesign(), this.getIntracloudNetworkDesign(), this.getIntracloudNetworkDesign_Devicedesign(), "intracloudnetworkdesign", null, 0, -1, DeviceDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(intercloudNetworkDesignEClass, IntercloudNetworkDesign.class, "IntercloudNetworkDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntercloudNetworkDesign_InterNetworkDomainName(), theTypesPackage.getString(), "InterNetworkDomainName", null, 0, -1, IntercloudNetworkDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntercloudNetworkDesign_InterNetworkMacLayer(), this.getMacLayerKind(), "InterNetworkMacLayer", null, 1, -1, IntercloudNetworkDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntercloudNetworkDesign_Devicedesign(), this.getDeviceDesign(), this.getDeviceDesign_Intercloudnetworkdesign(), "devicedesign", null, 0, -1, IntercloudNetworkDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(intracloudNetworkDesignEClass, IntracloudNetworkDesign.class, "IntracloudNetworkDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntracloudNetworkDesign_IntraNetworkDomain(), theTypesPackage.getString(), "IntraNetworkDomain", null, 1, 1, IntracloudNetworkDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntracloudNetworkDesign_IntraNetworkMacLayer(), this.getMacLayerKind(), "IntraNetworkMacLayer", null, 1, -1, IntracloudNetworkDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntracloudNetworkDesign_Devicedesign(), this.getDeviceDesign(), this.getDeviceDesign_Intracloudnetworkdesign(), "devicedesign", null, 0, -1, IntracloudNetworkDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceDesignDescriptionEClass, DeviceDesignDescription.class, "DeviceDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceDesignDescription_IOports(), theTypesPackage.getString(), "IOports", null, 0, -1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_Memory(), theTypesPackage.getString(), "memory", null, 0, -1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_Processor(), theTypesPackage.getString(), "processor", null, 1, -1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_OperatingSystem(), this.getOSKind(), "operatingSystem", null, 1, 1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_ArrowheadCertificate(), this.getArrowheadCertificateKind(), "ArrowheadCertificate", null, 1, 1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceDesignDescription_Intercloudnetworkdesigndescription(), this.getIntercloudNetworkDesignDescription(), this.getIntercloudNetworkDesignDescription_Devicedesigndescription(), "intercloudnetworkdesigndescription", null, 0, -1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceDesignDescription_Intracloudnetworkdesigndescription(), this.getIntracloudNetworkDesignDescription(), this.getIntracloudNetworkDesignDescription_Devicedesigndescription(), "intracloudnetworkdesigndescription", null, 0, -1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(intercloudNetworkDesignDescriptionEClass, IntercloudNetworkDesignDescription.class, "IntercloudNetworkDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntercloudNetworkDesignDescription_InterNetworkRouter(), theTypesPackage.getUnlimitedNatural(), "InterNetworkRouter", null, 0, -1, IntercloudNetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntercloudNetworkDesignDescription_InterNetworkRouterConfig(), theTypesPackage.getUnlimitedNatural(), "InterNetworkRouterConfig", null, 0, -1, IntercloudNetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntercloudNetworkDesignDescription_Devicedesigndescription(), this.getDeviceDesignDescription(), this.getDeviceDesignDescription_Intercloudnetworkdesigndescription(), "devicedesigndescription", null, 0, -1, IntercloudNetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(intracloudNetworkDesignDescriptionEClass, IntracloudNetworkDesignDescription.class, "IntracloudNetworkDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntracloudNetworkDesignDescription_IntraNetworkRouter(), theTypesPackage.getUnlimitedNatural(), "IntraNetworkRouter", null, 1, -1, IntracloudNetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntracloudNetworkDesignDescription_IntraNetworkRouterConfig(), theTypesPackage.getUnlimitedNatural(), "IntraNetworkRouterConfig", null, 1, -1, IntracloudNetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntracloudNetworkDesignDescription_Devicedesigndescription(), this.getDeviceDesignDescription(), this.getDeviceDesignDescription_Intracloudnetworkdesigndescription(), "devicedesigndescription", null, 0, -1, IntracloudNetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localcloudDesignDescriptionEClass, LocalcloudDesignDescription.class, "LocalcloudDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalcloudDesignDescription_LC_workflow(), theTypesPackage.getString(), "LC_workflow", null, 1, 1, LocalcloudDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalcloudDesignDescription_LC_orchestration(), theTypesPackage.getString(), "LC_orchestration", null, 1, 1, LocalcloudDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalcloudDesignDescription_Systemoflocaclouddesigndescription(), this.getSystem_of_LocacloudsDesignDescription(), this.getSystem_of_LocacloudsDesignDescription_Localclouddesigndescription(), "systemoflocaclouddesigndescription", null, 0, -1, LocalcloudDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalcloudDesignDescription_Sysdd(), this.getSysDD(), this.getSysDD_Localclouddesigndescription(), "sysdd", null, 0, -1, LocalcloudDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(system_of_LocacloudsDesignDescriptionEClass, System_of_LocacloudsDesignDescription.class, "System_of_LocacloudsDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_of_LocacloudsDesignDescription_SoLC_Orchestration(), theTypesPackage.getString(), "SoLC_Orchestration", null, 1, 1, System_of_LocacloudsDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystem_of_LocacloudsDesignDescription_SoLC_Workflow(), theTypesPackage.getString(), "SoLC_Workflow", null, 1, 1, System_of_LocacloudsDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystem_of_LocacloudsDesignDescription_Localclouddesigndescription(), this.getLocalcloudDesignDescription(), this.getLocalcloudDesignDescription_Systemoflocaclouddesigndescription(), "localclouddesigndescription", null, 0, -1, System_of_LocacloudsDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sysDDEClass, SysDD.class, "SysDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSysDD_Timeformat(), this.getTimeFormatKind(), "Timeformat", null, 1, 1, SysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSysDD_ArrowheadCertificate(), this.getArrowheadCertificateKind(), "ArrowheadCertificate", null, 1, 1, SysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysDD_Idd(), this.getIDD(), this.getIDD_Sysdd(), "idd", null, 0, -1, SysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysDD_Localclouddesigndescription(), this.getLocalcloudDesignDescription(), this.getLocalcloudDesignDescription_Sysdd(), "localclouddesigndescription", null, 0, -1, SysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iddEClass, ArrowheadDSL.IDD.class, "IDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDD_Port(), theTypesPackage.getInteger(), "Port", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Protocol(), this.getApplicationProtocolKind(), "Protocol", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Encoding(), this.getEncodingKind(), "Encoding", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Security(), this.getArrowheadSecurityKind(), "Security", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Compression(), this.getComprressionKind(), "Compression", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Certificate_level(), this.getArrowheadCertificateKind(), "Certificate_level", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Token(), this.getTokenKind(), "Token", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Crypto_algorithm(), this.getCryptoAlgorithmKind(), "Crypto_algorithm", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Datamodel(), this.getDatamodelStandardKind(), "Datamodel", null, 1, 1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIDD_Sysdd(), this.getSysDD(), this.getSysDD_Idd(), "sysdd", null, 0, -1, ArrowheadDSL.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(system_of_LocalcloudsImplementationEClass, System_of_LocalcloudsImplementation.class, "System_of_LocalcloudsImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_of_LocalcloudsImplementation_SoLC_Documentation(), theTypesPackage.getUnlimitedNatural(), "SoLC_Documentation", null, 1, 1, System_of_LocalcloudsImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystem_of_LocalcloudsImplementation_Localcloudimplementation(), this.getLocalcloudImplementation(), this.getLocalcloudImplementation_System_of_localcloudsimplementation(), "localcloudimplementation", null, 0, -1, System_of_LocalcloudsImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localcloudImplementationEClass, LocalcloudImplementation.class, "LocalcloudImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalcloudImplementation_LC_Documentation(), theTypesPackage.getUnlimitedNatural(), "LC_Documentation", null, 1, 1, LocalcloudImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalcloudImplementation_Systemimplementation(), this.getSystem_Implementation(), this.getSystem_Implementation_Loclacloudimplementation(), "systemimplementation", null, 0, -1, LocalcloudImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalcloudImplementation_System_of_localcloudsimplementation(), this.getSystem_of_LocalcloudsImplementation(), this.getSystem_of_LocalcloudsImplementation_Localcloudimplementation(), "system_of_localcloudsimplementation", null, 0, -1, LocalcloudImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(system_ImplementationEClass, System_Implementation.class, "System_Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Implementation_Idd_implementation(), this.getIDD_Implementation(), this.getIDD_Implementation_Systemimplementation(), "idd_implementation", null, 0, -1, System_Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystem_Implementation_Loclacloudimplementation(), this.getLocalcloudImplementation(), this.getLocalcloudImplementation_Systemimplementation(), "loclacloudimplementation", null, 0, -1, System_Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(idD_ImplementationEClass, IDD_Implementation.class, "IDD_Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIDD_Implementation_Systemimplementation(), this.getSystem_Implementation(), this.getSystem_Implementation_Idd_implementation(), "systemimplementation", null, 0, -1, IDD_Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrowHeadServiceInterfaceHTTPEClass, ArrowHeadServiceInterfaceHTTP.class, "ArrowHeadServiceInterfaceHTTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrowHeadServiceInterfaceHTTP_Method(), this.getHTTP11MethodKind(), "Method", null, 1, 1, ArrowHeadServiceInterfaceHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrowHeadServiceInterfaceHTTP_SubURL(), theTypesPackage.getString(), "SubURL", null, 1, 1, ArrowHeadServiceInterfaceHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrowHeadServiceInterfaceHTTP_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, ArrowHeadServiceInterfaceHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrowHeadServiceInterfaceMQTTEClass, ArrowHeadServiceInterfaceMQTT.class, "ArrowHeadServiceInterfaceMQTT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrowHeadServiceInterfaceMQTT_Method(), this.getHTTP11MethodKind(), "Method", null, 1, 1, ArrowHeadServiceInterfaceMQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrowHeadServiceInterfaceMQTT_Topic(), theTypesPackage.getString(), "Topic", null, 1, 1, ArrowHeadServiceInterfaceMQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrowHeadServiceInterfaceMQTT_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, ArrowHeadServiceInterfaceMQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrowHeadServiceInterfaceCOAPEClass, ArrowHeadServiceInterfaceCOAP.class, "ArrowHeadServiceInterfaceCOAP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrowHeadServiceInterfaceCOAP_Method(), this.getCoAPMethodKind(), "Method", null, 1, 1, ArrowHeadServiceInterfaceCOAP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrowHeadServiceInterfaceCOAP_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, ArrowHeadServiceInterfaceCOAP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrowHeadServiceInterfaceCOAP_SubURL(), theTypesPackage.getString(), "SubURL", null, 1, 1, ArrowHeadServiceInterfaceCOAP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrowHeadServiceInterfaceWebsocketEClass, ArrowHeadServiceInterfaceWebsocket.class, "ArrowHeadServiceInterfaceWebsocket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrowHeadServiceInterfaceWebsocket_Method(), this.getWebsocketDataFramingTypeKind(), "Method", null, 1, 1, ArrowHeadServiceInterfaceWebsocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrowHeadServiceInterfaceWebsocket_SubURL(), theTypesPackage.getString(), "SubURL", null, 1, 1, ArrowHeadServiceInterfaceWebsocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrowHeadServiceInterfaceWebsocket_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, ArrowHeadServiceInterfaceWebsocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fullPortEClass, FullPort.class, "FullPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFullPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, FullPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(proxyPortEClass, ProxyPort.class, "ProxyPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProxyPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, ProxyPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(systemDatabaseKindEEnum, SystemDatabaseKind.class, "SystemDatabaseKind");
		addEEnumLiteral(systemDatabaseKindEEnum, SystemDatabaseKind.MY_SQL);
		addEEnumLiteral(systemDatabaseKindEEnum, SystemDatabaseKind.UNDEFINED);
		addEEnumLiteral(systemDatabaseKindEEnum, SystemDatabaseKind.MARIA_DB);
		addEEnumLiteral(systemDatabaseKindEEnum, SystemDatabaseKind.MONGO_DB);
		addEEnumLiteral(systemDatabaseKindEEnum, SystemDatabaseKind.NEO4J);

		initEEnum(businessPolicyKindEEnum, BusinessPolicyKind.class, "BusinessPolicyKind");
		addEEnumLiteral(businessPolicyKindEEnum, BusinessPolicyKind.OTHER);

		initEEnum(securityPolicyKindEEnum, SecurityPolicyKind.class, "SecurityPolicyKind");
		addEEnumLiteral(securityPolicyKindEEnum, SecurityPolicyKind.NGAC);
		addEEnumLiteral(securityPolicyKindEEnum, SecurityPolicyKind.OTHER);

		initEEnum(lifecyclePolicyKindEEnum, LifecyclePolicyKind.class, "LifecyclePolicyKind");
		addEEnumLiteral(lifecyclePolicyKindEEnum, LifecyclePolicyKind.OTHER);

		initEEnum(macLayerKindEEnum, MacLayerKind.class, "MacLayerKind");
		addEEnumLiteral(macLayerKindEEnum, MacLayerKind.TDMA);
		addEEnumLiteral(macLayerKindEEnum, MacLayerKind.CDMA);
		addEEnumLiteral(macLayerKindEEnum, MacLayerKind.OTHER_MAC_LAYER);

		initEEnum(osKindEEnum, OSKind.class, "OSKind");
		addEEnumLiteral(osKindEEnum, OSKind.WINDOWS);
		addEEnumLiteral(osKindEEnum, OSKind.MAC_OS);
		addEEnumLiteral(osKindEEnum, OSKind.LINUX);
		addEEnumLiteral(osKindEEnum, OSKind.OTHER_OS);
		addEEnumLiteral(osKindEEnum, OSKind.ROS);

		initEEnum(arrowheadCertificateKindEEnum, ArrowheadCertificateKind.class, "ArrowheadCertificateKind");
		addEEnumLiteral(arrowheadCertificateKindEEnum, ArrowheadCertificateKind.DEVICE);
		addEEnumLiteral(arrowheadCertificateKindEEnum, ArrowheadCertificateKind.APPLICATION_SYSTEM);
		addEEnumLiteral(arrowheadCertificateKindEEnum, ArrowheadCertificateKind.CORE_SYSTEM);
		addEEnumLiteral(arrowheadCertificateKindEEnum, ArrowheadCertificateKind.MANAGEMENT);
		addEEnumLiteral(arrowheadCertificateKindEEnum, ArrowheadCertificateKind.INTER_CLOUD);
		addEEnumLiteral(arrowheadCertificateKindEEnum, ArrowheadCertificateKind.OTHER);

		initEEnum(timeFormatKindEEnum, TimeFormatKind.class, "TimeFormatKind");
		addEEnumLiteral(timeFormatKindEEnum, TimeFormatKind.RFC_3339);
		addEEnumLiteral(timeFormatKindEEnum, TimeFormatKind.ISO_8601);
		addEEnumLiteral(timeFormatKindEEnum, TimeFormatKind.UNIX_TIME);
		addEEnumLiteral(timeFormatKindEEnum, TimeFormatKind.OTHER_TIME_FORMAT);

		initEEnum(applicationProtocolKindEEnum, ApplicationProtocolKind.class, "ApplicationProtocolKind");
		addEEnumLiteral(applicationProtocolKindEEnum, ApplicationProtocolKind.HTTP);
		addEEnumLiteral(applicationProtocolKindEEnum, ApplicationProtocolKind.MQTT);
		addEEnumLiteral(applicationProtocolKindEEnum, ApplicationProtocolKind.COAP);
		addEEnumLiteral(applicationProtocolKindEEnum, ApplicationProtocolKind.WEBSOCKET);
		addEEnumLiteral(applicationProtocolKindEEnum, ApplicationProtocolKind.OTHER_APPLICATION_PROTOCOL);

		initEEnum(encodingKindEEnum, EncodingKind.class, "EncodingKind");
		addEEnumLiteral(encodingKindEEnum, EncodingKind.XML);
		addEEnumLiteral(encodingKindEEnum, EncodingKind.JSON);
		addEEnumLiteral(encodingKindEEnum, EncodingKind.CBOR);
		addEEnumLiteral(encodingKindEEnum, EncodingKind.OTHER_ENCODING);

		initEEnum(arrowheadSecurityKindEEnum, ArrowheadSecurityKind.class, "ArrowheadSecurityKind");
		addEEnumLiteral(arrowheadSecurityKindEEnum, ArrowheadSecurityKind.CERTIFICATE);
		addEEnumLiteral(arrowheadSecurityKindEEnum, ArrowheadSecurityKind.TOKEN);
		addEEnumLiteral(arrowheadSecurityKindEEnum, ArrowheadSecurityKind.NOT_SECURE);

		initEEnum(comprressionKindEEnum, ComprressionKind.class, "ComprressionKind");
		addEEnumLiteral(comprressionKindEEnum, ComprressionKind.EXI);
		addEEnumLiteral(comprressionKindEEnum, ComprressionKind.NONE);
		addEEnumLiteral(comprressionKindEEnum, ComprressionKind.OTHER_COMPRESSION);

		initEEnum(tokenKindEEnum, TokenKind.class, "TokenKind");
		addEEnumLiteral(tokenKindEEnum, TokenKind.ARROWHEAD_TOKEN);
		addEEnumLiteral(tokenKindEEnum, TokenKind.OTHER_TOKEN);

		initEEnum(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.class, "CryptoAlgorithmKind");
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.RSA);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.ELIPTIC_CURVE);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.DIFFIE_HELLMAN);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.SERPENT);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.AES);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.OTHER);

		initEEnum(datamodelStandardKindEEnum, DatamodelStandardKind.class, "DatamodelStandardKind");
		addEEnumLiteral(datamodelStandardKindEEnum, DatamodelStandardKind.ISO_10303);
		addEEnumLiteral(datamodelStandardKindEEnum, DatamodelStandardKind.ISO_15926);
		addEEnumLiteral(datamodelStandardKindEEnum, DatamodelStandardKind.SEN_ML);
		addEEnumLiteral(datamodelStandardKindEEnum, DatamodelStandardKind.ISO_12006);
		addEEnumLiteral(datamodelStandardKindEEnum, DatamodelStandardKind.IEC_81346);
		addEEnumLiteral(datamodelStandardKindEEnum, DatamodelStandardKind.ISO_15739_IFC);
		addEEnumLiteral(datamodelStandardKindEEnum, DatamodelStandardKind.IEC_61850);
		addEEnumLiteral(datamodelStandardKindEEnum, DatamodelStandardKind.OTHER_DATAMODEL_STANDARD);

		initEEnum(certificateKindEEnum, CertificateKind.class, "CertificateKind");
		addEEnumLiteral(certificateKindEEnum, CertificateKind.X509_ARROWHEAD);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.OTHER_CERTIFICATE);

		initEEnum(coAPMethodKindEEnum, CoAPMethodKind.class, "CoAPMethodKind");
		addEEnumLiteral(coAPMethodKindEEnum, CoAPMethodKind.GET);
		addEEnumLiteral(coAPMethodKindEEnum, CoAPMethodKind.PUT);
		addEEnumLiteral(coAPMethodKindEEnum, CoAPMethodKind.POST);
		addEEnumLiteral(coAPMethodKindEEnum, CoAPMethodKind.DELETE);
		addEEnumLiteral(coAPMethodKindEEnum, CoAPMethodKind.OTHER_CO_AP_METHOD);

		initEEnum(http11MethodKindEEnum, HTTP11MethodKind.class, "HTTP11MethodKind");
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.POST);
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.GET);
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.DELETE);
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.PUT);
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.HEAD);
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.OTHER_HTTP_METHOD);
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.CONNECT);
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.OPTIONS);
		addEEnumLiteral(http11MethodKindEEnum, HTTP11MethodKind.TRACE);

		initEEnum(http2FrameKindEEnum, HTTP2FrameKind.class, "HTTP2FrameKind");
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.OTHER_HTTP2_FRAME);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.HEADERS);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.DATA);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.PRIORITY);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.RST_STREAM);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.SETTINGS);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.PUSH_PROMISE);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.PING);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.GOAWAY);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.WINDOW_UPDATE);
		addEEnumLiteral(http2FrameKindEEnum, HTTP2FrameKind.CONTINUATION);

		initEEnum(macProtocolKindEEnum, MACProtocolKind.class, "MACProtocolKind");
		addEEnumLiteral(macProtocolKindEEnum, MACProtocolKind._802_11B_MAC);
		addEEnumLiteral(macProtocolKindEEnum, MACProtocolKind._802_11A_MAC);
		addEEnumLiteral(macProtocolKindEEnum, MACProtocolKind.OTHER_MAC_PROTOCOL);

		initEEnum(monitoringPolicyKindEEnum, MonitoringPolicyKind.class, "MonitoringPolicyKind");
		addEEnumLiteral(monitoringPolicyKindEEnum, MonitoringPolicyKind.ISA95);
		addEEnumLiteral(monitoringPolicyKindEEnum, MonitoringPolicyKind.OTHER_MONITORING_POLICY);

		initEEnum(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.class, "MQTT311MessageTypeKind");
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.CONNACK);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.CONNECT);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.DISCONNECT);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.PINGREQ);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.PINGRESP);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.PUBACK);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.PUBCOMP);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.PUBLISH);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.PUBREC);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.PUBREL);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.SUBACK);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.SUBSCRIBE);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.UNSUBACK);
		addEEnumLiteral(mqtt311MessageTypeKindEEnum, MQTT311MessageTypeKind.UNSUBSCRIBE);

		initEEnum(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.class, "MQTT50MessageTypeKind");
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.CONNECT);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.DISCONNECT);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.PUBLISH);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.CONNACK);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.PUBACK);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.PUBREC);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.PUBREL);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.PUBCOMP);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.SUBSCRIBE);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.SUBACK);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.UNSUBSCRIBE);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.UNSUBACK);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.PINGREQ);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.PINGRESP);
		addEEnumLiteral(mqtt50MessageTypeKindEEnum, MQTT50MessageTypeKind.AUTH);

		initEEnum(payloadEncryptionKindEEnum, PayloadEncryptionKind.class, "PayloadEncryptionKind");
		addEEnumLiteral(payloadEncryptionKindEEnum, PayloadEncryptionKind.DTLS12);
		addEEnumLiteral(payloadEncryptionKindEEnum, PayloadEncryptionKind.TLS12);
		addEEnumLiteral(payloadEncryptionKindEEnum, PayloadEncryptionKind.OTHER);
		addEEnumLiteral(payloadEncryptionKindEEnum, PayloadEncryptionKind.TLS13);
		addEEnumLiteral(payloadEncryptionKindEEnum, PayloadEncryptionKind.DTLS13);

		initEEnum(physicalLayerKindEEnum, PhysicalLayerKind.class, "PhysicalLayerKind");
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind.IEEE802_3);
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind.IEEE802_15_4);
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind.IEEE802_11A);
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind.IEEE802_11B);
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind.OTHER_PHYSICAL_LAYER);

		initEEnum(transportLayerKindEEnum, TransportLayerKind.class, "TransportLayerKind");
		addEEnumLiteral(transportLayerKindEEnum, TransportLayerKind.TCP);
		addEEnumLiteral(transportLayerKindEEnum, TransportLayerKind.UDP);

		initEEnum(websocketDataFramingTypeKindEEnum, WebsocketDataFramingTypeKind.class, "WebsocketDataFramingTypeKind");
		addEEnumLiteral(websocketDataFramingTypeKindEEnum, WebsocketDataFramingTypeKind.BASE_FRAMING_PROTOCOL);
		addEEnumLiteral(websocketDataFramingTypeKindEEnum, WebsocketDataFramingTypeKind.CLIENTTO_SERVER_MASKING);
		addEEnumLiteral(websocketDataFramingTypeKindEEnum, WebsocketDataFramingTypeKind.FRAGMENTATION);
		addEEnumLiteral(websocketDataFramingTypeKindEEnum, WebsocketDataFramingTypeKind.ENUMERATION_LITERAL4);
		addEEnumLiteral(websocketDataFramingTypeKindEEnum, WebsocketDataFramingTypeKind.CONTROL_FRAMES);
		addEEnumLiteral(websocketDataFramingTypeKindEEnum, WebsocketDataFramingTypeKind.DATA_FRAMES);

		initEEnum(workflowKindEEnum, WorkflowKind.class, "WorkflowKind");
		addEEnumLiteral(workflowKindEEnum, WorkflowKind.BPMN);
		addEEnumLiteral(workflowKindEEnum, WorkflowKind.SYS_ML_STATEMACHINE);
		addEEnumLiteral(workflowKindEEnum, WorkflowKind.NODE_RED);
		addEEnumLiteral(workflowKindEEnum, WorkflowKind.OTHER_WORKFLOW_LANGUAGE);
		addEEnumLiteral(workflowKindEEnum, WorkflowKind.PETRI_NET);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (getSystem_of_LocalcloudsDesign_SoLCName(),
		   source,
		   new String[] {
			   "originalName", "SoLC-Name"
		   });
		addAnnotation
		  (getDeviceDesign_DeviceName(),
		   source,
		   new String[] {
			   "originalName", "Device Name"
		   });
		addAnnotation
		  (getDeviceDesignDescription_IOports(),
		   source,
		   new String[] {
			   "originalName", "I/O ports"
		   });
		addAnnotation
		  (getLocalcloudDesignDescription_Systemoflocaclouddesigndescription(),
		   source,
		   new String[] {
			   "originalName", "system-of-locaclouddesigndescription"
		   });
		addAnnotation
		  (http11MethodKindEEnum,
		   source,
		   new String[] {
			   "originalName", "HTTP1.1MethodKind"
		   });
		addAnnotation
		  (http2FrameKindEEnum,
		   source,
		   new String[] {
			   "originalName", "HTTP/2FrameKind"
		   });
		addAnnotation
		  (macProtocolKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "originalName", "802_11b_MAC"
		   });
		addAnnotation
		  (macProtocolKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "originalName", "802_11a_MAC"
		   });
		addAnnotation
		  (mqtt311MessageTypeKindEEnum,
		   source,
		   new String[] {
			   "originalName", "MQTT3.1.1-MessageTypeKind"
		   });
		addAnnotation
		  (mqtt50MessageTypeKindEEnum,
		   source,
		   new String[] {
			   "originalName", "MQTT5.0-MessageTypeKind"
		   });
		addAnnotation
		  (payloadEncryptionKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "originalName", "DTLS 1.2"
		   });
		addAnnotation
		  (payloadEncryptionKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "originalName", "TLS 1.2"
		   });
		addAnnotation
		  (payloadEncryptionKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "originalName", "TLS 1.3"
		   });
		addAnnotation
		  (payloadEncryptionKindEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "originalName", "DTLS 1.3"
		   });
		addAnnotation
		  (websocketDataFramingTypeKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "originalName", "Client-to-Server_Masking"
		   });
	}

} //ArrowheadDSLPackageImpl
