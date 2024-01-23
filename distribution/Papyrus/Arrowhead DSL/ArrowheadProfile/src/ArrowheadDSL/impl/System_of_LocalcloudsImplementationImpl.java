/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.LocalcloudImplementation;
import ArrowheadDSL.System_of_LocalcloudsImplementation;

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
 * An implementation of the model object '<em><b>System of Localclouds Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocalcloudsImplementationImpl#getSoLC_Documentation <em>So LC Documentation</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.System_of_LocalcloudsImplementationImpl#getLocalcloudimplementation <em>Localcloudimplementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class System_of_LocalcloudsImplementationImpl extends System_of_LocacloudsDesignDescriptionImpl implements System_of_LocalcloudsImplementation {
	/**
	 * The default value of the '{@link #getSoLC_Documentation() <em>So LC Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_Documentation()
	 * @generated
	 * @ordered
	 */
	protected static final int SO_LC_DOCUMENTATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoLC_Documentation() <em>So LC Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoLC_Documentation()
	 * @generated
	 * @ordered
	 */
	protected int soLC_Documentation = SO_LC_DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalcloudimplementation() <em>Localcloudimplementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalcloudimplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalcloudImplementation> localcloudimplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected System_of_LocalcloudsImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSoLC_Documentation() {
		return soLC_Documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoLC_Documentation(int newSoLC_Documentation) {
		int oldSoLC_Documentation = soLC_Documentation;
		soLC_Documentation = newSoLC_Documentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_DOCUMENTATION, oldSoLC_Documentation, soLC_Documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalcloudImplementation> getLocalcloudimplementation() {
		if (localcloudimplementation == null) {
			localcloudimplementation = new EObjectWithInverseResolvingEList.ManyInverse<LocalcloudImplementation>(LocalcloudImplementation.class, this, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION, ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION);
		}
		return localcloudimplementation;
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocalcloudimplementation()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				return ((InternalEList<?>)getLocalcloudimplementation()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_DOCUMENTATION:
				return getSoLC_Documentation();
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				return getLocalcloudimplementation();
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_DOCUMENTATION:
				setSoLC_Documentation((Integer)newValue);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				getLocalcloudimplementation().clear();
				getLocalcloudimplementation().addAll((Collection<? extends LocalcloudImplementation>)newValue);
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_DOCUMENTATION:
				setSoLC_Documentation(SO_LC_DOCUMENTATION_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				getLocalcloudimplementation().clear();
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
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__SO_LC_DOCUMENTATION:
				return soLC_Documentation != SO_LC_DOCUMENTATION_EDEFAULT;
			case ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				return localcloudimplementation != null && !localcloudimplementation.isEmpty();
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
		result.append(" (SoLC_Documentation: ");
		result.append(soLC_Documentation);
		result.append(')');
		return result.toString();
	}

} //System_of_LocalcloudsImplementationImpl
