/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ServiceInterfaces: add more if required. Define Method name and parameters
 *  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.SD#getMicroserviceName <em>Microservice Name</em>}</li>
 *   <li>{@link ArrowheadDSL.SD#getSysd <em>Sysd</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getSD()
 * @model
 * @generated
 */
public interface SD extends Block {
	/**
	 * Returns the value of the '<em><b>Microservice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microservice Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice Name</em>' attribute.
	 * @see #setMicroserviceName(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSD_MicroserviceName()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMicroserviceName();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.SD#getMicroserviceName <em>Microservice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice Name</em>' attribute.
	 * @see #getMicroserviceName()
	 * @generated
	 */
	void setMicroserviceName(String value);

	/**
	 * Returns the value of the '<em><b>Sysd</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.SysD}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.SysD#getSd <em>Sd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sysd</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sysd</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSD_Sysd()
	 * @see ArrowheadDSL.SysD#getSd
	 * @model opposite="sd" ordered="false"
	 * @generated
	 */
	EList<SysD> getSysd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Operation();

} // SD