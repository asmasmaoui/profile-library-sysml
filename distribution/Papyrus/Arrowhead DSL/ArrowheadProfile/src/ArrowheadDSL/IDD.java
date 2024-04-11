/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.IDD#getPort <em>Port</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getSecurity <em>Security</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getCompression <em>Compression</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getCertificate_level <em>Certificate level</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getToken <em>Token</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getCrypto_algorithm <em>Crypto algorithm</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link ArrowheadDSL.IDD#getSysdd <em>Sysdd</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD()
 * @model
 * @generated
 */
public interface IDD extends SD {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Port()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.ApplicationProtocolKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see ArrowheadDSL.ApplicationProtocolKind
	 * @see #setProtocol(ApplicationProtocolKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Protocol()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ApplicationProtocolKind getProtocol();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see ArrowheadDSL.ApplicationProtocolKind
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ApplicationProtocolKind value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.EncodingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see ArrowheadDSL.EncodingKind
	 * @see #setEncoding(EncodingKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Encoding()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EncodingKind getEncoding();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see ArrowheadDSL.EncodingKind
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(EncodingKind value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.ArrowheadSecurityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see ArrowheadDSL.ArrowheadSecurityKind
	 * @see #setSecurity(ArrowheadSecurityKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Security()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ArrowheadSecurityKind getSecurity();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see ArrowheadDSL.ArrowheadSecurityKind
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(ArrowheadSecurityKind value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.ComprressionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see ArrowheadDSL.ComprressionKind
	 * @see #setCompression(ComprressionKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Compression()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ComprressionKind getCompression();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see ArrowheadDSL.ComprressionKind
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(ComprressionKind value);

	/**
	 * Returns the value of the '<em><b>Certificate level</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.ArrowheadCertificateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate level</em>' attribute.
	 * @see ArrowheadDSL.ArrowheadCertificateKind
	 * @see #setCertificate_level(ArrowheadCertificateKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Certificate_level()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ArrowheadCertificateKind getCertificate_level();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getCertificate_level <em>Certificate level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate level</em>' attribute.
	 * @see ArrowheadDSL.ArrowheadCertificateKind
	 * @see #getCertificate_level()
	 * @generated
	 */
	void setCertificate_level(ArrowheadCertificateKind value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.TokenKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see ArrowheadDSL.TokenKind
	 * @see #setToken(TokenKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Token()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TokenKind getToken();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see ArrowheadDSL.TokenKind
	 * @see #getToken()
	 * @generated
	 */
	void setToken(TokenKind value);

	/**
	 * Returns the value of the '<em><b>Crypto algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.CryptoAlgorithmKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crypto algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crypto algorithm</em>' attribute.
	 * @see ArrowheadDSL.CryptoAlgorithmKind
	 * @see #setCrypto_algorithm(CryptoAlgorithmKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Crypto_algorithm()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	CryptoAlgorithmKind getCrypto_algorithm();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getCrypto_algorithm <em>Crypto algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypto algorithm</em>' attribute.
	 * @see ArrowheadDSL.CryptoAlgorithmKind
	 * @see #getCrypto_algorithm()
	 * @generated
	 */
	void setCrypto_algorithm(CryptoAlgorithmKind value);

	/**
	 * Returns the value of the '<em><b>Datamodel</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.DatamodelStandardKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datamodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamodel</em>' attribute.
	 * @see ArrowheadDSL.DatamodelStandardKind
	 * @see #setDatamodel(DatamodelStandardKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Datamodel()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	DatamodelStandardKind getDatamodel();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IDD#getDatamodel <em>Datamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamodel</em>' attribute.
	 * @see ArrowheadDSL.DatamodelStandardKind
	 * @see #getDatamodel()
	 * @generated
	 */
	void setDatamodel(DatamodelStandardKind value);

	/**
	 * Returns the value of the '<em><b>Sysdd</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.SysDD}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.SysDD#getIdd <em>Idd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sysdd</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sysdd</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Sysdd()
	 * @see ArrowheadDSL.SysDD#getIdd
	 * @model opposite="idd" ordered="false"
	 * @generated
	 */
	EList<SysDD> getSysdd();

} // IDD
