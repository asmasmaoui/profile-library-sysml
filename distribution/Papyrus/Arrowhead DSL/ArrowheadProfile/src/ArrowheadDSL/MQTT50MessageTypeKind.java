/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MQTT50 Message Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getMQTT50MessageTypeKind()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MQTT5.0-MessageTypeKind'"
 * @generated
 */
public enum MQTT50MessageTypeKind implements Enumerator {
	/**
	 * The '<em><b>CONNECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT(0, "CONNECT", "CONNECT"),

	/**
	 * The '<em><b>DISCONNECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCONNECT(1, "DISCONNECT", "DISCONNECT"),

	/**
	 * The '<em><b>PUBLISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISH(2, "PUBLISH", "PUBLISH"),

	/**
	 * The '<em><b>CONNACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNACK_VALUE
	 * @generated
	 * @ordered
	 */
	CONNACK(3, "CONNACK", "CONNACK"),

	/**
	 * The '<em><b>PUBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBACK_VALUE
	 * @generated
	 * @ordered
	 */
	PUBACK(4, "PUBACK", "PUBACK"),

	/**
	 * The '<em><b>PUBREC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBREC_VALUE
	 * @generated
	 * @ordered
	 */
	PUBREC(5, "PUBREC", "PUBREC"),

	/**
	 * The '<em><b>PUBREL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBREL_VALUE
	 * @generated
	 * @ordered
	 */
	PUBREL(6, "PUBREL", "PUBREL"),

	/**
	 * The '<em><b>PUBCOMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBCOMP_VALUE
	 * @generated
	 * @ordered
	 */
	PUBCOMP(7, "PUBCOMP", "PUBCOMP"),

	/**
	 * The '<em><b>SUBSCRIBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIBE(8, "SUBSCRIBE", "SUBSCRIBE"),

	/**
	 * The '<em><b>SUBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBACK_VALUE
	 * @generated
	 * @ordered
	 */
	SUBACK(9, "SUBACK", "SUBACK"),

	/**
	 * The '<em><b>UNSUBSCRIBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUBSCRIBE(10, "UNSUBSCRIBE", "UNSUBSCRIBE"),

	/**
	 * The '<em><b>UNSUBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBACK_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUBACK(11, "UNSUBACK", "UNSUBACK"),

	/**
	 * The '<em><b>PINGREQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINGREQ_VALUE
	 * @generated
	 * @ordered
	 */
	PINGREQ(12, "PINGREQ", "PINGREQ"),

	/**
	 * The '<em><b>PINGRESP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINGRESP_VALUE
	 * @generated
	 * @ordered
	 */
	PINGRESP(13, "PINGRESP", "PINGRESP"),

	/**
	 * The '<em><b>AUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH(14, "AUTH", "AUTH");

	/**
	 * The '<em><b>CONNECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_VALUE = 0;

	/**
	 * The '<em><b>DISCONNECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONNECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECT_VALUE = 1;

	/**
	 * The '<em><b>PUBLISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISH_VALUE = 2;

	/**
	 * The '<em><b>CONNACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNACK_VALUE = 3;

	/**
	 * The '<em><b>PUBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBACK_VALUE = 4;

	/**
	 * The '<em><b>PUBREC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBREC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBREC_VALUE = 5;

	/**
	 * The '<em><b>PUBREL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBREL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBREL_VALUE = 6;

	/**
	 * The '<em><b>PUBCOMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBCOMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBCOMP_VALUE = 7;

	/**
	 * The '<em><b>SUBSCRIBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIBE_VALUE = 8;

	/**
	 * The '<em><b>SUBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBACK_VALUE = 9;

	/**
	 * The '<em><b>UNSUBSCRIBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUBSCRIBE_VALUE = 10;

	/**
	 * The '<em><b>UNSUBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUBACK_VALUE = 11;

	/**
	 * The '<em><b>PINGREQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINGREQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PINGREQ_VALUE = 12;

	/**
	 * The '<em><b>PINGRESP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINGRESP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PINGRESP_VALUE = 13;

	/**
	 * The '<em><b>AUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_VALUE = 14;

	/**
	 * An array of all the '<em><b>MQTT50 Message Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MQTT50MessageTypeKind[] VALUES_ARRAY =
		new MQTT50MessageTypeKind[] {
			CONNECT,
			DISCONNECT,
			PUBLISH,
			CONNACK,
			PUBACK,
			PUBREC,
			PUBREL,
			PUBCOMP,
			SUBSCRIBE,
			SUBACK,
			UNSUBSCRIBE,
			UNSUBACK,
			PINGREQ,
			PINGRESP,
			AUTH,
		};

	/**
	 * A public read-only list of all the '<em><b>MQTT50 Message Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MQTT50MessageTypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MQTT50 Message Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MQTT50MessageTypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MQTT50MessageTypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MQTT50 Message Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MQTT50MessageTypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MQTT50MessageTypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MQTT50 Message Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MQTT50MessageTypeKind get(int value) {
		switch (value) {
			case CONNECT_VALUE: return CONNECT;
			case DISCONNECT_VALUE: return DISCONNECT;
			case PUBLISH_VALUE: return PUBLISH;
			case CONNACK_VALUE: return CONNACK;
			case PUBACK_VALUE: return PUBACK;
			case PUBREC_VALUE: return PUBREC;
			case PUBREL_VALUE: return PUBREL;
			case PUBCOMP_VALUE: return PUBCOMP;
			case SUBSCRIBE_VALUE: return SUBSCRIBE;
			case SUBACK_VALUE: return SUBACK;
			case UNSUBSCRIBE_VALUE: return UNSUBSCRIBE;
			case UNSUBACK_VALUE: return UNSUBACK;
			case PINGREQ_VALUE: return PINGREQ;
			case PINGRESP_VALUE: return PINGRESP;
			case AUTH_VALUE: return AUTH;
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
	private MQTT50MessageTypeKind(int value, String name, String literal) {
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
	
} //MQTT50MessageTypeKind
