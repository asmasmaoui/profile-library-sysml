/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.System_Implementation#getIdd_implementation <em>Idd implementation</em>}</li>
 *   <li>{@link ArrowheadDSL.System_Implementation#getLoclacloudimplementation <em>Loclacloudimplementation</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_Implementation()
 * @model
 * @generated
 */
public interface System_Implementation extends SysDD {

	/**
	 * Returns the value of the '<em><b>Idd implementation</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.IDD_Implementation}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.IDD_Implementation#getSystemimplementation <em>Systemimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idd implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idd implementation</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_Implementation_Idd_implementation()
	 * @see ArrowheadDSL.IDD_Implementation#getSystemimplementation
	 * @model opposite="systemimplementation" ordered="false"
	 * @generated
	 */
	EList<IDD_Implementation> getIdd_implementation();

	/**
	 * Returns the value of the '<em><b>Loclacloudimplementation</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.LocalcloudImplementation}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.LocalcloudImplementation#getSystemimplementation <em>Systemimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loclacloudimplementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loclacloudimplementation</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_Implementation_Loclacloudimplementation()
	 * @see ArrowheadDSL.LocalcloudImplementation#getSystemimplementation
	 * @model opposite="systemimplementation" ordered="false"
	 * @generated
	 */
	EList<LocalcloudImplementation> getLoclacloudimplementation();
} // System_Implementation
