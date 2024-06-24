/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.ArrowheadDSLRequirement;
import ArrowheadDSL.ArrowheadUseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrowhead Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.ArrowheadUseCaseImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.ArrowheadUseCaseImpl#getArrowheaddslrequirement <em>Arrowheaddslrequirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowheadUseCaseImpl extends MinimalEObjectImpl.Container implements ArrowheadUseCase {
	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase base_UseCase;

	/**
	 * The cached value of the '{@link #getArrowheaddslrequirement() <em>Arrowheaddslrequirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowheaddslrequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrowheadDSLRequirement> arrowheaddslrequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowheadUseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.ARROWHEAD_USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadDSLPackage.ARROWHEAD_USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_UseCase(UseCase newBase_UseCase) {
		UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.ARROWHEAD_USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrowheadDSLRequirement> getArrowheaddslrequirement() {
		if (arrowheaddslrequirement == null) {
			arrowheaddslrequirement = new EObjectWithInverseResolvingEList.ManyInverse<ArrowheadDSLRequirement>(ArrowheadDSLRequirement.class, this, ArrowheadDSLPackage.ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT, ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE);
		}
		return arrowheaddslrequirement;
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
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArrowheaddslrequirement()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT:
				return ((InternalEList<?>)getArrowheaddslrequirement()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT:
				return getArrowheaddslrequirement();
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
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT:
				getArrowheaddslrequirement().clear();
				getArrowheaddslrequirement().addAll((Collection<? extends ArrowheadDSLRequirement>)newValue);
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
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT:
				getArrowheaddslrequirement().clear();
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
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__BASE_USE_CASE:
				return base_UseCase != null;
			case ArrowheadDSLPackage.ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT:
				return arrowheaddslrequirement != null && !arrowheaddslrequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrowheadUseCaseImpl
