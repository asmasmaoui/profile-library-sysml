/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.DeviceDesign;
import ArrowheadDSL.IntracloudNetworkDesign;
import ArrowheadDSL.MacLayerKind;

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
import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intracloud Network Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.IntracloudNetworkDesignImpl#getIntraNetworkDomain <em>Intra Network Domain</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IntracloudNetworkDesignImpl#getIntraNetworkMacLayer <em>Intra Network Mac Layer</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IntracloudNetworkDesignImpl#getDevicedesign <em>Devicedesign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntracloudNetworkDesignImpl extends BlockImpl implements IntracloudNetworkDesign {
	/**
	 * The default value of the '{@link #getIntraNetworkDomain() <em>Intra Network Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntraNetworkDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String INTRA_NETWORK_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntraNetworkDomain() <em>Intra Network Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntraNetworkDomain()
	 * @generated
	 * @ordered
	 */
	protected String intraNetworkDomain = INTRA_NETWORK_DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntraNetworkMacLayer() <em>Intra Network Mac Layer</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntraNetworkMacLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<MacLayerKind> intraNetworkMacLayer;

	/**
	 * The cached value of the '{@link #getDevicedesign() <em>Devicedesign</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicedesign()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDesign> devicedesign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntracloudNetworkDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.INTRACLOUD_NETWORK_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntraNetworkDomain() {
		return intraNetworkDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntraNetworkDomain(String newIntraNetworkDomain) {
		String oldIntraNetworkDomain = intraNetworkDomain;
		intraNetworkDomain = newIntraNetworkDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN, oldIntraNetworkDomain, intraNetworkDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MacLayerKind> getIntraNetworkMacLayer() {
		if (intraNetworkMacLayer == null) {
			intraNetworkMacLayer = new EDataTypeEList<MacLayerKind>(MacLayerKind.class, this, ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER);
		}
		return intraNetworkMacLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDesign> getDevicedesign() {
		if (devicedesign == null) {
			devicedesign = new EObjectWithInverseResolvingEList.ManyInverse<DeviceDesign>(DeviceDesign.class, this, ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN, ArrowheadDSLPackage.DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN);
		}
		return devicedesign;
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevicedesign()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN:
				return ((InternalEList<?>)getDevicedesign()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN:
				return getIntraNetworkDomain();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER:
				return getIntraNetworkMacLayer();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN:
				return getDevicedesign();
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN:
				setIntraNetworkDomain((String)newValue);
				return;
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER:
				getIntraNetworkMacLayer().clear();
				getIntraNetworkMacLayer().addAll((Collection<? extends MacLayerKind>)newValue);
				return;
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN:
				getDevicedesign().clear();
				getDevicedesign().addAll((Collection<? extends DeviceDesign>)newValue);
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN:
				setIntraNetworkDomain(INTRA_NETWORK_DOMAIN_EDEFAULT);
				return;
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER:
				getIntraNetworkMacLayer().clear();
				return;
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN:
				getDevicedesign().clear();
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
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN:
				return INTRA_NETWORK_DOMAIN_EDEFAULT == null ? intraNetworkDomain != null : !INTRA_NETWORK_DOMAIN_EDEFAULT.equals(intraNetworkDomain);
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER:
				return intraNetworkMacLayer != null && !intraNetworkMacLayer.isEmpty();
			case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN:
				return devicedesign != null && !devicedesign.isEmpty();
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
		result.append(" (IntraNetworkDomain: ");
		result.append(intraNetworkDomain);
		result.append(", IntraNetworkMacLayer: ");
		result.append(intraNetworkMacLayer);
		result.append(')');
		return result.toString();
	}

} //IntracloudNetworkDesignImpl
