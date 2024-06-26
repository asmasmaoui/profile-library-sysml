/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OS Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getOSKind()
 * @model
 * @generated
 */
public enum OSKind implements Enumerator {
	/**
	 * The '<em><b>Windows</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS(0, "Windows", "Windows"),

	/**
	 * The '<em><b>Mac OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC_OS_VALUE
	 * @generated
	 * @ordered
	 */
	MAC_OS(1, "MacOS", "MacOS"),

	/**
	 * The '<em><b>Linux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(2, "Linux", "Linux"),

	/**
	 * The '<em><b>Other OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_OS_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_OS(3, "OtherOS", "OtherOS"),

	/**
	 * The '<em><b>ROS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROS_VALUE
	 * @generated
	 * @ordered
	 */
	ROS(4, "ROS", "ROS");

	/**
	 * The '<em><b>Windows</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS
	 * @model name="Windows"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_VALUE = 0;

	/**
	 * The '<em><b>Mac OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC_OS
	 * @model name="MacOS"
	 * @generated
	 * @ordered
	 */
	public static final int MAC_OS_VALUE = 1;

	/**
	 * The '<em><b>Linux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model name="Linux"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 2;

	/**
	 * The '<em><b>Other OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_OS
	 * @model name="OtherOS"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_OS_VALUE = 3;

	/**
	 * The '<em><b>ROS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROS_VALUE = 4;

	/**
	 * An array of all the '<em><b>OS Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OSKind[] VALUES_ARRAY =
		new OSKind[] {
			WINDOWS,
			MAC_OS,
			LINUX,
			OTHER_OS,
			ROS,
		};

	/**
	 * A public read-only list of all the '<em><b>OS Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OSKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OS Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OSKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OS Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OSKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OS Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSKind get(int value) {
		switch (value) {
			case WINDOWS_VALUE: return WINDOWS;
			case MAC_OS_VALUE: return MAC_OS;
			case LINUX_VALUE: return LINUX;
			case OTHER_OS_VALUE: return OTHER_OS;
			case ROS_VALUE: return ROS;
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
	private OSKind(int value, String name, String literal) {
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
	
} //OSKind
