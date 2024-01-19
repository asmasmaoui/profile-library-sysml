/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.IDD_Implementation;

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
 * An implementation of the model object '<em><b>IDD Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.IDD_ImplementationImpl#getSystemimplementation <em>Systemimplementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDD_ImplementationImpl extends IDDImpl implements IDD_Implementation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDD_ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.IDD_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_Implementation> getSystemimplementation() {
		if (systemimplementation == null) {
			systemimplementation = new EObjectWithInverseResolvingEList.ManyInverse<System_Implementation>(System_Implementation.class, this, ArrowheadDSLPackage.IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION, ArrowheadDSLPackage.SYSTEM_IMPLEMENTATION__IDD_IMPLEMENTATION);
		}
		return systemimplementation;
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
			case ArrowheadDSLPackage.IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystemimplementation()).basicAdd(otherEnd, msgs);
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
			case ArrowheadDSLPackage.IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				return ((InternalEList<?>)getSystemimplementation()).basicRemove(otherEnd, msgs);
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
			case ArrowheadDSLPackage.IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				return getSystemimplementation();
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
			case ArrowheadDSLPackage.IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				getSystemimplementation().clear();
				getSystemimplementation().addAll((Collection<? extends System_Implementation>)newValue);
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
			case ArrowheadDSLPackage.IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				getSystemimplementation().clear();
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
			case ArrowheadDSLPackage.IDD_IMPLEMENTATION__SYSTEMIMPLEMENTATION:
				return systemimplementation != null && !systemimplementation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IDD_ImplementationImpl
