/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payload Encryption Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getPayloadEncryptionKind()
 * @model
 * @generated
 */
public enum PayloadEncryptionKind implements Enumerator {
	/**
	 * The '<em><b>DTLS12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DTLS12_VALUE
	 * @generated
	 * @ordered
	 */
	DTLS12(0, "DTLS12", "DTLS12"),

	/**
	 * The '<em><b>TLS12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://www.ietf.org/rfc/rfc5246.txt
	 * <!-- end-model-doc -->
	 * @see #TLS12_VALUE
	 * @generated
	 * @ordered
	 */
	TLS12(1, "TLS12", "TLS12"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "Other", "Other"),

	/**
	 * The '<em><b>TLS13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://www.ietf.org/blog/tls13/
	 * 
	 * <!-- end-model-doc -->
	 * @see #TLS13_VALUE
	 * @generated
	 * @ordered
	 */
	TLS13(3, "TLS13", "TLS13"),

	/**
	 * The '<em><b>DTLS13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://datatracker.ietf.org/doc/rfc9147/
	 * 
	 * <!-- end-model-doc -->
	 * @see #DTLS13_VALUE
	 * @generated
	 * @ordered
	 */
	DTLS13(4, "DTLS13", "DTLS13");

	/**
	 * The '<em><b>DTLS12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DTLS12
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DTLS 1.2'"
	 * @generated
	 * @ordered
	 */
	public static final int DTLS12_VALUE = 0;

	/**
	 * The '<em><b>TLS12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://www.ietf.org/rfc/rfc5246.txt
	 * <!-- end-model-doc -->
	 * @see #TLS12
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TLS 1.2'"
	 * @generated
	 * @ordered
	 */
	public static final int TLS12_VALUE = 1;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 2;

	/**
	 * The '<em><b>TLS13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://www.ietf.org/blog/tls13/
	 * 
	 * <!-- end-model-doc -->
	 * @see #TLS13
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TLS 1.3'"
	 * @generated
	 * @ordered
	 */
	public static final int TLS13_VALUE = 3;

	/**
	 * The '<em><b>DTLS13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://datatracker.ietf.org/doc/rfc9147/
	 * 
	 * <!-- end-model-doc -->
	 * @see #DTLS13
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DTLS 1.3'"
	 * @generated
	 * @ordered
	 */
	public static final int DTLS13_VALUE = 4;

	/**
	 * An array of all the '<em><b>Payload Encryption Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PayloadEncryptionKind[] VALUES_ARRAY =
		new PayloadEncryptionKind[] {
			DTLS12,
			TLS12,
			OTHER,
			TLS13,
			DTLS13,
		};

	/**
	 * A public read-only list of all the '<em><b>Payload Encryption Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PayloadEncryptionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payload Encryption Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PayloadEncryptionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PayloadEncryptionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payload Encryption Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PayloadEncryptionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PayloadEncryptionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payload Encryption Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PayloadEncryptionKind get(int value) {
		switch (value) {
			case DTLS12_VALUE: return DTLS12;
			case TLS12_VALUE: return TLS12;
			case OTHER_VALUE: return OTHER;
			case TLS13_VALUE: return TLS13;
			case DTLS13_VALUE: return DTLS13;
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
	private PayloadEncryptionKind(int value, String name, String literal) {
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
	
} //PayloadEncryptionKind
