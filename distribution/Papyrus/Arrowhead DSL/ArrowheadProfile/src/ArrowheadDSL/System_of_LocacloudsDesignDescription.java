/**
 */
package ArrowheadDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System of Locaclouds Design Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.System_of_LocacloudsDesignDescription#getSoLC_Orchestration <em>So LC Orchestration</em>}</li>
 *   <li>{@link ArrowheadDSL.System_of_LocacloudsDesignDescription#getSoLC_Workflow <em>So LC Workflow</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocacloudsDesignDescription()
 * @model
 * @generated
 */
public interface System_of_LocacloudsDesignDescription extends System_of_LocalcloudsDesign {
	/**
	 * Returns the value of the '<em><b>So LC Orchestration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>So LC Orchestration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So LC Orchestration</em>' attribute.
	 * @see #setSoLC_Orchestration(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocacloudsDesignDescription_SoLC_Orchestration()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSoLC_Orchestration();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.System_of_LocacloudsDesignDescription#getSoLC_Orchestration <em>So LC Orchestration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So LC Orchestration</em>' attribute.
	 * @see #getSoLC_Orchestration()
	 * @generated
	 */
	void setSoLC_Orchestration(String value);

	/**
	 * Returns the value of the '<em><b>So LC Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>So LC Workflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So LC Workflow</em>' attribute.
	 * @see #setSoLC_Workflow(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getSystem_of_LocacloudsDesignDescription_SoLC_Workflow()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSoLC_Workflow();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.System_of_LocacloudsDesignDescription#getSoLC_Workflow <em>So LC Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So LC Workflow</em>' attribute.
	 * @see #getSoLC_Workflow()
	 * @generated
	 */
	void setSoLC_Workflow(String value);

} // System_of_LocacloudsDesignDescription
