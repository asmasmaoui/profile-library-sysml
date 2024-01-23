/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.DeviceDesignDescription;
import ArrowheadDSL.IntracloudNetworkDesignDescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intracloud Network Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.IntracloudNetworkDesignDescriptionImpl#getIntraNetworkRouter <em>Intra Network Router</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IntracloudNetworkDesignDescriptionImpl#getIntraNetworkRouterConfig <em>Intra Network Router Config</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IntracloudNetworkDesignDescriptionImpl#getDevicedesigndescription <em>Devicedesigndescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntracloudNetworkDesignDescriptionImpl extends IntracloudNetworkDesignImpl implements IntracloudNetworkDesignDescription {
	/**
	 * The cached value of the '{@link #getIntraNetworkRouter() <em>Intra Network Router</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntraNetworkRouter()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> intraNetworkRouter;

	/**
	 * The cached value of the '{@link #getIntraNetworkRouterConfig() <em>Intra Network Router Config</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntraNetworkRouterConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> intraNetworkRouterConfig;

	/**
	 * The cached value of the '{@link #getDevicedesigndescription() <em>Devicedesigndescription</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicedesigndescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDesignDescription> devicedesigndescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntracloudNetworkDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIntraNetworkRouter() {
		if (intraNetworkRouter == null) {
			intraNetworkRouter = new EDataTypeEList<Integer>(Integer.class, this, ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER);
		}
		return intraNetworkRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIntraNetworkRouterConfig() {
		if (intraNetworkRouterConfig == null) {
			intraNetworkRouterConfig = new EDataTypeEList<Integer>(Integer.class, this, ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG);
		}
		return intraNetworkRouterConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDesignDescription> getDevicedesigndescription() {
		if (devicedesigndescription == null) {
			devicedesigndescription = new EObjectWithInverseResolvingEList.ManyInverse<DeviceDesignDescription>(DeviceDesignDescription.class, this, ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION);
		}
		return devicedesigndescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevicedesigndescription()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
				return ((InternalEList<?>)getDevicedesigndescription()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER:
				return getIntraNetworkRouter();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG:
				return getIntraNetworkRouterConfig();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
				return getDevicedesigndescription();
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER:
				getIntraNetworkRouter().clear();
				getIntraNetworkRouter().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG:
				getIntraNetworkRouterConfig().clear();
				getIntraNetworkRouterConfig().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
				getDevicedesigndescription().clear();
				getDevicedesigndescription().addAll((Collection<? extends DeviceDesignDescription>)newValue);
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER:
				getIntraNetworkRouter().clear();
				return;
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG:
				getIntraNetworkRouterConfig().clear();
				return;
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
				getDevicedesigndescription().clear();
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER:
				return intraNetworkRouter != null && !intraNetworkRouter.isEmpty();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG:
				return intraNetworkRouterConfig != null && !intraNetworkRouterConfig.isEmpty();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
				return devicedesigndescription != null && !devicedesigndescription.isEmpty();
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
		result.append(" (IntraNetworkRouter: ");
		result.append(intraNetworkRouter);
		result.append(", IntraNetworkRouterConfig: ");
		result.append(intraNetworkRouterConfig);
		result.append(')');
		return result.toString();
	}

} //IntracloudNetworkDesignDescriptionImpl
