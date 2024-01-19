/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.LocalcloudDesignDescription;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW:
				return getLC_workflow();
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION:
				return getLC_orchestration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_WORKFLOW:
				setLC_workflow((String)newValue);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__LC_ORCHESTRATION:
				setLC_orchestration((String)newValue);
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
