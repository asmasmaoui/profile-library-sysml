/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mac Layer Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getMacLayerKind()
 * @model
 * @generated
 */
public enum MacLayerKind implements Enumerator {
	/**
	 * The '<em><b>TDMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDMA_VALUE
	 * @generated
	 * @ordered
	 */
	TDMA(0, "TDMA", "TDMA"),

	/**
	 * The '<em><b>CDMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMA_VALUE
	 * @generated
	 * @ordered
	 */
	CDMA(1, "CDMA", "CDMA"),

	/**
	 * The '<em><b>Other Mac Layer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_MAC_LAYER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_MAC_LAYER(2, "OtherMacLayer", "OtherMacLayer");

	/**
	 * The '<em><b>TDMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDMA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TDMA_VALUE = 0;

	/**
	 * The '<em><b>CDMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CDMA_VALUE = 1;

	/**
	 * The '<em><b>Other Mac Layer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_MAC_LAYER
	 * @model name="OtherMacLayer"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_MAC_LAYER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Mac Layer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MacLayerKind[] VALUES_ARRAY =
		new MacLayerKind[] {
			TDMA,
			CDMA,
			OTHER_MAC_LAYER,
		};

	/**
	 * A public read-only list of all the '<em><b>Mac Layer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MacLayerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mac Layer Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MacLayerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MacLayerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mac Layer Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MacLayerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MacLayerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mac Layer Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MacLayerKind get(int value) {
		switch (value) {
			case TDMA_VALUE: return TDMA;
			case CDMA_VALUE: return CDMA;
			case OTHER_MAC_LAYER_VALUE: return OTHER_MAC_LAYER;
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
	private MacLayerKind(int value, String name, String literal) {
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
	
} //MacLayerKind
