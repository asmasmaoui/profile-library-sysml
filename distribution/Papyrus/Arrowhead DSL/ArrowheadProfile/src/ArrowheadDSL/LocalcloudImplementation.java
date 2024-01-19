/**
 */
package ArrowheadDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localcloud Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.LocalcloudImplementation#getLC_Documentation <em>LC Documentation</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudImplementation()
 * @model
 * @generated
 */
public interface LocalcloudImplementation extends LocalcloudDesignDescription {
	/**
	 * Returns the value of the '<em><b>LC Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LC Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LC Documentation</em>' attribute.
	 * @see #setLC_Documentation(int)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudImplementation_LC_Documentation()
	 * @model dataType="org.eclipse.uml2.types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	int getLC_Documentation();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.LocalcloudImplementation#getLC_Documentation <em>LC Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LC Documentation</em>' attribute.
	 * @see #getLC_Documentation()
	 * @generated
	 */
	void setLC_Documentation(int value);

} // LocalcloudImplementation
