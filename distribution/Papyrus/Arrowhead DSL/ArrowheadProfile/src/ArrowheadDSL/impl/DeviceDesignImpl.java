/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.DeviceDesign;
import ArrowheadDSL.IntercloudNetworkDesign;
import ArrowheadDSL.IntracloudNetworkDesign;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignImpl#getIntercloudnetworkdesign <em>Intercloudnetworkdesign</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignImpl#getIntracloudnetworkdesign <em>Intracloudnetworkdesign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDesignImpl extends BlockImpl implements DeviceDesign {
	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> deviceName;

	/**
	 * The cached value of the '{@link #getIntercloudnetworkdesign() <em>Intercloudnetworkdesign</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercloudnetworkdesign()
	 * @generated
	 * @ordered
	 */
	protected EList<IntercloudNetworkDesign> intercloudnetworkdesign;

	/**
	 * The cached value of the '{@link #getIntracloudnetworkdesign() <em>Intracloudnetworkdesign</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntracloudnetworkdesign()
	 * @generated
	 * @ordered
	 */
	protected EList<IntracloudNetworkDesign> intracloudnetworkdesign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.DEVICE_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDeviceName() {
		if (deviceName == null) {
			deviceName = new EDataTypeUniqueEList<String>(String.class, this, ArrowheadDSLPackage.DEVICE_DESIGN__DEVICE_NAME);
		}
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntercloudNetworkDesign> getIntercloudnetworkdesign() {
		if (intercloudnetworkdesign == null) {
			intercloudnetworkdesign = new EObjectWithInverseResolvingEList.ManyInverse<IntercloudNetworkDesign>(IntercloudNetworkDesign.class, this, ArrowheadDSLPackage.DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN__DEVICEDESIGN);
		}
		return intercloudnetworkdesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntracloudNetworkDesign> getIntracloudnetworkdesign() {
		if (intracloudnetworkdesign == null) {
			intracloudnetworkdesign = new EObjectWithInverseResolvingEList.ManyInverse<IntracloudNetworkDesign>(IntracloudNetworkDesign.class, this, ArrowheadDSLPackage.DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN, ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__DEVICEDESIGN);
		}
		return intracloudnetworkdesign;
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
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntercloudnetworkdesign()).basicAdd(otherEnd, msgs);
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntracloudnetworkdesign()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN:
				return ((InternalEList<?>)getIntercloudnetworkdesign()).basicRemove(otherEnd, msgs);
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN:
				return ((InternalEList<?>)getIntracloudnetworkdesign()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.DEVICE_DESIGN__DEVICE_NAME:
				return getDeviceName();
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN:
				return getIntercloudnetworkdesign();
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN:
				return getIntracloudnetworkdesign();
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
			case ArrowheadDSLPackage.DEVICE_DESIGN__DEVICE_NAME:
				getDeviceName().clear();
				getDeviceName().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN:
				getIntercloudnetworkdesign().clear();
				getIntercloudnetworkdesign().addAll((Collection<? extends IntercloudNetworkDesign>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN:
				getIntracloudnetworkdesign().clear();
				getIntracloudnetworkdesign().addAll((Collection<? extends IntracloudNetworkDesign>)newValue);
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
			case ArrowheadDSLPackage.DEVICE_DESIGN__DEVICE_NAME:
				getDeviceName().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN:
				getIntercloudnetworkdesign().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN:
				getIntracloudnetworkdesign().clear();
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
			case ArrowheadDSLPackage.DEVICE_DESIGN__DEVICE_NAME:
				return deviceName != null && !deviceName.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTERCLOUDNETWORKDESIGN:
				return intercloudnetworkdesign != null && !intercloudnetworkdesign.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN__INTRACLOUDNETWORKDESIGN:
				return intracloudnetworkdesign != null && !intracloudnetworkdesign.isEmpty();
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
		result.append(" (DeviceName: ");
		result.append(deviceName);
		result.append(')');
		return result.toString();
	}

} //DeviceDesignImpl
