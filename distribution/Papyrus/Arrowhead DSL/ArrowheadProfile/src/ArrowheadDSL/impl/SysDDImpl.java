/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadCertificateKind;
import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.SysDD;
import ArrowheadDSL.TimeFormatKind;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys DD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.SysDDImpl#getTimeformat <em>Timeformat</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.SysDDImpl#getArrowheadCertificate <em>Arrowhead Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SysDDImpl extends SysDImpl implements SysDD {
	/**
	 * The default value of the '{@link #getTimeformat() <em>Timeformat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeformat()
	 * @generated
	 * @ordered
	 */
	protected static final TimeFormatKind TIMEFORMAT_EDEFAULT = TimeFormatKind.RFC_3339;

	/**
	 * The cached value of the '{@link #getTimeformat() <em>Timeformat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeformat()
	 * @generated
	 * @ordered
	 */
	protected TimeFormatKind timeformat = TIMEFORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrowheadCertificate() <em>Arrowhead Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowheadCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowheadCertificateKind ARROWHEAD_CERTIFICATE_EDEFAULT = ArrowheadCertificateKind.APPLICATION_SYSTEM;

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
	protected SysDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.SYS_DD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeFormatKind getTimeformat() {
		return timeformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeformat(TimeFormatKind newTimeformat) {
		TimeFormatKind oldTimeformat = timeformat;
		timeformat = newTimeformat == null ? TIMEFORMAT_EDEFAULT : newTimeformat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SYS_DD__TIMEFORMAT, oldTimeformat, timeformat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE, oldArrowheadCertificate, arrowheadCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.SYS_DD__TIMEFORMAT:
				return getTimeformat();
			case ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE:
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
			case ArrowheadDSLPackage.SYS_DD__TIMEFORMAT:
				setTimeformat((TimeFormatKind)newValue);
				return;
			case ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE:
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
			case ArrowheadDSLPackage.SYS_DD__TIMEFORMAT:
				setTimeformat(TIMEFORMAT_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE:
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
			case ArrowheadDSLPackage.SYS_DD__TIMEFORMAT:
				return timeformat != TIMEFORMAT_EDEFAULT;
			case ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Timeformat: ");
		result.append(timeformat);
		result.append(", ArrowheadCertificate: ");
		result.append(arrowheadCertificate);
		result.append(')');
		return result.toString();
	}

} //SysDDImpl
