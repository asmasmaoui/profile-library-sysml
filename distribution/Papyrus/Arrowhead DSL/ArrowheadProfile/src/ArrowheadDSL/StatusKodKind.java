/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status Kod Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getStatusKodKind()
 * @model
 * @generated
 */
public enum StatusKodKind implements Enumerator {
	/**
	 * The '<em><b>100 Continue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_100_CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	_100_CONTINUE(0, "_100Continue", "_100Continue"),

	/**
	 * The '<em><b>101 Switchprotocol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_101_SWITCHPROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	_101_SWITCHPROTOCOL(1, "_101Switchprotocol", "_101Switchprotocol"),

	/**
	 * The '<em><b>102 Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_102_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	_102_PROCESSING(2, "_102Processing", "_102Processing"),

	/**
	 * The '<em><b>103 Early Hints</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_103_EARLY_HINTS_VALUE
	 * @generated
	 * @ordered
	 */
	_103_EARLY_HINTS(3, "_103EarlyHints", "_103EarlyHints"),

	/**
	 * The '<em><b>200OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_200OK_VALUE
	 * @generated
	 * @ordered
	 */
	_200OK(4, "_200OK", "_200OK"),

	/**
	 * The '<em><b>201 Created</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_201_CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	_201_CREATED(5, "_201Created", "_201Created"),

	/**
	 * The '<em><b>202 Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_202_ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	_202_ACCEPTED(6, "_202Accepted", "_202Accepted"),

	/**
	 * The '<em><b>203 Non Authoritative Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_203_NON_AUTHORITATIVE_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	_203_NON_AUTHORITATIVE_INFORMATION(7, "_203NonAuthoritativeInformation", "_203NonAuthoritativeInformation"),

	/**
	 * The '<em><b>204 No Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_204_NO_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	_204_NO_CONTENT(8, "_204NoContent", "_204NoContent"),

	/**
	 * The '<em><b>205 Reset Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_205_RESET_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	_205_RESET_CONTENT(9, "_205ResetContent", "_205ResetContent"),

	/**
	 * The '<em><b>206 Partial Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_206_PARTIAL_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	_206_PARTIAL_CONTENT(10, "_206PartialContent", "_206PartialContent"),

	/**
	 * The '<em><b>207 Multi Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_207_MULTI_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	_207_MULTI_STATUS(11, "_207MultiStatus", "_207MultiStatus"),

	/**
	 * The '<em><b>208 Already Reported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_208_ALREADY_REPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	_208_ALREADY_REPORTED(12, "_208AlreadyReported", "_208AlreadyReported");

	/**
	 * The '<em><b>100 Continue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_100_CONTINUE
	 * @model name="_100Continue"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='100 - Continue'"
	 * @generated
	 * @ordered
	 */
	public static final int _100_CONTINUE_VALUE = 0;

	/**
	 * The '<em><b>101 Switchprotocol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_101_SWITCHPROTOCOL
	 * @model name="_101Switchprotocol"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='101 - Switch protocol'"
	 * @generated
	 * @ordered
	 */
	public static final int _101_SWITCHPROTOCOL_VALUE = 1;

	/**
	 * The '<em><b>102 Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_102_PROCESSING
	 * @model name="_102Processing"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='102 - Processing'"
	 * @generated
	 * @ordered
	 */
	public static final int _102_PROCESSING_VALUE = 2;

	/**
	 * The '<em><b>103 Early Hints</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_103_EARLY_HINTS
	 * @model name="_103EarlyHints"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='103 - Early Hints'"
	 * @generated
	 * @ordered
	 */
	public static final int _103_EARLY_HINTS_VALUE = 3;

	/**
	 * The '<em><b>200OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_200OK
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='200 - OK'"
	 * @generated
	 * @ordered
	 */
	public static final int _200OK_VALUE = 4;

	/**
	 * The '<em><b>201 Created</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_201_CREATED
	 * @model name="_201Created"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='201 - Created'"
	 * @generated
	 * @ordered
	 */
	public static final int _201_CREATED_VALUE = 5;

