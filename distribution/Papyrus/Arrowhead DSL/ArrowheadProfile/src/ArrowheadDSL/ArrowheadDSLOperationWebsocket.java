/**
 */
package ArrowheadDSL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Websocket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.ArrowheadDSLOperationWebsocket#getMethod <em>Method</em>}</li>
 *   <li>{@link ArrowheadDSL.ArrowheadDSLOperationWebsocket#getSubURL <em>Sub URL</em>}</li>
 *   <li>{@link ArrowheadDSL.ArrowheadDSLOperationWebsocket#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLOperationWebsocket()
 * @model
 * @generated
 */
public interface ArrowheadDSLOperationWebsocket extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.WebsocketDataFramingTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see ArrowheadDSL.WebsocketDataFramingTypeKind
	 * @see #setMethod(WebsocketDataFramingTypeKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLOperationWebsocket_Method()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WebsocketDataFramingTypeKind getMethod();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowheadDSLOperationWebsocket#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see ArrowheadDSL.WebsocketDataFramingTypeKind
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(WebsocketDataFramingTypeKind value);

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
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLOperationWebsocket_SubURL()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSubURL();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowheadDSLOperationWebsocket#getSubURL <em>Sub URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub URL</em>' attribute.
	 * @see #getSubURL()
	 * @generated
	 */
	void setSubURL(String value);

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
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLOperationWebsocket_Base_Operation()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowheadDSLOperationWebsocket#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

} // ArrowheadDSLOperationWebsocket
