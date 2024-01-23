/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HTTP2 Frame Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getHTTP2FrameKind()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HTTP/2FrameKind'"
 * @generated
 */
public enum HTTP2FrameKind implements Enumerator {
	/**
	 * The '<em><b>Other HTTP2 Frame</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_HTTP2_FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_HTTP2_FRAME(0, "OtherHTTP2Frame", "OtherHTTP2Frame"),

	/**
	 * The '<em><b>HEADERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADERS_VALUE
	 * @generated
	 * @ordered
	 */
	HEADERS(1, "HEADERS", "HEADERS"),

	/**
	 * The '<em><b>DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(2, "DATA", "DATA"),

	/**
	 * The '<em><b>PRIORITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIORITY(3, "PRIORITY", "PRIORITY"),

	/**
	 * The '<em><b>RST STREAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RST_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	RST_STREAM(4, "RST_STREAM", "RST_STREAM"),

	/**
	 * The '<em><b>SETTINGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETTINGS_VALUE
	 * @generated
	 * @ordered
	 */
	SETTINGS(5, "SETTINGS", "SETTINGS"),

	/**
	 * The '<em><b>PUSH PROMISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_PROMISE_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH_PROMISE(6, "PUSH_PROMISE", "PUSH_PROMISE"),

	/**
	 * The '<em><b>PING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PING_VALUE
	 * @generated
	 * @ordered
	 */
	PING(7, "PING", "PING"),

	/**
	 * The '<em><b>GOAWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAWAY_VALUE
	 * @generated
	 * @ordered
	 */
	GOAWAY(8, "GOAWAY", "GOAWAY"),

	/**
	 * The '<em><b>WINDOW UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOW_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOW_UPDATE(9, "WINDOW_UPDATE", "WINDOW_UPDATE"),

	/**
	 * The '<em><b>CONTINUATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUATION(10, "CONTINUATION", "CONTINUATION");

	/**
	 * The '<em><b>Other HTTP2 Frame</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_HTTP2_FRAME
	 * @model name="OtherHTTP2Frame"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_HTTP2_FRAME_VALUE = 0;

	/**
	 * The '<em><b>HEADERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEADERS_VALUE = 1;

	/**
	 * The '<em><b>DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 2;

	/**
	 * The '<em><b>PRIORITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY_VALUE = 3;

	/**
	 * The '<em><b>RST STREAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RST_STREAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RST_STREAM_VALUE = 4;

	/**
	 * The '<em><b>SETTINGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETTINGS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SETTINGS_VALUE = 5;

	/**
	 * The '<em><b>PUSH PROMISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_PROMISE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_PROMISE_VALUE = 6;

	/**
	 * The '<em><b>PING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PING_VALUE = 7;

	/**
	 * The '<em><b>GOAWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOAWAY_VALUE = 8;

	/**
	 * The '<em><b>WINDOW UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOW_UPDATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINDOW_UPDATE_VALUE = 9;

	/**
	 * The '<em><b>CONTINUATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUATION_VALUE = 10;

	/**
	 * An array of all the '<em><b>HTTP2 Frame Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HTTP2FrameKind[] VALUES_ARRAY =
		new HTTP2FrameKind[] {
			OTHER_HTTP2_FRAME,
			HEADERS,
			DATA,
			PRIORITY,
			RST_STREAM,
			SETTINGS,
			PUSH_PROMISE,
			PING,
			GOAWAY,
			WINDOW_UPDATE,
			CONTINUATION,
		};

	/**
	 * A public read-only list of all the '<em><b>HTTP2 Frame Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HTTP2FrameKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HTTP2 Frame Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTP2FrameKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTTP2FrameKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTTP2 Frame Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTP2FrameKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTTP2FrameKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTTP2 Frame Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTP2FrameKind get(int value) {
		switch (value) {
			case OTHER_HTTP2_FRAME_VALUE: return OTHER_HTTP2_FRAME;
			case HEADERS_VALUE: return HEADERS;
			case DATA_VALUE: return DATA;
			case PRIORITY_VALUE: return PRIORITY;
			case RST_STREAM_VALUE: return RST_STREAM;
			case SETTINGS_VALUE: return SETTINGS;
			case PUSH_PROMISE_VALUE: return PUSH_PROMISE;
			case PING_VALUE: return PING;
			case GOAWAY_VALUE: return GOAWAY;
			case WINDOW_UPDATE_VALUE: return WINDOW_UPDATE;
			case CONTINUATION_VALUE: return CONTINUATION;
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
	private HTTP2FrameKind(int value, String name, String literal) {
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
	
} //HTTP2FrameKind
