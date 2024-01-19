/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monitoring Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getMonitoringPolicyKind()
 * @model
 * @generated
 */
public enum MonitoringPolicyKind implements Enumerator {
	/**
	 * The '<em><b>ISA95</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISA95_VALUE
	 * @generated
	 * @ordered
	 */
	ISA95(0, "ISA95", "ISA95"),

	/**
	 * The '<em><b>Other Monitoring Policy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_MONITORING_POLICY_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_MONITORING_POLICY(1, "OtherMonitoringPolicy", "OtherMonitoringPolicy");

	/**
	 * The '<em><b>ISA95</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISA95
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISA95_VALUE = 0;

	/**
	 * The '<em><b>Other Monitoring Policy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_MONITORING_POLICY
	 * @model name="OtherMonitoringPolicy"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_MONITORING_POLICY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Monitoring Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonitoringPolicyKind[] VALUES_ARRAY =
		new MonitoringPolicyKind[] {
			ISA95,
			OTHER_MONITORING_POLICY,
		};

	/**
	 * A public read-only list of all the '<em><b>Monitoring Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonitoringPolicyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monitoring Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringPolicyKind get(int value) {
		switch (value) {
			case ISA95_VALUE: return ISA95;
			case OTHER_MONITORING_POLICY_VALUE: return OTHER_MONITORING_POLICY;
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
	private MonitoringPolicyKind(int value, String name, String literal) {
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
	
} //MonitoringPolicyKind
