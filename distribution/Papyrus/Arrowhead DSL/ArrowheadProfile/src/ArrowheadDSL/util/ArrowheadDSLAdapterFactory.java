/**
 */
package ArrowheadDSL.util;

import ArrowheadDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ArrowheadDSL.ArrowheadDSLPackage
 * @generated
 */
public class ArrowheadDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArrowheadDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArrowheadDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowheadDSLSwitch<Adapter> modelSwitch =
		new ArrowheadDSLSwitch<Adapter>() {
			@Override
			public Adapter caseSysD(SysD object) {
				return createSysDAdapter();
			}
			@Override
			public Adapter caseSD(SD object) {
				return createSDAdapter();
			}
			@Override
			public Adapter caseArrowheadDSLRequirement(ArrowheadDSLRequirement object) {
				return createArrowheadDSLRequirementAdapter();
			}
			@Override
			public Adapter caseArrowheadUseCase(ArrowheadUseCase object) {
				return createArrowheadUseCaseAdapter();
			}
			@Override
			public Adapter caseLocalCloudDesign(LocalCloudDesign object) {
				return createLocalCloudDesignAdapter();
			}
			@Override
			public Adapter caseSystem_of_LocalcloudsDesign(System_of_LocalcloudsDesign object) {
				return createSystem_of_LocalcloudsDesignAdapter();
			}
			@Override
			public Adapter caseDeviceDesign(DeviceDesign object) {
				return createDeviceDesignAdapter();
			}
			@Override
			public Adapter caseIntracloudNetworkDesign(IntracloudNetworkDesign object) {
				return createIntracloudNetworkDesignAdapter();
			}
			@Override
			public Adapter caseIntercloudNetworkDesign(IntercloudNetworkDesign object) {
				return createIntercloudNetworkDesignAdapter();
			}
			@Override
			public Adapter caseDeviceDesignDescription(DeviceDesignDescription object) {
				return createDeviceDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseIntracloudNetworkDesignDescription(IntracloudNetworkDesignDescription object) {
				return createIntracloudNetworkDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseIntercloudNetworkDesignDescription(IntercloudNetworkDesignDescription object) {
				return createIntercloudNetworkDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseLocalcloudDesignDescription(LocalcloudDesignDescription object) {
				return createLocalcloudDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseSystem_of_LocacloudsDesignDescription(System_of_LocacloudsDesignDescription object) {
				return createSystem_of_LocacloudsDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseSystem_of_LocalcloudsImplementation(System_of_LocalcloudsImplementation object) {
				return createSystem_of_LocalcloudsImplementationAdapter();
			}
			@Override
			public Adapter caseLocalcloudImplementation(LocalcloudImplementation object) {
				return createLocalcloudImplementationAdapter();
			}
			@Override
			public Adapter caseSystem_Implementation(System_Implementation object) {
				return createSystem_ImplementationAdapter();
			}
			@Override
			public Adapter caseSysDD(SysDD object) {
				return createSysDDAdapter();
			}
			@Override
			public Adapter caseIDD_Implementation(IDD_Implementation object) {
				return createIDD_ImplementationAdapter();
			}
			@Override
			public Adapter caseIDD(IDD object) {
				return createIDDAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.SysD <em>Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.SysD
	 * @generated
	 */
	public Adapter createSysDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.SD <em>SD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.SD
	 * @generated
	 */
	public Adapter createSDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.ArrowheadDSLRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.ArrowheadDSLRequirement
	 * @generated
	 */
	public Adapter createArrowheadDSLRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.ArrowheadUseCase <em>Arrowhead Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.ArrowheadUseCase
	 * @generated
	 */
	public Adapter createArrowheadUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.LocalCloudDesign <em>Local Cloud Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.LocalCloudDesign
	 * @generated
	 */
	public Adapter createLocalCloudDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.System_of_LocalcloudsDesign <em>System of Localclouds Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.System_of_LocalcloudsDesign
	 * @generated
	 */
	public Adapter createSystem_of_LocalcloudsDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.DeviceDesign <em>Device Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.DeviceDesign
	 * @generated
	 */
	public Adapter createDeviceDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.IntracloudNetworkDesign <em>Intracloud Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.IntracloudNetworkDesign
	 * @generated
	 */
	public Adapter createIntracloudNetworkDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.IntercloudNetworkDesign <em>Intercloud Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.IntercloudNetworkDesign
	 * @generated
	 */
	public Adapter createIntercloudNetworkDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.DeviceDesignDescription <em>Device Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.DeviceDesignDescription
	 * @generated
	 */
	public Adapter createDeviceDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.IntracloudNetworkDesignDescription <em>Intracloud Network Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.IntracloudNetworkDesignDescription
	 * @generated
	 */
	public Adapter createIntracloudNetworkDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.IntercloudNetworkDesignDescription <em>Intercloud Network Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.IntercloudNetworkDesignDescription
	 * @generated
	 */
	public Adapter createIntercloudNetworkDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.LocalcloudDesignDescription <em>Localcloud Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.LocalcloudDesignDescription
	 * @generated
	 */
	public Adapter createLocalcloudDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.System_of_LocacloudsDesignDescription <em>System of Locaclouds Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.System_of_LocacloudsDesignDescription
	 * @generated
	 */
	public Adapter createSystem_of_LocacloudsDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.System_of_LocalcloudsImplementation <em>System of Localclouds Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.System_of_LocalcloudsImplementation
	 * @generated
	 */
	public Adapter createSystem_of_LocalcloudsImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.LocalcloudImplementation <em>Localcloud Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.LocalcloudImplementation
	 * @generated
	 */
	public Adapter createLocalcloudImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.System_Implementation <em>System Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.System_Implementation
	 * @generated
	 */
	public Adapter createSystem_ImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.SysDD <em>Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.SysDD
	 * @generated
	 */
	public Adapter createSysDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.IDD_Implementation <em>IDD Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.IDD_Implementation
	 * @generated
	 */
	public Adapter createIDD_ImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ArrowheadDSL.IDD <em>IDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ArrowheadDSL.IDD
	 * @generated
	 */
	public Adapter createIDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml16.blocks.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml16.blocks.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArrowheadDSLAdapterFactory
