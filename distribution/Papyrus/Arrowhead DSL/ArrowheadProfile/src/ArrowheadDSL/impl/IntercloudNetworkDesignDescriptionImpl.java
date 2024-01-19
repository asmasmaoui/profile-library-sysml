/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.IntercloudNetworkDesignDescription;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercloud Network Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.IntercloudNetworkDesignDescriptionImpl#getInterNetworkRouter <em>Inter Network Router</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IntercloudNetworkDesignDescriptionImpl#getInterNetworkRouterConfig <em>Inter Network Router Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntercloudNetworkDesignDescriptionImpl extends IntercloudNetworkDesignImpl implements IntercloudNetworkDesignDescription {
	/**
	 * The cached value of the '{@link #getInterNetworkRouter() <em>Inter Network Router</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterNetworkRouter()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> interNetworkRouter;

	/**
	 * The cached value of the '{@link #getInterNetworkRouterConfig() <em>Inter Network Router Config</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterNetworkRouterConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> interNetworkRouterConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercloudNetworkDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getInterNetworkRouter() {
		if (interNetworkRouter == null) {
			interNetworkRouter = new EDataTypeEList<Integer>(Integer.class, this, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER);
		}
		return interNetworkRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getInterNetworkRouterConfig() {
		if (interNetworkRouterConfig == null) {
			interNetworkRouterConfig = new EDataTypeEList<Integer>(Integer.class, this, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG);
		}
		return interNetworkRouterConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER:
				return getInterNetworkRouter();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG:
				return getInterNetworkRouterConfig();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER:
				getInterNetworkRouter().clear();
				getInterNetworkRouter().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG:
				getInterNetworkRouterConfig().clear();
				getInterNetworkRouterConfig().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER:
				getInterNetworkRouter().clear();
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG:
				getInterNetworkRouterConfig().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER:
				return interNetworkRouter != null && !interNetworkRouter.isEmpty();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG:
				return interNetworkRouterConfig != null && !interNetworkRouterConfig.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (InterNetworkRouter: ");
		result.append(interNetworkRouter);
		result.append(", InterNetworkRouterConfig: ");
		result.append(interNetworkRouterConfig);
		result.append(')');
		return result.toString();
	}

} //IntercloudNetworkDesignDescriptionImpl
