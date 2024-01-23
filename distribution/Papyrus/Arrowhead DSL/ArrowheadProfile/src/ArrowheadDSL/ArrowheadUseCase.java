/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrowhead Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.ArrowheadUseCase#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link ArrowheadDSL.ArrowheadUseCase#getArrowheaddslrequirement <em>Arrowheaddslrequirement</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadUseCase()
 * @model
 * @generated
 */
public interface ArrowheadUseCase extends EObject {

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadUseCase_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.ArrowheadUseCase#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Arrowheaddslrequirement</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.ArrowheadDSLRequirement}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.ArrowheadDSLRequirement#getArrowheadusecase <em>Arrowheadusecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrowheaddslrequirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrowheaddslrequirement</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadUseCase_Arrowheaddslrequirement()
	 * @see ArrowheadDSL.ArrowheadDSLRequirement#getArrowheadusecase
	 * @model opposite="arrowheadusecase" ordered="false"
	 * @generated
	 */
	EList<ArrowheadDSLRequirement> getArrowheaddslrequirement();
} // ArrowheadUseCase
