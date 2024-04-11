/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.requirements.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.ArrowheadDSLRequirement#getArrowheadusecase <em>Arrowheadusecase</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLRequirement()
 * @model
 * @generated
 */
public interface ArrowheadDSLRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Arrowheadusecase</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.ArrowheadUseCase}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.ArrowheadUseCase#getArrowheaddslrequirement <em>Arrowheaddslrequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrowheadusecase</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrowheadusecase</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getArrowheadDSLRequirement_Arrowheadusecase()
	 * @see ArrowheadDSL.ArrowheadUseCase#getArrowheaddslrequirement
	 * @model opposite="arrowheaddslrequirement" ordered="false"
	 * @generated
	 */
	EList<ArrowheadUseCase> getArrowheadusecase();

} // ArrowheadDSLRequirement
