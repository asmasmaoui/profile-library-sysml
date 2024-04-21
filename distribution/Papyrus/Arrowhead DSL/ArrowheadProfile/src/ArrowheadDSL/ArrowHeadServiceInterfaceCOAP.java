/**
 */
package ArrowheadDSL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Head Service Interface COAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.ArrowHeadServiceInterfaceCOAP#getMethod <em>Method</em>}</li>
 *   <li>{@link ArrowheadDSL.ArrowHeadServiceInterfaceCOAP#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link ArrowheadDSL.ArrowHeadServiceInterfaceCOAP#getSubURL <em>Sub URL</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowHeadServiceInterfaceCOAP()
 * @model
 * @generated
 */
public interface ArrowHeadServiceInterfaceCOAP extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.CoAPMethodKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see ArrowheadDSL.CoAPMethodKind
	 * @see #setMethod(CoAPMethodKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowHeadServiceInterfaceCOAP_Method()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CoAPMethodKind getMethod();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowHeadServiceInterfaceCOAP#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see ArrowheadDSL.CoAPMethodKind
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CoAPMethodKind value);

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
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowHeadServiceInterfaceCOAP_Base_Operation()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowHeadServiceInterfaceCOAP#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

	/**
	 * Returns the value of the '<em><b>Sub URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub URL</em>' attribute.
	 * @see #setSubURL(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowHeadServiceInterfaceCOAP_SubURL()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSubURL();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowHeadServiceInterfaceCOAP#getSubURL <em>Sub URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub URL</em>' attribute.
	 * @see #getSubURL()
	 * @generated
	 */
	void setSubURL(String value);

} // ArrowHeadServiceInterfaceCOAP
