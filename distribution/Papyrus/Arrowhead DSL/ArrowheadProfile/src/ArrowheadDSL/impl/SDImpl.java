/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.IDD;
import ArrowheadDSL.IDD_Implementation;
import ArrowheadDSL.SD;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InterfaceBlockImpl;
import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>SD</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.SDImpl#getMicroserviceName <em>Microservice Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDImpl extends InterfaceBlockImpl implements SD {
	/**
	 * The default value of the '{@link #getMicroserviceName() <em>Microservice Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMicroserviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String MICROSERVICE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.SD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMicroserviceName() {
		// get MicrosystemName Element
						String name = null;
						if (this instanceof IDD_Implementation) {
							Classifier classifier = this.getBase_Class();
							if (classifier.getGenerals() != null && !classifier.getGenerals().isEmpty())
								name = classifier.allParents().get(0).getGenerals().get(0).getName();
							
						}else if (this instanceof IDD) {
							Classifier classifier = this.getBase_Class();
							if (classifier.getGenerals() != null && !classifier.getGenerals().isEmpty())
								name = classifier.getGenerals().get(0).getName();
							
						} else if (this instanceof SD) {
							SD sdElement = (SD) this;
							name = sdElement.getBase_Class().getName();
						}
				
						return name;
			
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMicroserviceName(String newMicroserviceName) {
		// TODO: implement this method to set the 'Microservice Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void Operation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.SD__MICROSERVICE_NAME:
				return getMicroserviceName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadDSLPackage.SD__MICROSERVICE_NAME:
				setMicroserviceName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArrowheadDSLPackage.SD__MICROSERVICE_NAME:
				setMicroserviceName(MICROSERVICE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArrowheadDSLPackage.SD__MICROSERVICE_NAME:
				return MICROSERVICE_NAME_EDEFAULT == null ? getMicroserviceName() != null : !MICROSERVICE_NAME_EDEFAULT.equals(getMicroserviceName());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

} // SDImpl
