/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Format Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getTimeFormatKind()
 * @model
 * @generated
 */
public enum TimeFormatKind implements Enumerator {
	/**
	 * The '<em><b>RFC 3339</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC_3339_VALUE
	 * @generated
	 * @ordered
	 */
	RFC_3339(0, "RFC_3339", "RFC_3339"),

	/**
	 * The '<em><b>ISO 8601</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_8601_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_8601(1, "ISO_8601", "ISO_8601"),

	/**
	 * The '<em><b>Unix time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIX_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	UNIX_TIME(2, "Unix_time", "Unix_time"),

	/**
	 * The '<em><b>Other Time Format</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_TIME_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_TIME_FORMAT(3, "OtherTimeFormat", "OtherTimeFormat");

	/**
	 * The '<em><b>RFC 3339</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC_3339
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC_3339_VALUE = 0;

	/**
	 * The '<em><b>ISO 8601</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_8601
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO_8601_VALUE = 1;

	/**
	 * The '<em><b>Unix time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIX_TIME
	 * @model name="Unix_time"
	 * @generated
	 * @ordered
	 */
	public static final int UNIX_TIME_VALUE = 2;

	/**
	 * The '<em><b>Other Time Format</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_TIME_FORMAT
	 * @model name="OtherTimeFormat"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_TIME_FORMAT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Time Format Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeFormatKind[] VALUES_ARRAY =
		new TimeFormatKind[] {
			RFC_3339,
			ISO_8601,
			UNIX_TIME,
			OTHER_TIME_FORMAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Format Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeFormatKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Format Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFormatKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeFormatKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Format Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFormatKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeFormatKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Format Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFormatKind get(int value) {
		switch (value) {
			case RFC_3339_VALUE: return RFC_3339;
			case ISO_8601_VALUE: return ISO_8601;
			case UNIX_TIME_VALUE: return UNIX_TIME;
			case OTHER_TIME_FORMAT_VALUE: return OTHER_TIME_FORMAT;
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
	private TimeFormatKind(int value, String name, String literal) {
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
	
} //TimeFormatKind
