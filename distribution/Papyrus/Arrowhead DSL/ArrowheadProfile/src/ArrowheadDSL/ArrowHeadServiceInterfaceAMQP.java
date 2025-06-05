/**
 */
package ArrowheadDSL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Head Service Interface AMQP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.ArrowHeadServiceInterfaceAMQP#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowHeadServiceInterfaceAMQP()
 * @model
 * @generated
 */
public interface ArrowHeadServiceInterfaceAMQP extends EObject {
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
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowHeadServiceInterfaceAMQP_Base_Operation()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowHeadServiceInterfaceAMQP#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

} // ArrowHeadServiceInterfaceAMQP
