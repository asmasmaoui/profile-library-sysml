/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Application Protocol Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getApplicationProtocolKind()
 * @model
 * @generated
 */
public enum ApplicationProtocolKind implements Enumerator {
	/**
	 * The '<em><b>Http</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP(0, "http", "http"),

	/**
	 * The '<em><b>Mqtt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_VALUE
	 * @generated
	 * @ordered
	 */
	MQTT(1, "mqtt", "mqtt"),

	/**
	 * The '<em><b>Coap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COAP_VALUE
	 * @generated
	 * @ordered
	 */
	COAP(2, "coap", "coap"),

	/**
	 * The '<em><b>Websocket</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBSOCKET_VALUE
	 * @generated
	 * @ordered
	 */
	WEBSOCKET(3, "websocket", "websocket"),

	/**
	 * The '<em><b>Other Application Protocol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_APPLICATION_PROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_APPLICATION_PROTOCOL(4, "OtherApplicationProtocol", "OtherApplicationProtocol");

	/**
	 * The '<em><b>Http</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP
	 * @model name="http"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VALUE = 0;

	/**
	 * The '<em><b>Mqtt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT
	 * @model name="mqtt"
	 * @generated
	 * @ordered
	 */
	public static final int MQTT_VALUE = 1;

	/**
	 * The '<em><b>Coap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COAP
	 * @model name="coap"
	 * @generated
	 * @ordered
	 */
	public static final int COAP_VALUE = 2;

	/**
	 * The '<em><b>Websocket</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBSOCKET
	 * @model name="websocket"
	 * @generated
	 * @ordered
	 */
	public static final int WEBSOCKET_VALUE = 3;

	/**
	 * The '<em><b>Other Application Protocol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_APPLICATION_PROTOCOL
	 * @model name="OtherApplicationProtocol"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_APPLICATION_PROTOCOL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Application Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplicationProtocolKind[] VALUES_ARRAY =
		new ApplicationProtocolKind[] {
			HTTP,
			MQTT,
			COAP,
			WEBSOCKET,
			OTHER_APPLICATION_PROTOCOL,
		};

	/**
	 * A public read-only list of all the '<em><b>Application Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApplicationProtocolKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Application Protocol Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationProtocolKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationProtocolKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Protocol Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationProtocolKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationProtocolKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Protocol Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationProtocolKind get(int value) {
		switch (value) {
			case HTTP_VALUE: return HTTP;
			case MQTT_VALUE: return MQTT;
			case COAP_VALUE: return COAP;
			case WEBSOCKET_VALUE: return WEBSOCKET;
			case OTHER_APPLICATION_PROTOCOL_VALUE: return OTHER_APPLICATION_PROTOCOL;
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
	private ApplicationProtocolKind(int value, String name, String literal) {
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
	
} //ApplicationProtocolKind