	/**
	 * The '<em><b>202 Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_202_ACCEPTED
	 * @model name="_202Accepted"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='202 - Accepted'"
	 * @generated
	 * @ordered
	 */
	public static final int _202_ACCEPTED_VALUE = 6;

	/**
	 * The '<em><b>203 Non Authoritative Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_203_NON_AUTHORITATIVE_INFORMATION
	 * @model name="_203NonAuthoritativeInformation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='203 - Non-Authoritative Information'"
	 * @generated
	 * @ordered
	 */
	public static final int _203_NON_AUTHORITATIVE_INFORMATION_VALUE = 7;

	/**
	 * The '<em><b>204 No Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_204_NO_CONTENT
	 * @model name="_204NoContent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='204 - No Content'"
	 * @generated
	 * @ordered
	 */
	public static final int _204_NO_CONTENT_VALUE = 8;

	/**
	 * The '<em><b>205 Reset Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_205_RESET_CONTENT
	 * @model name="_205ResetContent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='205 - Reset Content'"
	 * @generated
	 * @ordered
	 */
	public static final int _205_RESET_CONTENT_VALUE = 9;

	/**
	 * The '<em><b>206 Partial Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_206_PARTIAL_CONTENT
	 * @model name="_206PartialContent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='206 - Partial Content'"
	 * @generated
	 * @ordered
	 */
	public static final int _206_PARTIAL_CONTENT_VALUE = 10;

	/**
	 * The '<em><b>207 Multi Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_207_MULTI_STATUS
	 * @model name="_207MultiStatus"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='207 - Multi-Status'"
	 * @generated
	 * @ordered
	 */
	public static final int _207_MULTI_STATUS_VALUE = 11;

	/**
	 * The '<em><b>208 Already Reported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_208_ALREADY_REPORTED
	 * @model name="_208AlreadyReported"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='208 - Already Reported'"
	 * @generated
	 * @ordered
	 */
	public static final int _208_ALREADY_REPORTED_VALUE = 12;

	/**
	 * An array of all the '<em><b>Status Kod Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatusKodKind[] VALUES_ARRAY =
		new StatusKodKind[] {
			_100_CONTINUE,
			_101_SWITCHPROTOCOL,
			_102_PROCESSING,
			_103_EARLY_HINTS,
			_200OK,
			_201_CREATED,
			_202_ACCEPTED,
			_203_NON_AUTHORITATIVE_INFORMATION,
			_204_NO_CONTENT,
			_205_RESET_CONTENT,
			_206_PARTIAL_CONTENT,
			_207_MULTI_STATUS,
			_208_ALREADY_REPORTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Status Kod Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatusKodKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Kod Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusKodKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusKodKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Kod Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusKodKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusKodKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Kod Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusKodKind get(int value) {
		switch (value) {
			case _100_CONTINUE_VALUE: return _100_CONTINUE;
			case _101_SWITCHPROTOCOL_VALUE: return _101_SWITCHPROTOCOL;
			case _102_PROCESSING_VALUE: return _102_PROCESSING;
			case _103_EARLY_HINTS_VALUE: return _103_EARLY_HINTS;
			case _200OK_VALUE: return _200OK;
			case _201_CREATED_VALUE: return _201_CREATED;
			case _202_ACCEPTED_VALUE: return _202_ACCEPTED;
			case _203_NON_AUTHORITATIVE_INFORMATION_VALUE: return _203_NON_AUTHORITATIVE_INFORMATION;
			case _204_NO_CONTENT_VALUE: return _204_NO_CONTENT;
			case _205_RESET_CONTENT_VALUE: return _205_RESET_CONTENT;
			case _206_PARTIAL_CONTENT_VALUE: return _206_PARTIAL_CONTENT;
			case _207_MULTI_STATUS_VALUE: return _207_MULTI_STATUS;
			case _208_ALREADY_REPORTED_VALUE: return _208_ALREADY_REPORTED;
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
	private StatusKodKind(int value, String name, String literal) {
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
	
} //StatusKodKind
