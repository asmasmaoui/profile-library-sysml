/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.BusinessPolicyKind;
import ArrowheadDSL.LifecyclePolicyKind;
import ArrowheadDSL.LocalCloudDesign;
import ArrowheadDSL.SecurityPolicyKind;
import ArrowheadDSL.System_of_LocalcloudsDesign;

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
 * An implementation of the model object '<em><b>System of Localclouds Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl#getSoLCName <em>So LC Name</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl#getSoLC_SecurityStrategy <em>So LC Security Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl#getSoLC_BusinessStrategy <em>So LC Business Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl#getSoLC_LifecycleStrategy <em>So LC Lifecycle Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocalcloudsDesignImpl#getLocalclouddesign <em>Localclouddesign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class System_of_LocalcloudsDesignImpl extends BlockImpl implements System_of_LocalcloudsDesign {
	/**
	 * The default value of the '{@link #getSoLCName() <em>So LC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLCName()
	 * @generated
	 * @ordered
	 */
	protected static final String SO_LC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoLCName() <em>So LC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLCName()
	 * @generated
	 * @ordered
	 */
	protected String soLCName = SO_LC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoLC_SecurityStrategy() <em>So LC Security Strategy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_SecurityStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityPolicyKind> soLC_SecurityStrategy;

	/**
	 * The cached value of the '{@link #getSoLC_BusinessStrategy() <em>So LC Business Strategy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_BusinessStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessPolicyKind> soLC_BusinessStrategy;

	/**
	 * The default value of the '{@link #getSoLC_LifecycleStrategy() <em>So LC Lifecycle Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_LifecycleStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final LifecyclePolicyKind SO_LC_LIFECYCLE_STRATEGY_EDEFAULT = LifecyclePolicyKind.OTHER;

	/**
	 * The cached value of the '{@link #getSoLC_LifecycleStrategy() <em>So LC Lifecycle Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_LifecycleStrategy()
	 * @generated
	 * @ordered
	 */
	protected LifecyclePolicyKind soLC_LifecycleStrategy = SO_LC_LIFECYCLE_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalclouddesign() <em>Localclouddesign</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalclouddesign()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalCloudDesign> localclouddesign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected System_of_LocalcloudsDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.SYSTEM_OF_LOCALCLOUDS_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoLCName() {
		return soLCName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoLCName(String newSoLCName) {
		String oldSoLCName = soLCName;
		soLCName = newSoLCName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME, oldSoLCName, soLCName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityPolicyKind> getSoLC_SecurityStrategy() {
		if (soLC_SecurityStrategy == null) {
			soLC_SecurityStrategy = new EDataTypeEList<SecurityPolicyKind>(SecurityPolicyKind.class, this, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY);
		}
		return soLC_SecurityStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusinessPolicyKind> getSoLC_BusinessStrategy() {
		if (soLC_BusinessStrategy == null) {
			soLC_BusinessStrategy = new EDataTypeEList<BusinessPolicyKind>(BusinessPolicyKind.class, this, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY);
		}
		return soLC_BusinessStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecyclePolicyKind getSoLC_LifecycleStrategy() {
		return soLC_LifecycleStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoLC_LifecycleStrategy(LifecyclePolicyKind newSoLC_LifecycleStrategy) {
		LifecyclePolicyKind oldSoLC_LifecycleStrategy = soLC_LifecycleStrategy;
		soLC_LifecycleStrategy = newSoLC_LifecycleStrategy == null ? SO_LC_LIFECYCLE_STRATEGY_EDEFAULT : newSoLC_LifecycleStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY, oldSoLC_LifecycleStrategy, soLC_LifecycleStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalCloudDesign> getLocalclouddesign() {
		if (localclouddesign == null) {
			localclouddesign = new EObjectWithInverseResolvingEList.ManyInverse<LocalCloudDesign>(LocalCloudDesign.class, this, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN, ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN);
		}
		return localclouddesign;
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocalclouddesign()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN:
				return ((InternalEList<?>)getLocalclouddesign()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME:
				return getSoLCName();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY:
				return getSoLC_SecurityStrategy();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY:
				return getSoLC_BusinessStrategy();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY:
				return getSoLC_LifecycleStrategy();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN:
				return getLocalclouddesign();
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME:
				setSoLCName((String)newValue);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY:
				getSoLC_SecurityStrategy().clear();
				getSoLC_SecurityStrategy().addAll((Collection<? extends SecurityPolicyKind>)newValue);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY:
				getSoLC_BusinessStrategy().clear();
				getSoLC_BusinessStrategy().addAll((Collection<? extends BusinessPolicyKind>)newValue);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY:
				setSoLC_LifecycleStrategy((LifecyclePolicyKind)newValue);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN:
				getLocalclouddesign().clear();
				getLocalclouddesign().addAll((Collection<? extends LocalCloudDesign>)newValue);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME:
				setSoLCName(SO_LC_NAME_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY:
				getSoLC_SecurityStrategy().clear();
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY:
				getSoLC_BusinessStrategy().clear();
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY:
				setSoLC_LifecycleStrategy(SO_LC_LIFECYCLE_STRATEGY_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN:
				getLocalclouddesign().clear();
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_NAME:
				return SO_LC_NAME_EDEFAULT == null ? soLCName != null : !SO_LC_NAME_EDEFAULT.equals(soLCName);
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_SECURITY_STRATEGY:
				return soLC_SecurityStrategy != null && !soLC_SecurityStrategy.isEmpty();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_BUSINESS_STRATEGY:
				return soLC_BusinessStrategy != null && !soLC_BusinessStrategy.isEmpty();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__SO_LC_LIFECYCLE_STRATEGY:
				return soLC_LifecycleStrategy != SO_LC_LIFECYCLE_STRATEGY_EDEFAULT;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN:
				return localclouddesign != null && !localclouddesign.isEmpty();
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
		result.append(" (SoLCName: ");
		result.append(soLCName);
		result.append(", SoLC_SecurityStrategy: ");
		result.append(soLC_SecurityStrategy);
		result.append(", SoLC_BusinessStrategy: ");
		result.append(soLC_BusinessStrategy);
		result.append(", SoLC_LifecycleStrategy: ");
		result.append(soLC_LifecycleStrategy);
		result.append(')');
		return result.toString();
	}

} //System_of_LocalcloudsDesignImpl
