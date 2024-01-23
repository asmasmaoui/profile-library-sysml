/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arrowhead Security Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadSecurityKind()
 * @model
 * @generated
 */
public enum ArrowheadSecurityKind implements Enumerator {
	/**
	 * The '<em><b>CERTIFICATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATE(0, "CERTIFICATE", "CERTIFICATE"),

	/**
	 * The '<em><b>TOKEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN(1, "TOKEN", "TOKEN"),

	/**
	 * The '<em><b>NOT SECURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SECURE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SECURE(2, "NOT_SECURE", "NOT_SECURE");

	/**
	 * The '<em><b>CERTIFICATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATE_VALUE = 0;

	/**
	 * The '<em><b>TOKEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_VALUE = 1;

	/**
	 * The '<em><b>NOT SECURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SECURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SECURE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Arrowhead Security Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArrowheadSecurityKind[] VALUES_ARRAY =
		new ArrowheadSecurityKind[] {
			CERTIFICATE,
			TOKEN,
			NOT_SECURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Arrowhead Security Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArrowheadSecurityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arrowhead Security Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowheadSecurityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrowheadSecurityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrowhead Security Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowheadSecurityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrowheadSecurityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrowhead Security Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowheadSecurityKind get(int value) {
		switch (value) {
			case CERTIFICATE_VALUE: return CERTIFICATE;
			case TOKEN_VALUE: return TOKEN;
			case NOT_SECURE_VALUE: return NOT_SECURE;
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
	private ArrowheadSecurityKind(int value, String name, String literal) {
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
	
} //ArrowheadSecurityKind
