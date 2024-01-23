/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.LocalcloudDesignDescription;
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
 * An implementation of the model object '<em><b>System of Locaclouds Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocacloudsDesignDescriptionImpl#getSoLC_Orchestration <em>So LC Orchestration</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocacloudsDesignDescriptionImpl#getSoLC_Workflow <em>So LC Workflow</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocacloudsDesignDescriptionImpl#getLocalclouddesigndescription <em>Localclouddesigndescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class System_of_LocacloudsDesignDescriptionImpl extends System_of_LocalcloudsDesignImpl implements System_of_LocacloudsDesignDescription {
	/**
	 * The default value of the '{@link #getSoLC_Orchestration() <em>So LC Orchestration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_Orchestration()
	 * @generated
	 * @ordered
	 */
	protected static final String SO_LC_ORCHESTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoLC_Orchestration() <em>So LC Orchestration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_Orchestration()
	 * @generated
	 * @ordered
	 */
	protected String soLC_Orchestration = SO_LC_ORCHESTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoLC_Workflow() <em>So LC Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_Workflow()
	 * @generated
	 * @ordered
	 */
	protected static final String SO_LC_WORKFLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoLC_Workflow() <em>So LC Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_Workflow()
	 * @generated
	 * @ordered
	 */
	protected String soLC_Workflow = SO_LC_WORKFLOW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalclouddesigndescription() <em>Localclouddesigndescription</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalclouddesigndescription()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalcloudDesignDescription> localclouddesigndescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected System_of_LocacloudsDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoLC_Orchestration() {
		return soLC_Orchestration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoLC_Orchestration(String newSoLC_Orchestration) {
		String oldSoLC_Orchestration = soLC_Orchestration;
		soLC_Orchestration = newSoLC_Orchestration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION, oldSoLC_Orchestration, soLC_Orchestration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoLC_Workflow() {
		return soLC_Workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoLC_Workflow(String newSoLC_Workflow) {
		String oldSoLC_Workflow = soLC_Workflow;
		soLC_Workflow = newSoLC_Workflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW, oldSoLC_Workflow, soLC_Workflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalcloudDesignDescription> getLocalclouddesigndescription() {
		if (localclouddesigndescription == null) {
			localclouddesigndescription = new EObjectWithInverseResolvingEList.ManyInverse<LocalcloudDesignDescription>(LocalcloudDesignDescription.class, this, ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION, ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSTEMOFLOCACLOUDDESIGNDESCRIPTION);
		}
		return localclouddesigndescription;
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocalclouddesigndescription()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION:
				return ((InternalEList<?>)getLocalclouddesigndescription()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION:
				return getSoLC_Orchestration();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW:
				return getSoLC_Workflow();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION:
				return getLocalclouddesigndescription();
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION:
				setSoLC_Orchestration((String)newValue);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW:
				setSoLC_Workflow((String)newValue);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION:
				getLocalclouddesigndescription().clear();
				getLocalclouddesigndescription().addAll((Collection<? extends LocalcloudDesignDescription>)newValue);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION:
				setSoLC_Orchestration(SO_LC_ORCHESTRATION_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW:
				setSoLC_Workflow(SO_LC_WORKFLOW_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION:
				getLocalclouddesigndescription().clear();
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_ORCHESTRATION:
				return SO_LC_ORCHESTRATION_EDEFAULT == null ? soLC_Orchestration != null : !SO_LC_ORCHESTRATION_EDEFAULT.equals(soLC_Orchestration);
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__SO_LC_WORKFLOW:
				return SO_LC_WORKFLOW_EDEFAULT == null ? soLC_Workflow != null : !SO_LC_WORKFLOW_EDEFAULT.equals(soLC_Workflow);
			case ArrowheadDSLPackage.SYSTEM_OF_LOCACLOUDS_DESIGN_DESCRIPTION__LOCALCLOUDDESIGNDESCRIPTION:
				return localclouddesigndescription != null && !localclouddesigndescription.isEmpty();
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
		result.append(" (SoLC_Orchestration: ");
		result.append(soLC_Orchestration);
		result.append(", SoLC_Workflow: ");
		result.append(soLC_Workflow);
		result.append(')');
		return result.toString();
	}

} //System_of_LocacloudsDesignDescriptionImpl
