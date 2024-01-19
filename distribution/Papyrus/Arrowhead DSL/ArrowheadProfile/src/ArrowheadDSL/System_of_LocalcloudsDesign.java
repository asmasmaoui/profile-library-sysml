/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System of Localclouds Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLCName <em>So LC Name</em>}</li>
 *   <li>{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_SecurityStrategy <em>So LC Security Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_BusinessStrategy <em>So LC Business Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_LifecycleStrategy <em>So LC Lifecycle Strategy</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocalcloudsDesign()
 * @model
 * @generated
 */
public interface System_of_LocalcloudsDesign extends Block {
	/**
	 * Returns the value of the '<em><b>So LC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>So LC Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So LC Name</em>' attribute.
	 * @see #setSoLCName(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocalcloudsDesign_SoLCName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SoLC-Name'"
	 * @generated
	 */
	String getSoLCName();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLCName <em>So LC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So LC Name</em>' attribute.
	 * @see #getSoLCName()
	 * @generated
	 */
	void setSoLCName(String value);

	/**
	 * Returns the value of the '<em><b>So LC Security Strategy</b></em>' attribute list.
	 * The list contents are of type {@link ArrowheadDSL.SecurityPolicyKind}.
	 * The literals are from the enumeration {@link ArrowheadDSL.SecurityPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>So LC Security Strategy</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So LC Security Strategy</em>' attribute list.
	 * @see ArrowheadDSL.SecurityPolicyKind
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocalcloudsDesign_SoLC_SecurityStrategy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<SecurityPolicyKind> getSoLC_SecurityStrategy();

	/**
	 * Returns the value of the '<em><b>So LC Business Strategy</b></em>' attribute list.
	 * The list contents are of type {@link ArrowheadDSL.BusinessPolicyKind}.
	 * The literals are from the enumeration {@link ArrowheadDSL.BusinessPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>So LC Business Strategy</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So LC Business Strategy</em>' attribute list.
	 * @see ArrowheadDSL.BusinessPolicyKind
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocalcloudsDesign_SoLC_BusinessStrategy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<BusinessPolicyKind> getSoLC_BusinessStrategy();

	/**
	 * Returns the value of the '<em><b>So LC Lifecycle Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.LifecyclePolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>So LC Lifecycle Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So LC Lifecycle Strategy</em>' attribute.
	 * @see ArrowheadDSL.LifecyclePolicyKind
	 * @see #setSoLC_LifecycleStrategy(LifecyclePolicyKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocalcloudsDesign_SoLC_LifecycleStrategy()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	LifecyclePolicyKind getSoLC_LifecycleStrategy();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.System_of_LocalcloudsDesign#getSoLC_LifecycleStrategy <em>So LC Lifecycle Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So LC Lifecycle Strategy</em>' attribute.
	 * @see ArrowheadDSL.LifecyclePolicyKind
	 * @see #getSoLC_LifecycleStrategy()
	 * @generated
	 */
	void setSoLC_LifecycleStrategy(LifecyclePolicyKind value);

} // System_of_LocalcloudsDesign
