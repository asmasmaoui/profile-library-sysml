/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MQTT311 Message Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getMQTT311MessageTypeKind()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MQTT3.1.1-MessageTypeKind'"
 * @generated
 */
public enum MQTT311MessageTypeKind implements Enumerator {
	/**
	 * The '<em><b>CONNACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNACK_VALUE
	 * @generated
	 * @ordered
	 */
	CONNACK(0, "CONNACK", "CONNACK"),

	/**
	 * The '<em><b>CONNECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT(1, "CONNECT", "CONNECT"),

	/**
	 * The '<em><b>DISCONNECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCONNECT(2, "DISCONNECT", "DISCONNECT"),

	/**
	 * The '<em><b>PINGREQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINGREQ_VALUE
	 * @generated
	 * @ordered
	 */
	PINGREQ(3, "PINGREQ", "PINGREQ"),

	/**
	 * The '<em><b>PINGRESP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINGRESP_VALUE
	 * @generated
	 * @ordered
	 */
	PINGRESP(4, "PINGRESP", "PINGRESP"),

	/**
	 * The '<em><b>PUBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBACK_VALUE
	 * @generated
	 * @ordered
	 */
	PUBACK(5, "PUBACK", "PUBACK"),

	/**
	 * The '<em><b>PUBCOMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBCOMP_VALUE
	 * @generated
	 * @ordered
	 */
	PUBCOMP(6, "PUBCOMP", "PUBCOMP"),

	/**
	 * The '<em><b>PUBLISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISH(7, "PUBLISH", "PUBLISH"),

	/**
	 * The '<em><b>PUBREC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBREC_VALUE
	 * @generated
	 * @ordered
	 */
	PUBREC(8, "PUBREC", "PUBREC"),

	/**
	 * The '<em><b>PUBREL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBREL_VALUE
	 * @generated
	 * @ordered
	 */
	PUBREL(9, "PUBREL", "PUBREL"),

	/**
	 * The '<em><b>SUBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBACK_VALUE
	 * @generated
	 * @ordered
	 */
	SUBACK(10, "SUBACK", "SUBACK"),

	/**
	 * The '<em><b>SUBSCRIBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIBE(11, "SUBSCRIBE", "SUBSCRIBE"),

	/**
	 * The '<em><b>UNSUBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBACK_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUBACK(12, "UNSUBACK", "UNSUBACK"),

	/**
	 * The '<em><b>UNSUBSCRIBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUBSCRIBE(13, "UNSUBSCRIBE", "UNSUBSCRIBE");

	/**
	 * The '<em><b>CONNACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNACK_VALUE = 0;

	/**
	 * The '<em><b>CONNECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_VALUE = 1;

	/**
	 * The '<em><b>DISCONNECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONNECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECT_VALUE = 2;

	/**
	 * The '<em><b>PINGREQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINGREQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PINGREQ_VALUE = 3;

	/**
	 * The '<em><b>PINGRESP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINGRESP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PINGRESP_VALUE = 4;

	/**
	 * The '<em><b>PUBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBACK_VALUE = 5;

	/**
	 * The '<em><b>PUBCOMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBCOMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBCOMP_VALUE = 6;

	/**
	 * The '<em><b>PUBLISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISH_VALUE = 7;

	/**
	 * The '<em><b>PUBREC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBREC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBREC_VALUE = 8;

	/**
	 * The '<em><b>PUBREL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBREL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBREL_VALUE = 9;

	/**
	 * The '<em><b>SUBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBACK_VALUE = 10;

	/**
	 * The '<em><b>SUBSCRIBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIBE_VALUE = 11;

	/**
	 * The '<em><b>UNSUBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUBACK_VALUE = 12;

	/**
	 * The '<em><b>UNSUBSCRIBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUBSCRIBE_VALUE = 13;

	/**
	 * An array of all the '<em><b>MQTT311 Message Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MQTT311MessageTypeKind[] VALUES_ARRAY =
		new MQTT311MessageTypeKind[] {
			CONNACK,
			CONNECT,
			DISCONNECT,
			PINGREQ,
			PINGRESP,
			PUBACK,
			PUBCOMP,
			PUBLISH,
			PUBREC,
			PUBREL,
			SUBACK,
			SUBSCRIBE,
			UNSUBACK,
			UNSUBSCRIBE,
		};

	/**
	 * A public read-only list of all the '<em><b>MQTT311 Message Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MQTT311MessageTypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MQTT311 Message Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MQTT311MessageTypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MQTT311MessageTypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MQTT311 Message Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MQTT311MessageTypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MQTT311MessageTypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MQTT311 Message Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MQTT311MessageTypeKind get(int value) {
		switch (value) {
			case CONNACK_VALUE: return CONNACK;
			case CONNECT_VALUE: return CONNECT;
			case DISCONNECT_VALUE: return DISCONNECT;
			case PINGREQ_VALUE: return PINGREQ;
			case PINGRESP_VALUE: return PINGRESP;
			case PUBACK_VALUE: return PUBACK;
			case PUBCOMP_VALUE: return PUBCOMP;
			case PUBLISH_VALUE: return PUBLISH;
			case PUBREC_VALUE: return PUBREC;
			case PUBREL_VALUE: return PUBREL;
			case SUBACK_VALUE: return SUBACK;
			case SUBSCRIBE_VALUE: return SUBSCRIBE;
			case UNSUBACK_VALUE: return UNSUBACK;
			case UNSUBSCRIBE_VALUE: return UNSUBSCRIBE;
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
	private MQTT311MessageTypeKind(int value, String name, String literal) {
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
	
} //MQTT311MessageTypeKind
