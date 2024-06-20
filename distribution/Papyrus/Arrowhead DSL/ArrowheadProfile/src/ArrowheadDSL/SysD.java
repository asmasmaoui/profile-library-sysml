/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Microservies SD to be added to a microsystem (SysD) as a full port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.SysD#getMicrosystemName <em>Microsystem Name</em>}</li>
 *   <li>{@link ArrowheadDSL.SysD#getFunctionalProperties <em>Functional Properties</em>}</li>
 *   <li>{@link ArrowheadDSL.SysD#getSystemDatabase <em>System Database</em>}</li>
 *   <li>{@link ArrowheadDSL.SysD#getMicrosystemBehaviour <em>Microsystem Behaviour</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getSysD()
 * @model
 * @generated
 */
public interface SysD extends Block {
	/**
	 * Returns the value of the '<em><b>Microsystem Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microsystem Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microsystem Name</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSysD_MicrosystemName()
	 * @model default="Inherit from generalization SysD" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getMicrosystemName();

	/**
	 * Returns the value of the '<em><b>Functional Properties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Properties</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Properties</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSysD_FunctionalProperties()
	 * @model unique="false" dataType="org.eclipse.uml2.types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getFunctionalProperties();

	/**
	 * Returns the value of the '<em><b>System Database</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.SystemDatabaseKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Database</em>' attribute.
	 * @see ArrowheadDSL.SystemDatabaseKind
	 * @see #setSystemDatabase(SystemDatabaseKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSysD_SystemDatabase()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	SystemDatabaseKind getSystemDatabase();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.SysD#getSystemDatabase <em>System Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Database</em>' attribute.
	 * @see ArrowheadDSL.SystemDatabaseKind
	 * @see #getSystemDatabase()
	 * @generated
	 */
	void setSystemDatabase(SystemDatabaseKind value);

	/**
	 * Returns the value of the '<em><b>Microsystem Behaviour</b></em>' attribute list.
	 * The list contents are of type {@link ArrowheadDSL.BusinessPolicyKind}.
	 * The literals are from the enumeration {@link ArrowheadDSL.BusinessPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microsystem Behaviour</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microsystem Behaviour</em>' attribute list.
	 * @see ArrowheadDSL.BusinessPolicyKind
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSysD_MicrosystemBehaviour()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<BusinessPolicyKind> getMicrosystemBehaviour();

} // SysD
