/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.BusinessPolicyKind;
import ArrowheadDSL.LifecyclePolicyKind;
import ArrowheadDSL.LocalCloudDesign;
import ArrowheadDSL.SecurityPolicyKind;
import ArrowheadDSL.SysD;
import ArrowheadDSL.System_of_LocalcloudsDesign;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Cloud Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.LocalCloudDesignImpl#getLC_Name <em>LC Name</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalCloudDesignImpl#getFunctionalProperties <em>Functional Properties</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalCloudDesignImpl#getLC_SecurityStrategy <em>LC Security Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalCloudDesignImpl#getLC_BusinessStrategy <em>LC Business Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalCloudDesignImpl#getLC_LifecycleStrategy <em>LC Lifecycle Strategy</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalCloudDesignImpl#getSystem_of_localcloudsdesign <em>System of localcloudsdesign</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalCloudDesignImpl#getSysd <em>Sysd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalCloudDesignImpl extends BlockImpl implements LocalCloudDesign {
	/**
	 * The default value of the '{@link #getLC_Name() <em>LC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String LC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLC_Name() <em>LC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_Name()
	 * @generated
	 * @ordered
	 */
	protected String lC_Name = LC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionalProperties() <em>Functional Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalProperties()
	 * @generated
	 * @ordered
	 */
	protected static final int FUNCTIONAL_PROPERTIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFunctionalProperties() <em>Functional Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalProperties()
	 * @generated
	 * @ordered
	 */
	protected int functionalProperties = FUNCTIONAL_PROPERTIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLC_SecurityStrategy() <em>LC Security Strategy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_SecurityStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityPolicyKind> lC_SecurityStrategy;

	/**
	 * The cached value of the '{@link #getLC_BusinessStrategy() <em>LC Business Strategy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_BusinessStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessPolicyKind> lC_BusinessStrategy;

	/**
	 * The default value of the '{@link #getLC_LifecycleStrategy() <em>LC Lifecycle Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_LifecycleStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final LifecyclePolicyKind LC_LIFECYCLE_STRATEGY_EDEFAULT = LifecyclePolicyKind.OTHER;

	/**
	 * The cached value of the '{@link #getLC_LifecycleStrategy() <em>LC Lifecycle Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_LifecycleStrategy()
	 * @generated
	 * @ordered
	 */
	protected LifecyclePolicyKind lC_LifecycleStrategy = LC_LIFECYCLE_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystem_of_localcloudsdesign() <em>System of localcloudsdesign</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_of_localcloudsdesign()
	 * @generated
	 * @ordered
	 */
	protected EList<System_of_LocalcloudsDesign> system_of_localcloudsdesign;

	/**
	 * The cached value of the '{@link #getSysd() <em>Sysd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysd()
	 * @generated
	 * @ordered
	 */
	protected EList<SysD> sysd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalCloudDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.LOCAL_CLOUD_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLC_Name() {
		return lC_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLC_Name(String newLC_Name) {
		String oldLC_Name = lC_Name;
		lC_Name = newLC_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_NAME, oldLC_Name, lC_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFunctionalProperties() {
		return functionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionalProperties(int newFunctionalProperties) {
		int oldFunctionalProperties = functionalProperties;
		functionalProperties = newFunctionalProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES, oldFunctionalProperties, functionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityPolicyKind> getLC_SecurityStrategy() {
		if (lC_SecurityStrategy == null) {
			lC_SecurityStrategy = new EDataTypeUniqueEList<SecurityPolicyKind>(SecurityPolicyKind.class, this, ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY);
		}
		return lC_SecurityStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusinessPolicyKind> getLC_BusinessStrategy() {
		if (lC_BusinessStrategy == null) {
			lC_BusinessStrategy = new EDataTypeUniqueEList<BusinessPolicyKind>(BusinessPolicyKind.class, this, ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY);
		}
		return lC_BusinessStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecyclePolicyKind getLC_LifecycleStrategy() {
		return lC_LifecycleStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLC_LifecycleStrategy(LifecyclePolicyKind newLC_LifecycleStrategy) {
		LifecyclePolicyKind oldLC_LifecycleStrategy = lC_LifecycleStrategy;
		lC_LifecycleStrategy = newLC_LifecycleStrategy == null ? LC_LIFECYCLE_STRATEGY_EDEFAULT : newLC_LifecycleStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY, oldLC_LifecycleStrategy, lC_LifecycleStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_of_LocalcloudsDesign> getSystem_of_localcloudsdesign() {
		if (system_of_localcloudsdesign == null) {
			system_of_localcloudsdesign = new EObjectWithInverseResolvingEList.ManyInverse<System_of_LocalcloudsDesign>(System_of_LocalcloudsDesign.class, this, ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_DESIGN__LOCALCLOUDDESIGN);
		}
		return system_of_localcloudsdesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SysD> getSysd() {
		if (sysd == null) {
			sysd = new EObjectWithInverseResolvingEList.ManyInverse<SysD>(SysD.class, this, ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSD, ArrowheadDSLPackage.SYS_D__LOCALCLOUDDESIGN);
		}
		return sysd;
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
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystem_of_localcloudsdesign()).basicAdd(otherEnd, msgs);
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSysd()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN:
				return ((InternalEList<?>)getSystem_of_localcloudsdesign()).basicRemove(otherEnd, msgs);
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSD:
				return ((InternalEList<?>)getSysd()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_NAME:
				return getLC_Name();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES:
				return getFunctionalProperties();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY:
				return getLC_SecurityStrategy();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY:
				return getLC_BusinessStrategy();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY:
				return getLC_LifecycleStrategy();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN:
				return getSystem_of_localcloudsdesign();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSD:
				return getSysd();
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
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_NAME:
				setLC_Name((String)newValue);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES:
				setFunctionalProperties((Integer)newValue);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY:
				getLC_SecurityStrategy().clear();
				getLC_SecurityStrategy().addAll((Collection<? extends SecurityPolicyKind>)newValue);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY:
				getLC_BusinessStrategy().clear();
				getLC_BusinessStrategy().addAll((Collection<? extends BusinessPolicyKind>)newValue);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY:
				setLC_LifecycleStrategy((LifecyclePolicyKind)newValue);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN:
				getSystem_of_localcloudsdesign().clear();
				getSystem_of_localcloudsdesign().addAll((Collection<? extends System_of_LocalcloudsDesign>)newValue);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSD:
				getSysd().clear();
				getSysd().addAll((Collection<? extends SysD>)newValue);
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
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_NAME:
				setLC_Name(LC_NAME_EDEFAULT);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES:
				setFunctionalProperties(FUNCTIONAL_PROPERTIES_EDEFAULT);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY:
				getLC_SecurityStrategy().clear();
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY:
				getLC_BusinessStrategy().clear();
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY:
				setLC_LifecycleStrategy(LC_LIFECYCLE_STRATEGY_EDEFAULT);
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN:
				getSystem_of_localcloudsdesign().clear();
				return;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSD:
				getSysd().clear();
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
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_NAME:
				return LC_NAME_EDEFAULT == null ? lC_Name != null : !LC_NAME_EDEFAULT.equals(lC_Name);
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__FUNCTIONAL_PROPERTIES:
				return functionalProperties != FUNCTIONAL_PROPERTIES_EDEFAULT;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_SECURITY_STRATEGY:
				return lC_SecurityStrategy != null && !lC_SecurityStrategy.isEmpty();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_BUSINESS_STRATEGY:
				return lC_BusinessStrategy != null && !lC_BusinessStrategy.isEmpty();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__LC_LIFECYCLE_STRATEGY:
				return lC_LifecycleStrategy != LC_LIFECYCLE_STRATEGY_EDEFAULT;
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSTEM_OF_LOCALCLOUDSDESIGN:
				return system_of_localcloudsdesign != null && !system_of_localcloudsdesign.isEmpty();
			case ArrowheadDSLPackage.LOCAL_CLOUD_DESIGN__SYSD:
				return sysd != null && !sysd.isEmpty();
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
		result.append(" (LC_Name: ");
		result.append(lC_Name);
		result.append(", FunctionalProperties: ");
		result.append(functionalProperties);
		result.append(", LC_SecurityStrategy: ");
		result.append(lC_SecurityStrategy);
		result.append(", LC_BusinessStrategy: ");
		result.append(lC_BusinessStrategy);
		result.append(", LC_LifecycleStrategy: ");
		result.append(lC_LifecycleStrategy);
		result.append(')');
		return result.toString();
	}

} //LocalCloudDesignImpl
