/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Design Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.DeviceDesignDescription#getIOports <em>IOports</em>}</li>
 *   <li>{@link ArrowheadDSL.DeviceDesignDescription#getMemory <em>Memory</em>}</li>
 *   <li>{@link ArrowheadDSL.DeviceDesignDescription#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ArrowheadDSL.DeviceDesignDescription#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link ArrowheadDSL.DeviceDesignDescription#getArrowheadCertificate <em>Arrowhead Certificate</em>}</li>
 *   <li>{@link ArrowheadDSL.DeviceDesignDescription#getIntercloudnetworkdesigndescription <em>Intercloudnetworkdesigndescription</em>}</li>
 *   <li>{@link ArrowheadDSL.DeviceDesignDescription#getIntracloudnetworkdesigndescription <em>Intracloudnetworkdesigndescription</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription()
 * @model
 * @generated
 */
public interface DeviceDesignDescription extends DeviceDesign {
	/**
	 * Returns the value of the '<em><b>IOports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IOports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IOports</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription_IOports()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='I/O ports'"
	 * @generated
	 */
	EList<String> getIOports();

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription_Memory()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getMemory();

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription_Processor()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getProcessor();

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.OSKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute.
	 * @see ArrowheadDSL.OSKind
	 * @see #setOperatingSystem(OSKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription_OperatingSystem()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OSKind getOperatingSystem();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.DeviceDesignDescription#getOperatingSystem <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' attribute.
	 * @see ArrowheadDSL.OSKind
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(OSKind value);

	/**
	 * Returns the value of the '<em><b>Arrowhead Certificate</b></em>' attribute.
	 * The literals are from the enumeration {@link ArrowheadDSL.ArrowheadCertificateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrowhead Certificate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrowhead Certificate</em>' attribute.
	 * @see ArrowheadDSL.ArrowheadCertificateKind
	 * @see #setArrowheadCertificate(ArrowheadCertificateKind)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription_ArrowheadCertificate()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ArrowheadCertificateKind getArrowheadCertificate();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.DeviceDesignDescription#getArrowheadCertificate <em>Arrowhead Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrowhead Certificate</em>' attribute.
	 * @see ArrowheadDSL.ArrowheadCertificateKind
	 * @see #getArrowheadCertificate()
	 * @generated
	 */
	void setArrowheadCertificate(ArrowheadCertificateKind value);

	/**
	 * Returns the value of the '<em><b>Intercloudnetworkdesigndescription</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.IntercloudNetworkDesignDescription}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.IntercloudNetworkDesignDescription#getDevicedesigndescription <em>Devicedesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercloudnetworkdesigndescription</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercloudnetworkdesigndescription</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription_Intercloudnetworkdesigndescription()
	 * @see ArrowheadDSL.IntercloudNetworkDesignDescription#getDevicedesigndescription
	 * @model opposite="devicedesigndescription" ordered="false"
	 * @generated
	 */
	EList<IntercloudNetworkDesignDescription> getIntercloudnetworkdesigndescription();

	/**
	 * Returns the value of the '<em><b>Intracloudnetworkdesigndescription</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.IntracloudNetworkDesignDescription}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.IntracloudNetworkDesignDescription#getDevicedesigndescription <em>Devicedesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intracloudnetworkdesigndescription</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intracloudnetworkdesigndescription</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription_Intracloudnetworkdesigndescription()
	 * @see ArrowheadDSL.IntracloudNetworkDesignDescription#getDevicedesigndescription
	 * @model opposite="devicedesigndescription" ordered="false"
	 * @generated
	 */
	EList<IntracloudNetworkDesignDescription> getIntracloudnetworkdesigndescription();

} // DeviceDesignDescription
