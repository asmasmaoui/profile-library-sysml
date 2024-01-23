/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Cloud Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.LocalCloudDesign#getLC_Name <em>LC Name</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalCloudDesign#getFunctionalProperties <em>Functional Properties</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalCloudDesign#getLC_SecurityStrategy <em>LC Security Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalCloudDesign#getLC_BusinessStrategy <em>LC Business Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalCloudDesign#getLC_LifecycleStrategy <em>LC Lifecycle Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalCloudDesign#getSystem_of_localcloudsdesign <em>System of localcloudsdesign</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalCloudDesign#getSysd <em>Sysd</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalCloudDesign()
 * @model
 * @generated
 */
public interface LocalCloudDesign extends Block {
	/**
	 * Returns the value of the '<em><b>LC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LC Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LC Name</em>' attribute.
	 * @see #setLC_Name(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalCloudDesign_LC_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLC_Name();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.LocalCloudDesign#getLC_Name <em>LC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LC Name</em>' attribute.
	 * @see #getLC_Name()
	 * @generated
	 */
	void setLC_Name(String value);

	/**
	 * Returns the value of the '<em><b>Functional Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Properties</em>' attribute.
	 * @see #setFunctionalProperties(int)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalCloudDesign_FunctionalProperties()
	 * @model unique="false" dataType="org.eclipse.uml2.types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	int getFunctionalProperties();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.LocalCloudDesign#getFunctionalProperties <em>Functional Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Properties</em>' attribute.
	 * @see #getFunctionalProperties()
	 * @generated
	 */
	void setFunctionalProperties(int value);

	/**
	 * Returns the value of the '<em><b>LC Security Strategy</b></em>' attribute list.
	 * The list contents are of type {@link ArrowheadDSL.SecurityPolicyKind}.
	 * The literals are from the enumeration {@link ArrowheadDSL.SecurityPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LC Security Strategy</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LC Security Strategy</em>' attribute list.
	 * @see ArrowheadDSL.SecurityPolicyKind
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalCloudDesign_LC_SecurityStrategy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SecurityPolicyKind> getLC_SecurityStrategy();

	/**
	 * Returns the value of the '<em><b>LC Business Strategy</b></em>' attribute list.
	 * The list contents are of type {@link ArrowheadDSL.BusinessPolicyKind}.
	 * The literals are from the enumeration {@link ArrowheadDSL.BusinessPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LC Business Strategy</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LC Business Strategy</em>' attribute list.
	 * @see ArrowheadDSL.BusinessPolicyKind
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalCloudDesign_LC_BusinessStrategy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BusinessPolicyKind> getLC_BusinessStrategy();

	/**
	 * Returns the value of the '<em><b>LC Lifecycle Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.LifecyclePolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LC Lifecycle Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LC Lifecycle Strategy</em>' attribute.
	 * @see ArrowheadDSL.LifecyclePolicyKind
	 * @see #setLC_LifecycleStrategy(LifecyclePolicyKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalCloudDesign_LC_LifecycleStrategy()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	LifecyclePolicyKind getLC_LifecycleStrategy();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.LocalCloudDesign#getLC_LifecycleStrategy <em>LC Lifecycle Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LC Lifecycle Strategy</em>' attribute.
	 * @see ArrowheadDSL.LifecyclePolicyKind
	 * @see #getLC_LifecycleStrategy()
	 * @generated
	 */
	void setLC_LifecycleStrategy(LifecyclePolicyKind value);

	/**
	 * Returns the value of the '<em><b>System of localcloudsdesign</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.System_of_LocalcloudsDesign}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.System_of_LocalcloudsDesign#getLocalclouddesign <em>Localclouddesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System of localcloudsdesign</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System of localcloudsdesign</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalCloudDesign_System_of_localcloudsdesign()
	 * @see ArrowheadDSL.System_of_LocalcloudsDesign#getLocalclouddesign
	 * @model opposite="localclouddesign" ordered="false"
	 * @generated
	 */
	EList<System_of_LocalcloudsDesign> getSystem_of_localcloudsdesign();

	/**
	 * Returns the value of the '<em><b>Sysd</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.SysD}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.SysD#getLocalclouddesign <em>Localclouddesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sysd</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sysd</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalCloudDesign_Sysd()
	 * @see ArrowheadDSL.SysD#getLocalclouddesign
	 * @model opposite="localclouddesign" ordered="false"
	 * @generated
	 */
	EList<SysD> getSysd();

} // LocalCloudDesign
