/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.IDD_Implementation;
import ArrowheadDSL.LocalcloudImplementation;
import ArrowheadDSL.System_Implementation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.System_ImplementationImpl#getIdd_implementation <em>Idd implementation</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.System_ImplementationImpl#getLoclacloudimplementation <em>Loclacloudimplementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class System_ImplementationImpl extends SysDDImpl implements System_Implementation {
	/**
	 * The cached value of the '{@link #getIdd_implementation() <em>Idd implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdd_implementation()
	 * @generated
	 * @ordered
	 */
	protected EList<IDD_Implementation> idd_implementation;

	/**
	 * The cached value of the '{@link #getLoclacloudimplementation() <em>Loclacloudimplementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoclacloudimplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalcloudImplementation> loclacloudimplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected System_ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.SYSTEM_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDD_Implementation> getIdd_implementation() {
		if (idd_implementation == null) {
			idd_implementation = new EObjectWithInverseResolvingEList.ManyInverse<IDD_Implementation>(IDD_Implementation.class, this, ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION, ArrowheadDSLPackage.IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION);
		}
		return idd_implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalcloudImplementation> getLoclacloudimplementation() {
		if (loclacloudimplementation == null) {
			loclacloudimplementation = new EObjectWithInverseResolvingEList.ManyInverse<LocalcloudImplementation>(LocalcloudImplementation.class, this, ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION, ArrowheadDSLPackage.LOCALCLOUD_IMPLEMENTATION__SYSTEMIMPLEMENTATION);
		}
		return loclacloudimplementation;
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
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdd_implementation()).basicAdd(otherEnd, msgs);
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoclacloudimplementation()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION:
				return ((InternalEList<?>)getIdd_implementation()).basicRemove(otherEnd, msgs);
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION:
				return ((InternalEList<?>)getLoclacloudimplementation()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION:
				return getIdd_implementation();
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION:
				return getLoclacloudimplementation();
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
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION:
				getIdd_implementation().clear();
				getIdd_implementation().addAll((Collection<? extends IDD_Implementation>)newValue);
				return;
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION:
				getLoclacloudimplementation().clear();
				getLoclacloudimplementation().addAll((Collection<? extends LocalcloudImplementation>)newValue);
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
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION:
				getIdd_implementation().clear();
				return;
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION:
				getLoclacloudimplementation().clear();
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
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION:
				return idd_implementation != null && !idd_implementation.isEmpty();
			case ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__LOCLACLOUDIMPLEMENTATION:
				return loclacloudimplementation != null && !loclacloudimplementation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //System_ImplementationImpl
