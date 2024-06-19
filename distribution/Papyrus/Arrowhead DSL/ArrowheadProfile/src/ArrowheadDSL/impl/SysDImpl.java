/**
 */
package ArrowheadDSL.impl;

import ArrowheadDSL.ArrowheadDSLPackage;
import ArrowheadDSL.BusinessPolicyKind;
import ArrowheadDSL.SysD;
import ArrowheadDSL.SystemDatabaseKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ArrowheadDSL.impl.SysDImpl#getMicrosystemName <em>Microsystem Name</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.SysDImpl#getFunctionalProperties <em>Functional Properties</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.SysDImpl#getSystemDatabase <em>System Database</em>}</li>
 *   <li>{@link ArrowheadDSL.impl.SysDImpl#getMicrosystemBehaviour <em>Microsystem Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SysDImpl extends BlockImpl implements SysD {
	/**
	 * The cached value of the '{@link #getMicrosystemName() <em>Microsystem Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrosystemName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> microsystemName;

	/**
	 * The cached value of the '{@link #getFunctionalProperties() <em>Functional Properties</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> functionalProperties;

	/**
	 * The default value of the '{@link #getSystemDatabase() <em>System Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final SystemDatabaseKind SYSTEM_DATABASE_EDEFAULT = SystemDatabaseKind.MY_SQL;

	/**
	 * The cached value of the '{@link #getSystemDatabase() <em>System Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDatabase()
	 * @generated
	 * @ordered
	 */
	protected SystemDatabaseKind systemDatabase = SYSTEM_DATABASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMicrosystemBehaviour() <em>Microsystem Behaviour</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrosystemBehaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessPolicyKind> microsystemBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadDSLPackage.Literals.SYS_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMicrosystemName() {
		if (microsystemName == null) {
			microsystemName = new EDataTypeUniqueEList<String>(String.class, this, ArrowheadDSLPackage.SYS_D__MICROSYSTEM_NAME);
		}
		return microsystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFunctionalProperties() {
		if (functionalProperties == null) {
			functionalProperties = new EDataTypeEList<Integer>(Integer.class, this, ArrowheadDSLPackage.SYS_D__FUNCTIONAL_PROPERTIES);
		}
		return functionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemDatabaseKind getSystemDatabase() {
		return systemDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemDatabase(SystemDatabaseKind newSystemDatabase) {
		SystemDatabaseKind oldSystemDatabase = systemDatabase;
		systemDatabase = newSystemDatabase == null ? SYSTEM_DATABASE_EDEFAULT : newSystemDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadDSLPackage.SYS_D__SYSTEM_DATABASE, oldSystemDatabase, systemDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusinessPolicyKind> getMicrosystemBehaviour() {
		if (microsystemBehaviour == null) {
			microsystemBehaviour = new EDataTypeEList<BusinessPolicyKind>(BusinessPolicyKind.class, this, ArrowheadDSLPackage.SYS_D__MICROSYSTEM_BEHAVIOUR);
		}
		return microsystemBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadDSLPackage.SYS_D__MICROSYSTEM_NAME:
				return getMicrosystemName();
			case ArrowheadDSLPackage.SYS_D__FUNCTIONAL_PROPERTIES:
				return getFunctionalProperties();
			case ArrowheadDSLPackage.SYS_D__SYSTEM_DATABASE:
				return getSystemDatabase();
			case ArrowheadDSLPackage.SYS_D__MICROSYSTEM_BEHAVIOUR:
				return getMicrosystemBehaviour();
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
			case ArrowheadDSLPackage.SYS_D__MICROSYSTEM_NAME:
				getMicrosystemName().clear();
				getMicrosystemName().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadDSLPackage.SYS_D__FUNCTIONAL_PROPERTIES:
				getFunctionalProperties().clear();
				getFunctionalProperties().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArrowheadDSLPackage.SYS_D__SYSTEM_DATABASE:
				setSystemDatabase((SystemDatabaseKind)newValue);
				return;
			case ArrowheadDSLPackage.SYS_D__MICROSYSTEM_BEHAVIOUR:
				getMicrosystemBehaviour().clear();
				getMicrosystemBehaviour().addAll((Collection<? extends BusinessPolicyKind>)newValue);
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
			case ArrowheadDSLPackage.SYS_D__MICROSYSTEM_NAME:
				getMicrosystemName().clear();
				return;
			case ArrowheadDSLPackage.SYS_D__FUNCTIONAL_PROPERTIES:
				getFunctionalProperties().clear();
				return;
			case ArrowheadDSLPackage.SYS_D__SYSTEM_DATABASE:
				setSystemDatabase(SYSTEM_DATABASE_EDEFAULT);
				return;
			case ArrowheadDSLPackage.SYS_D__MICROSYSTEM_BEHAVIOUR:
				getMicrosystemBehaviour().clear();
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
			case ArrowheadDSLPackage.SYS_D__MICROSYSTEM_NAME:
				return microsystemName != null && !microsystemName.isEmpty();
			case ArrowheadDSLPackage.SYS_D__FUNCTIONAL_PROPERTIES:
				return functionalProperties != null && !functionalProperties.isEmpty();
			case ArrowheadDSLPackage.SYS_D__SYSTEM_DATABASE:
				return systemDatabase != SYSTEM_DATABASE_EDEFAULT;
			case ArrowheadDSLPackage.SYS_D__MICROSYSTEM_BEHAVIOUR:
				return microsystemBehaviour != null && !microsystemBehaviour.isEmpty();
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
		result.append(" (MicrosystemName: ");
		result.append(microsystemName);
		result.append(", FunctionalProperties: ");
		result.append(functionalProperties);
		result.append(", SystemDatabase: ");
		result.append(systemDatabase);
		result.append(", MicrosystemBehaviour: ");
		result.append(microsystemBehaviour);
		result.append(')');
		return result.toString();
	}

} //SysDImpl
