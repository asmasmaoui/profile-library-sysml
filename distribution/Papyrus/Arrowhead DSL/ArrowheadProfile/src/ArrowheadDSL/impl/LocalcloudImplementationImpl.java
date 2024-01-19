/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.LocalcloudImplementation;

import ArrowheadDSL.System_Implementation;
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
 * An implementation of the model object '<em><b>Localcloud Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.LocalcloudImplementationImpl#getLC_Documentation <em>LC Documentation</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalcloudImplementationImpl#getSystemimplementation <em>Systemimplementation</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.LocalcloudImplementationImpl#getSystem_of_localcloudsimplementation <em>System of localcloudsimplementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalcloudImplementationImpl extends LocalcloudDesignDescriptionImpl implements LocalcloudImplementation {
	/**
	 * The default value of the '{@link #getLC_Documentation() <em>LC Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_Documentation()
	 * @generated
	 * @ordered
	 */
	protected static final int LC_DOCUMENTATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLC_Documentation() <em>LC Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLC_Documentation()
	 * @generated
	 * @ordered
	 */
	protected int lC_Documentation = LC_DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemimplementation() <em>Systemimplementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemimplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<System_Implementation> systemimplementation;

	/**
	 * The cached value of the '{@link #getSystem_of_localcloudsimplementation() <em>System of localcloudsimplementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_of_localcloudsimplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<System_of_LocalcloudsImplementation> system_of_localcloudsimplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalcloudImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.LOCALCLOUD_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLC_Documentation() {
		return lC_Documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLC_Documentation(int newLC_Documentation) {
		int oldLC_Documentation = lC_Documentation;
		lC_Documentation = newLC_Documentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION, oldLC_Documentation, lC_Documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_Implementation> getSystemimplementation() {
		if (systemimplementation == null) {
			systemimplementation = new EObjectWithInverseResolvingEList.ManyInverse<System_Implementation>(System_Implementation.class, this, ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION, ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION);
		}
		return systemimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_of_LocalcloudsImplementation> getSystem_of_localcloudsimplementation() {
		if (system_of_localcloudsimplementation == null) {
			system_of_localcloudsimplementation = new EObjectWithInverseResolvingEList.ManyInverse<System_of_LocalcloudsImplementation>(System_of_LocalcloudsImplementation.class, this, ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION, ArrowheadDSLPackage.SYSTEM_OF_LOCALCLOUDS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION);
		}
		return system_of_localcloudsimplementation;
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
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystemimplementation()).basicAdd(otherEnd, msgs);
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystem_of_localcloudsimplementation()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				return ((InternalEList<?>)getSystemimplementation()).basicRemove(otherEnd, msgs);
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION:
				return ((InternalEList<?>)getSystem_of_localcloudsimplementation()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION:
				return getLC_Documentation();
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				return getSystemimplementation();
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION:
				return getSystem_of_localcloudsimplementation();
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
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION:
				setLC_Documentation((Integer)newValue);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				getSystemimplementation().clear();
				getSystemimplementation().addAll((Collection<? extends System_Implementation>)newValue);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION:
				getSystem_of_localcloudsimplementation().clear();
				getSystem_of_localcloudsimplementation().addAll((Collection<? extends System_of_LocalcloudsImplementation>)newValue);
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
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION:
				setLC_Documentation(LC_DOCUMENTATION_EDEFAULT);
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				getSystemimplementation().clear();
				return;
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION:
				getSystem_of_localcloudsimplementation().clear();
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
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION:
				return lC_Documentation != LC_DOCUMENTATION_EDEFAULT;
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				return systemimplementation != null && !systemimplementation.isEmpty();
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEM_OF_LOCALCLOUDSIMPLEMENTATION:
				return system_of_localcloudsimplementation != null && !system_of_localcloudsimplementation.isEmpty();
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
		result.append(" (LC_Documentation: ");
		result.append(lC_Documentation);
		result.append(')');
		return result.toString();
	}

} //LocalcloudImplementationImpl
