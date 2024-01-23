/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.LocalcloudDesignDescription;

import ArrowheadDSL.SysDD;
import ArrowheadDSL.System_of_LocacloudsDesignDescription;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localcloud Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.LocalcloudDesignDescriptionImpl#getLC_workflow <em>LC workflow</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalcloudDesignDescriptionImpl#getLC_orchestration <em>LC orchestration</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalcloudDesignDescriptionImpl#getSystemoflocaclouddesigndescription <em>Systemoflocaclouddesigndescription</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalcloudDesignDescriptionImpl#getSysdd <em>Sysdd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalcloudDesignDescriptionImpl extends LocalCloudDesignImpl implements LocalcloudDesignDescription {
	/**
	 * The default value of the '{@link #getLC_workflow() <em>LC workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_workflow()
	 * @generated
	 * @ordered
	 */
	protected static final String LC_WORKFLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLC_workflow() <em>LC workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_workflow()
	 * @generated
	 * @ordered
	 */
	protected String lC_workflow = LC_WORKFLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getLC_orchestration() <em>LC orchestration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_orchestration()
	 * @generated
	 * @ordered
	 */
	protected static final String LC_ORCHESTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLC_orchestration() <em>LC orchestration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_orchestration()
	 * @generated
	 * @ordered
	 */
	protected String lC_orchestration = LC_ORCHESTRATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemoflocaclouddesigndescription() <em>Systemoflocaclouddesigndescription</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemoflocaclouddesigndescription()
	 * @generated
	 * @ordered
	 */
	protected EList<System_of_LocacloudsDesignDescription> systemoflocaclouddesigndescription;

	/**
	 * The cached value of the '{@link #getSysdd() <em>Sysdd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysdd()
	 * @generated
	 * @ordered
	 */
	protected EList<SysDD> sysdd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalcloudDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.LOCALCLOUD_DESIGN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLC_workflow() {
		return lC_workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLC_workflow(String newLC_workflow) {
		String oldLC_workflow = lC_workflow;
		lC_workflow = newLC_workflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW, oldLC_workflow, lC_workflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLC_orchestration() {
		return lC_orchestration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLC_orchestration(String newLC_orchestration) {
		String oldLC_orchestration = lC_orchestration;
		lC_orchestration = newLC_orchestration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION, oldLC_orchestration, lC_orchestration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_of_LocacloudsDesignDescription> getSystemoflocaclouddesigndescription() {
		if (systemoflocaclouddesigndescription == null) {
			systemoflocaclouddesigndescription = new EObjectWithInverseResolvingEList.ManyInverse<System_of_LocacloudsDesignDescription>(System_of_LocacloudsDesignDescription.class, this, ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION, ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION);
		}
		return systemoflocaclouddesigndescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SysDD> getSysdd() {
		if (sysdd == null) {
			sysdd = new EObjectWithInverseResolvingEList.ManyInverse<SysDD>(SysDD.class, this, ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD, ArrowheadDSLPackage.SYS_DD__LOCALCLOUDDESIGNDESCRIPTION);
		}
		return sysdd;
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
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystemoflocaclouddesigndescription()).basicAdd(otherEnd, msgs);
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSysdd()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION:
				return ((InternalEList<?>)getSystemoflocaclouddesigndescription()).basicRemove(otherEnd, msgs);
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD:
				return ((InternalEList<?>)getSysdd()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW:
				return getLC_workflow();
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION:
				return getLC_orchestration();
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION:
				return getSystemoflocaclouddesigndescription();
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD:
				return getSysdd();
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
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW:
				setLC_workflow((String)newValue);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION:
				setLC_orchestration((String)newValue);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION:
				getSystemoflocaclouddesigndescription().clear();
				getSystemoflocaclouddesigndescription().addAll((Collection<? extends System_of_LocacloudsDesignDescription>)newValue);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD:
				getSysdd().clear();
				getSysdd().addAll((Collection<? extends SysDD>)newValue);
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
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW:
				setLC_workflow(LC_WORKFLOW_EDEFAULT);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION:
				setLC_orchestration(LC_ORCHESTRATION_EDEFAULT);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION:
				getSystemoflocaclouddesigndescription().clear();
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD:
				getSysdd().clear();
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
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW:
				return LC_WORKFLOW_EDEFAULT == null ? lC_workflow != null : !LC_WORKFLOW_EDEFAULT.equals(lC_workflow);
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION:
				return LC_ORCHESTRATION_EDEFAULT == null ? lC_orchestration != null : !LC_ORCHESTRATION_EDEFAULT.equals(lC_orchestration);
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION:
				return systemoflocaclouddesigndescription != null && !systemoflocaclouddesigndescription.isEmpty();
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD:
				return sysdd != null && !sysdd.isEmpty();
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
		result.append(" (LC_workflow: ");
		result.append(lC_workflow);
		result.append(", LC_orchestration: ");
		result.append(lC_orchestration);
		result.append(')');
		return result.toString();
	}

} //LocalcloudDesignDescriptionImpl
