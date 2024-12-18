/*******************************************************************************
 * Copyright (c) 2018 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     CEA LIST - initial API and implementation
 *******************************************************************************/

package com.cea.afpvn.arrowhead.transformations;

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Interface to implemented by a FileSystemAccess to indicate that it enables
 * a cleanup of non-generated files.
 */
public interface ICleanUntouched {

	/**
	 * Remove files for which no code has been generated. This enables the
	 * removal of old code e.g. after a suppression or renaming of elements
	 * in the model.
	 *
	 * @param folder
	 *            a folder from which cleaning should start
	 * @param monitor
	 *            a progress monitor
	 * @throws CoreException
	 *             a possible exception during file operations
	 */
	public void cleanUntouched(IFolder folder, IProgressMonitor monitor) throws CoreException;

	/**
	 * Remove files for which no code has been generated. This enables the
	 * removal of old code e.g. after a suppression or renaming of elements
	 * in the model.
	 *
	 * @param folder
	 *            a folder from which cleaning should start
	 * @param keepFiles
	 *            a list of filenames corresponding to files that should be kept.
	 * @param monitor
	 *            a progress monitor
	 * @throws CoreException
	 *             a possible exception during file operations
	 */
	public void cleanUntouched(IFolder folder, List<String> keepFiles, IProgressMonitor monitor) throws CoreException;
}

