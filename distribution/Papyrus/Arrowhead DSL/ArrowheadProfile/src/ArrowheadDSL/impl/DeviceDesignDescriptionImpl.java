/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadCertificateKind;
import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.DeviceDesignDescription;
import ArrowheadDSL.IntercloudNetworkDesignDescription;
import ArrowheadDSL.IntracloudNetworkDesignDescription;
import ArrowheadDSL.OSKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getIOports <em>IOports</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getArrowheadCertificate <em>Arrowhead Certificate</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getIntercloudnetworkdesigndescription <em>Intercloudnetworkdesigndescription</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getIntracloudnetworkdesigndescription <em>Intracloudnetworkdesigndescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDesignDescriptionImpl extends DeviceDesignImpl implements DeviceDesignDescription {
	/**
	 * The cached value of the '{@link #getIOports() <em>IOports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOports()
	 * @generated
	 * @ordered
	 */
	protected EList<String> iOports;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> memory;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> processor;

	/**
	 * The default value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final OSKind OPERATING_SYSTEM_EDEFAULT = OSKind.WINDOWS;

	/**
	 * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected OSKind operatingSystem = OPERATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrowheadCertificate() <em>Arrowhead Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowheadCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowheadCertificateKind ARROWHEAD_CERTIFICATE_EDEFAULT = ArrowheadCertificateKind.DEVICE;

	/**
	 * The cached value of the '{@link #getArrowheadCertificate() <em>Arrowhead Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowheadCertificate()
	 * @generated
	 * @ordered
	 */
	protected ArrowheadCertificateKind arrowheadCertificate = ARROWHEAD_CERTIFICATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntercloudnetworkdesigndescription() <em>Intercloudnetworkdesigndescription</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercloudnetworkdesigndescription()
	 * @generated
	 * @ordered
	 */
	protected EList<IntercloudNetworkDesignDescription> intercloudnetworkdesigndescription;

	/**
	 * The cached value of the '{@link #getIntracloudnetworkdesigndescription() <em>Intracloudnetworkdesigndescription</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntracloudnetworkdesigndescription()
	 * @generated
	 * @ordered
	 */
	protected EList<IntracloudNetworkDesignDescription> intracloudnetworkdesigndescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.DEVICE_DESIGN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIOports() {
		if (iOports == null) {
			iOports = new EDataTypeUniqueEList<String>(String.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__IOPORTS);
		}
		return iOports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMemory() {
		if (memory == null) {
			memory = new EDataTypeEList<String>(String.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__MEMORY);
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProcessor() {
		if (processor == null) {
			processor = new EDataTypeUniqueEList<String>(String.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OSKind getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatingSystem(OSKind newOperatingSystem) {
		OSKind oldOperatingSystem = operatingSystem;
		operatingSystem = newOperatingSystem == null ? OPERATING_SYSTEM_EDEFAULT : newOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowheadCertificateKind getArrowheadCertificate() {
		return arrowheadCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrowheadCertificate(ArrowheadCertificateKind newArrowheadCertificate) {
		ArrowheadCertificateKind oldArrowheadCertificate = arrowheadCertificate;
		arrowheadCertificate = newArrowheadCertificate == null ? ARROWHEAD_CERTIFICATE_EDEFAULT : newArrowheadCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__ARROWHEAD_CERTIFICATE, oldArrowheadCertificate, arrowheadCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntercloudNetworkDesignDescription> getIntercloudnetworkdesigndescription() {
		if (intercloudnetworkdesigndescription == null) {
			intercloudnetworkdesigndescription = new EObjectWithInverseResolvingEList.ManyInverse<IntercloudNetworkDesignDescription>(IntercloudNetworkDesignDescription.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION, ArrowheadDSLPackage.INTERCLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION);
		}
		return intercloudnetworkdesigndescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntracloudNetworkDesignDescription> getIntracloudnetworkdesigndescription() {
		if (intracloudnetworkdesigndescription == null) {
			intracloudnetworkdesigndescription = new EObjectWithInverseResolvingEList.ManyInverse<IntracloudNetworkDesignDescription>(IntracloudNetworkDesignDescription.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION, ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__DEVICEDESIGNDESCRIPTION);
		}
		return intracloudnetworkdesigndescription;
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntercloudnetworkdesigndescription()).basicAdd(otherEnd, msgs);
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntracloudnetworkdesigndescription()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION:
				return ((InternalEList<?>)getIntercloudnetworkdesigndescription()).basicRemove(otherEnd, msgs);
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION:
				return ((InternalEList<?>)getIntracloudnetworkdesigndescription()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__IOPORTS:
				return getIOports();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__MEMORY:
				return getMemory();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR:
				return getProcessor();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM:
				return getOperatingSystem();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__ARROWHEAD_CERTIFICATE:
				return getArrowheadCertificate();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION:
				return getIntercloudnetworkdesigndescription();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION:
				return getIntracloudnetworkdesigndescription();
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__IOPORTS:
				getIOports().clear();
				getIOports().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__MEMORY:
				getMemory().clear();
				getMemory().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR:
				getProcessor().clear();
				getProcessor().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM:
				setOperatingSystem((OSKind)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__ARROWHEAD_CERTIFICATE:
				setArrowheadCertificate((ArrowheadCertificateKind)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION:
				getIntercloudnetworkdesigndescription().clear();
				getIntercloudnetworkdesigndescription().addAll((Collection<? extends IntercloudNetworkDesignDescription>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION:
				getIntracloudnetworkdesigndescription().clear();
				getIntracloudnetworkdesigndescription().addAll((Collection<? extends IntracloudNetworkDesignDescription>)newValue);
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__IOPORTS:
				getIOports().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__MEMORY:
				getMemory().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR:
				getProcessor().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM:
				setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__ARROWHEAD_CERTIFICATE:
				setArrowheadCertificate(ARROWHEAD_CERTIFICATE_EDEFAULT);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION:
				getIntercloudnetworkdesigndescription().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION:
				getIntracloudnetworkdesigndescription().clear();
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__IOPORTS:
				return iOports != null && !iOports.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__MEMORY:
				return memory != null && !memory.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR:
				return processor != null && !processor.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM:
				return operatingSystem != OPERATING_SYSTEM_EDEFAULT;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__ARROWHEAD_CERTIFICATE:
				return arrowheadCertificate != ARROWHEAD_CERTIFICATE_EDEFAULT;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTERCLOUDNETWORKDESIGNDESCRIPTION:
				return intercloudnetworkdesigndescription != null && !intercloudnetworkdesigndescription.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRACLOUDNETWORKDESIGNDESCRIPTION:
				return intracloudnetworkdesigndescription != null && !intracloudnetworkdesigndescription.isEmpty();
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
		result.append(" (IOports: ");
		result.append(iOports);
		result.append(", memory: ");
		result.append(memory);
		result.append(", processor: ");
		result.append(processor);
		result.append(", operatingSystem: ");
		result.append(operatingSystem);
		result.append(", ArrowheadCertificate: ");
		result.append(arrowheadCertificate);
		result.append(')');
		return result.toString();
	}

} //DeviceDesignDescriptionImpl
