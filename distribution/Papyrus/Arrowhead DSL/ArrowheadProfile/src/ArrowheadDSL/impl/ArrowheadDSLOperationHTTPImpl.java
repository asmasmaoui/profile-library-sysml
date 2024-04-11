/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLOperationHTTP;
import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.HTTP11MethodKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation HTTP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.ArrowheadDSLOperationHTTPImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.ArrowheadDSLOperationHTTPImpl#getSubURL <em>Sub URL</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.ArrowheadDSLOperationHTTPImpl#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowheadDSLOperationHTTPImpl extends MinimalEObjectImpl.Container implements ArrowheadDSLOperationHTTP {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HTTP11MethodKind METHOD_EDEFAULT = HTTP11MethodKind.POST;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected HTTP11MethodKind method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubURL() <em>Sub URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubURL() <em>Sub URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubURL()
	 * @generated
	 * @ordered
	 */
	protected String subURL = SUB_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Operation() <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Operation()
	 * @generated
	 * @ordered
	 */
	protected Operation base_Operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowheadDSLOperationHTTPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.ARROWHEAD_DSL_OPERATION_HTTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTTP11MethodKind getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(HTTP11MethodKind newMethod) {
		HTTP11MethodKind oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubURL() {
		return subURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubURL(String newSubURL) {
		String oldSubURL = subURL;
		subURL = newSubURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__SUB_URL, oldSubURL, subURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getBase_Operation() {
		if (base_Operation != null && base_Operation.eIsProxy()) {
			InternalEObject oldBase_Operation = (InternalEObject)base_Operation;
			base_Operation = (Operation)eResolveProxy(oldBase_Operation);
			if (base_Operation != oldBase_Operation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__BASE_OPERATION, oldBase_Operation, base_Operation));
			}
		}
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBase_Operation() {
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Operation(Operation newBase_Operation) {
		Operation oldBase_Operation = base_Operation;
		base_Operation = newBase_Operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__METHOD:
				return getMethod();
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__SUB_URL:
				return getSubURL();
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__BASE_OPERATION:
				if (resolve) return getBase_Operation();
				return basicGetBase_Operation();
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__METHOD:
				setMethod((HTTP11MethodKind)newValue);
				return;
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__SUB_URL:
				setSubURL((String)newValue);
				return;
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__BASE_OPERATION:
				setBase_Operation((Operation)newValue);
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__SUB_URL:
				setSubURL(SUB_URL_EDEFAULT);
				return;
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__BASE_OPERATION:
				setBase_Operation((Operation)null);
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
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__METHOD:
				return method != METHOD_EDEFAULT;
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__SUB_URL:
				return SUB_URL_EDEFAULT == null ? subURL != null : !SUB_URL_EDEFAULT.equals(subURL);
			case ArrowheadDSLPackage.ARROWHEAD_DSL_OPERATION_HTTP__BASE_OPERATION:
				return base_Operation != null;
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
		result.append(" (Method: ");
		result.append(method);
		result.append(", SubURL: ");
		result.append(subURL);
		result.append(')');
		return result.toString();
	}

} //ArrowheadDSLOperationHTTPImpl
