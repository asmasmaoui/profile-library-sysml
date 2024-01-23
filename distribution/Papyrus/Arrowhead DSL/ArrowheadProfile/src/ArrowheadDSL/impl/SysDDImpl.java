/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadCertificateKind;
import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.IDD;
import ArrowheadDSL.LocalcloudDesignDescription;
import ArrowheadDSL.SysDD;
import ArrowheadDSL.TimeFormatKind;

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
 * An implementation of the model object '<em><b>Sys DD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.SysDDImpl#getTimeformat <em>Timeformat</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.SysDDImpl#getArrowheadCertificate <em>Arrowhead Certificate</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.SysDDImpl#getIdd <em>Idd</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.SysDDImpl#getLocalclouddesigndescription <em>Localclouddesigndescription</em>}</li>
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
	 * The cached value of the '{@link #getIdd() <em>Idd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdd()
	 * @generated
	 * @ordered
	 */
	protected EList<IDD> idd;

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
	public EList<IDD> getIdd() {
		if (idd == null) {
			idd = new EObjectWithInverseResolvingEList.ManyInverse<IDD>(IDD.class, this, ArrowheadDSLPackage.SYS_DD__IDD, ArrowheadDSLPackage.IDD__SYSDD);
		}
		return idd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalcloudDesignDescription> getLocalclouddesigndescription() {
		if (localclouddesigndescription == null) {
			localclouddesigndescription = new EObjectWithInverseResolvingEList.ManyInverse<LocalcloudDesignDescription>(LocalcloudDesignDescription.class, this, ArrowheadDSLPackage.SYS_DD__LOCALCLOUDDESIGNDESCRIPTION, ArrowheadDSLPackage.LOCALCLOUD_DESIGN_DESCRIPTION__SYSDD);
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
			case ArrowheadDSLPackage.SYS_DD__IDD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdd()).basicAdd(otherEnd, msgs);
			case ArrowheadDSLPackage.SYS_DD__LOCALCLOUDDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.SYS_DD__IDD:
				return ((InternalEList<?>)getIdd()).basicRemove(otherEnd, msgs);
			case ArrowheadDSLPackage.SYS_DD__LOCALCLOUDDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.SYS_DD__TIMEFORMAT:
				return getTimeformat();
			case ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE:
				return getArrowheadCertificate();
			case ArrowheadDSLPackage.SYS_DD__IDD:
				return getIdd();
			case ArrowheadDSLPackage.SYS_DD__LOCALCLOUDDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.SYS_DD__TIMEFORMAT:
				setTimeformat((TimeFormatKind)newValue);
				return;
			case ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE:
				setArrowheadCertificate((ArrowheadCertificateKind)newValue);
				return;
			case ArrowheadDSLPackage.SYS_DD__IDD:
				getIdd().clear();
				getIdd().addAll((Collection<? extends IDD>)newValue);
				return;
			case ArrowheadDSLPackage.SYS_DD__LOCALCLOUDDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.SYS_DD__TIMEFORMAT:
				setTimeformat(TIMEFORMAT_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE:
				setArrowheadCertificate(ARROWHEAD_CERTIFICATE_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYS_DD__IDD:
				getIdd().clear();
				return;
			case ArrowheadDSLPackage.SYS_DD__LOCALCLOUDDESIGNDESCRIPTION:
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
			case ArrowheadDSLPackage.SYS_DD__TIMEFORMAT:
				return timeformat != TIMEFORMAT_EDEFAULT;
			case ArrowheadDSLPackage.SYS_DD__ARROWHEAD_CERTIFICATE:
				return arrowheadCertificate != ARROWHEAD_CERTIFICATE_EDEFAULT;
			case ArrowheadDSLPackage.SYS_DD__IDD:
				return idd != null && !idd.isEmpty();
			case ArrowheadDSLPackage.SYS_DD__LOCALCLOUDDESIGNDESCRIPTION:
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
		result.append(" (Timeformat: ");
		result.append(timeformat);
		result.append(", ArrowheadCertificate: ");
		result.append(arrowheadCertificate);
		result.append(')');
		return result.toString();
	}

} //SysDDImpl
