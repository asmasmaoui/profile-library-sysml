/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arrowhead Certificate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadCertificateKind()
 * @model
 * @generated
 */
public enum ArrowheadCertificateKind implements Enumerator {
	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(0, "Device", "Device"), /**
	 * The '<em><b>Application System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SYSTEM(1, "ApplicationSystem", "ApplicationSystem"),

	/**
	 * The '<em><b>Core System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_SYSTEM(2, "CoreSystem", "CoreSystem"),

	/**
	 * The '<em><b>Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGEMENT(3, "Management", "Management"),

	/**
	 * The '<em><b>Inter Cloud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTER_CLOUD_VALUE
	 * @generated
	 * @ordered
	 */
	INTER_CLOUD(4, "InterCloud", "InterCloud"),

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
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model name="Device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 0;

	/**
	 * The '<em><b>Application System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SYSTEM
	 * @model name="ApplicationSystem"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SYSTEM_VALUE = 1;

	/**
	 * The '<em><b>Core System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_SYSTEM
	 * @model name="CoreSystem"
	 * @generated
	 * @ordered
	 */
	public static final int CORE_SYSTEM_VALUE = 2;

	/**
	 * The '<em><b>Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT
	 * @model name="Management"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGEMENT_VALUE = 3;

	/**
	 * The '<em><b>Inter Cloud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTER_CLOUD
	 * @model name="InterCloud"
	 * @generated
	 * @ordered
	 */
	public static final int INTER_CLOUD_VALUE = 4;

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
	 * An array of all the '<em><b>Arrowhead Certificate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArrowheadCertificateKind[] VALUES_ARRAY =
		new ArrowheadCertificateKind[] {
			DEVICE,
			APPLICATION_SYSTEM,
			CORE_SYSTEM,
			MANAGEMENT,
			INTER_CLOUD,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Arrowhead Certificate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArrowheadCertificateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arrowhead Certificate Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowheadCertificateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrowheadCertificateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrowhead Certificate Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowheadCertificateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrowheadCertificateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrowhead Certificate Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArrowheadCertificateKind get(int value) {
		switch (value) {
			case DEVICE_VALUE: return DEVICE;
			case APPLICATION_SYSTEM_VALUE: return APPLICATION_SYSTEM;
			case CORE_SYSTEM_VALUE: return CORE_SYSTEM;
			case MANAGEMENT_VALUE: return MANAGEMENT;
			case INTER_CLOUD_VALUE: return INTER_CLOUD;
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
	private ArrowheadCertificateKind(int value, String name, String literal) {
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
	
} //ArrowheadCertificateKind
