/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MAC Protocol Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getMACProtocolKind()
 * @model
 * @generated
 */
public enum MACProtocolKind implements Enumerator {
	/**
	 * The '<em><b>802 11b MAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11B_MAC_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11B_MAC(0, "_802_11b_MAC", "_802_11b_MAC"),

	/**
	 * The '<em><b>802 11a MAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11A_MAC_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11A_MAC(1, "_802_11a_MAC", "_802_11a_MAC"),

	/**
	 * The '<em><b>Other Mac Protocol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_MAC_PROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_MAC_PROTOCOL(2, "OtherMacProtocol", "OtherMacProtocol");

	/**
	 * The '<em><b>802 11b MAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11B_MAC
	 * @model name="_802_11b_MAC"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='802_11b_MAC'"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11B_MAC_VALUE = 0;

	/**
	 * The '<em><b>802 11a MAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11A_MAC
	 * @model name="_802_11a_MAC"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='802_11a_MAC'"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11A_MAC_VALUE = 1;

	/**
	 * The '<em><b>Other Mac Protocol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_MAC_PROTOCOL
	 * @model name="OtherMacProtocol"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_MAC_PROTOCOL_VALUE = 2;

	/**
	 * An array of all the '<em><b>MAC Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MACProtocolKind[] VALUES_ARRAY =
		new MACProtocolKind[] {
			_802_11B_MAC,
			_802_11A_MAC,
			OTHER_MAC_PROTOCOL,
		};

	/**
	 * A public read-only list of all the '<em><b>MAC Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MACProtocolKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MAC Protocol Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACProtocolKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MACProtocolKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MAC Protocol Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACProtocolKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MACProtocolKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MAC Protocol Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACProtocolKind get(int value) {
		switch (value) {
			case _802_11B_MAC_VALUE: return _802_11B_MAC;
			case _802_11A_MAC_VALUE: return _802_11A_MAC;
			case OTHER_MAC_PROTOCOL_VALUE: return OTHER_MAC_PROTOCOL;
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
	private MACProtocolKind(int value, String name, String literal) {
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
	
} //MACProtocolKind
