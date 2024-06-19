/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localcloud Design Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.LocalcloudDesignDescription#getLC_workflow <em>LC workflow</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalcloudDesignDescription#getLC_orchestration <em>LC orchestration</em>}</li>
 *   <li>{@link ArrowheadDSL.LocalcloudDesignDescription#getSystemoflocaclouddesigndescription <em>Systemoflocaclouddesigndescription</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudDesignDescription()
 * @model
 * @generated
 */
public interface LocalcloudDesignDescription extends LocalCloudDesign {
	/**
	 * Returns the value of the '<em><b>LC workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LC workflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LC workflow</em>' attribute.
	 * @see #setLC_workflow(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudDesignDescription_LC_workflow()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLC_workflow();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.LocalcloudDesignDescription#getLC_workflow <em>LC workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LC workflow</em>' attribute.
	 * @see #getLC_workflow()
	 * @generated
	 */
	void setLC_workflow(String value);

	/**
	 * Returns the value of the '<em><b>LC orchestration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LC orchestration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LC orchestration</em>' attribute.
	 * @see #setLC_orchestration(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudDesignDescription_LC_orchestration()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLC_orchestration();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.LocalcloudDesignDescription#getLC_orchestration <em>LC orchestration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LC orchestration</em>' attribute.
	 * @see #getLC_orchestration()
	 * @generated
	 */
	void setLC_orchestration(String value);

	/**
	 * Returns the value of the '<em><b>Systemoflocaclouddesigndescription</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.System_of_LocacloudsDesignDescription}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.System_of_LocacloudsDesignDescription#getLocalclouddesigndescription <em>Localclouddesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemoflocaclouddesigndescription</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemoflocaclouddesigndescription</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getLocalcloudDesignDescription_Systemoflocaclouddesigndescription()
	 * @see ArrowheadDSL.System_of_LocacloudsDesignDescription#getLocalclouddesigndescription
	 * @model opposite="localclouddesigndescription" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='system-of-locaclouddesigndescription'"
	 * @generated
	 */
	EList<System_of_LocacloudsDesignDescription> getSystemoflocaclouddesigndescription();

} // LocalcloudDesignDescription
