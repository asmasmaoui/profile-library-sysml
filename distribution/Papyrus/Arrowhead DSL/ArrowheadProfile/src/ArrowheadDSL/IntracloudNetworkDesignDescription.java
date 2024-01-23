/**
 */
package ArrowheadDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intracloud Network Design Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.IntracloudNetworkDesignDescription#getIntraNetworkRouter <em>Intra Network Router</em>}</li>
 *   <li>{@link ArrowheadDSL.IntracloudNetworkDesignDescription#getIntraNetworkRouterConfig <em>Intra Network Router Config</em>}</li>
 *   <li>{@link ArrowheadDSL.IntracloudNetworkDesignDescription#getDevicedesigndescription <em>Devicedesigndescription</em>}</li>
 * </ul>
 *
 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntracloudNetworkDesignDescription()
 * @model
 * @generated
 */
public interface IntracloudNetworkDesignDescription extends IntracloudNetworkDesign {
	/**
	 * Returns the value of the '<em><b>Intra Network Router</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intra Network Router</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intra Network Router</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntracloudNetworkDesignDescription_IntraNetworkRouter()
	 * @model unique="false" dataType="org.eclipse.uml2.types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getIntraNetworkRouter();

	/**
	 * Returns the value of the '<em><b>Intra Network Router Config</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intra Network Router Config</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intra Network Router Config</em>' attribute list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntracloudNetworkDesignDescription_IntraNetworkRouterConfig()
	 * @model unique="false" dataType="org.eclipse.uml2.types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getIntraNetworkRouterConfig();

	/**
	 * Returns the value of the '<em><b>Devicedesigndescription</b></em>' reference list.
	 * The list contents are of type {@link ArrowheadDSL.DeviceDesignDescription}.
	 * It is bidirectional and its opposite is '{@link ArrowheadDSL.DeviceDesignDescription#getIntracloudnetworkdesigndescription <em>Intracloudnetworkdesigndescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devicedesigndescription</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devicedesigndescription</em>' reference list.
	 * @see ArrowheadDSL.ArrowheadDSLPackage#getIntracloudNetworkDesignDescription_Devicedesigndescription()
	 * @see ArrowheadDSL.DeviceDesignDescription#getIntracloudnetworkdesigndescription
	 * @model opposite="intracloudnetworkdesigndescription" ordered="false"
	 * @generated
	 */
	EList<DeviceDesignDescription> getDevicedesigndescription();

} // IntracloudNetworkDesignDescription
