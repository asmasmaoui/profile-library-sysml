/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intercloud Network Design Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.IntercloudNetworkDesignDescription#getInterNetworkRouter <em>Inter Network Router</em>}</li>
 *   <li>{@link ArrowheadDSL.IntercloudNetworkDesignDescription#getInterNetworkRouterConfig <em>Inter Network Router Config</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntercloudNetworkDesignDescription()
 * @model
 * @generated
 */
public interface IntercloudNetworkDesignDescription extends IntercloudNetworkDesign {
	/**
	 * Returns the value of the '<em><b>Inter Network Router</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Network Router</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Network Router</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntercloudNetworkDesignDescription_InterNetworkRouter()
	 * @model unique="false" dataType="org.eclipse.uml2.types.UnlimitedNatural" ordered="false"
	 * @generated
	 */
	EList<Integer> getInterNetworkRouter();

	/**
	 * Returns the value of the '<em><b>Inter Network Router Config</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Network Router Config</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Network Router Config</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntercloudNetworkDesignDescription_InterNetworkRouterConfig()
	 * @model unique="false" dataType="org.eclipse.uml2.types.UnlimitedNatural" ordered="false"
	 * @generated
	 */
	EList<Integer> getInterNetworkRouterConfig();

} // IntercloudNetworkDesignDescription
