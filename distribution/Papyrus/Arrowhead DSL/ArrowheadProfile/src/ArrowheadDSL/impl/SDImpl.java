/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.SD;

import ArrowheadDSL.SysD;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.SDImpl#getMicroserviceName <em>Microservice Name</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.SDImpl#getSysd <em>Sysd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDImpl extends BlockImpl implements SD {
	/**
	 * The default value of the '{@link #getMicroserviceName() <em>Microservice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroserviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String MICROSERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMicroserviceName() <em>Microservice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroserviceName()
	 * @generated
	 * @ordered
	 */
	protected String microserviceName = MICROSERVICE_NAME_EDEFAULT;

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
	protected SDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.SD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMicroserviceName() {
		return microserviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMicroserviceName(String newMicroserviceName) {
		String oldMicroserviceName = microserviceName;
		microserviceName = newMicroserviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SD__MICROSERVICE_NAME, oldMicroserviceName, microserviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SysD> getSysd() {
		if (sysd == null) {
			sysd = new EObjectWithInverseResolvingEList.ManyInverse<SysD>(SysD.class, this, ArrowheadDSLPackage.SD__SYSD, ArrowheadDSLPackage.SYS_D__SD);
		}
		return sysd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Operation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ArrowheadDSLPackage.SD__SYSD:
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
			case ArrowheadDSLPackage.SD__SYSD:
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
			case ArrowheadDSLPackage.SD__MICROSERVICE_NAME:
				return getMicroserviceName();
			case ArrowheadDSLPackage.SD__SYSD:
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
			case ArrowheadDSLPackage.SD__MICROSERVICE_NAME:
				setMicroserviceName((String)newValue);
				return;
			case ArrowheadDSLPackage.SD__SYSD:
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
			case ArrowheadDSLPackage.SD__MICROSERVICE_NAME:
				setMicroserviceName(MICROSERVICE_NAME_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SD__SYSD:
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
			case ArrowheadDSLPackage.SD__MICROSERVICE_NAME:
				return MICROSERVICE_NAME_EDEFAULT == null ? microserviceName != null : !MICROSERVICE_NAME_EDEFAULT.equals(microserviceName);
			case ArrowheadDSLPackage.SD__SYSD:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ArrowheadDSLPackage.SD___OPERATION:
				Operation();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (MicroserviceName: ");
		result.append(microserviceName);
		result.append(')');
		return result.toString();
	}

} //SDImpl