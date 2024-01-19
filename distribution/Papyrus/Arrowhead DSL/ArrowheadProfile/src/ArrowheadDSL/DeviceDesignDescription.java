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
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesignDescription()
 * @model
 * @generated
 */
public interface DeviceDesignDescription extends IntercloudNetworkDesignDescription, IntracloudNetworkDesignDescription, DeviceDesign {
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

} // DeviceDesignDescription
