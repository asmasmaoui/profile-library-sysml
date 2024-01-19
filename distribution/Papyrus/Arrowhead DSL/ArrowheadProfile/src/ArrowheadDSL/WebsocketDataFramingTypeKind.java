/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Websocket Data Framing Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getWebsocketDataFramingTypeKind()
 * @model
 * @generated
 */
public enum WebsocketDataFramingTypeKind implements Enumerator {
	/**
	 * The '<em><b>Base Framing Protocol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_FRAMING_PROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	BASE_FRAMING_PROTOCOL(0, "BaseFramingProtocol", "BaseFramingProtocol"),

	/**
	 * The '<em><b>Clientto Server Masking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENTTO_SERVER_MASKING_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENTTO_SERVER_MASKING(1, "ClienttoServer_Masking", "ClienttoServer_Masking"),

	/**
	 * The '<em><b>Fragmentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAGMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	FRAGMENTATION(2, "Fragmentation", "Fragmentation"),

	/**
	 * The '<em><b>Enumeration Literal4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMERATION_LITERAL4_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMERATION_LITERAL4(3, "EnumerationLiteral4", "EnumerationLiteral4"),

	/**
	 * The '<em><b>Control Frames</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_FRAMES_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_FRAMES(4, "ControlFrames", "ControlFrames"),

	/**
	 * The '<em><b>Data Frames</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_FRAMES_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_FRAMES(5, "DataFrames", "DataFrames");

	/**
	 * The '<em><b>Base Framing Protocol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_FRAMING_PROTOCOL
	 * @model name="BaseFramingProtocol"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_FRAMING_PROTOCOL_VALUE = 0;

	/**
	 * The '<em><b>Clientto Server Masking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENTTO_SERVER_MASKING
	 * @model name="ClienttoServer_Masking"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Client-to-Server_Masking'"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENTTO_SERVER_MASKING_VALUE = 1;

	/**
	 * The '<em><b>Fragmentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAGMENTATION
	 * @model name="Fragmentation"
	 * @generated
	 * @ordered
	 */
	public static final int FRAGMENTATION_VALUE = 2;

	/**
	 * The '<em><b>Enumeration Literal4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMERATION_LITERAL4
	 * @model name="EnumerationLiteral4"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMERATION_LITERAL4_VALUE = 3;

	/**
	 * The '<em><b>Control Frames</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_FRAMES
	 * @model name="ControlFrames"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_FRAMES_VALUE = 4;

	/**
	 * The '<em><b>Data Frames</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_FRAMES
	 * @model name="DataFrames"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_FRAMES_VALUE = 5;

	/**
	 * An array of all the '<em><b>Websocket Data Framing Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WebsocketDataFramingTypeKind[] VALUES_ARRAY =
		new WebsocketDataFramingTypeKind[] {
			BASE_FRAMING_PROTOCOL,
			CLIENTTO_SERVER_MASKING,
			FRAGMENTATION,
			ENUMERATION_LITERAL4,
			CONTROL_FRAMES,
			DATA_FRAMES,
		};

	/**
	 * A public read-only list of all the '<em><b>Websocket Data Framing Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WebsocketDataFramingTypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Websocket Data Framing Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebsocketDataFramingTypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WebsocketDataFramingTypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Websocket Data Framing Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebsocketDataFramingTypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WebsocketDataFramingTypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Websocket Data Framing Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebsocketDataFramingTypeKind get(int value) {
		switch (value) {
			case BASE_FRAMING_PROTOCOL_VALUE: return BASE_FRAMING_PROTOCOL;
			case CLIENTTO_SERVER_MASKING_VALUE: return CLIENTTO_SERVER_MASKING;
			case FRAGMENTATION_VALUE: return FRAGMENTATION;
			case ENUMERATION_LITERAL4_VALUE: return ENUMERATION_LITERAL4;
			case CONTROL_FRAMES_VALUE: return CONTROL_FRAMES;
			case DATA_FRAMES_VALUE: return DATA_FRAMES;
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
	private WebsocketDataFramingTypeKind(int value, String name, String literal) {
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
	
} //WebsocketDataFramingTypeKind
