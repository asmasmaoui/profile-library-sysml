/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.ArrowheadDSLRequirement;
import ArrowheadDSL.ArrowheadUseCase;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.sysml16.requirements.internal.impl.RequirementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.ArrowheadDSLRequirementImpl#getArrowheadusecase <em>Arrowheadusecase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowheadDSLRequirementImpl extends RequirementImpl implements ArrowheadDSLRequirement {
	/**
	 * The cached value of the '{@link #getArrowheadusecase() <em>Arrowheadusecase</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowheadusecase()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrowheadUseCase> arrowheadusecase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowheadDSLRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.ARROWHEAD_DSL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrowheadUseCase> getArrowheadusecase() {
		if (arrowheadusecase == null) {
			arrowheadusecase = new EObjectWithInverseResolvingEList.ManyInverse<ArrowheadUseCase>(ArrowheadUseCase.class, this, ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE, ArrowheadDSLPackage.ARROWHEAD_USE_CASE__ARROWHEADDSLREQUIREMENT);
		}
		return arrowheadusecase;
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArrowheadusecase()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE:
				return ((InternalEList<?>)getArrowheadusecase()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE:
				return getArrowheadusecase();
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE:
				getArrowheadusecase().clear();
				getArrowheadusecase().addAll((Collection<? extends ArrowheadUseCase>)newValue);
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE:
				getArrowheadusecase().clear();
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_REQUIREMENT__ARROWHEADUSECASE:
				return arrowheadusecase != null && !arrowheadusecase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrowheadDSLRequirementImpl
