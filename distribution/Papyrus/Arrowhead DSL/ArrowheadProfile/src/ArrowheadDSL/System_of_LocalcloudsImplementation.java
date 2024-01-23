/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System of Localclouds Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.System_of_LocalcloudsImplementation#getSoLC_Documentation <em>So LC Documentation</em>}</li>
 *   <li>{@link ArrowheadDSL.System_of_LocalcloudsImplementation#getLocalcloudimplementation <em>Localcloudimplementation</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocalcloudsImplementation()
 * @model
 * @generated
 */
public interface System_of_LocalcloudsImplementation extends System_of_LocacloudsDesignDescription {
	/**
	 * Returns the value of the '<em><b>So LC Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>So LC Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So LC Documentation</em>' attribute.
	 * @see #setSoLC_Documentation(int)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocalcloudsImplementation_SoLC_Documentation()
	 * @model dataType="org.eclipse.uml2.types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	int getSoLC_Documentation();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.System_of_LocalcloudsImplementation#getSoLC_Documentation <em>So LC Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So LC Documentation</em>' attribute.
	 * @see #getSoLC_Documentation()
	 * @generated
	 */
	void setSoLC_Documentation(int value);

	/**
	 * Returns the value of the '<em><b>Localcloudimplementation</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.LocalcloudImplementation}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.LocalcloudImplementation#getSystem_of_localcloudsimplementation <em>System of localcloudsimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localcloudimplementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localcloudimplementation</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocalcloudsImplementation_Localcloudimplementation()
	 * @see ArrowheadDSL.LocalcloudImplementation#getSystem_of_localcloudsimplementation
	 * @model opposite="system_of_localcloudsimplementation" ordered="false"
	 * @generated
	 */
	EList<LocalcloudImplementation> getLocalcloudimplementation();

} // System_of_LocalcloudsImplementation
