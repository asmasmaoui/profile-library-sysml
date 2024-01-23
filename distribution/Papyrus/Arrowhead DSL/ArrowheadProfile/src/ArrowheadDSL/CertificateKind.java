/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Certificate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getCertificateKind()
 * @model
 * @generated
 */
public enum CertificateKind implements Enumerator {
	/**
	 * The '<em><b>X509 Arrowhead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X509_ARROWHEAD_VALUE
	 * @generated
	 * @ordered
	 */
	X509_ARROWHEAD(0, "x509_Arrowhead", "x509_Arrowhead"),

	/**
	 * The '<em><b>Other Certificate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_CERTIFICATE_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_CERTIFICATE(1, "OtherCertificate", "OtherCertificate");

	/**
	 * The '<em><b>X509 Arrowhead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X509_ARROWHEAD
	 * @model name="x509_Arrowhead"
	 * @generated
	 * @ordered
	 */
	public static final int X509_ARROWHEAD_VALUE = 0;

	/**
	 * The '<em><b>Other Certificate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_CERTIFICATE
	 * @model name="OtherCertificate"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_CERTIFICATE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Certificate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CertificateKind[] VALUES_ARRAY =
		new CertificateKind[] {
			X509_ARROWHEAD,
			OTHER_CERTIFICATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Certificate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CertificateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Certificate Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CertificateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Certificate Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CertificateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Certificate Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificateKind get(int value) {
		switch (value) {
			case X509_ARROWHEAD_VALUE: return X509_ARROWHEAD;
			case OTHER_CERTIFICATE_VALUE: return OTHER_CERTIFICATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CertificateKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CertificateKind
