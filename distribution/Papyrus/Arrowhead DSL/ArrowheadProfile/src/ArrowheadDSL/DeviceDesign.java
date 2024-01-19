/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.DeviceDesign#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ArrowheadDSL.DeviceDesign#getIntercloudnetworkdesign <em>Intercloudnetworkdesign</em>}</li>
 *   <li>{@link ArrowheadDSL.DeviceDesign#getIntracloudnetworkdesign <em>Intracloudnetworkdesign</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesign()
 * @model
 * @generated
 */
public interface DeviceDesign extends Block {
	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesign_DeviceName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Device Name'"
	 * @generated
	 */
	EList<String> getDeviceName();

	/**
	 * Returns the value of the '<em><b>Intercloudnetworkdesign</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.IntercloudNetworkDesign}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.IntercloudNetworkDesign#getDevicedesign <em>Devicedesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercloudnetworkdesign</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercloudnetworkdesign</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesign_Intercloudnetworkdesign()
	 * @see ArrowheadDSL.IntercloudNetworkDesign#getDevicedesign
	 * @model opposite="devicedesign" ordered="false"
	 * @generated
	 */
	EList<IntercloudNetworkDesign> getIntercloudnetworkdesign();

	/**
	 * Returns the value of the '<em><b>Intracloudnetworkdesign</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.IntracloudNetworkDesign}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.IntracloudNetworkDesign#getDevicedesign <em>Devicedesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intracloudnetworkdesign</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intracloudnetworkdesign</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getDeviceDesign_Intracloudnetworkdesign()
	 * @see ArrowheadDSL.IntracloudNetworkDesign#getDevicedesign
	 * @model opposite="devicedesign" ordered="false"
	 * @generated
	 */
	EList<IntracloudNetworkDesign> getIntracloudnetworkdesign();

} // DeviceDesign
