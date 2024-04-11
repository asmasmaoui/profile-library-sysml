/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.DeviceDesign;
import ArrowheadDSL.IntercloudNetworkDesign;
import ArrowheadDSL.MacLayerKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercloud Network Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.IntercloudNetworkDesignImpl#getInterNetworkDomainName <em>Inter Network Domain Name</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IntercloudNetworkDesignImpl#getInterNetworkMacLayer <em>Inter Network Mac Layer</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.IntercloudNetworkDesignImpl#getDevicedesign <em>Devicedesign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntercloudNetworkDesignImpl extends BlockImpl implements IntercloudNetworkDesign {
	/**
	 * The cached value of the '{@link #getInterNetworkDomainName() <em>Inter Network Domain Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterNetworkDomainName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> interNetworkDomainName;

	/**
	 * The cached value of the '{@link #getInterNetworkMacLayer() <em>Inter Network Mac Layer</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterNetworkMacLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<MacLayerKind> interNetworkMacLayer;

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
	protected IntercloudNetworkDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.INTERCLOUD_NETWORK_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInterNetworkDomainName() {
		if (interNetworkDomainName == null) {
			interNetworkDomainName = new EDataTypeEList<String>(String.class, this, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME);
		}
		return interNetworkDomainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MacLayerKind> getInterNetworkMacLayer() {
		if (interNetworkMacLayer == null) {
			interNetworkMacLayer = new EDataTypeEList<MacLayerKind>(MacLayerKind.class, this, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER);
		}
		return interNetworkMacLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDesign> getDevicedesign() {
		if (devicedesign == null) {
			devicedesign = new EObjectWithInverseResolvingEList.ManyInverse<DeviceDesign>(DeviceDesign.class, this, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN, ArrowheadDSLPackage.DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN);
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME:
				return getInterNetworkDomainName();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER:
				return getInterNetworkMacLayer();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME:
				getInterNetworkDomainName().clear();
				getInterNetworkDomainName().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER:
				getInterNetworkMacLayer().clear();
				getInterNetworkMacLayer().addAll((Collection<? extends MacLayerKind>)newValue);
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME:
				getInterNetworkDomainName().clear();
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER:
				getInterNetworkMacLayer().clear();
				return;
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN:
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
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_DOMAIN_NAME:
				return interNetworkDomainName != null && !interNetworkDomainName.isEmpty();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__INTER_NETWORK_MAC_LAYER:
				return interNetworkMacLayer != null && !interNetworkMacLayer.isEmpty();
			case ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN:
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
		result.append(" (InterNetworkDomainName: ");
		result.append(interNetworkDomainName);
		result.append(", InterNetworkMacLayer: ");
		result.append(interNetworkMacLayer);
		result.append(')');
		return result.toString();
	}

} //IntercloudNetworkDesignImpl
