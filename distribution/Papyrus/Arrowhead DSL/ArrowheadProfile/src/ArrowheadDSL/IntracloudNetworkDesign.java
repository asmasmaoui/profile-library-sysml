/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intracloud Network Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.IntracloudNetworkDesign#getIntraNetworkDomain <em>Intra Network Domain</em>}</li>
 *   <li>{@link ArrowheadDSL.IntracloudNetworkDesign#getIntraNetworkMacLayer <em>Intra Network Mac Layer</em>}</li>
 *   <li>{@link ArrowheadDSL.IntracloudNetworkDesign#getDevicedesign <em>Devicedesign</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntracloudNetworkDesign()
 * @model
 * @generated
 */
public interface IntracloudNetworkDesign extends Block {
	/**
	 * Returns the value of the '<em><b>Intra Network Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intra Network Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intra Network Domain</em>' attribute.
	 * @see #setIntraNetworkDomain(String)
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntracloudNetworkDesign_IntraNetworkDomain()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getIntraNetworkDomain();

	/**
	 * Sets the value of the '{@link ArrowheadDSL.IntracloudNetworkDesign#getIntraNetworkDomain <em>Intra Network Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intra Network Domain</em>' attribute.
	 * @see #getIntraNetworkDomain()
	 * @generated
	 */
	void setIntraNetworkDomain(String value);

	/**
	 * Returns the value of the '<em><b>Intra Network Mac Layer</b></em>' attribute list.
	 * The list contents are of type {@link ArrowheadDSL.MacLayerKind}.
	 * The literals are from the enumeration {@link ArrowheadDSL.MacLayerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intra Network Mac Layer</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intra Network Mac Layer</em>' attribute list.
	 * @see ArrowheadDSL.MacLayerKind
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntracloudNetworkDesign_IntraNetworkMacLayer()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<MacLayerKind> getIntraNetworkMacLayer();

	/**
	 * Returns the value of the '<em><b>Devicedesign</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.DeviceDesign}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.DeviceDesign#getIntracloudnetworkdesign <em>Intracloudnetworkdesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devicedesign</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devicedesign</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntracloudNetworkDesign_Devicedesign()
	 * @see ArrowheadDSL.DeviceDesign#getIntracloudnetworkdesign
	 * @model opposite="intracloudnetworkdesign" ordered="false"
	 * @generated
	 */
	EList<DeviceDesign> getDevicedesign();

} // IntracloudNetworkDesign
