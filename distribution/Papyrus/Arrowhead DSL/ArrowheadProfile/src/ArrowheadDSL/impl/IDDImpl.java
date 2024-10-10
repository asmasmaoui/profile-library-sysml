/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ApplicationProtocolKind;
import ArrowheadDSL.ArrowheadCertificateKind;
import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.ArrowheadSecurityKind;
import ArrowheadDSL.ComprressionKind;
import ArrowheadDSL.CryptoAlgorithmKind;
import ArrowheadDSL.DatamodelStandardKind;
import ArrowheadDSL.EncodingKind;
import ArrowheadDSL.IDD;
import ArrowheadDSL.TokenKind;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getPort <em>Port</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getCompression <em>Compression</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getCertificate_level <em>Certificate level</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getToken <em>Token</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getCrypto_algorithm <em>Crypto algorithm</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IDDImpl#getDatamodel <em>Datamodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDDImpl extends SDImpl implements IDD {
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationProtocolKind PROTOCOL_EDEFAULT = ApplicationProtocolKind.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ApplicationProtocolKind protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final EncodingKind ENCODING_EDEFAULT = EncodingKind.JSON;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected EncodingKind encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowheadSecurityKind SECURITY_EDEFAULT = ArrowheadSecurityKind.CERTIFICATE;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected ArrowheadSecurityKind security = SECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final ComprressionKind COMPRESSION_EDEFAULT = ComprressionKind.NONE;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected ComprressionKind compression = COMPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificate_level() <em>Certificate level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate_level()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowheadCertificateKind CERTIFICATE_LEVEL_EDEFAULT = ArrowheadCertificateKind.APPLICATION_SYSTEM;

	/**
	 * The cached value of the '{@link #getCertificate_level() <em>Certificate level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate_level()
	 * @generated
	 * @ordered
	 */
	protected ArrowheadCertificateKind certificate_level = CERTIFICATE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final TokenKind TOKEN_EDEFAULT = TokenKind.ARROWHEAD_TOKEN;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected TokenKind token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrypto_algorithm() <em>Crypto algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrypto_algorithm()
	 * @generated
	 * @ordered
	 */
	protected static final CryptoAlgorithmKind CRYPTO_ALGORITHM_EDEFAULT = CryptoAlgorithmKind.RSA;

	/**
	 * The cached value of the '{@link #getCrypto_algorithm() <em>Crypto algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrypto_algorithm()
	 * @generated
	 * @ordered
	 */
	protected CryptoAlgorithmKind crypto_algorithm = CRYPTO_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatamodel() <em>Datamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatamodel()
	 * @generated
	 * @ordered
	 */
	protected static final DatamodelStandardKind DATAMODEL_EDEFAULT = DatamodelStandardKind.NONE;

	/**
	 * The cached value of the '{@link #getDatamodel() <em>Datamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatamodel()
	 * @generated
	 * @ordered
	 */
	protected DatamodelStandardKind datamodel = DATAMODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.IDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationProtocolKind getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(ApplicationProtocolKind newProtocol) {
		ApplicationProtocolKind oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncodingKind getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(EncodingKind newEncoding) {
		EncodingKind oldEncoding = encoding;
		encoding = newEncoding == null ? ENCODING_EDEFAULT : newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowheadSecurityKind getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(ArrowheadSecurityKind newSecurity) {
		ArrowheadSecurityKind oldSecurity = security;
		security = newSecurity == null ? SECURITY_EDEFAULT : newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComprressionKind getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompression(ComprressionKind newCompression) {
		ComprressionKind oldCompression = compression;
		compression = newCompression == null ? COMPRESSION_EDEFAULT : newCompression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__COMPRESSION, oldCompression, compression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowheadCertificateKind getCertificate_level() {
		return certificate_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificate_level(ArrowheadCertificateKind newCertificate_level) {
		ArrowheadCertificateKind oldCertificate_level = certificate_level;
		certificate_level = newCertificate_level == null ? CERTIFICATE_LEVEL_EDEFAULT : newCertificate_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__CERTIFICATE_LEVEL, oldCertificate_level, certificate_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenKind getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(TokenKind newToken) {
		TokenKind oldToken = token;
		token = newToken == null ? TOKEN_EDEFAULT : newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoAlgorithmKind getCrypto_algorithm() {
		return crypto_algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrypto_algorithm(CryptoAlgorithmKind newCrypto_algorithm) {
		CryptoAlgorithmKind oldCrypto_algorithm = crypto_algorithm;
		crypto_algorithm = newCrypto_algorithm == null ? CRYPTO_ALGORITHM_EDEFAULT : newCrypto_algorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__CRYPTO_ALGORITHM, oldCrypto_algorithm, crypto_algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatamodelStandardKind getDatamodel() {
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatamodel(DatamodelStandardKind newDatamodel) {
		DatamodelStandardKind oldDatamodel = datamodel;
		datamodel = newDatamodel == null ? DATAMODEL_EDEFAULT : newDatamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.IDD__DATAMODEL, oldDatamodel, datamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.IDD__PORT:
				return getPort();
			case ArrowheadDSLPackage.IDD__PROTOCOL:
				return getProtocol();
			case ArrowheadDSLPackage.IDD__ENCODING:
				return getEncoding();
			case ArrowheadDSLPackage.IDD__SECURITY:
				return getSecurity();
			case ArrowheadDSLPackage.IDD__COMPRESSION:
				return getCompression();
			case ArrowheadDSLPackage.IDD__CERTIFICATE_LEVEL:
				return getCertificate_level();
			case ArrowheadDSLPackage.IDD__TOKEN:
				return getToken();
			case ArrowheadDSLPackage.IDD__CRYPTO_ALGORITHM:
				return getCrypto_algorithm();
			case ArrowheadDSLPackage.IDD__DATAMODEL:
				return getDatamodel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadDSLPackage.IDD__PORT:
				setPort((Integer)newValue);
				return;
			case ArrowheadDSLPackage.IDD__PROTOCOL:
				setProtocol((ApplicationProtocolKind)newValue);
				return;
			case ArrowheadDSLPackage.IDD__ENCODING:
				setEncoding((EncodingKind)newValue);
				return;
			case ArrowheadDSLPackage.IDD__SECURITY:
				setSecurity((ArrowheadSecurityKind)newValue);
				return;
			case ArrowheadDSLPackage.IDD__COMPRESSION:
				setCompression((ComprressionKind)newValue);
				return;
			case ArrowheadDSLPackage.IDD__CERTIFICATE_LEVEL:
				setCertificate_level((ArrowheadCertificateKind)newValue);
				return;
			case ArrowheadDSLPackage.IDD__TOKEN:
				setToken((TokenKind)newValue);
				return;
			case ArrowheadDSLPackage.IDD__CRYPTO_ALGORITHM:
				setCrypto_algorithm((CryptoAlgorithmKind)newValue);
				return;
			case ArrowheadDSLPackage.IDD__DATAMODEL:
				setDatamodel((DatamodelStandardKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArrowheadDSLPackage.IDD__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ArrowheadDSLPackage.IDD__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ArrowheadDSLPackage.IDD__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case ArrowheadDSLPackage.IDD__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case ArrowheadDSLPackage.IDD__COMPRESSION:
				setCompression(COMPRESSION_EDEFAULT);
				return;
			case ArrowheadDSLPackage.IDD__CERTIFICATE_LEVEL:
				setCertificate_level(CERTIFICATE_LEVEL_EDEFAULT);
				return;
			case ArrowheadDSLPackage.IDD__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case ArrowheadDSLPackage.IDD__CRYPTO_ALGORITHM:
				setCrypto_algorithm(CRYPTO_ALGORITHM_EDEFAULT);
				return;
			case ArrowheadDSLPackage.IDD__DATAMODEL:
				setDatamodel(DATAMODEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArrowheadDSLPackage.IDD__PORT:
				return port != PORT_EDEFAULT;
			case ArrowheadDSLPackage.IDD__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case ArrowheadDSLPackage.IDD__ENCODING:
				return encoding != ENCODING_EDEFAULT;
			case ArrowheadDSLPackage.IDD__SECURITY:
				return security != SECURITY_EDEFAULT;
			case ArrowheadDSLPackage.IDD__COMPRESSION:
				return compression != COMPRESSION_EDEFAULT;
			case ArrowheadDSLPackage.IDD__CERTIFICATE_LEVEL:
				return certificate_level != CERTIFICATE_LEVEL_EDEFAULT;
			case ArrowheadDSLPackage.IDD__TOKEN:
				return token != TOKEN_EDEFAULT;
			case ArrowheadDSLPackage.IDD__CRYPTO_ALGORITHM:
				return crypto_algorithm != CRYPTO_ALGORITHM_EDEFAULT;
			case ArrowheadDSLPackage.IDD__DATAMODEL:
				return datamodel != DATAMODEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Port: ");
		result.append(port);
		result.append(", Protocol: ");
		result.append(protocol);
		result.append(", Encoding: ");
		result.append(encoding);
		result.append(", Security: ");
		result.append(security);
		result.append(", Compression: ");
		result.append(compression);
		result.append(", Certificate_level: ");
		result.append(certificate_level);
		result.append(", Token: ");
		result.append(token);
		result.append(", Crypto_algorithm: ");
		result.append(crypto_algorithm);
		result.append(", Datamodel: ");
		result.append(datamodel);
		result.append(')');
		return result.toString();
	}

} //IDDImpl
