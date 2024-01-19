/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadCertificateKind;
import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.DeviceDesign;
import ArrowheadDSL.DeviceDesignDescription;
import ArrowheadDSL.IntracloudNetworkDesign;
import ArrowheadDSL.IntracloudNetworkDesignDescription;
import ArrowheadDSL.MacLayerKind;
import ArrowheadDSL.OSKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getIntraNetworkDomain <em>Intra Network Domain</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getIntraNetworkMacLayer <em>Intra Network Mac Layer</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getIntraNetworkRouter <em>Intra Network Router</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getIntraNetworkRouterConfig <em>Intra Network Router Config</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getIOports <em>IOports</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.DeviceDesignDescriptionImpl#getArrowheadCertificate <em>Arrowhead Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDesignDescriptionImpl extends IntercloudNetworkDesignDescriptionImpl implements DeviceDesignDescription {
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
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> deviceName;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_DOMAIN, oldIntraNetworkDomain, intraNetworkDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MacLayerKind> getIntraNetworkMacLayer() {
		if (intraNetworkMacLayer == null) {
			intraNetworkMacLayer = new EDataTypeEList<MacLayerKind>(MacLayerKind.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_MAC_LAYER);
		}
		return intraNetworkMacLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIntraNetworkRouter() {
		if (intraNetworkRouter == null) {
			intraNetworkRouter = new EDataTypeEList<Integer>(Integer.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER);
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
			intraNetworkRouterConfig = new EDataTypeEList<Integer>(Integer.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG);
		}
		return intraNetworkRouterConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDeviceName() {
		if (deviceName == null) {
			deviceName = new EDataTypeUniqueEList<String>(String.class, this, ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_NAME);
		}
		return deviceName;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_DOMAIN:
				return getIntraNetworkDomain();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_MAC_LAYER:
				return getIntraNetworkMacLayer();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER:
				return getIntraNetworkRouter();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG:
				return getIntraNetworkRouterConfig();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_NAME:
				return getDeviceName();
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_DOMAIN:
				setIntraNetworkDomain((String)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_MAC_LAYER:
				getIntraNetworkMacLayer().clear();
				getIntraNetworkMacLayer().addAll((Collection<? extends MacLayerKind>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER:
				getIntraNetworkRouter().clear();
				getIntraNetworkRouter().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG:
				getIntraNetworkRouterConfig().clear();
				getIntraNetworkRouterConfig().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_NAME:
				getDeviceName().clear();
				getDeviceName().addAll((Collection<? extends String>)newValue);
				return;
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_DOMAIN:
				setIntraNetworkDomain(INTRA_NETWORK_DOMAIN_EDEFAULT);
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_MAC_LAYER:
				getIntraNetworkMacLayer().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER:
				getIntraNetworkRouter().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG:
				getIntraNetworkRouterConfig().clear();
				return;
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_NAME:
				getDeviceName().clear();
				return;
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
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_DOMAIN:
				return INTRA_NETWORK_DOMAIN_EDEFAULT == null ? intraNetworkDomain != null : !INTRA_NETWORK_DOMAIN_EDEFAULT.equals(intraNetworkDomain);
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_MAC_LAYER:
				return intraNetworkMacLayer != null && !intraNetworkMacLayer.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER:
				return intraNetworkRouter != null && !intraNetworkRouter.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG:
				return intraNetworkRouterConfig != null && !intraNetworkRouterConfig.isEmpty();
			case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_NAME:
				return deviceName != null && !deviceName.isEmpty();
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
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IntracloudNetworkDesign.class) {
			switch (derivedFeatureID) {
				case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_DOMAIN: return ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN;
				case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_MAC_LAYER: return ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER;
				default: return -1;
			}
		}
		if (baseClass == IntracloudNetworkDesignDescription.class) {
			switch (derivedFeatureID) {
				case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER: return ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER;
				case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG: return ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG;
				default: return -1;
			}
		}
		if (baseClass == DeviceDesign.class) {
			switch (derivedFeatureID) {
				case ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_NAME: return ArrowheadDSLPackage.DEVICE_DESIGN__DEVICE_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IntracloudNetworkDesign.class) {
			switch (baseFeatureID) {
				case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_DOMAIN: return ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_DOMAIN;
				case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN__INTRA_NETWORK_MAC_LAYER: return ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_MAC_LAYER;
				default: return -1;
			}
		}
		if (baseClass == IntracloudNetworkDesignDescription.class) {
			switch (baseFeatureID) {
				case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER: return ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER;
				case ArrowheadDSLPackage.INTRACLOUD_NETWORK_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG: return ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__INTRA_NETWORK_ROUTER_CONFIG;
				default: return -1;
			}
		}
		if (baseClass == DeviceDesign.class) {
			switch (baseFeatureID) {
				case ArrowheadDSLPackage.DEVICE_DESIGN__DEVICE_NAME: return ArrowheadDSLPackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", IntraNetworkRouter: ");
		result.append(intraNetworkRouter);
		result.append(", IntraNetworkRouterConfig: ");
		result.append(intraNetworkRouterConfig);
		result.append(", DeviceName: ");
		result.append(deviceName);
		result.append(", IOports: ");
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
