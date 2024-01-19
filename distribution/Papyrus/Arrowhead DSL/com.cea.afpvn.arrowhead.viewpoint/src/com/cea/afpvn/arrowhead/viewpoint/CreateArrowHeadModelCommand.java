package com.cea.afpvn.arrowhead.viewpoint;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.architecture.commands.IModelCreationCommand;
import org.eclipse.papyrus.sysml16.util.SysMLResource;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * The Class CreateSysMLModelCommand.
 */
public class CreateArrowHeadModelCommand extends ModelCreationCommandBase implements IModelCreationCommand {

	/**
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#createRootElement()
	 *
	 * @return
	 */
	
	public static final String PROFILES_PATHMAP = "pathmap://Arrowhead_Profile/"; //$NON-NLS-1$

	public static final String ArrowHead_PROFILE_URI = PROFILES_PATHMAP + "ArrowheadProfile_v5.0.profile.uml"; //$NON-NLS-1$

	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	/**
	 * A standard SysML model should have : - the SysML profile applied - the UML standard profile applied - the UML primitive library imported - the SysML library imported
	 * 
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#initializeModel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param owner
	 */

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		Package packageOwner = (Package) owner;

		Profile arrowheadProfile = (Profile) PackageUtil.loadPackage(URI.createURI(ArrowHead_PROFILE_URI),
				owner.eResource().getResourceSet());
		if (arrowheadProfile != null) {
			PackageUtil.applyProfile((Package) owner, arrowheadProfile, true);
		}
		
		// Retrieve SysML profile and apply with Sub-profile
		Profile sysml = (Profile) PackageUtil.loadPackage(URI.createURI(SysMLResource.PROFILE_PATH), owner.eResource().getResourceSet());
		if (sysml != null) {
			PackageUtil.applyProfile(packageOwner, sysml, true);
		}

		Profile standardUMLProfile = (Profile) PackageUtil.loadPackage(URI.createURI(UMLResource.STANDARD_PROFILE_URI), owner.eResource().getResourceSet());
		if (standardUMLProfile != null) {
			PackageUtil.applyProfile(packageOwner, standardUMLProfile, true);
		}

		Package umlPrimitiveTypes = PackageUtil.loadPackage(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), owner.eResource().getResourceSet());
		if (umlPrimitiveTypes != null) {
			PackageImport pi = UMLFactory.eINSTANCE.createPackageImport();
			pi.setImportedPackage(umlPrimitiveTypes);
			packageOwner.getPackageImports().add(pi);
		}

		Package sysmlLibrary = PackageUtil.loadPackage(URI.createURI(SysMLResource.LIBRARY_PATH), owner.eResource().getResourceSet());
		if (sysmlLibrary != null) {
			PackageImport pi = UMLFactory.eINSTANCE.createPackageImport();
			pi.setImportedPackage(sysmlLibrary);
			packageOwner.getPackageImports().add(pi);
		}

	}

}
