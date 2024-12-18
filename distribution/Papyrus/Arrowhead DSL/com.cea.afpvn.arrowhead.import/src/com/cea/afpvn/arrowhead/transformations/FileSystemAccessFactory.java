/*****************************************************************************
 * Copyright (c) 2018 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package com.cea.afpvn.arrowhead.transformations;

import org.eclipse.core.resources.IProject;

/**
 * Factory for creating (project-based) file access objects
 */
public class FileSystemAccessFactory {
	public static IPFileSystemAccess create(IProject project) {
		return new ProjectBasedFileAccess(project);
	}

	public static IPFileSystemAccess create(IProject project, String subFolder) {
		return new ProjectBasedFileAccess(project, subFolder);
	}
}