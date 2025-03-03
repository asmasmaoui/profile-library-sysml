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

package com.cea.afpvn.arrowhead.viewpoint;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.VisibilityKind;

public class PortViewFactory extends AbstractBasicViewFactory {

	/**
	 * Base element of SysML Port
	 */
	private static final String PORT = "Port";//$NON-NLS-1$
	/**
	 * visual ID for name label of border item
	 */
	protected static final String OPERATION_BORDER_ITEM_LABEL = "Operation_BorderItem_Label";//$NON-NLS-1$

	@Override
	public Node createElementView(EObject domainElement, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(semanticHint);
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, PORT);
		Node label5125 = createLabel(node, OPERATION_BORDER_ITEM_LABEL);
		label5125.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5125 = (Location) label5125.getLayoutConstraint();
		location5125.setX(25);
		location5125.setY(3);
		if (domainElement instanceof Port)
		{
			Port port = (Port) domainElement;
			port.setVisibility(VisibilityKind.PUBLIC_LITERAL);
		}
		return node;
	}

}
