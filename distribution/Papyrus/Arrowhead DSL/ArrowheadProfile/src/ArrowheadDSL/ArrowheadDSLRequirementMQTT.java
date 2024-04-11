/**
 */
package ArrowheadDSL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement MQTT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getMethod <em>Method</em>}</li>
 *   <li>{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getTopic <em>Topic</em>}</li>
 *   <li>{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLRequirementMQTT()
 * @model
 * @generated
 */
public interface ArrowheadDSLRequirementMQTT extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.HTTP11MethodKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see ArrowheadDSL.HTTP11MethodKind
	 * @see #setMethod(HTTP11MethodKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLRequirementMQTT_Method()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HTTP11MethodKind getMethod();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see ArrowheadDSL.HTTP11MethodKind
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HTTP11MethodKind value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLRequirementMQTT_Topic()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * Returns the value of the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Operation</em>' reference.
	 * @see #setBase_Operation(Operation)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLRequirementMQTT_Base_Operation()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowheadDSLRequirementMQTT#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

} // ArrowheadDSLRequirementMQTT
