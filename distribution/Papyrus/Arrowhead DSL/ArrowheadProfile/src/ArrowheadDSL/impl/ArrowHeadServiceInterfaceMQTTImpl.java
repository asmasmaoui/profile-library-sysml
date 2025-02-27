/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowHeadServiceInterfaceMQTT;
import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.MQTT50MessageTypeKind;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow Head Service Interface MQTT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.ArrowHeadServiceInterfaceMQTTImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.ArrowHeadServiceInterfaceMQTTImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.ArrowHeadServiceInterfaceMQTTImpl#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowHeadServiceInterfaceMQTTImpl extends MinimalEObjectImpl.Container implements ArrowHeadServiceInterfaceMQTT {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final MQTT50MessageTypeKind METHOD_EDEFAULT = MQTT50MessageTypeKind.CONNECT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected MQTT50MessageTypeKind method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected String topic = TOPIC_EDEFAULT;

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
	protected ArrowHeadServiceInterfaceMQTTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.ARROW_HEAD_SERVICE_INTERFACE_MQTT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MQTT50MessageTypeKind getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(MQTT50MessageTypeKind newMethod) {
		MQTT50MessageTypeKind oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopic(String newTopic) {
		String oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__TOPIC, oldTopic, topic));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__BASE_OPERATION, oldBase_Operation, base_Operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__METHOD:
				return getMethod();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__TOPIC:
				return getTopic();
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__BASE_OPERATION:
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
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__METHOD:
				setMethod((MQTT50MessageTypeKind)newValue);
				return;
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__TOPIC:
				setTopic((String)newValue);
				return;
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__BASE_OPERATION:
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
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__TOPIC:
				setTopic(TOPIC_EDEFAULT);
				return;
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__BASE_OPERATION:
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
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__METHOD:
				return method != METHOD_EDEFAULT;
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__TOPIC:
				return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
			case ArrowheadDSLPackage.ARROW_HEAD_SERVICE_INTERFACE_MQTT__BASE_OPERATION:
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
		result.append(", Topic: ");
		result.append(topic);
		result.append(')');
		return result.toString();
	}

} //ArrowHeadServiceInterfaceMQTTImpl
