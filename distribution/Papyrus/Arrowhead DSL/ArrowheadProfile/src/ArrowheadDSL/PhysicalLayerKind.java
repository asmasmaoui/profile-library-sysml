/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Physical Layer Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getPhysicalLayerKind()
 * @model
 * @generated
 */
public enum PhysicalLayerKind implements Enumerator {
	/**
	 * The '<em><b>IEEE802 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_3_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE802_3(0, "IEEE802_3", "IEEE802_3"),

	/**
	 * The '<em><b>IEEE802 15 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_15_4_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE802_15_4(1, "IEEE802_15_4", "IEEE802_15_4"),

	/**
	 * The '<em><b>IEEE802 11a</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_11A_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE802_11A(2, "IEEE802_11a", "IEEE802_11a"),

	/**
	 * The '<em><b>IEEE802 11b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_11B_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE802_11B(3, "IEEE802_11b", "IEEE802_11b"),

	/**
	 * The '<em><b>Other Physical Layer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_PHYSICAL_LAYER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_PHYSICAL_LAYER(4, "OtherPhysicalLayer", "OtherPhysicalLayer");

	/**
	 * The '<em><b>IEEE802 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEEE802_3_VALUE = 0;

	/**
	 * The '<em><b>IEEE802 15 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_15_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEEE802_15_4_VALUE = 1;

	/**
	 * The '<em><b>IEEE802 11a</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_11A
	 * @model name="IEEE802_11a"
	 * @generated
	 * @ordered
	 */
	public static final int IEEE802_11A_VALUE = 2;

	/**
	 * The '<em><b>IEEE802 11b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE802_11B
	 * @model name="IEEE802_11b"
	 * @generated
	 * @ordered
	 */
	public static final int IEEE802_11B_VALUE = 3;

	/**
	 * The '<em><b>Other Physical Layer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_PHYSICAL_LAYER
	 * @model name="OtherPhysicalLayer"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_PHYSICAL_LAYER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Physical Layer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PhysicalLayerKind[] VALUES_ARRAY =
		new PhysicalLayerKind[] {
			IEEE802_3,
			IEEE802_15_4,
			IEEE802_11A,
			IEEE802_11B,
			OTHER_PHYSICAL_LAYER,
		};

	/**
	 * A public read-only list of all the '<em><b>Physical Layer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PhysicalLayerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Physical Layer Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalLayerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhysicalLayerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Physical Layer Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalLayerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhysicalLayerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Physical Layer Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalLayerKind get(int value) {
		switch (value) {
			case IEEE802_3_VALUE: return IEEE802_3;
			case IEEE802_15_4_VALUE: return IEEE802_15_4;
			case IEEE802_11A_VALUE: return IEEE802_11A;
			case IEEE802_11B_VALUE: return IEEE802_11B;
			case OTHER_PHYSICAL_LAYER_VALUE: return OTHER_PHYSICAL_LAYER;
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
	private PhysicalLayerKind(int value, String name, String literal) {
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
	
} //PhysicalLayerKind
