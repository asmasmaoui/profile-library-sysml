/*****************************************************************************
 * Copyright (c) 2019 CEA LIST, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package com.cea.afpvn.arrowhead.types.advices;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import ArrowheadDSL.ArrowheadDSLPackage;

/**
 * Dialog for initialization of Part (Property) type (the type is either selected or created).
 */
public class CreateOrSelectLCDPropertyTypeDialog extends CreateOrSelectTypeWithNameDialog {

	public CreateOrSelectLCDPropertyTypeDialog(Shell shell, NamedElement owner/*,IElementType elementType*/) {
		super(shell, owner, ElementTypeRegistry.getInstance().getType("com.example.arrowheadDSL.LocalCloudDesign_UML::Class"),
				UMLPackage.eINSTANCE.getTypedElement_Type(),  ArrowheadDSLPackage.eINSTANCE.getLocalCloudDesign(), 
				UMLElementTypes.PACKAGE, UMLPackage.eINSTANCE.getPackage_PackagedElement(), null);
	}
	
	
	
	 
}

