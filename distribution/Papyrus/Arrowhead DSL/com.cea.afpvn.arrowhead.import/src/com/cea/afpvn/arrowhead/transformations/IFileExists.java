/*******************************************************************************
 * Copyright (c) 2020 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     CEA LIST - initial API and implementation
 *
 *******************************************************************************/

package com.cea.afpvn.arrowhead.transformations;


/**
 * Part of IFileSystemAccess, might be implemented by sub classes
 */
public interface IFileExists {
	/**
	 * Check, whether the file with the given name exists
	 *
	 * @param fileName
	 *            filename using '/' as file separator
	 * @return true, if file exists
	 */
	public boolean existsFile(String fileName);
}