/*****************************************************************************
 * Copyright (c) 2023 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Asma Smaoui (CEA LIST) asma.smaoui@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package com.cea.afpvn.arrowhead.wizards;

import org.eclipse.osgi.util.NLS;


/**
 * The messages.
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "com.cea.afpvn.arrowhead.wizards.messages"; //$NON-NLS-1$
	

	public static String WizardTitle ; 
	
	
	public static String SelectTheFileToImport ; 
	
	public static String RELS_FILE_EXTENSION ;

	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
		
	}

	private Messages() {
	}
}
