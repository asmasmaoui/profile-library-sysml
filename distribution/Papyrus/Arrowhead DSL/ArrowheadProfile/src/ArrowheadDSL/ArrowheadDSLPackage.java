/**
 */
package ArrowheadDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.papyrus.sysml16.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ArrowheadDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ArrowheadDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/arrowhead";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ArrowheadDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArrowheadDSLPackage eINSTANCE = ArrowheadDSL.impl.ArrowheadDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.SysDImpl <em>Sys D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.SysDImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSysD()
	 * @generated
	 */
	int SYS_D = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Microsystem Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__MICROSYSTEM_NAME = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__FUNCTIONAL_PROPERTIES = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__SYSTEM_DATABASE = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Microsystem Behaviour</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__MICROSYSTEM_BEHAVIOUR = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__SD = BlocksPackage.BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Localclouddesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__LOCALCLOUDDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.SDImpl <em>SD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.SDImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSD()
	 * @generated
	 */
	int SD = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__BASE_CLASS = PortsAndFlowsPackage.INTERFACE_BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__IS_ENCAPSULATED = PortsAndFlowsPackage.INTERFACE_BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Microservice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__MICROSERVICE_NAME = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sysd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__SYSD = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FEATURE_COUNT = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___GET_REFERENCES = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___GET_PARTS = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___GET_FLOW_PROPERTIES = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___GET_CONJUGATED = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_CONJUGATED;

	/**
	 * The operation id for the '<em>Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___OPERATION = PortsAndFlowsPackage.INTERFACE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_OPERATION_COUNT = PortsAndFlowsPackage.INTERFACE_BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.LocalCloudDesignImpl <em>Local Cloud Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.LocalCloudDesignImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getLocalCloudDesign()
	 * @generated
	 */
	int LOCAL_CLOUD_DESIGN = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>LC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__LC_NAME = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LC Security Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LC Business Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>LC Lifecycle Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY = BlocksPackage.BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System of localcloudsdesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sysd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__SYSD = BlocksPackage.BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Local Cloud Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Local Cloud Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl <em>System of Localclouds Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystem_of_LocalcloudsDesign()
	 * @generated
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>So LC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>So LC Security Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>So LC Business Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>So LC Lifecycle Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Localclouddesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>System of Localclouds Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>System of Localclouds Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.ArrowheadDSLRequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.ArrowheadDSLRequirementImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLRequirement()
	 * @generated
	 */
	int ARROWHEAD_DSL_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__BASE_NAMED_ELEMENT = RequirementsPackage.REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__DERIVED = RequirementsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__DERIVED_FROM = RequirementsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__ID = RequirementsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__MASTER = RequirementsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__REFINED_BY = RequirementsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__SATISFIED_BY = RequirementsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__TEXT = RequirementsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__TRACED_TO = RequirementsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__VERIFIED_BY = RequirementsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__BASE_CLASS = RequirementsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Arrowheadusecase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_FEATURE_COUNT = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Satisfied By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT___GET_SATISFIED_BY = RequirementsPackage.REQUIREMENT___GET_SATISFIED_BY;

	/**
	 * The operation id for the '<em>Get Verified By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT___GET_VERIFIED_BY = RequirementsPackage.REQUIREMENT___GET_VERIFIED_BY;

	/**
	 * The operation id for the '<em>Get Traced To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT___GET_TRACED_TO = RequirementsPackage.REQUIREMENT___GET_TRACED_TO;

	/**
	 * The operation id for the '<em>Get Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT___GET_DERIVED = RequirementsPackage.REQUIREMENT___GET_DERIVED;

	/**
	 * The operation id for the '<em>Get Derived From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT___GET_DERIVED_FROM = RequirementsPackage.REQUIREMENT___GET_DERIVED_FROM;

	/**
	 * The operation id for the '<em>Get Refined By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT___GET_REFINED_BY = RequirementsPackage.REQUIREMENT___GET_REFINED_BY;

	/**
	 * The operation id for the '<em>Get Master</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT___GET_MASTER = RequirementsPackage.REQUIREMENT___GET_MASTER;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_OPERATION_COUNT = RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.ArrowheadUseCaseImpl <em>Arrowhead Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.ArrowheadUseCaseImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadUseCase()
	 * @generated
	 */
	int ARROWHEAD_USE_CASE = 5;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_USE_CASE__BASE_USE_CASE = 0;

	/**
	 * The feature id for the '<em><b>Arrowheaddslrequirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT = 1;

	/**
	 * The number of structural features of the '<em>Arrowhead Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_USE_CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arrowhead Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_USE_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.DeviceDesignImpl <em>Device Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.DeviceDesignImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getDeviceDesign()
	 * @generated
	 */
	int DEVICE_DESIGN = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__DEVICE_NAME = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intercloudnetworkdesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intracloudnetworkdesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Device Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Device Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.IntercloudNetworkDesignImpl <em>Intercloud Network Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.IntercloudNetworkDesignImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIntercloudNetworkDesign()
	 * @generated
	 */
	int INTERCLOUD_NETWORK_DESIGN = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Inter Network Domain Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inter Network Mac Layer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devicedesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Intercloud Network Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Intercloud Network Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.IntracloudNetworkDesignImpl <em>Intracloud Network Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.IntracloudNetworkDesignImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIntracloudNetworkDesign()
	 * @generated
	 */
	int INTRACLOUD_NETWORK_DESIGN = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Intra Network Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intra Network Mac Layer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devicedesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Intracloud Network Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Intracloud Network Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl <em>Device Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.DeviceDesignDescriptionImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getDeviceDesignDescription()
	 * @generated
	 */
	int DEVICE_DESIGN_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__BASE_CLASS = DEVICE_DESIGN__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__IS_ENCAPSULATED = DEVICE_DESIGN__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__DEVICE_NAME = DEVICE_DESIGN__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Intercloudnetworkdesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGN = DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN;

	/**
	 * The feature id for the '<em><b>Intracloudnetworkdesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGN = DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN;

	/**
	 * The feature id for the '<em><b>IOports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__IOPORTS = DEVICE_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__MEMORY = DEVICE_DESIGN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__PROCESSOR = DEVICE_DESIGN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM = DEVICE_DESIGN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arrowhead Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__ARROWHEAD_CERTIFICATE = DEVICE_DESIGN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Intercloudnetworkdesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION = DEVICE_DESIGN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Intracloudnetworkdesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION = DEVICE_DESIGN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Device Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION_FEATURE_COUNT = DEVICE_DESIGN_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION___GET_REFERENCES = DEVICE_DESIGN___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION___GET_PARTS = DEVICE_DESIGN___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = DEVICE_DESIGN___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Device Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION_OPERATION_COUNT = DEVICE_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.IntercloudNetworkDesignDescriptionImpl <em>Intercloud Network Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.IntercloudNetworkDesignDescriptionImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIntercloudNetworkDesignDescription()
	 * @generated
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__BASE_CLASS = INTERCLOUD_NETWORK_DESIGN__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__IS_ENCAPSULATED = INTERCLOUD_NETWORK_DESIGN__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Inter Network Domain Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_DOMAIN_NAME = INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME;

	/**
	 * The feature id for the '<em><b>Inter Network Mac Layer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_MAC_LAYER = INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER;

	/**
	 * The feature id for the '<em><b>Devicedesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGN = INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN;

	/**
	 * The feature id for the '<em><b>Inter Network Router</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER = INTERCLOUD_NETWORK_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inter Network Router Config</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG = INTERCLOUD_NETWORK_DESIGN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devicedesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION = INTERCLOUD_NETWORK_DESIGN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Intercloud Network Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION_FEATURE_COUNT = INTERCLOUD_NETWORK_DESIGN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION___GET_REFERENCES = INTERCLOUD_NETWORK_DESIGN___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION___GET_PARTS = INTERCLOUD_NETWORK_DESIGN___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = INTERCLOUD_NETWORK_DESIGN___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Intercloud Network Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCLOUD_NETWORK_DESIGN_DESCRIPTION_OPERATION_COUNT = INTERCLOUD_NETWORK_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.IntracloudNetworkDesignDescriptionImpl <em>Intracloud Network Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.IntracloudNetworkDesignDescriptionImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIntracloudNetworkDesignDescription()
	 * @generated
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__BASE_CLASS = INTRACLOUD_NETWORK_DESIGN__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__IS_ENCAPSULATED = INTRACLOUD_NETWORK_DESIGN__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Intra Network Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_DOMAIN = INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN;

	/**
	 * The feature id for the '<em><b>Intra Network Mac Layer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_MAC_LAYER = INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER;

	/**
	 * The feature id for the '<em><b>Devicedesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGN = INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN;

	/**
	 * The feature id for the '<em><b>Intra Network Router</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER = INTRACLOUD_NETWORK_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intra Network Router Config</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG = INTRACLOUD_NETWORK_DESIGN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devicedesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION = INTRACLOUD_NETWORK_DESIGN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Intracloud Network Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION_FEATURE_COUNT = INTRACLOUD_NETWORK_DESIGN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION___GET_REFERENCES = INTRACLOUD_NETWORK_DESIGN___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION___GET_PARTS = INTRACLOUD_NETWORK_DESIGN___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = INTRACLOUD_NETWORK_DESIGN___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Intracloud Network Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACLOUD_NETWORK_DESIGN_DESCRIPTION_OPERATION_COUNT = INTRACLOUD_NETWORK_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.LocalcloudDesignDescriptionImpl <em>Localcloud Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.LocalcloudDesignDescriptionImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getLocalcloudDesignDescription()
	 * @generated
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__BASE_CLASS = LOCAL_CLOUD_DESIGN__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__IS_ENCAPSULATED = LOCAL_CLOUD_DESIGN__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>LC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__LC_NAME = LOCAL_CLOUD_DESIGN__LC_NAME;

	/**
	 * The feature id for the '<em><b>Functional Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__FUNCTIONAL_PROPERTIES = LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>LC Security Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__LC_SECURITY_STRATEGY = LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY;

	/**
	 * The feature id for the '<em><b>LC Business Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__LC_BUSINESS_STRATEGY = LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY;

	/**
	 * The feature id for the '<em><b>LC Lifecycle Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__LC_LIFECYCLE_STRATEGY = LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY;

	/**
	 * The feature id for the '<em><b>System of localcloudsdesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEM_OF_LOCALCLOUDSDESIGN = LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN;

	/**
	 * The feature id for the '<em><b>Sysd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__SYSD = LOCAL_CLOUD_DESIGN__SYSD;

	/**
	 * The feature id for the '<em><b>LC workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW = LOCAL_CLOUD_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>LC orchestration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION = LOCAL_CLOUD_DESIGN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Systemoflocaclouddesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION = LOCAL_CLOUD_DESIGN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sysdd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD = LOCAL_CLOUD_DESIGN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Localcloud Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION_FEATURE_COUNT = LOCAL_CLOUD_DESIGN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION___GET_REFERENCES = LOCAL_CLOUD_DESIGN___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION___GET_PARTS = LOCAL_CLOUD_DESIGN___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = LOCAL_CLOUD_DESIGN___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Localcloud Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_DESIGN_DESCRIPTION_OPERATION_COUNT = LOCAL_CLOUD_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.System_of_LocacloudsDesignDescriptionImpl <em>System of Locaclouds Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.System_of_LocacloudsDesignDescriptionImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystem_of_LocacloudsDesignDescription()
	 * @generated
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__BASE_CLASS = SYSTEM_OF_LOCALCLOUDS_DESIGN__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__IS_ENCAPSULATED = SYSTEM_OF_LOCALCLOUDS_DESIGN__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>So LC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_NAME = SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME;

	/**
	 * The feature id for the '<em><b>So LC Security Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_SECURITY_STRATEGY = SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY;

	/**
	 * The feature id for the '<em><b>So LC Business Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_BUSINESS_STRATEGY = SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY;

	/**
	 * The feature id for the '<em><b>So LC Lifecycle Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_LIFECYCLE_STRATEGY = SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY;

	/**
	 * The feature id for the '<em><b>Localclouddesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGN = SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN;

	/**
	 * The feature id for the '<em><b>So LC Orchestration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION = SYSTEM_OF_LOCALCLOUDS_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>So LC Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW = SYSTEM_OF_LOCALCLOUDS_DESIGN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Localclouddesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION = SYSTEM_OF_LOCALCLOUDS_DESIGN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System of Locaclouds Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION_FEATURE_COUNT = SYSTEM_OF_LOCALCLOUDS_DESIGN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION___GET_REFERENCES = SYSTEM_OF_LOCALCLOUDS_DESIGN___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION___GET_PARTS = SYSTEM_OF_LOCALCLOUDS_DESIGN___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = SYSTEM_OF_LOCALCLOUDS_DESIGN___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>System of Locaclouds Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION_OPERATION_COUNT = SYSTEM_OF_LOCALCLOUDS_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.SysDDImpl <em>Sys DD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.SysDDImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSysDD()
	 * @generated
	 */
	int SYS_DD = 14;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__BASE_CLASS = SYS_D__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__IS_ENCAPSULATED = SYS_D__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Microsystem Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__MICROSYSTEM_NAME = SYS_D__MICROSYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Functional Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__FUNCTIONAL_PROPERTIES = SYS_D__FUNCTIONAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>System Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__SYSTEM_DATABASE = SYS_D__SYSTEM_DATABASE;

	/**
	 * The feature id for the '<em><b>Microsystem Behaviour</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__MICROSYSTEM_BEHAVIOUR = SYS_D__MICROSYSTEM_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Sd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__SD = SYS_D__SD;

	/**
	 * The feature id for the '<em><b>Localclouddesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__LOCALCLOUDDESIGN = SYS_D__LOCALCLOUDDESIGN;

	/**
	 * The feature id for the '<em><b>Timeformat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__TIMEFORMAT = SYS_D_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arrowhead Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__ARROWHEAD_CERTIFICATE = SYS_D_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Idd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__IDD = SYS_D_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Localclouddesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__LOCALCLOUDDESIGNDESCRIPTION = SYS_D_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD_FEATURE_COUNT = SYS_D_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD___GET_REFERENCES = SYS_D___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD___GET_PARTS = SYS_D___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD___GET_FLOW_PROPERTIES = SYS_D___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD_OPERATION_COUNT = SYS_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.IDDImpl <em>IDD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.IDDImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIDD()
	 * @generated
	 */
	int IDD = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__BASE_CLASS = SD__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__IS_ENCAPSULATED = SD__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Microservice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__MICROSERVICE_NAME = SD__MICROSERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Sysd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__SYSD = SD__SYSD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__PORT = SD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__PROTOCOL = SD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__ENCODING = SD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__SECURITY = SD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__COMPRESSION = SD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Certificate level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__CERTIFICATE_LEVEL = SD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__TOKEN = SD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Crypto algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__CRYPTO_ALGORITHM = SD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__DATAMODEL = SD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sysdd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__SYSDD = SD_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>IDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_FEATURE_COUNT = SD_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___GET_REFERENCES = SD___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___GET_PARTS = SD___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___GET_FLOW_PROPERTIES = SD___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___GET_CONJUGATED = SD___GET_CONJUGATED;

	/**
	 * The operation id for the '<em>Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___OPERATION = SD___OPERATION;

	/**
	 * The number of operations of the '<em>IDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_OPERATION_COUNT = SD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.System_of_LocalcloudsImplementationImpl <em>System of Localclouds Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.System_of_LocalcloudsImplementationImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystem_of_LocalcloudsImplementation()
	 * @generated
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION = 16;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__BASE_CLASS = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__IS_ENCAPSULATED = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>So LC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_NAME = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_NAME;

	/**
	 * The feature id for the '<em><b>So LC Security Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_SECURITY_STRATEGY = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_SECURITY_STRATEGY;

	/**
	 * The feature id for the '<em><b>So LC Business Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_BUSINESS_STRATEGY = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_BUSINESS_STRATEGY;

	/**
	 * The feature id for the '<em><b>So LC Lifecycle Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_LIFECYCLE_STRATEGY = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_LIFECYCLE_STRATEGY;

	/**
	 * The feature id for the '<em><b>Localclouddesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDDESIGN = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGN;

	/**
	 * The feature id for the '<em><b>So LC Orchestration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_ORCHESTRATION = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION;

	/**
	 * The feature id for the '<em><b>So LC Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_WORKFLOW = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW;

	/**
	 * The feature id for the '<em><b>Localclouddesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDDESIGNDESCRIPTION = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION;

	/**
	 * The feature id for the '<em><b>So LC Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_DOCUMENTATION = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Localcloudimplementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System of Localclouds Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION_FEATURE_COUNT = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION___GET_REFERENCES = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION___GET_PARTS = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION___GET_FLOW_PROPERTIES = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>System of Localclouds Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION_OPERATION_COUNT = SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.LocalcloudImplementationImpl <em>Localcloud Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.LocalcloudImplementationImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getLocalcloudImplementation()
	 * @generated
	 */
	int LOCALCLOUD_IMPLEMENTATION = 17;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__BASE_CLASS = LOCALCLOUD_DESIGN_DESCRIPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__IS_ENCAPSULATED = LOCALCLOUD_DESIGN_DESCRIPTION__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>LC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__LC_NAME = LOCALCLOUD_DESIGN_DESCRIPTION__LC_NAME;

	/**
	 * The feature id for the '<em><b>Functional Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__FUNCTIONAL_PROPERTIES = LOCALCLOUD_DESIGN_DESCRIPTION__FUNCTIONAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>LC Security Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__LC_SECURITY_STRATEGY = LOCALCLOUD_DESIGN_DESCRIPTION__LC_SECURITY_STRATEGY;

	/**
	 * The feature id for the '<em><b>LC Business Strategy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__LC_BUSINESS_STRATEGY = LOCALCLOUD_DESIGN_DESCRIPTION__LC_BUSINESS_STRATEGY;

	/**
	 * The feature id for the '<em><b>LC Lifecycle Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__LC_LIFECYCLE_STRATEGY = LOCALCLOUD_DESIGN_DESCRIPTION__LC_LIFECYCLE_STRATEGY;

	/**
	 * The feature id for the '<em><b>System of localcloudsdesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSDESIGN = LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEM_OF_LOCALCLOUDSDESIGN;

	/**
	 * The feature id for the '<em><b>Sysd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__SYSD = LOCALCLOUD_DESIGN_DESCRIPTION__SYSD;

	/**
	 * The feature id for the '<em><b>LC workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__LC_WORKFLOW = LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW;

	/**
	 * The feature id for the '<em><b>LC orchestration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__LC_ORCHESTRATION = LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION;

	/**
	 * The feature id for the '<em><b>Systemoflocaclouddesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION = LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sysdd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__SYSDD = LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD;

	/**
	 * The feature id for the '<em><b>LC Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION = LOCALCLOUD_DESIGN_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Systemimplementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION = LOCALCLOUD_DESIGN_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System of localcloudsimplementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION = LOCALCLOUD_DESIGN_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Localcloud Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION_FEATURE_COUNT = LOCALCLOUD_DESIGN_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION___GET_REFERENCES = LOCALCLOUD_DESIGN_DESCRIPTION___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION___GET_PARTS = LOCALCLOUD_DESIGN_DESCRIPTION___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION___GET_FLOW_PROPERTIES = LOCALCLOUD_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Localcloud Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALCLOUD_IMPLEMENTATION_OPERATION_COUNT = LOCALCLOUD_DESIGN_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.System_ImplementationImpl <em>System Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.System_ImplementationImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystem_Implementation()
	 * @generated
	 */
	int SYSTEM_IMPLEMENTATION = 18;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__BASE_CLASS = SYS_DD__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__IS_ENCAPSULATED = SYS_DD__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Microsystem Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__MICROSYSTEM_NAME = SYS_DD__MICROSYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Functional Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__FUNCTIONAL_PROPERTIES = SYS_DD__FUNCTIONAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>System Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__SYSTEM_DATABASE = SYS_DD__SYSTEM_DATABASE;

	/**
	 * The feature id for the '<em><b>Microsystem Behaviour</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__MICROSYSTEM_BEHAVIOUR = SYS_DD__MICROSYSTEM_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Sd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__SD = SYS_DD__SD;

	/**
	 * The feature id for the '<em><b>Localclouddesign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__LOCALCLOUDDESIGN = SYS_DD__LOCALCLOUDDESIGN;

	/**
	 * The feature id for the '<em><b>Timeformat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__TIMEFORMAT = SYS_DD__TIMEFORMAT;

	/**
	 * The feature id for the '<em><b>Arrowhead Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__ARROWHEAD_CERTIFICATE = SYS_DD__ARROWHEAD_CERTIFICATE;

	/**
	 * The feature id for the '<em><b>Idd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__IDD = SYS_DD__IDD;

	/**
	 * The feature id for the '<em><b>Localclouddesigndescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__LOCALCLOUDDESIGNDESCRIPTION = SYS_DD__LOCALCLOUDDESIGNDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Idd implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION = SYS_DD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loclacloudimplementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION = SYS_DD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION_FEATURE_COUNT = SYS_DD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION___GET_REFERENCES = SYS_DD___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION___GET_PARTS = SYS_DD___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION___GET_FLOW_PROPERTIES = SYS_DD___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>System Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION_OPERATION_COUNT = SYS_DD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.IDD_ImplementationImpl <em>IDD Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.IDD_ImplementationImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIDD_Implementation()
	 * @generated
	 */
	int IDD_IMPLEMENTATION = 19;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__BASE_CLASS = IDD__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__IS_ENCAPSULATED = IDD__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Microservice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__MICROSERVICE_NAME = IDD__MICROSERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Sysd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__SYSD = IDD__SYSD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__PORT = IDD__PORT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__PROTOCOL = IDD__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__ENCODING = IDD__ENCODING;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__SECURITY = IDD__SECURITY;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__COMPRESSION = IDD__COMPRESSION;

	/**
	 * The feature id for the '<em><b>Certificate level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__CERTIFICATE_LEVEL = IDD__CERTIFICATE_LEVEL;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__TOKEN = IDD__TOKEN;

	/**
	 * The feature id for the '<em><b>Crypto algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__CRYPTO_ALGORITHM = IDD__CRYPTO_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__DATAMODEL = IDD__DATAMODEL;

	/**
	 * The feature id for the '<em><b>Sysdd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__SYSDD = IDD__SYSDD;

	/**
	 * The feature id for the '<em><b>Systemimplementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION = IDD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDD Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION_FEATURE_COUNT = IDD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION___GET_REFERENCES = IDD___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION___GET_PARTS = IDD___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION___GET_FLOW_PROPERTIES = IDD___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION___GET_CONJUGATED = IDD___GET_CONJUGATED;

	/**
	 * The operation id for the '<em>Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION___OPERATION = IDD___OPERATION;

	/**
	 * The number of operations of the '<em>IDD Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_IMPLEMENTATION_OPERATION_COUNT = IDD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.ArrowheadDSLOperationHTTPImpl <em>Operation HTTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.ArrowheadDSLOperationHTTPImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLOperationHTTP()
	 * @generated
	 */
	int ARROWHEAD_DSL_OPERATION_HTTP = 20;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_OPERATION_HTTP__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Sub URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_OPERATION_HTTP__SUB_URL = 1;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_OPERATION_HTTP__BASE_OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Operation HTTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_OPERATION_HTTP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation HTTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_OPERATION_HTTP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.ArrowheadDSLRequirementMQTTImpl <em>Requirement MQTT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.ArrowheadDSLRequirementMQTTImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLRequirementMQTT()
	 * @generated
	 */
	int ARROWHEAD_DSL_REQUIREMENT_MQTT = 21;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_MQTT__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_MQTT__TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_MQTT__BASE_OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Requirement MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_MQTT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirement MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_MQTT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.ArrowheadDSLRequirementCOAPImpl <em>Requirement COAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.ArrowheadDSLRequirementCOAPImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLRequirementCOAP()
	 * @generated
	 */
	int ARROWHEAD_DSL_REQUIREMENT_COAP = 22;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_COAP__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_COAP__BASE_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Sub URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_COAP__SUB_URL = 2;

	/**
	 * The number of structural features of the '<em>Requirement COAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_COAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirement COAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_COAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.impl.ArrowheadDSLRequirementWebsocketImpl <em>Requirement Websocket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.impl.ArrowheadDSLRequirementWebsocketImpl
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLRequirementWebsocket()
	 * @generated
	 */
	int ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET = 23;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Sub URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET__SUB_URL = 1;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET__BASE_OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Requirement Websocket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirement Websocket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.SystemDatabaseKind <em>System Database Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.SystemDatabaseKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystemDatabaseKind()
	 * @generated
	 */
	int SYSTEM_DATABASE_KIND = 24;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.BusinessPolicyKind <em>Business Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.BusinessPolicyKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getBusinessPolicyKind()
	 * @generated
	 */
	int BUSINESS_POLICY_KIND = 25;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.SecurityPolicyKind <em>Security Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.SecurityPolicyKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSecurityPolicyKind()
	 * @generated
	 */
	int SECURITY_POLICY_KIND = 26;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.LifecyclePolicyKind <em>Lifecycle Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.LifecyclePolicyKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getLifecyclePolicyKind()
	 * @generated
	 */
	int LIFECYCLE_POLICY_KIND = 27;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.MacLayerKind <em>Mac Layer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.MacLayerKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMacLayerKind()
	 * @generated
	 */
	int MAC_LAYER_KIND = 28;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.OSKind <em>OS Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.OSKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getOSKind()
	 * @generated
	 */
	int OS_KIND = 29;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.ArrowheadCertificateKind <em>Arrowhead Certificate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.ArrowheadCertificateKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadCertificateKind()
	 * @generated
	 */
	int ARROWHEAD_CERTIFICATE_KIND = 30;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.TimeFormatKind <em>Time Format Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.TimeFormatKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getTimeFormatKind()
	 * @generated
	 */
	int TIME_FORMAT_KIND = 31;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.ApplicationProtocolKind <em>Application Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.ApplicationProtocolKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getApplicationProtocolKind()
	 * @generated
	 */
	int APPLICATION_PROTOCOL_KIND = 32;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.EncodingKind <em>Encoding Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.EncodingKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getEncodingKind()
	 * @generated
	 */
	int ENCODING_KIND = 33;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.ArrowheadSecurityKind <em>Arrowhead Security Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.ArrowheadSecurityKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadSecurityKind()
	 * @generated
	 */
	int ARROWHEAD_SECURITY_KIND = 34;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.ComprressionKind <em>Comprression Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.ComprressionKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getComprressionKind()
	 * @generated
	 */
	int COMPRRESSION_KIND = 35;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.TokenKind <em>Token Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.TokenKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getTokenKind()
	 * @generated
	 */
	int TOKEN_KIND = 36;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.CryptoAlgorithmKind <em>Crypto Algorithm Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.CryptoAlgorithmKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getCryptoAlgorithmKind()
	 * @generated
	 */
	int CRYPTO_ALGORITHM_KIND = 37;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.DatamodelStandardKind <em>Datamodel Standard Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.DatamodelStandardKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getDatamodelStandardKind()
	 * @generated
	 */
	int DATAMODEL_STANDARD_KIND = 38;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.CertificateKind <em>Certificate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.CertificateKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getCertificateKind()
	 * @generated
	 */
	int CERTIFICATE_KIND = 39;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.CoAPMethodKind <em>Co AP Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.CoAPMethodKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getCoAPMethodKind()
	 * @generated
	 */
	int CO_AP_METHOD_KIND = 40;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.HTTP11MethodKind <em>HTTP11 Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.HTTP11MethodKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getHTTP11MethodKind()
	 * @generated
	 */
	int HTTP11_METHOD_KIND = 41;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.HTTP2FrameKind <em>HTTP2 Frame Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.HTTP2FrameKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getHTTP2FrameKind()
	 * @generated
	 */
	int HTTP2_FRAME_KIND = 42;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.MACProtocolKind <em>MAC Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.MACProtocolKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMACProtocolKind()
	 * @generated
	 */
	int MAC_PROTOCOL_KIND = 43;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.MonitoringPolicyKind <em>Monitoring Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.MonitoringPolicyKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMonitoringPolicyKind()
	 * @generated
	 */
	int MONITORING_POLICY_KIND = 44;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.MQTT311MessageTypeKind <em>MQTT311 Message Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.MQTT311MessageTypeKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMQTT311MessageTypeKind()
	 * @generated
	 */
	int MQTT311_MESSAGE_TYPE_KIND = 45;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.MQTT50MessageTypeKind <em>MQTT50 Message Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.MQTT50MessageTypeKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMQTT50MessageTypeKind()
	 * @generated
	 */
	int MQTT50_MESSAGE_TYPE_KIND = 46;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.PayloadEncryptionKind <em>Payload Encryption Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.PayloadEncryptionKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getPayloadEncryptionKind()
	 * @generated
	 */
	int PAYLOAD_ENCRYPTION_KIND = 47;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.PhysicalLayerKind <em>Physical Layer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.PhysicalLayerKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getPhysicalLayerKind()
	 * @generated
	 */
	int PHYSICAL_LAYER_KIND = 48;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.TransportLayerKind <em>Transport Layer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.TransportLayerKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getTransportLayerKind()
	 * @generated
	 */
	int TRANSPORT_LAYER_KIND = 49;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.WebsocketDataFramingTypeKind <em>Websocket Data Framing Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.WebsocketDataFramingTypeKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getWebsocketDataFramingTypeKind()
	 * @generated
	 */
	int WEBSOCKET_DATA_FRAMING_TYPE_KIND = 50;

	/**
	 * The meta object id for the '{@link ArrowheadDSL.WorkflowKind <em>Workflow Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ArrowheadDSL.WorkflowKind
	 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getWorkflowKind()
	 * @generated
	 */
	int WORKFLOW_KIND = 51;


	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.SysD <em>Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys D</em>'.
	 * @see ArrowheadDSL.SysD
	 * @generated
	 */
	EClass getSysD();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.SysD#getMicrosystemName <em>Microsystem Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Microsystem Name</em>'.
	 * @see ArrowheadDSL.SysD#getMicrosystemName()
	 * @see #getSysD()
	 * @generated
	 */
	EAttribute getSysD_MicrosystemName();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.SysD#getFunctionalProperties <em>Functional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Functional Properties</em>'.
	 * @see ArrowheadDSL.SysD#getFunctionalProperties()
	 * @see #getSysD()
	 * @generated
	 */
	EAttribute getSysD_FunctionalProperties();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.SysD#getSystemDatabase <em>System Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Database</em>'.
	 * @see ArrowheadDSL.SysD#getSystemDatabase()
	 * @see #getSysD()
	 * @generated
	 */
	EAttribute getSysD_SystemDatabase();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.SysD#getMicrosystemBehaviour <em>Microsystem Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Microsystem Behaviour</em>'.
	 * @see ArrowheadDSL.SysD#getMicrosystemBehaviour()
	 * @see #getSysD()
	 * @generated
	 */
	EAttribute getSysD_MicrosystemBehaviour();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.SysD#getSd <em>Sd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sd</em>'.
	 * @see ArrowheadDSL.SysD#getSd()
	 * @see #getSysD()
	 * @generated
	 */
	EReference getSysD_Sd();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.SysD#getLocalclouddesign <em>Localclouddesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Localclouddesign</em>'.
	 * @see ArrowheadDSL.SysD#getLocalclouddesign()
	 * @see #getSysD()
	 * @generated
	 */
	EReference getSysD_Localclouddesign();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.SD <em>SD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SD</em>'.
	 * @see ArrowheadDSL.SD
	 * @generated
	 */
	EClass getSD();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.SD#getMicroserviceName <em>Microservice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Microservice Name</em>'.
	 * @see ArrowheadDSL.SD#getMicroserviceName()
	 * @see #getSD()
	 * @generated
	 */
	EAttribute getSD_MicroserviceName();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.SD#getSysd <em>Sysd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sysd</em>'.
	 * @see ArrowheadDSL.SD#getSysd()
	 * @see #getSD()
	 * @generated
	 */
	EReference getSD_Sysd();

	/**
	 * Returns the meta object for the '{@link ArrowheadDSL.SD#Operation() <em>Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operation</em>' operation.
	 * @see ArrowheadDSL.SD#Operation()
	 * @generated
	 */
	EOperation getSD__Operation();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.LocalCloudDesign <em>Local Cloud Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Cloud Design</em>'.
	 * @see ArrowheadDSL.LocalCloudDesign
	 * @generated
	 */
	EClass getLocalCloudDesign();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.LocalCloudDesign#getLC_Name <em>LC Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LC Name</em>'.
	 * @see ArrowheadDSL.LocalCloudDesign#getLC_Name()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EAttribute getLocalCloudDesign_LC_Name();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.LocalCloudDesign#getFunctionalProperties <em>Functional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Properties</em>'.
	 * @see ArrowheadDSL.LocalCloudDesign#getFunctionalProperties()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EAttribute getLocalCloudDesign_FunctionalProperties();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.LocalCloudDesign#getLC_SecurityStrategy <em>LC Security Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>LC Security Strategy</em>'.
	 * @see ArrowheadDSL.LocalCloudDesign#getLC_SecurityStrategy()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EAttribute getLocalCloudDesign_LC_SecurityStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.LocalCloudDesign#getLC_BusinessStrategy <em>LC Business Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>LC Business Strategy</em>'.
	 * @see ArrowheadDSL.LocalCloudDesign#getLC_BusinessStrategy()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EAttribute getLocalCloudDesign_LC_BusinessStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.LocalCloudDesign#getLC_LifecycleStrategy <em>LC Lifecycle Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LC Lifecycle Strategy</em>'.
	 * @see ArrowheadDSL.LocalCloudDesign#getLC_LifecycleStrategy()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EAttribute getLocalCloudDesign_LC_LifecycleStrategy();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.LocalCloudDesign#getSystem_of_localcloudsdesign <em>System of localcloudsdesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System of localcloudsdesign</em>'.
	 * @see ArrowheadDSL.LocalCloudDesign#getSystem_of_localcloudsdesign()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EReference getLocalCloudDesign_System_of_localcloudsdesign();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.LocalCloudDesign#getSysd <em>Sysd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sysd</em>'.
	 * @see ArrowheadDSL.LocalCloudDesign#getSysd()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EReference getLocalCloudDesign_Sysd();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.System_of_LocalcloudsDesign <em>System of Localclouds Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System of Localclouds Design</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsDesign
	 * @generated
	 */
	EClass getSystem_of_LocalcloudsDesign();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLCName <em>So LC Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So LC Name</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsDesign#getSoLCName()
	 * @see #getSystem_of_LocalcloudsDesign()
	 * @generated
	 */
	EAttribute getSystem_of_LocalcloudsDesign_SoLCName();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_SecurityStrategy <em>So LC Security Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>So LC Security Strategy</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_SecurityStrategy()
	 * @see #getSystem_of_LocalcloudsDesign()
	 * @generated
	 */
	EAttribute getSystem_of_LocalcloudsDesign_SoLC_SecurityStrategy();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_BusinessStrategy <em>So LC Business Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>So LC Business Strategy</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_BusinessStrategy()
	 * @see #getSystem_of_LocalcloudsDesign()
	 * @generated
	 */
	EAttribute getSystem_of_LocalcloudsDesign_SoLC_BusinessStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_LifecycleStrategy <em>So LC Lifecycle Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So LC Lifecycle Strategy</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_LifecycleStrategy()
	 * @see #getSystem_of_LocalcloudsDesign()
	 * @generated
	 */
	EAttribute getSystem_of_LocalcloudsDesign_SoLC_LifecycleStrategy();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.System_of_LocalcloudsDesign#getLocalclouddesign <em>Localclouddesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Localclouddesign</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsDesign#getLocalclouddesign()
	 * @see #getSystem_of_LocalcloudsDesign()
	 * @generated
	 */
	EReference getSystem_of_LocalcloudsDesign_Localclouddesign();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.ArrowheadDSLRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirement
	 * @generated
	 */
	EClass getArrowheadDSLRequirement();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.ArrowheadDSLRequirement#getArrowheadusecase <em>Arrowheadusecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arrowheadusecase</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirement#getArrowheadusecase()
	 * @see #getArrowheadDSLRequirement()
	 * @generated
	 */
	EReference getArrowheadDSLRequirement_Arrowheadusecase();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.ArrowheadUseCase <em>Arrowhead Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrowhead Use Case</em>'.
	 * @see ArrowheadDSL.ArrowheadUseCase
	 * @generated
	 */
	EClass getArrowheadUseCase();

	/**
	 * Returns the meta object for the reference '{@link ArrowheadDSL.ArrowheadUseCase#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see ArrowheadDSL.ArrowheadUseCase#getBase_UseCase()
	 * @see #getArrowheadUseCase()
	 * @generated
	 */
	EReference getArrowheadUseCase_Base_UseCase();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.ArrowheadUseCase#getArrowheaddslrequirement <em>Arrowheaddslrequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arrowheaddslrequirement</em>'.
	 * @see ArrowheadDSL.ArrowheadUseCase#getArrowheaddslrequirement()
	 * @see #getArrowheadUseCase()
	 * @generated
	 */
	EReference getArrowheadUseCase_Arrowheaddslrequirement();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.DeviceDesign <em>Device Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Design</em>'.
	 * @see ArrowheadDSL.DeviceDesign
	 * @generated
	 */
	EClass getDeviceDesign();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.DeviceDesign#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Device Name</em>'.
	 * @see ArrowheadDSL.DeviceDesign#getDeviceName()
	 * @see #getDeviceDesign()
	 * @generated
	 */
	EAttribute getDeviceDesign_DeviceName();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.DeviceDesign#getIntercloudnetworkdesign <em>Intercloudnetworkdesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intercloudnetworkdesign</em>'.
	 * @see ArrowheadDSL.DeviceDesign#getIntercloudnetworkdesign()
	 * @see #getDeviceDesign()
	 * @generated
	 */
	EReference getDeviceDesign_Intercloudnetworkdesign();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.DeviceDesign#getIntracloudnetworkdesign <em>Intracloudnetworkdesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intracloudnetworkdesign</em>'.
	 * @see ArrowheadDSL.DeviceDesign#getIntracloudnetworkdesign()
	 * @see #getDeviceDesign()
	 * @generated
	 */
	EReference getDeviceDesign_Intracloudnetworkdesign();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.IntercloudNetworkDesign <em>Intercloud Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intercloud Network Design</em>'.
	 * @see ArrowheadDSL.IntercloudNetworkDesign
	 * @generated
	 */
	EClass getIntercloudNetworkDesign();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.IntercloudNetworkDesign#getInterNetworkDomainName <em>Inter Network Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inter Network Domain Name</em>'.
	 * @see ArrowheadDSL.IntercloudNetworkDesign#getInterNetworkDomainName()
	 * @see #getIntercloudNetworkDesign()
	 * @generated
	 */
	EAttribute getIntercloudNetworkDesign_InterNetworkDomainName();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.IntercloudNetworkDesign#getInterNetworkMacLayer <em>Inter Network Mac Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inter Network Mac Layer</em>'.
	 * @see ArrowheadDSL.IntercloudNetworkDesign#getInterNetworkMacLayer()
	 * @see #getIntercloudNetworkDesign()
	 * @generated
	 */
	EAttribute getIntercloudNetworkDesign_InterNetworkMacLayer();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.IntercloudNetworkDesign#getDevicedesign <em>Devicedesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devicedesign</em>'.
	 * @see ArrowheadDSL.IntercloudNetworkDesign#getDevicedesign()
	 * @see #getIntercloudNetworkDesign()
	 * @generated
	 */
	EReference getIntercloudNetworkDesign_Devicedesign();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.IntracloudNetworkDesign <em>Intracloud Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intracloud Network Design</em>'.
	 * @see ArrowheadDSL.IntracloudNetworkDesign
	 * @generated
	 */
	EClass getIntracloudNetworkDesign();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IntracloudNetworkDesign#getIntraNetworkDomain <em>Intra Network Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intra Network Domain</em>'.
	 * @see ArrowheadDSL.IntracloudNetworkDesign#getIntraNetworkDomain()
	 * @see #getIntracloudNetworkDesign()
	 * @generated
	 */
	EAttribute getIntracloudNetworkDesign_IntraNetworkDomain();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.IntracloudNetworkDesign#getIntraNetworkMacLayer <em>Intra Network Mac Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Intra Network Mac Layer</em>'.
	 * @see ArrowheadDSL.IntracloudNetworkDesign#getIntraNetworkMacLayer()
	 * @see #getIntracloudNetworkDesign()
	 * @generated
	 */
	EAttribute getIntracloudNetworkDesign_IntraNetworkMacLayer();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.IntracloudNetworkDesign#getDevicedesign <em>Devicedesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devicedesign</em>'.
	 * @see ArrowheadDSL.IntracloudNetworkDesign#getDevicedesign()
	 * @see #getIntracloudNetworkDesign()
	 * @generated
	 */
	EReference getIntracloudNetworkDesign_Devicedesign();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.DeviceDesignDescription <em>Device Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Design Description</em>'.
	 * @see ArrowheadDSL.DeviceDesignDescription
	 * @generated
	 */
	EClass getDeviceDesignDescription();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.DeviceDesignDescription#getIOports <em>IOports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>IOports</em>'.
	 * @see ArrowheadDSL.DeviceDesignDescription#getIOports()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_IOports();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.DeviceDesignDescription#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Memory</em>'.
	 * @see ArrowheadDSL.DeviceDesignDescription#getMemory()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_Memory();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.DeviceDesignDescription#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Processor</em>'.
	 * @see ArrowheadDSL.DeviceDesignDescription#getProcessor()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_Processor();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.DeviceDesignDescription#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating System</em>'.
	 * @see ArrowheadDSL.DeviceDesignDescription#getOperatingSystem()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_OperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.DeviceDesignDescription#getArrowheadCertificate <em>Arrowhead Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrowhead Certificate</em>'.
	 * @see ArrowheadDSL.DeviceDesignDescription#getArrowheadCertificate()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_ArrowheadCertificate();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.DeviceDesignDescription#getIntercloudnetworkdesigndescription <em>Intercloudnetworkdesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intercloudnetworkdesigndescription</em>'.
	 * @see ArrowheadDSL.DeviceDesignDescription#getIntercloudnetworkdesigndescription()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EReference getDeviceDesignDescription_Intercloudnetworkdesigndescription();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.DeviceDesignDescription#getIntracloudnetworkdesigndescription <em>Intracloudnetworkdesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intracloudnetworkdesigndescription</em>'.
	 * @see ArrowheadDSL.DeviceDesignDescription#getIntracloudnetworkdesigndescription()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EReference getDeviceDesignDescription_Intracloudnetworkdesigndescription();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.IntercloudNetworkDesignDescription <em>Intercloud Network Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intercloud Network Design Description</em>'.
	 * @see ArrowheadDSL.IntercloudNetworkDesignDescription
	 * @generated
	 */
	EClass getIntercloudNetworkDesignDescription();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.IntercloudNetworkDesignDescription#getInterNetworkRouter <em>Inter Network Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inter Network Router</em>'.
	 * @see ArrowheadDSL.IntercloudNetworkDesignDescription#getInterNetworkRouter()
	 * @see #getIntercloudNetworkDesignDescription()
	 * @generated
	 */
	EAttribute getIntercloudNetworkDesignDescription_InterNetworkRouter();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.IntercloudNetworkDesignDescription#getInterNetworkRouterConfig <em>Inter Network Router Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inter Network Router Config</em>'.
	 * @see ArrowheadDSL.IntercloudNetworkDesignDescription#getInterNetworkRouterConfig()
	 * @see #getIntercloudNetworkDesignDescription()
	 * @generated
	 */
	EAttribute getIntercloudNetworkDesignDescription_InterNetworkRouterConfig();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.IntercloudNetworkDesignDescription#getDevicedesigndescription <em>Devicedesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devicedesigndescription</em>'.
	 * @see ArrowheadDSL.IntercloudNetworkDesignDescription#getDevicedesigndescription()
	 * @see #getIntercloudNetworkDesignDescription()
	 * @generated
	 */
	EReference getIntercloudNetworkDesignDescription_Devicedesigndescription();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.IntracloudNetworkDesignDescription <em>Intracloud Network Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intracloud Network Design Description</em>'.
	 * @see ArrowheadDSL.IntracloudNetworkDesignDescription
	 * @generated
	 */
	EClass getIntracloudNetworkDesignDescription();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.IntracloudNetworkDesignDescription#getIntraNetworkRouter <em>Intra Network Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Intra Network Router</em>'.
	 * @see ArrowheadDSL.IntracloudNetworkDesignDescription#getIntraNetworkRouter()
	 * @see #getIntracloudNetworkDesignDescription()
	 * @generated
	 */
	EAttribute getIntracloudNetworkDesignDescription_IntraNetworkRouter();

	/**
	 * Returns the meta object for the attribute list '{@link ArrowheadDSL.IntracloudNetworkDesignDescription#getIntraNetworkRouterConfig <em>Intra Network Router Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Intra Network Router Config</em>'.
	 * @see ArrowheadDSL.IntracloudNetworkDesignDescription#getIntraNetworkRouterConfig()
	 * @see #getIntracloudNetworkDesignDescription()
	 * @generated
	 */
	EAttribute getIntracloudNetworkDesignDescription_IntraNetworkRouterConfig();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.IntracloudNetworkDesignDescription#getDevicedesigndescription <em>Devicedesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devicedesigndescription</em>'.
	 * @see ArrowheadDSL.IntracloudNetworkDesignDescription#getDevicedesigndescription()
	 * @see #getIntracloudNetworkDesignDescription()
	 * @generated
	 */
	EReference getIntracloudNetworkDesignDescription_Devicedesigndescription();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.LocalcloudDesignDescription <em>Localcloud Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localcloud Design Description</em>'.
	 * @see ArrowheadDSL.LocalcloudDesignDescription
	 * @generated
	 */
	EClass getLocalcloudDesignDescription();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.LocalcloudDesignDescription#getLC_workflow <em>LC workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LC workflow</em>'.
	 * @see ArrowheadDSL.LocalcloudDesignDescription#getLC_workflow()
	 * @see #getLocalcloudDesignDescription()
	 * @generated
	 */
	EAttribute getLocalcloudDesignDescription_LC_workflow();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.LocalcloudDesignDescription#getLC_orchestration <em>LC orchestration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LC orchestration</em>'.
	 * @see ArrowheadDSL.LocalcloudDesignDescription#getLC_orchestration()
	 * @see #getLocalcloudDesignDescription()
	 * @generated
	 */
	EAttribute getLocalcloudDesignDescription_LC_orchestration();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.LocalcloudDesignDescription#getSystemoflocaclouddesigndescription <em>Systemoflocaclouddesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Systemoflocaclouddesigndescription</em>'.
	 * @see ArrowheadDSL.LocalcloudDesignDescription#getSystemoflocaclouddesigndescription()
	 * @see #getLocalcloudDesignDescription()
	 * @generated
	 */
	EReference getLocalcloudDesignDescription_Systemoflocaclouddesigndescription();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.LocalcloudDesignDescription#getSysdd <em>Sysdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sysdd</em>'.
	 * @see ArrowheadDSL.LocalcloudDesignDescription#getSysdd()
	 * @see #getLocalcloudDesignDescription()
	 * @generated
	 */
	EReference getLocalcloudDesignDescription_Sysdd();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.System_of_LocacloudsDesignDescription <em>System of Locaclouds Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System of Locaclouds Design Description</em>'.
	 * @see ArrowheadDSL.System_of_LocacloudsDesignDescription
	 * @generated
	 */
	EClass getSystem_of_LocacloudsDesignDescription();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.System_of_LocacloudsDesignDescription#getSoLC_Orchestration <em>So LC Orchestration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So LC Orchestration</em>'.
	 * @see ArrowheadDSL.System_of_LocacloudsDesignDescription#getSoLC_Orchestration()
	 * @see #getSystem_of_LocacloudsDesignDescription()
	 * @generated
	 */
	EAttribute getSystem_of_LocacloudsDesignDescription_SoLC_Orchestration();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.System_of_LocacloudsDesignDescription#getSoLC_Workflow <em>So LC Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So LC Workflow</em>'.
	 * @see ArrowheadDSL.System_of_LocacloudsDesignDescription#getSoLC_Workflow()
	 * @see #getSystem_of_LocacloudsDesignDescription()
	 * @generated
	 */
	EAttribute getSystem_of_LocacloudsDesignDescription_SoLC_Workflow();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.System_of_LocacloudsDesignDescription#getLocalclouddesigndescription <em>Localclouddesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Localclouddesigndescription</em>'.
	 * @see ArrowheadDSL.System_of_LocacloudsDesignDescription#getLocalclouddesigndescription()
	 * @see #getSystem_of_LocacloudsDesignDescription()
	 * @generated
	 */
	EReference getSystem_of_LocacloudsDesignDescription_Localclouddesigndescription();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.SysDD <em>Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys DD</em>'.
	 * @see ArrowheadDSL.SysDD
	 * @generated
	 */
	EClass getSysDD();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.SysDD#getTimeformat <em>Timeformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeformat</em>'.
	 * @see ArrowheadDSL.SysDD#getTimeformat()
	 * @see #getSysDD()
	 * @generated
	 */
	EAttribute getSysDD_Timeformat();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.SysDD#getArrowheadCertificate <em>Arrowhead Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrowhead Certificate</em>'.
	 * @see ArrowheadDSL.SysDD#getArrowheadCertificate()
	 * @see #getSysDD()
	 * @generated
	 */
	EAttribute getSysDD_ArrowheadCertificate();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.SysDD#getIdd <em>Idd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Idd</em>'.
	 * @see ArrowheadDSL.SysDD#getIdd()
	 * @see #getSysDD()
	 * @generated
	 */
	EReference getSysDD_Idd();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.SysDD#getLocalclouddesigndescription <em>Localclouddesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Localclouddesigndescription</em>'.
	 * @see ArrowheadDSL.SysDD#getLocalclouddesigndescription()
	 * @see #getSysDD()
	 * @generated
	 */
	EReference getSysDD_Localclouddesigndescription();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.IDD <em>IDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDD</em>'.
	 * @see ArrowheadDSL.IDD
	 * @generated
	 */
	EClass getIDD();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see ArrowheadDSL.IDD#getPort()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Port();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see ArrowheadDSL.IDD#getProtocol()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see ArrowheadDSL.IDD#getEncoding()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see ArrowheadDSL.IDD#getSecurity()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Security();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getCompression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compression</em>'.
	 * @see ArrowheadDSL.IDD#getCompression()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Compression();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getCertificate_level <em>Certificate level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate level</em>'.
	 * @see ArrowheadDSL.IDD#getCertificate_level()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Certificate_level();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see ArrowheadDSL.IDD#getToken()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Token();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getCrypto_algorithm <em>Crypto algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crypto algorithm</em>'.
	 * @see ArrowheadDSL.IDD#getCrypto_algorithm()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Crypto_algorithm();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.IDD#getDatamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datamodel</em>'.
	 * @see ArrowheadDSL.IDD#getDatamodel()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Datamodel();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.IDD#getSysdd <em>Sysdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sysdd</em>'.
	 * @see ArrowheadDSL.IDD#getSysdd()
	 * @see #getIDD()
	 * @generated
	 */
	EReference getIDD_Sysdd();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.System_of_LocalcloudsImplementation <em>System of Localclouds Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System of Localclouds Implementation</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsImplementation
	 * @generated
	 */
	EClass getSystem_of_LocalcloudsImplementation();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.System_of_LocalcloudsImplementation#getSoLC_Documentation <em>So LC Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So LC Documentation</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsImplementation#getSoLC_Documentation()
	 * @see #getSystem_of_LocalcloudsImplementation()
	 * @generated
	 */
	EAttribute getSystem_of_LocalcloudsImplementation_SoLC_Documentation();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.System_of_LocalcloudsImplementation#getLocalcloudimplementation <em>Localcloudimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Localcloudimplementation</em>'.
	 * @see ArrowheadDSL.System_of_LocalcloudsImplementation#getLocalcloudimplementation()
	 * @see #getSystem_of_LocalcloudsImplementation()
	 * @generated
	 */
	EReference getSystem_of_LocalcloudsImplementation_Localcloudimplementation();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.LocalcloudImplementation <em>Localcloud Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localcloud Implementation</em>'.
	 * @see ArrowheadDSL.LocalcloudImplementation
	 * @generated
	 */
	EClass getLocalcloudImplementation();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.LocalcloudImplementation#getLC_Documentation <em>LC Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LC Documentation</em>'.
	 * @see ArrowheadDSL.LocalcloudImplementation#getLC_Documentation()
	 * @see #getLocalcloudImplementation()
	 * @generated
	 */
	EAttribute getLocalcloudImplementation_LC_Documentation();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.LocalcloudImplementation#getSystemimplementation <em>Systemimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Systemimplementation</em>'.
	 * @see ArrowheadDSL.LocalcloudImplementation#getSystemimplementation()
	 * @see #getLocalcloudImplementation()
	 * @generated
	 */
	EReference getLocalcloudImplementation_Systemimplementation();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.LocalcloudImplementation#getSystem_of_localcloudsimplementation <em>System of localcloudsimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System of localcloudsimplementation</em>'.
	 * @see ArrowheadDSL.LocalcloudImplementation#getSystem_of_localcloudsimplementation()
	 * @see #getLocalcloudImplementation()
	 * @generated
	 */
	EReference getLocalcloudImplementation_System_of_localcloudsimplementation();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.System_Implementation <em>System Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Implementation</em>'.
	 * @see ArrowheadDSL.System_Implementation
	 * @generated
	 */
	EClass getSystem_Implementation();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.System_Implementation#getIdd_implementation <em>Idd implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Idd implementation</em>'.
	 * @see ArrowheadDSL.System_Implementation#getIdd_implementation()
	 * @see #getSystem_Implementation()
	 * @generated
	 */
	EReference getSystem_Implementation_Idd_implementation();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.System_Implementation#getLoclacloudimplementation <em>Loclacloudimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loclacloudimplementation</em>'.
	 * @see ArrowheadDSL.System_Implementation#getLoclacloudimplementation()
	 * @see #getSystem_Implementation()
	 * @generated
	 */
	EReference getSystem_Implementation_Loclacloudimplementation();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.IDD_Implementation <em>IDD Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDD Implementation</em>'.
	 * @see ArrowheadDSL.IDD_Implementation
	 * @generated
	 */
	EClass getIDD_Implementation();

	/**
	 * Returns the meta object for the reference list '{@link ArrowheadDSL.IDD_Implementation#getSystemimplementation <em>Systemimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Systemimplementation</em>'.
	 * @see ArrowheadDSL.IDD_Implementation#getSystemimplementation()
	 * @see #getIDD_Implementation()
	 * @generated
	 */
	EReference getIDD_Implementation_Systemimplementation();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.ArrowheadDSLOperationHTTP <em>Operation HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation HTTP</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLOperationHTTP
	 * @generated
	 */
	EClass getArrowheadDSLOperationHTTP();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.ArrowheadDSLOperationHTTP#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLOperationHTTP#getMethod()
	 * @see #getArrowheadDSLOperationHTTP()
	 * @generated
	 */
	EAttribute getArrowheadDSLOperationHTTP_Method();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.ArrowheadDSLOperationHTTP#getSubURL <em>Sub URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub URL</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLOperationHTTP#getSubURL()
	 * @see #getArrowheadDSLOperationHTTP()
	 * @generated
	 */
	EAttribute getArrowheadDSLOperationHTTP_SubURL();

	/**
	 * Returns the meta object for the reference '{@link ArrowheadDSL.ArrowheadDSLOperationHTTP#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLOperationHTTP#getBase_Operation()
	 * @see #getArrowheadDSLOperationHTTP()
	 * @generated
	 */
	EReference getArrowheadDSLOperationHTTP_Base_Operation();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT <em>Requirement MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement MQTT</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementMQTT
	 * @generated
	 */
	EClass getArrowheadDSLRequirementMQTT();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementMQTT#getMethod()
	 * @see #getArrowheadDSLRequirementMQTT()
	 * @generated
	 */
	EAttribute getArrowheadDSLRequirementMQTT_Method();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementMQTT#getTopic()
	 * @see #getArrowheadDSLRequirementMQTT()
	 * @generated
	 */
	EAttribute getArrowheadDSLRequirementMQTT_Topic();

	/**
	 * Returns the meta object for the reference '{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementMQTT#getBase_Operation()
	 * @see #getArrowheadDSLRequirementMQTT()
	 * @generated
	 */
	EReference getArrowheadDSLRequirementMQTT_Base_Operation();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.ArrowheadDSLRequirementCOAP <em>Requirement COAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement COAP</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementCOAP
	 * @generated
	 */
	EClass getArrowheadDSLRequirementCOAP();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.ArrowheadDSLRequirementCOAP#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementCOAP#getMethod()
	 * @see #getArrowheadDSLRequirementCOAP()
	 * @generated
	 */
	EAttribute getArrowheadDSLRequirementCOAP_Method();

	/**
	 * Returns the meta object for the reference '{@link ArrowheadDSL.ArrowheadDSLRequirementCOAP#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementCOAP#getBase_Operation()
	 * @see #getArrowheadDSLRequirementCOAP()
	 * @generated
	 */
	EReference getArrowheadDSLRequirementCOAP_Base_Operation();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.ArrowheadDSLRequirementCOAP#getSubURL <em>Sub URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub URL</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementCOAP#getSubURL()
	 * @see #getArrowheadDSLRequirementCOAP()
	 * @generated
	 */
	EAttribute getArrowheadDSLRequirementCOAP_SubURL();

	/**
	 * Returns the meta object for class '{@link ArrowheadDSL.ArrowheadDSLRequirementWebsocket <em>Requirement Websocket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Websocket</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementWebsocket
	 * @generated
	 */
	EClass getArrowheadDSLRequirementWebsocket();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.ArrowheadDSLRequirementWebsocket#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementWebsocket#getMethod()
	 * @see #getArrowheadDSLRequirementWebsocket()
	 * @generated
	 */
	EAttribute getArrowheadDSLRequirementWebsocket_Method();

	/**
	 * Returns the meta object for the attribute '{@link ArrowheadDSL.ArrowheadDSLRequirementWebsocket#getSubURL <em>Sub URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub URL</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementWebsocket#getSubURL()
	 * @see #getArrowheadDSLRequirementWebsocket()
	 * @generated
	 */
	EAttribute getArrowheadDSLRequirementWebsocket_SubURL();

	/**
	 * Returns the meta object for the reference '{@link ArrowheadDSL.ArrowheadDSLRequirementWebsocket#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see ArrowheadDSL.ArrowheadDSLRequirementWebsocket#getBase_Operation()
	 * @see #getArrowheadDSLRequirementWebsocket()
	 * @generated
	 */
	EReference getArrowheadDSLRequirementWebsocket_Base_Operation();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.SystemDatabaseKind <em>System Database Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Database Kind</em>'.
	 * @see ArrowheadDSL.SystemDatabaseKind
	 * @generated
	 */
	EEnum getSystemDatabaseKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.BusinessPolicyKind <em>Business Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Business Policy Kind</em>'.
	 * @see ArrowheadDSL.BusinessPolicyKind
	 * @generated
	 */
	EEnum getBusinessPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.SecurityPolicyKind <em>Security Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Policy Kind</em>'.
	 * @see ArrowheadDSL.SecurityPolicyKind
	 * @generated
	 */
	EEnum getSecurityPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.LifecyclePolicyKind <em>Lifecycle Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle Policy Kind</em>'.
	 * @see ArrowheadDSL.LifecyclePolicyKind
	 * @generated
	 */
	EEnum getLifecyclePolicyKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.MacLayerKind <em>Mac Layer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mac Layer Kind</em>'.
	 * @see ArrowheadDSL.MacLayerKind
	 * @generated
	 */
	EEnum getMacLayerKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.OSKind <em>OS Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Kind</em>'.
	 * @see ArrowheadDSL.OSKind
	 * @generated
	 */
	EEnum getOSKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.ArrowheadCertificateKind <em>Arrowhead Certificate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arrowhead Certificate Kind</em>'.
	 * @see ArrowheadDSL.ArrowheadCertificateKind
	 * @generated
	 */
	EEnum getArrowheadCertificateKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.TimeFormatKind <em>Time Format Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Format Kind</em>'.
	 * @see ArrowheadDSL.TimeFormatKind
	 * @generated
	 */
	EEnum getTimeFormatKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.ApplicationProtocolKind <em>Application Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Protocol Kind</em>'.
	 * @see ArrowheadDSL.ApplicationProtocolKind
	 * @generated
	 */
	EEnum getApplicationProtocolKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.EncodingKind <em>Encoding Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding Kind</em>'.
	 * @see ArrowheadDSL.EncodingKind
	 * @generated
	 */
	EEnum getEncodingKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.ArrowheadSecurityKind <em>Arrowhead Security Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arrowhead Security Kind</em>'.
	 * @see ArrowheadDSL.ArrowheadSecurityKind
	 * @generated
	 */
	EEnum getArrowheadSecurityKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.ComprressionKind <em>Comprression Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comprression Kind</em>'.
	 * @see ArrowheadDSL.ComprressionKind
	 * @generated
	 */
	EEnum getComprressionKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.TokenKind <em>Token Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Token Kind</em>'.
	 * @see ArrowheadDSL.TokenKind
	 * @generated
	 */
	EEnum getTokenKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.CryptoAlgorithmKind <em>Crypto Algorithm Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Crypto Algorithm Kind</em>'.
	 * @see ArrowheadDSL.CryptoAlgorithmKind
	 * @generated
	 */
	EEnum getCryptoAlgorithmKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.DatamodelStandardKind <em>Datamodel Standard Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datamodel Standard Kind</em>'.
	 * @see ArrowheadDSL.DatamodelStandardKind
	 * @generated
	 */
	EEnum getDatamodelStandardKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.CertificateKind <em>Certificate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certificate Kind</em>'.
	 * @see ArrowheadDSL.CertificateKind
	 * @generated
	 */
	EEnum getCertificateKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.CoAPMethodKind <em>Co AP Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Co AP Method Kind</em>'.
	 * @see ArrowheadDSL.CoAPMethodKind
	 * @generated
	 */
	EEnum getCoAPMethodKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.HTTP11MethodKind <em>HTTP11 Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP11 Method Kind</em>'.
	 * @see ArrowheadDSL.HTTP11MethodKind
	 * @generated
	 */
	EEnum getHTTP11MethodKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.HTTP2FrameKind <em>HTTP2 Frame Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP2 Frame Kind</em>'.
	 * @see ArrowheadDSL.HTTP2FrameKind
	 * @generated
	 */
	EEnum getHTTP2FrameKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.MACProtocolKind <em>MAC Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MAC Protocol Kind</em>'.
	 * @see ArrowheadDSL.MACProtocolKind
	 * @generated
	 */
	EEnum getMACProtocolKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.MonitoringPolicyKind <em>Monitoring Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitoring Policy Kind</em>'.
	 * @see ArrowheadDSL.MonitoringPolicyKind
	 * @generated
	 */
	EEnum getMonitoringPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.MQTT311MessageTypeKind <em>MQTT311 Message Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MQTT311 Message Type Kind</em>'.
	 * @see ArrowheadDSL.MQTT311MessageTypeKind
	 * @generated
	 */
	EEnum getMQTT311MessageTypeKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.MQTT50MessageTypeKind <em>MQTT50 Message Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MQTT50 Message Type Kind</em>'.
	 * @see ArrowheadDSL.MQTT50MessageTypeKind
	 * @generated
	 */
	EEnum getMQTT50MessageTypeKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.PayloadEncryptionKind <em>Payload Encryption Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payload Encryption Kind</em>'.
	 * @see ArrowheadDSL.PayloadEncryptionKind
	 * @generated
	 */
	EEnum getPayloadEncryptionKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.PhysicalLayerKind <em>Physical Layer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Physical Layer Kind</em>'.
	 * @see ArrowheadDSL.PhysicalLayerKind
	 * @generated
	 */
	EEnum getPhysicalLayerKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.TransportLayerKind <em>Transport Layer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Layer Kind</em>'.
	 * @see ArrowheadDSL.TransportLayerKind
	 * @generated
	 */
	EEnum getTransportLayerKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.WebsocketDataFramingTypeKind <em>Websocket Data Framing Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Websocket Data Framing Type Kind</em>'.
	 * @see ArrowheadDSL.WebsocketDataFramingTypeKind
	 * @generated
	 */
	EEnum getWebsocketDataFramingTypeKind();

	/**
	 * Returns the meta object for enum '{@link ArrowheadDSL.WorkflowKind <em>Workflow Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Workflow Kind</em>'.
	 * @see ArrowheadDSL.WorkflowKind
	 * @generated
	 */
	EEnum getWorkflowKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArrowheadDSLFactory getArrowheadDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.SysDImpl <em>Sys D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.SysDImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSysD()
		 * @generated
		 */
		EClass SYS_D = eINSTANCE.getSysD();

		/**
		 * The meta object literal for the '<em><b>Microsystem Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_D__MICROSYSTEM_NAME = eINSTANCE.getSysD_MicrosystemName();

		/**
		 * The meta object literal for the '<em><b>Functional Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_D__FUNCTIONAL_PROPERTIES = eINSTANCE.getSysD_FunctionalProperties();

		/**
		 * The meta object literal for the '<em><b>System Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_D__SYSTEM_DATABASE = eINSTANCE.getSysD_SystemDatabase();

		/**
		 * The meta object literal for the '<em><b>Microsystem Behaviour</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_D__MICROSYSTEM_BEHAVIOUR = eINSTANCE.getSysD_MicrosystemBehaviour();

		/**
		 * The meta object literal for the '<em><b>Sd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_D__SD = eINSTANCE.getSysD_Sd();

		/**
		 * The meta object literal for the '<em><b>Localclouddesign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_D__LOCALCLOUDDESIGN = eINSTANCE.getSysD_Localclouddesign();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.SDImpl <em>SD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.SDImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSD()
		 * @generated
		 */
		EClass SD = eINSTANCE.getSD();

		/**
		 * The meta object literal for the '<em><b>Microservice Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD__MICROSERVICE_NAME = eINSTANCE.getSD_MicroserviceName();

		/**
		 * The meta object literal for the '<em><b>Sysd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD__SYSD = eINSTANCE.getSD_Sysd();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SD___OPERATION = eINSTANCE.getSD__Operation();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.LocalCloudDesignImpl <em>Local Cloud Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.LocalCloudDesignImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getLocalCloudDesign()
		 * @generated
		 */
		EClass LOCAL_CLOUD_DESIGN = eINSTANCE.getLocalCloudDesign();

		/**
		 * The meta object literal for the '<em><b>LC Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_CLOUD_DESIGN__LC_NAME = eINSTANCE.getLocalCloudDesign_LC_Name();

		/**
		 * The meta object literal for the '<em><b>Functional Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES = eINSTANCE.getLocalCloudDesign_FunctionalProperties();

		/**
		 * The meta object literal for the '<em><b>LC Security Strategy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY = eINSTANCE.getLocalCloudDesign_LC_SecurityStrategy();

		/**
		 * The meta object literal for the '<em><b>LC Business Strategy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY = eINSTANCE.getLocalCloudDesign_LC_BusinessStrategy();

		/**
		 * The meta object literal for the '<em><b>LC Lifecycle Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY = eINSTANCE.getLocalCloudDesign_LC_LifecycleStrategy();

		/**
		 * The meta object literal for the '<em><b>System of localcloudsdesign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN = eINSTANCE.getLocalCloudDesign_System_of_localcloudsdesign();

		/**
		 * The meta object literal for the '<em><b>Sysd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_DESIGN__SYSD = eINSTANCE.getLocalCloudDesign_Sysd();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl <em>System of Localclouds Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystem_of_LocalcloudsDesign()
		 * @generated
		 */
		EClass SYSTEM_OF_LOCALCLOUDS_DESIGN = eINSTANCE.getSystem_of_LocalcloudsDesign();

		/**
		 * The meta object literal for the '<em><b>So LC Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME = eINSTANCE.getSystem_of_LocalcloudsDesign_SoLCName();

		/**
		 * The meta object literal for the '<em><b>So LC Security Strategy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY = eINSTANCE.getSystem_of_LocalcloudsDesign_SoLC_SecurityStrategy();

		/**
		 * The meta object literal for the '<em><b>So LC Business Strategy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY = eINSTANCE.getSystem_of_LocalcloudsDesign_SoLC_BusinessStrategy();

		/**
		 * The meta object literal for the '<em><b>So LC Lifecycle Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY = eINSTANCE.getSystem_of_LocalcloudsDesign_SoLC_LifecycleStrategy();

		/**
		 * The meta object literal for the '<em><b>Localclouddesign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN = eINSTANCE.getSystem_of_LocalcloudsDesign_Localclouddesign();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.ArrowheadDSLRequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.ArrowheadDSLRequirementImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLRequirement()
		 * @generated
		 */
		EClass ARROWHEAD_DSL_REQUIREMENT = eINSTANCE.getArrowheadDSLRequirement();

		/**
		 * The meta object literal for the '<em><b>Arrowheadusecase</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE = eINSTANCE.getArrowheadDSLRequirement_Arrowheadusecase();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.ArrowheadUseCaseImpl <em>Arrowhead Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.ArrowheadUseCaseImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadUseCase()
		 * @generated
		 */
		EClass ARROWHEAD_USE_CASE = eINSTANCE.getArrowheadUseCase();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROWHEAD_USE_CASE__BASE_USE_CASE = eINSTANCE.getArrowheadUseCase_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Arrowheaddslrequirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT = eINSTANCE.getArrowheadUseCase_Arrowheaddslrequirement();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.DeviceDesignImpl <em>Device Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.DeviceDesignImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getDeviceDesign()
		 * @generated
		 */
		EClass DEVICE_DESIGN = eINSTANCE.getDeviceDesign();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN__DEVICE_NAME = eINSTANCE.getDeviceDesign_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Intercloudnetworkdesign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN = eINSTANCE.getDeviceDesign_Intercloudnetworkdesign();

		/**
		 * The meta object literal for the '<em><b>Intracloudnetworkdesign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN = eINSTANCE.getDeviceDesign_Intracloudnetworkdesign();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.IntercloudNetworkDesignImpl <em>Intercloud Network Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.IntercloudNetworkDesignImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIntercloudNetworkDesign()
		 * @generated
		 */
		EClass INTERCLOUD_NETWORK_DESIGN = eINSTANCE.getIntercloudNetworkDesign();

		/**
		 * The meta object literal for the '<em><b>Inter Network Domain Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME = eINSTANCE.getIntercloudNetworkDesign_InterNetworkDomainName();

		/**
		 * The meta object literal for the '<em><b>Inter Network Mac Layer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER = eINSTANCE.getIntercloudNetworkDesign_InterNetworkMacLayer();

		/**
		 * The meta object literal for the '<em><b>Devicedesign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN = eINSTANCE.getIntercloudNetworkDesign_Devicedesign();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.IntracloudNetworkDesignImpl <em>Intracloud Network Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.IntracloudNetworkDesignImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIntracloudNetworkDesign()
		 * @generated
		 */
		EClass INTRACLOUD_NETWORK_DESIGN = eINSTANCE.getIntracloudNetworkDesign();

		/**
		 * The meta object literal for the '<em><b>Intra Network Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN = eINSTANCE.getIntracloudNetworkDesign_IntraNetworkDomain();

		/**
		 * The meta object literal for the '<em><b>Intra Network Mac Layer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER = eINSTANCE.getIntracloudNetworkDesign_IntraNetworkMacLayer();

		/**
		 * The meta object literal for the '<em><b>Devicedesign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN = eINSTANCE.getIntracloudNetworkDesign_Devicedesign();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl <em>Device Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.DeviceDesignDescriptionImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getDeviceDesignDescription()
		 * @generated
		 */
		EClass DEVICE_DESIGN_DESCRIPTION = eINSTANCE.getDeviceDesignDescription();

		/**
		 * The meta object literal for the '<em><b>IOports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__IOPORTS = eINSTANCE.getDeviceDesignDescription_IOports();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__MEMORY = eINSTANCE.getDeviceDesignDescription_Memory();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__PROCESSOR = eINSTANCE.getDeviceDesignDescription_Processor();

		/**
		 * The meta object literal for the '<em><b>Operating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM = eINSTANCE.getDeviceDesignDescription_OperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Arrowhead Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__ARROWHEAD_CERTIFICATE = eINSTANCE.getDeviceDesignDescription_ArrowheadCertificate();

		/**
		 * The meta object literal for the '<em><b>Intercloudnetworkdesigndescription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION = eINSTANCE.getDeviceDesignDescription_Intercloudnetworkdesigndescription();

		/**
		 * The meta object literal for the '<em><b>Intracloudnetworkdesigndescription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION = eINSTANCE.getDeviceDesignDescription_Intracloudnetworkdesigndescription();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.IntercloudNetworkDesignDescriptionImpl <em>Intercloud Network Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.IntercloudNetworkDesignDescriptionImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIntercloudNetworkDesignDescription()
		 * @generated
		 */
		EClass INTERCLOUD_NETWORK_DESIGN_DESCRIPTION = eINSTANCE.getIntercloudNetworkDesignDescription();

		/**
		 * The meta object literal for the '<em><b>Inter Network Router</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER = eINSTANCE.getIntercloudNetworkDesignDescription_InterNetworkRouter();

		/**
		 * The meta object literal for the '<em><b>Inter Network Router Config</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG = eINSTANCE.getIntercloudNetworkDesignDescription_InterNetworkRouterConfig();

		/**
		 * The meta object literal for the '<em><b>Devicedesigndescription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION = eINSTANCE.getIntercloudNetworkDesignDescription_Devicedesigndescription();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.IntracloudNetworkDesignDescriptionImpl <em>Intracloud Network Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.IntracloudNetworkDesignDescriptionImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIntracloudNetworkDesignDescription()
		 * @generated
		 */
		EClass INTRACLOUD_NETWORK_DESIGN_DESCRIPTION = eINSTANCE.getIntracloudNetworkDesignDescription();

		/**
		 * The meta object literal for the '<em><b>Intra Network Router</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER = eINSTANCE.getIntracloudNetworkDesignDescription_IntraNetworkRouter();

		/**
		 * The meta object literal for the '<em><b>Intra Network Router Config</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG = eINSTANCE.getIntracloudNetworkDesignDescription_IntraNetworkRouterConfig();

		/**
		 * The meta object literal for the '<em><b>Devicedesigndescription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION = eINSTANCE.getIntracloudNetworkDesignDescription_Devicedesigndescription();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.LocalcloudDesignDescriptionImpl <em>Localcloud Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.LocalcloudDesignDescriptionImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getLocalcloudDesignDescription()
		 * @generated
		 */
		EClass LOCALCLOUD_DESIGN_DESCRIPTION = eINSTANCE.getLocalcloudDesignDescription();

		/**
		 * The meta object literal for the '<em><b>LC workflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW = eINSTANCE.getLocalcloudDesignDescription_LC_workflow();

		/**
		 * The meta object literal for the '<em><b>LC orchestration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION = eINSTANCE.getLocalcloudDesignDescription_LC_orchestration();

		/**
		 * The meta object literal for the '<em><b>Systemoflocaclouddesigndescription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION = eINSTANCE.getLocalcloudDesignDescription_Systemoflocaclouddesigndescription();

		/**
		 * The meta object literal for the '<em><b>Sysdd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD = eINSTANCE.getLocalcloudDesignDescription_Sysdd();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.System_of_LocacloudsDesignDescriptionImpl <em>System of Locaclouds Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.System_of_LocacloudsDesignDescriptionImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystem_of_LocacloudsDesignDescription()
		 * @generated
		 */
		EClass SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION = eINSTANCE.getSystem_of_LocacloudsDesignDescription();

		/**
		 * The meta object literal for the '<em><b>So LC Orchestration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION = eINSTANCE.getSystem_of_LocacloudsDesignDescription_SoLC_Orchestration();

		/**
		 * The meta object literal for the '<em><b>So LC Workflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW = eINSTANCE.getSystem_of_LocacloudsDesignDescription_SoLC_Workflow();

		/**
		 * The meta object literal for the '<em><b>Localclouddesigndescription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION = eINSTANCE.getSystem_of_LocacloudsDesignDescription_Localclouddesigndescription();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.SysDDImpl <em>Sys DD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.SysDDImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSysDD()
		 * @generated
		 */
		EClass SYS_DD = eINSTANCE.getSysDD();

		/**
		 * The meta object literal for the '<em><b>Timeformat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_DD__TIMEFORMAT = eINSTANCE.getSysDD_Timeformat();

		/**
		 * The meta object literal for the '<em><b>Arrowhead Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_DD__ARROWHEAD_CERTIFICATE = eINSTANCE.getSysDD_ArrowheadCertificate();

		/**
		 * The meta object literal for the '<em><b>Idd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_DD__IDD = eINSTANCE.getSysDD_Idd();

		/**
		 * The meta object literal for the '<em><b>Localclouddesigndescription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_DD__LOCALCLOUDDESIGNDESCRIPTION = eINSTANCE.getSysDD_Localclouddesigndescription();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.IDDImpl <em>IDD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.IDDImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIDD()
		 * @generated
		 */
		EClass IDD = eINSTANCE.getIDD();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__PORT = eINSTANCE.getIDD_Port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__PROTOCOL = eINSTANCE.getIDD_Protocol();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__ENCODING = eINSTANCE.getIDD_Encoding();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__SECURITY = eINSTANCE.getIDD_Security();

		/**
		 * The meta object literal for the '<em><b>Compression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__COMPRESSION = eINSTANCE.getIDD_Compression();

		/**
		 * The meta object literal for the '<em><b>Certificate level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__CERTIFICATE_LEVEL = eINSTANCE.getIDD_Certificate_level();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__TOKEN = eINSTANCE.getIDD_Token();

		/**
		 * The meta object literal for the '<em><b>Crypto algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__CRYPTO_ALGORITHM = eINSTANCE.getIDD_Crypto_algorithm();

		/**
		 * The meta object literal for the '<em><b>Datamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__DATAMODEL = eINSTANCE.getIDD_Datamodel();

		/**
		 * The meta object literal for the '<em><b>Sysdd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDD__SYSDD = eINSTANCE.getIDD_Sysdd();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.System_of_LocalcloudsImplementationImpl <em>System of Localclouds Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.System_of_LocalcloudsImplementationImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystem_of_LocalcloudsImplementation()
		 * @generated
		 */
		EClass SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION = eINSTANCE.getSystem_of_LocalcloudsImplementation();

		/**
		 * The meta object literal for the '<em><b>So LC Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_DOCUMENTATION = eINSTANCE.getSystem_of_LocalcloudsImplementation_SoLC_Documentation();

		/**
		 * The meta object literal for the '<em><b>Localcloudimplementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION = eINSTANCE.getSystem_of_LocalcloudsImplementation_Localcloudimplementation();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.LocalcloudImplementationImpl <em>Localcloud Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.LocalcloudImplementationImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getLocalcloudImplementation()
		 * @generated
		 */
		EClass LOCALCLOUD_IMPLEMENTATION = eINSTANCE.getLocalcloudImplementation();

		/**
		 * The meta object literal for the '<em><b>LC Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION = eINSTANCE.getLocalcloudImplementation_LC_Documentation();

		/**
		 * The meta object literal for the '<em><b>Systemimplementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION = eINSTANCE.getLocalcloudImplementation_Systemimplementation();

		/**
		 * The meta object literal for the '<em><b>System of localcloudsimplementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION = eINSTANCE.getLocalcloudImplementation_System_of_localcloudsimplementation();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.System_ImplementationImpl <em>System Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.System_ImplementationImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystem_Implementation()
		 * @generated
		 */
		EClass SYSTEM_IMPLEMENTATION = eINSTANCE.getSystem_Implementation();

		/**
		 * The meta object literal for the '<em><b>Idd implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION = eINSTANCE.getSystem_Implementation_Idd_implementation();

		/**
		 * The meta object literal for the '<em><b>Loclacloudimplementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION = eINSTANCE.getSystem_Implementation_Loclacloudimplementation();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.IDD_ImplementationImpl <em>IDD Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.IDD_ImplementationImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getIDD_Implementation()
		 * @generated
		 */
		EClass IDD_IMPLEMENTATION = eINSTANCE.getIDD_Implementation();

		/**
		 * The meta object literal for the '<em><b>Systemimplementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION = eINSTANCE.getIDD_Implementation_Systemimplementation();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.ArrowheadDSLOperationHTTPImpl <em>Operation HTTP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.ArrowheadDSLOperationHTTPImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLOperationHTTP()
		 * @generated
		 */
		EClass ARROWHEAD_DSL_OPERATION_HTTP = eINSTANCE.getArrowheadDSLOperationHTTP();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROWHEAD_DSL_OPERATION_HTTP__METHOD = eINSTANCE.getArrowheadDSLOperationHTTP_Method();

		/**
		 * The meta object literal for the '<em><b>Sub URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROWHEAD_DSL_OPERATION_HTTP__SUB_URL = eINSTANCE.getArrowheadDSLOperationHTTP_SubURL();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROWHEAD_DSL_OPERATION_HTTP__BASE_OPERATION = eINSTANCE.getArrowheadDSLOperationHTTP_Base_Operation();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.ArrowheadDSLRequirementMQTTImpl <em>Requirement MQTT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.ArrowheadDSLRequirementMQTTImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLRequirementMQTT()
		 * @generated
		 */
		EClass ARROWHEAD_DSL_REQUIREMENT_MQTT = eINSTANCE.getArrowheadDSLRequirementMQTT();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROWHEAD_DSL_REQUIREMENT_MQTT__METHOD = eINSTANCE.getArrowheadDSLRequirementMQTT_Method();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROWHEAD_DSL_REQUIREMENT_MQTT__TOPIC = eINSTANCE.getArrowheadDSLRequirementMQTT_Topic();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROWHEAD_DSL_REQUIREMENT_MQTT__BASE_OPERATION = eINSTANCE.getArrowheadDSLRequirementMQTT_Base_Operation();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.ArrowheadDSLRequirementCOAPImpl <em>Requirement COAP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.ArrowheadDSLRequirementCOAPImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLRequirementCOAP()
		 * @generated
		 */
		EClass ARROWHEAD_DSL_REQUIREMENT_COAP = eINSTANCE.getArrowheadDSLRequirementCOAP();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROWHEAD_DSL_REQUIREMENT_COAP__METHOD = eINSTANCE.getArrowheadDSLRequirementCOAP_Method();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROWHEAD_DSL_REQUIREMENT_COAP__BASE_OPERATION = eINSTANCE.getArrowheadDSLRequirementCOAP_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Sub URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROWHEAD_DSL_REQUIREMENT_COAP__SUB_URL = eINSTANCE.getArrowheadDSLRequirementCOAP_SubURL();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.impl.ArrowheadDSLRequirementWebsocketImpl <em>Requirement Websocket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.impl.ArrowheadDSLRequirementWebsocketImpl
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadDSLRequirementWebsocket()
		 * @generated
		 */
		EClass ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET = eINSTANCE.getArrowheadDSLRequirementWebsocket();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET__METHOD = eINSTANCE.getArrowheadDSLRequirementWebsocket_Method();

		/**
		 * The meta object literal for the '<em><b>Sub URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET__SUB_URL = eINSTANCE.getArrowheadDSLRequirementWebsocket_SubURL();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROWHEAD_DSL_REQUIREMENT_WEBSOCKET__BASE_OPERATION = eINSTANCE.getArrowheadDSLRequirementWebsocket_Base_Operation();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.SystemDatabaseKind <em>System Database Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.SystemDatabaseKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSystemDatabaseKind()
		 * @generated
		 */
		EEnum SYSTEM_DATABASE_KIND = eINSTANCE.getSystemDatabaseKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.BusinessPolicyKind <em>Business Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.BusinessPolicyKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getBusinessPolicyKind()
		 * @generated
		 */
		EEnum BUSINESS_POLICY_KIND = eINSTANCE.getBusinessPolicyKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.SecurityPolicyKind <em>Security Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.SecurityPolicyKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getSecurityPolicyKind()
		 * @generated
		 */
		EEnum SECURITY_POLICY_KIND = eINSTANCE.getSecurityPolicyKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.LifecyclePolicyKind <em>Lifecycle Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.LifecyclePolicyKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getLifecyclePolicyKind()
		 * @generated
		 */
		EEnum LIFECYCLE_POLICY_KIND = eINSTANCE.getLifecyclePolicyKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.MacLayerKind <em>Mac Layer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.MacLayerKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMacLayerKind()
		 * @generated
		 */
		EEnum MAC_LAYER_KIND = eINSTANCE.getMacLayerKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.OSKind <em>OS Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.OSKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getOSKind()
		 * @generated
		 */
		EEnum OS_KIND = eINSTANCE.getOSKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.ArrowheadCertificateKind <em>Arrowhead Certificate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.ArrowheadCertificateKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadCertificateKind()
		 * @generated
		 */
		EEnum ARROWHEAD_CERTIFICATE_KIND = eINSTANCE.getArrowheadCertificateKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.TimeFormatKind <em>Time Format Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.TimeFormatKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getTimeFormatKind()
		 * @generated
		 */
		EEnum TIME_FORMAT_KIND = eINSTANCE.getTimeFormatKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.ApplicationProtocolKind <em>Application Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.ApplicationProtocolKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getApplicationProtocolKind()
		 * @generated
		 */
		EEnum APPLICATION_PROTOCOL_KIND = eINSTANCE.getApplicationProtocolKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.EncodingKind <em>Encoding Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.EncodingKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getEncodingKind()
		 * @generated
		 */
		EEnum ENCODING_KIND = eINSTANCE.getEncodingKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.ArrowheadSecurityKind <em>Arrowhead Security Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.ArrowheadSecurityKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getArrowheadSecurityKind()
		 * @generated
		 */
		EEnum ARROWHEAD_SECURITY_KIND = eINSTANCE.getArrowheadSecurityKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.ComprressionKind <em>Comprression Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.ComprressionKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getComprressionKind()
		 * @generated
		 */
		EEnum COMPRRESSION_KIND = eINSTANCE.getComprressionKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.TokenKind <em>Token Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.TokenKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getTokenKind()
		 * @generated
		 */
		EEnum TOKEN_KIND = eINSTANCE.getTokenKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.CryptoAlgorithmKind <em>Crypto Algorithm Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.CryptoAlgorithmKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getCryptoAlgorithmKind()
		 * @generated
		 */
		EEnum CRYPTO_ALGORITHM_KIND = eINSTANCE.getCryptoAlgorithmKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.DatamodelStandardKind <em>Datamodel Standard Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.DatamodelStandardKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getDatamodelStandardKind()
		 * @generated
		 */
		EEnum DATAMODEL_STANDARD_KIND = eINSTANCE.getDatamodelStandardKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.CertificateKind <em>Certificate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.CertificateKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getCertificateKind()
		 * @generated
		 */
		EEnum CERTIFICATE_KIND = eINSTANCE.getCertificateKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.CoAPMethodKind <em>Co AP Method Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.CoAPMethodKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getCoAPMethodKind()
		 * @generated
		 */
		EEnum CO_AP_METHOD_KIND = eINSTANCE.getCoAPMethodKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.HTTP11MethodKind <em>HTTP11 Method Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.HTTP11MethodKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getHTTP11MethodKind()
		 * @generated
		 */
		EEnum HTTP11_METHOD_KIND = eINSTANCE.getHTTP11MethodKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.HTTP2FrameKind <em>HTTP2 Frame Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.HTTP2FrameKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getHTTP2FrameKind()
		 * @generated
		 */
		EEnum HTTP2_FRAME_KIND = eINSTANCE.getHTTP2FrameKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.MACProtocolKind <em>MAC Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.MACProtocolKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMACProtocolKind()
		 * @generated
		 */
		EEnum MAC_PROTOCOL_KIND = eINSTANCE.getMACProtocolKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.MonitoringPolicyKind <em>Monitoring Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.MonitoringPolicyKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMonitoringPolicyKind()
		 * @generated
		 */
		EEnum MONITORING_POLICY_KIND = eINSTANCE.getMonitoringPolicyKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.MQTT311MessageTypeKind <em>MQTT311 Message Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.MQTT311MessageTypeKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMQTT311MessageTypeKind()
		 * @generated
		 */
		EEnum MQTT311_MESSAGE_TYPE_KIND = eINSTANCE.getMQTT311MessageTypeKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.MQTT50MessageTypeKind <em>MQTT50 Message Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.MQTT50MessageTypeKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getMQTT50MessageTypeKind()
		 * @generated
		 */
		EEnum MQTT50_MESSAGE_TYPE_KIND = eINSTANCE.getMQTT50MessageTypeKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.PayloadEncryptionKind <em>Payload Encryption Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.PayloadEncryptionKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getPayloadEncryptionKind()
		 * @generated
		 */
		EEnum PAYLOAD_ENCRYPTION_KIND = eINSTANCE.getPayloadEncryptionKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.PhysicalLayerKind <em>Physical Layer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.PhysicalLayerKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getPhysicalLayerKind()
		 * @generated
		 */
		EEnum PHYSICAL_LAYER_KIND = eINSTANCE.getPhysicalLayerKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.TransportLayerKind <em>Transport Layer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.TransportLayerKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getTransportLayerKind()
		 * @generated
		 */
		EEnum TRANSPORT_LAYER_KIND = eINSTANCE.getTransportLayerKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.WebsocketDataFramingTypeKind <em>Websocket Data Framing Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.WebsocketDataFramingTypeKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getWebsocketDataFramingTypeKind()
		 * @generated
		 */
		EEnum WEBSOCKET_DATA_FRAMING_TYPE_KIND = eINSTANCE.getWebsocketDataFramingTypeKind();

		/**
		 * The meta object literal for the '{@link ArrowheadDSL.WorkflowKind <em>Workflow Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ArrowheadDSL.WorkflowKind
		 * @see ArrowheadDSL.impl.ArrowheadDSLPackageImpl#getWorkflowKind()
		 * @generated
		 */
		EEnum WORKFLOW_KIND = eINSTANCE.getWorkflowKind();

	}

} //ArrowheadDSLPackage
