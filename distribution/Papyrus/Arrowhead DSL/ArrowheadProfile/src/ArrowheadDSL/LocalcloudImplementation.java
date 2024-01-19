/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localcloud Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.LocalcloudImplementation#getLC_Documentation <em>LC Documentation</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalcloudImplementation#getSystemimplementation <em>Systemimplementation</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalcloudImplementation#getSystem_of_localcloudsimplementation <em>System of localcloudsimplementation</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudImplementation()
 * @model
 * @generated
 */
public interface LocalcloudImplementation extends LocalcloudDesignDescription {
	/**
	 * Returns the value of the '<em><b>LC Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LC Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LC Documentation</em>' attribute.
	 * @see #setLC_Documentation(int)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudImplementation_LC_Documentation()
	 * @model dataType="org.eclipse.uml2.types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	int getLC_Documentation();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.LocalcloudImplementation#getLC_Documentation <em>LC Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LC Documentation</em>' attribute.
	 * @see #getLC_Documentation()
	 * @generated
	 */
	void setLC_Documentation(int value);

	/**
	 * Returns the value of the '<em><b>Systemimplementation</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.System_Implementation}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.System_Implementation#getLoclacloudimplementation <em>Loclacloudimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemimplementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemimplementation</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudImplementation_Systemimplementation()
	 * @see ArrowheadDSL.System_Implementation#getLoclacloudimplementation
	 * @model opposite="loclacloudimplementation" ordered="false"
	 * @generated
	 */
	EList<System_Implementation> getSystemimplementation();

	/**
	 * Returns the value of the '<em><b>System of localcloudsimplementation</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.System_of_LocalcloudsImplementation}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.System_of_LocalcloudsImplementation#getLocalcloudimplementation <em>Localcloudimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System of localcloudsimplementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System of localcloudsimplementation</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudImplementation_System_of_localcloudsimplementation()
	 * @see ArrowheadDSL.System_of_LocalcloudsImplementation#getLocalcloudimplementation
	 * @model opposite="localcloudimplementation" ordered="false"
	 * @generated
	 */
	EList<System_of_LocalcloudsImplementation> getSystem_of_localcloudsimplementation();

} // LocalcloudImplementation
