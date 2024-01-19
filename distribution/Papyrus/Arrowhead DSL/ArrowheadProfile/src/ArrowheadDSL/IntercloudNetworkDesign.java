/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intercloud Network Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.IntercloudNetworkDesign#getInterNetworkDomainName <em>Inter Network Domain Name</em>}</li>
 *   <li>{@link ArrowheadDSL.IntercloudNetworkDesign#getInterNetworkMacLayer <em>Inter Network Mac Layer</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntercloudNetworkDesign()
 * @model
 * @generated
 */
public interface IntercloudNetworkDesign extends Block {
	/**
	 * Returns the value of the '<em><b>Inter Network Domain Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Network Domain Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Network Domain Name</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntercloudNetworkDesign_InterNetworkDomainName()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getInterNetworkDomainName();

	/**
	 * Returns the value of the '<em><b>Inter Network Mac Layer</b></em>' attribute list.
	 * The list contents are of type {@link ArrowheadDSL.MacLayerKind}.
	 * The literals are from the enumeration {@link ArrowheadDSL.MacLayerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Network Mac Layer</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Network Mac Layer</em>' attribute list.
	 * @see ArrowheadDSL.MacLayerKind
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntercloudNetworkDesign_InterNetworkMacLayer()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<MacLayerKind> getInterNetworkMacLayer();

} // IntercloudNetworkDesign
