/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.DeviceDesignDescription;
import ArrowheadDSL.IntercloudNetworkDesignDescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link ArrowheadDSL.impl.IntercloudNetworkDesignDescriptionImpl#getNetworkPhysicalLayer <em>Network Physical Layer</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IntercloudNetworkDesignDescriptionImpl#getDevicedesigndescription <em>Devicedesigndescription</em>}</li>
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
	 * The default value of the '{@link #getNetworkPhysicalLayer() <em>Network Physical Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPhysicalLayer()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_PHYSICAL_LAYER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkPhysicalLayer() <em>Network Physical Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPhysicalLayer()
	 * @generated
	 * @ordered
	 */
	protected String networkPhysicalLayer = NETWORK_PHYSICAL_LAYER_EDEFAULT;

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
	public String getNetworkPhysicalLayer() {
		return networkPhysicalLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkPhysicalLayer(String newNetworkPhysicalLayer) {
		String oldNetworkPhysicalLayer = networkPhysicalLayer;
		networkPhysicalLayer = newNetworkPhysicalLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__NETWORK_PHYSICAL_LAYER, oldNetworkPhysicalLayer, networkPhysicalLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDesignDescription> getDevicedesigndescription() {
		if (devicedesigndescription == null) {
			devicedesigndescription = new EObjectWithInverseResolvingEList.ManyInverse<DeviceDesignDescription>(DeviceDesignDescription.class, this, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION);
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER:
				return getInterNetworkRouter();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG:
				return getInterNetworkRouterConfig();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__NETWORK_PHYSICAL_LAYER:
				return getNetworkPhysicalLayer();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER:
				getInterNetworkRouter().clear();
				getInterNetworkRouter().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG:
				getInterNetworkRouterConfig().clear();
				getInterNetworkRouterConfig().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__NETWORK_PHYSICAL_LAYER:
				setNetworkPhysicalLayer((String)newValue);
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER:
				getInterNetworkRouter().clear();
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG:
				getInterNetworkRouterConfig().clear();
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__NETWORK_PHYSICAL_LAYER:
				setNetworkPhysicalLayer(NETWORK_PHYSICAL_LAYER_EDEFAULT);
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER:
				return interNetworkRouter != null && !interNetworkRouter.isEmpty();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__INTER_NETWORK_ROUTER_CONFIG:
				return interNetworkRouterConfig != null && !interNetworkRouterConfig.isEmpty();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__NETWORK_PHYSICAL_LAYER:
				return NETWORK_PHYSICAL_LAYER_EDEFAULT == null ? networkPhysicalLayer != null : !NETWORK_PHYSICAL_LAYER_EDEFAULT.equals(networkPhysicalLayer);
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION:
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
		result.append(" (InterNetworkRouter: ");
		result.append(interNetworkRouter);
		result.append(", InterNetworkRouterConfig: ");
		result.append(interNetworkRouterConfig);
		result.append(", NetworkPhysicalLayer: ");
		result.append(networkPhysicalLayer);
		result.append(')');
		return result.toString();
	}

} //IntercloudNetworkDesignDescriptionImpl
