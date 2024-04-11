/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDD Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.IDD_Implementation#getSystemimplementation <em>Systemimplementation</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Implementation()
 * @model
 * @generated
 */
public interface IDD_Implementation extends IDD {
	/**
	 * Returns the value of the '<em><b>Systemimplementation</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.System_Implementation}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.System_Implementation#getIdd_implementation <em>Idd implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemimplementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemimplementation</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIDD_Implementation_Systemimplementation()
	 * @see ArrowheadDSL.System_Implementation#getIdd_implementation
	 * @model opposite="idd_implementation" ordered="false"
	 * @generated
	 */
	EList<System_Implementation> getSystemimplementation();

} // IDD_Implementation
