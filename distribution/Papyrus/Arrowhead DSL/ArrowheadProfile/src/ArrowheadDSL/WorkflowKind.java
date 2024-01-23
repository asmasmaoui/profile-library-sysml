/**
 */
package ArrowheadDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Workflow Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage#getWorkflowKind()
 * @model
 * @generated
 */
public enum WorkflowKind implements Enumerator {
	/**
	 * The '<em><b>BPMN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BPMN_VALUE
	 * @generated
	 * @ordered
	 */
	BPMN(0, "BPMN", "BPMN"),

	/**
	 * The '<em><b>Sys ML Statemachine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYS_ML_STATEMACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	SYS_ML_STATEMACHINE(1, "SysML_Statemachine", "SysML_Statemachine"),

	/**
	 * The '<em><b>Node Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_RED_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_RED(2, "NodeRed", "NodeRed"),

	/**
	 * The '<em><b>Other Workflow Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_WORKFLOW_LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_WORKFLOW_LANGUAGE(3, "OtherWorkflowLanguage", "OtherWorkflowLanguage"),

	/**
	 * The '<em><b>Petri Net</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PETRI_NET_VALUE
	 * @generated
	 * @ordered
	 */
	PETRI_NET(4, "PetriNet", "PetriNet");

	/**
	 * The '<em><b>BPMN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BPMN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BPMN_VALUE = 0;

	/**
	 * The '<em><b>Sys ML Statemachine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYS_ML_STATEMACHINE
	 * @model name="SysML_Statemachine"
	 * @generated
	 * @ordered
	 */
	public static final int SYS_ML_STATEMACHINE_VALUE = 1;

	/**
	 * The '<em><b>Node Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_RED
	 * @model name="NodeRed"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_RED_VALUE = 2;

	/**
	 * The '<em><b>Other Workflow Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_WORKFLOW_LANGUAGE
	 * @model name="OtherWorkflowLanguage"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_WORKFLOW_LANGUAGE_VALUE = 3;

	/**
	 * The '<em><b>Petri Net</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PETRI_NET
	 * @model name="PetriNet"
	 * @generated
	 * @ordered
	 */
	public static final int PETRI_NET_VALUE = 4;

	/**
	 * An array of all the '<em><b>Workflow Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkflowKind[] VALUES_ARRAY =
		new WorkflowKind[] {
			BPMN,
			SYS_ML_STATEMACHINE,
			NODE_RED,
			OTHER_WORKFLOW_LANGUAGE,
			PETRI_NET,
		};

	/**
	 * A public read-only list of all the '<em><b>Workflow Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WorkflowKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Workflow Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkflowKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkflowKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Workflow Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkflowKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkflowKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Workflow Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkflowKind get(int value) {
		switch (value) {
			case BPMN_VALUE: return BPMN;
			case SYS_ML_STATEMACHINE_VALUE: return SYS_ML_STATEMACHINE;
			case NODE_RED_VALUE: return NODE_RED;
			case OTHER_WORKFLOW_LANGUAGE_VALUE: return OTHER_WORKFLOW_LANGUAGE;
			case PETRI_NET_VALUE: return PETRI_NET;
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
	private WorkflowKind(int value, String name, String literal) {
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
	
} //WorkflowKind
