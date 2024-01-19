/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HTTP 11 Method Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getHTTP_11_MethodKind()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HTTP_1.1_MethodKind'"
 * @generated
 */
public enum HTTP_11_MethodKind implements Enumerator {
	/**
	 * The '<em><b>POST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_VALUE
	 * @generated
	 * @ordered
	 */
	POST(0, "POST", "POST"),

	/**
	 * The '<em><b>GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_VALUE
	 * @generated
	 * @ordered
	 */
	GET(1, "GET", "GET"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(2, "DELETE", "DELETE"),

	/**
	 * The '<em><b>PUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUT_VALUE
	 * @generated
	 * @ordered
	 */
	PUT(3, "PUT", "PUT"),

	/**
	 * The '<em><b>HEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD(4, "HEAD", "HEAD"),

	/**
	 * The '<em><b>Other HTTP Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_HTTP_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_HTTP_METHOD(5, "OtherHTTPMethod", "OtherHTTPMethod"),

	/**
	 * The '<em><b>CONNECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT(6, "CONNECT", "CONNECT"),

	/**
	 * The '<em><b>OPTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONS(7, "OPTIONS", "OPTIONS"),

	/**
	 * The '<em><b>TRACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE(8, "TRACE", "TRACE");

	/**
	 * The '<em><b>POST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST_VALUE = 0;

	/**
	 * The '<em><b>GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_VALUE = 1;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 2;

	/**
	 * The '<em><b>PUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUT_VALUE = 3;

	/**
	 * The '<em><b>HEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_VALUE = 4;

	/**
	 * The '<em><b>Other HTTP Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_HTTP_METHOD
	 * @model name="OtherHTTPMethod"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_HTTP_METHOD_VALUE = 5;

	/**
	 * The '<em><b>CONNECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_VALUE = 6;

	/**
	 * The '<em><b>OPTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONS_VALUE = 7;

	/**
	 * The '<em><b>TRACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_VALUE = 8;

	/**
	 * An array of all the '<em><b>HTTP 11 Method Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HTTP_11_MethodKind[] VALUES_ARRAY =
		new HTTP_11_MethodKind[] {
			POST,
			GET,
			DELETE,
			PUT,
			HEAD,
			OTHER_HTTP_METHOD,
			CONNECT,
			OPTIONS,
			TRACE,
		};

	/**
	 * A public read-only list of all the '<em><b>HTTP 11 Method Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HTTP_11_MethodKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HTTP 11 Method Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTP_11_MethodKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTTP_11_MethodKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTTP 11 Method Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTP_11_MethodKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTTP_11_MethodKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTTP 11 Method Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTP_11_MethodKind get(int value) {
		switch (value) {
			case POST_VALUE: return POST;
			case GET_VALUE: return GET;
			case DELETE_VALUE: return DELETE;
			case PUT_VALUE: return PUT;
			case HEAD_VALUE: return HEAD;
			case OTHER_HTTP_METHOD_VALUE: return OTHER_HTTP_METHOD;
			case CONNECT_VALUE: return CONNECT;
			case OPTIONS_VALUE: return OPTIONS;
			case TRACE_VALUE: return TRACE;
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
	private HTTP_11_MethodKind(int value, String name, String literal) {
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
	
} //HTTP_11_MethodKind
