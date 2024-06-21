/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Datamodel Standard Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getDatamodelStandardKind()
 * @model
 * @generated
 */
public enum DatamodelStandardKind implements Enumerator {
	/**
	 * The '<em><b>ISO 10303</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_10303_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_10303(0, "ISO_10303", "ISO_10303"), /**
	 * The '<em><b>Other Datamodel Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_DATAMODEL_STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_DATAMODEL_STANDARD(1, "OtherDatamodelStandard", "OtherDatamodelStandard"), /**
	 * The '<em><b>ISO 15926</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_15926_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_15926(2, "ISO_15926", "ISO_15926"), /**
	 * The '<em><b>Sen ML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEN_ML_VALUE
	 * @generated
	 * @ordered
	 */
	SEN_ML(3, "SenML", "SenML"), /**
	 * The '<em><b>ISO 12006</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_12006_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_12006(4, "ISO_12006", "ISO_12006"), /**
	 * The '<em><b>IEC 81346</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_81346_VALUE
	 * @generated
	 * @ordered
	 */
	IEC_81346(5, "IEC_81346", "IEC_81346"), /**
	 * The '<em><b>ISO 15739 IFC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_15739_IFC_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_15739_IFC(6, "ISO_15739_IFC", "ISO_15739_IFC"), /**
	 * The '<em><b>IEC 61850</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_61850_VALUE
	 * @generated
	 * @ordered
	 */
	IEC_61850(7, "IEC_61850", "IEC_61850");

	/**
	 * The '<em><b>ISO 10303</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_10303
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO_10303_VALUE = 0;

	/**
	 * The '<em><b>Other Datamodel Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_DATAMODEL_STANDARD
	 * @model name="OtherDatamodelStandard"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_DATAMODEL_STANDARD_VALUE = 1;

	/**
	 * The '<em><b>ISO 15926</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_15926
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO_15926_VALUE = 2;

	/**
	 * The '<em><b>Sen ML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEN_ML
	 * @model name="SenML"
	 * @generated
	 * @ordered
	 */
	public static final int SEN_ML_VALUE = 3;

	/**
	 * The '<em><b>ISO 12006</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_12006
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO_12006_VALUE = 4;

	/**
	 * The '<em><b>IEC 81346</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_81346
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEC_81346_VALUE = 5;

	/**
	 * The '<em><b>ISO 15739 IFC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_15739_IFC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO_15739_IFC_VALUE = 6;

	/**
	 * The '<em><b>IEC 61850</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEC_61850
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEC_61850_VALUE = 7;

	/**
	 * An array of all the '<em><b>Datamodel Standard Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatamodelStandardKind[] VALUES_ARRAY =
		new DatamodelStandardKind[] {
			ISO_10303,
			OTHER_DATAMODEL_STANDARD,
			ISO_15926,
			SEN_ML,
			ISO_12006,
			IEC_81346,
			ISO_15739_IFC,
			IEC_61850,
		};

	/**
	 * A public read-only list of all the '<em><b>Datamodel Standard Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatamodelStandardKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Datamodel Standard Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatamodelStandardKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatamodelStandardKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datamodel Standard Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatamodelStandardKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatamodelStandardKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datamodel Standard Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatamodelStandardKind get(int value) {
		switch (value) {
			case ISO_10303_VALUE: return ISO_10303;
			case OTHER_DATAMODEL_STANDARD_VALUE: return OTHER_DATAMODEL_STANDARD;
			case ISO_15926_VALUE: return ISO_15926;
			case SEN_ML_VALUE: return SEN_ML;
			case ISO_12006_VALUE: return ISO_12006;
			case IEC_81346_VALUE: return IEC_81346;
			case ISO_15739_IFC_VALUE: return ISO_15739_IFC;
			case IEC_61850_VALUE: return IEC_61850;
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
	private DatamodelStandardKind(int value, String name, String literal) {
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
	
} //DatamodelStandardKind
