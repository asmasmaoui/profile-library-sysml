/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Crypto Algorithm Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getCryptoAlgorithmKind()
 * @model
 * @generated
 */
public enum CryptoAlgorithmKind implements Enumerator {
	/**
	 * The '<em><b>RSA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSA_VALUE
	 * @generated
	 * @ordered
	 */
	RSA(0, "RSA", "RSA"),

	/**
	 * The '<em><b>Eliptic Curve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIPTIC_CURVE_VALUE
	 * @generated
	 * @ordered
	 */
	ELIPTIC_CURVE(1, "ElipticCurve", "ElipticCurve"),

	/**
	 * The '<em><b>Diffie Hellman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFIE_HELLMAN_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFIE_HELLMAN(2, "DiffieHellman", "DiffieHellman"),

	/**
	 * The '<em><b>Serpent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERPENT_VALUE
	 * @generated
	 * @ordered
	 */
	SERPENT(3, "Serpent", "Serpent"),

	/**
	 * The '<em><b>AES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AES_VALUE
	 * @generated
	 * @ordered
	 */
	AES(4, "AES", "AES"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "Other", "Other");

	/**
	 * The '<em><b>RSA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSA_VALUE = 0;

	/**
	 * The '<em><b>Eliptic Curve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIPTIC_CURVE
	 * @model name="ElipticCurve"
	 * @generated
	 * @ordered
	 */
	public static final int ELIPTIC_CURVE_VALUE = 1;

	/**
	 * The '<em><b>Diffie Hellman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFIE_HELLMAN
	 * @model name="DiffieHellman"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFIE_HELLMAN_VALUE = 2;

	/**
	 * The '<em><b>Serpent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERPENT
	 * @model name="Serpent"
	 * @generated
	 * @ordered
	 */
	public static final int SERPENT_VALUE = 3;

	/**
	 * The '<em><b>AES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AES_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Crypto Algorithm Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CryptoAlgorithmKind[] VALUES_ARRAY =
		new CryptoAlgorithmKind[] {
			RSA,
			ELIPTIC_CURVE,
			DIFFIE_HELLMAN,
			SERPENT,
			AES,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Crypto Algorithm Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CryptoAlgorithmKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Crypto Algorithm Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoAlgorithmKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CryptoAlgorithmKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crypto Algorithm Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoAlgorithmKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CryptoAlgorithmKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crypto Algorithm Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoAlgorithmKind get(int value) {
		switch (value) {
			case RSA_VALUE: return RSA;
			case ELIPTIC_CURVE_VALUE: return ELIPTIC_CURVE;
			case DIFFIE_HELLMAN_VALUE: return DIFFIE_HELLMAN;
			case SERPENT_VALUE: return SERPENT;
			case AES_VALUE: return AES;
			case OTHER_VALUE: return OTHER;
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
	private CryptoAlgorithmKind(int value, String name, String literal) {
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
	
} //CryptoAlgorithmKind
