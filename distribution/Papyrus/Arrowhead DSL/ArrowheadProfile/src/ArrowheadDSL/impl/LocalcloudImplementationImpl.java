/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.LocalcloudImplementation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localcloud Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.LocalcloudImplementationImpl#getLC_Documentation <em>LC Documentation</em>}</li>
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION:
				return getLC_Documentation();
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
			case ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__LC_DOCUMENTATION:
				setLC_Documentation((Integer)newValue);
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
