/**
 */
package ArrowheadDSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys DD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.SysDD#getTimeformat <em>Timeformat</em>}</li>
 *   <li>{@link ArrowheadDSL.SysDD#getArrowheadCertificate <em>Arrowhead Certificate</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getSysDD()
 * @model
 * @generated
 */
public interface SysDD extends SysD {
	/**
	 * Returns the value of the '<em><b>Timeformat</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.TimeFormatKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeformat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeformat</em>' attribute.
	 * @see ArrowheadDSL.TimeFormatKind
	 * @see #setTimeformat(TimeFormatKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSysDD_Timeformat()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TimeFormatKind getTimeformat();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.SysDD#getTimeformat <em>Timeformat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeformat</em>' attribute.
	 * @see ArrowheadDSL.TimeFormatKind
	 * @see #getTimeformat()
	 * @generated
	 */
	void setTimeformat(TimeFormatKind value);

	/**
	 * Returns the value of the '<em><b>Arrowhead Certificate</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.ArrowheadCertificateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrowhead Certificate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrowhead Certificate</em>' attribute.
	 * @see ArrowheadDSL.ArrowheadCertificateKind
	 * @see #setArrowheadCertificate(ArrowheadCertificateKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSysDD_ArrowheadCertificate()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ArrowheadCertificateKind getArrowheadCertificate();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.SysDD#getArrowheadCertificate <em>Arrowhead Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrowhead Certificate</em>' attribute.
	 * @see ArrowheadDSL.ArrowheadCertificateKind
	 * @see #getArrowheadCertificate()
	 * @generated
	 */
	void setArrowheadCertificate(ArrowheadCertificateKind value);

} // SysDD
