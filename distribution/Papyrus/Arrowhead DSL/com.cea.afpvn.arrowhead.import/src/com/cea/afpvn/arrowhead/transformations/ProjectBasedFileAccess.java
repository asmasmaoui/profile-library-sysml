/*****************************************************************************
 * Copyright (c) 2021, 2022 CEA LIST and others.
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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * A simple class providing access to the file system relative to a specified project
 */
public class ProjectBasedFileAccess implements IPFileSystemAccess, ICleanUntouched, IFileExists {

	IProject project;

	String subFolderName;

	/**
	 * Store information which files have been created in a hash map
	 */
	protected Map<String, Boolean> touched;

	/**
	 * force an update of resources (currently always true)
	 */
	final static boolean force = true;

	/**
	 * Create a project based file access for a specific project.
	 *
	 * @param project
	 *            the project for which file system access is provided
	 */
	public ProjectBasedFileAccess(IProject project) {
		this(project, null);
	}

	/**
	 * Create a project based file access for a specific project.
	 *
	 * @param project
	 *            the project for which file system access is provided
	 * @param subFolderName
	 *            a sub-folder within the project, e.g. "src"
	 */
	public ProjectBasedFileAccess(IProject project, String subFolderName) {
		setProject(project, subFolderName);
		touched = new HashMap<String, Boolean>();
	}

	/**
	 * Set/update project, reset subFolderName to null
	 *
	 * @param project
	 *            the project for which file system access is provided
	 */
	public void setProject(IProject project) {
		setProject(project, null);
	}

	/**
	 * Set/update project and sub-folder
	 *
	 * @param project
	 *            the project for which file system access is provided
	 * @param subFolderName
	 *            a sub-folder within the project, e.g. "src"
	 */
	public void setProject(IProject project, String subFolderName) {
		this.project = project;
		this.subFolderName = subFolderName;
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.common.base.file.IPFileSystemAccess#generateFile(java.lang.String, java.lang.String)
	 *
	 * @param fileName
	 *            the filename relative to the project and sub-folder specified in the constructor. Use
	 *            '/' (IPFileSystemAccess.SEP_CHAR) as separation character
	 * @param content
	 *            the content to write
	 */
	public void generateFile(String fileName, String content) {
		IFile file = getFile(fileName);
		touched.put(file.getFullPath().toString(), true);
		try {
			boolean needsRefresh = false;
			if (file.exists()) {
				content = ProtSection.mergeProtectedSections(file.getLocation(), content);
				InputStream contentStream = new ByteArrayInputStream(content.getBytes());
				if (!IOUtilsTmp.contentEquals(file.getContents(), contentStream)) {
					if (force) {
						contentStream.reset();
						file.setContents(contentStream, true, true, null);
						needsRefresh = true;
					}
					// else - file is not updated
				}
			} else {
				// the file does not exists
				InputStream contentStream = new ByteArrayInputStream(content.getBytes());
				file.create(contentStream, true, null);
				needsRefresh = true;
			}
			// Refresh the container for the newly created files. This needs to be done even
			// during error because of the possibility for partial results.
			if (needsRefresh) {
				file.refreshLocal(IResource.DEPTH_INFINITE, null);
			}
		} catch (CoreException e) {
			throw new RuntimeException(e);
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.common.base.file.IPFileSystemAccess#deleteFile(java.lang.String)
	 *
	 * @param fileName
	 *            the filename relative to the project and sub-folder specified in the constructor
	 */
	public void deleteFile(String fileName) {
		IFile file = getFile(fileName);
		try {
			if (file.exists()) {
				file.delete(force, null);
			}
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Return a container (folder) for a given filename.
	 * Folders will be created, if the do not exist (comparable to "mkdir -p" in Unix).
	 *
	 * @param filename
	 *            a filename with the '/' as separation character
	 * @return file for this element
	 */
	public IFile getFile(String filename) {
		String paths[] = filename.split(IPFileSystemAccess.SEP_CHAR);
		try {
			IContainer packageContainer = getFolder(project, subFolderName);
			for (int i = 0; i < paths.length - 1; i++) {
				String path = paths[i];
				packageContainer = getFolder(packageContainer, path);
				touched.put(packageContainer.getFullPath().toString(), true);
			}
			String last = paths[paths.length - 1];
			return getFile(packageContainer, last);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Return the a sub-folder from a given container
	 *
	 * @param container
	 *            a container (must be a project or a folder)
	 * @param folderName
	 *            the name of a sub-folder within the container. If null, original container is returned.
	 * @return the sub-folder if it exists, null otherwise
	 */
	protected IContainer getFolder(IContainer container, String folderName) throws CoreException {
		if (folderName == null) {
			return container;
		}
		IFolder folder = null;
		if (container instanceof IFolder) {
			folder = ((IFolder) container).getFolder(folderName);
		} else if (container instanceof IProject) {
			folder = ((IProject) container).getFolder(folderName);
		}
		if (folder != null && !folder.exists()) {
			folder.create(false, true, null);
		}
		return folder;
	}

	/**
	 * Return a file within a container
	 *
	 * @param container
	 *            a container (must be a project or a folder)
	 * @param fileName
	 *            the name of a file within the container.
	 * @return the file if it exists, null otherwise
	 */
	public IFile getFile(IContainer container, String fileName) {
		if (container instanceof IFolder) {
			return ((IFolder) container).getFile(fileName);
		} else if (container instanceof IProject) {
			return ((IProject) container).getFile(fileName);
		}
		return null;
	}

	/**
	 * @see org.eclipse.papyrus.infra.tools.file.ICleanUntouched#cleanUntouched(IFolder, IProgressMonitor)
	 *
	 * @param folder
	 *            a folder. If it does not exist, no cleaning is done
	 * @param monitor
	 *            a progress monitor
	 * @throws CoreException
	 */
	@Override
	public void cleanUntouched(IFolder folder, IProgressMonitor monitor) throws CoreException {
		if (folder.exists()) {
			for (IResource resource : folder.members()) {
				if (resource instanceof IFolder) {
					cleanUntouched((IFolder) resource, monitor);
				}
				if (!touched.containsKey(resource.getFullPath().toString())) {
					resource.delete(false, monitor);
				}
			}
		}
	}


	/**
	 * @see org.eclipse.papyrus.designer.languages.common.base.file.ICleanUntouched#cleanUntouched(org.eclipse.core.resources.IFolder, org.eclipse.emf.common.util.EList, org.eclipse.core.runtime.IProgressMonitor)
	 *
	 * @param folder
	 *            a folder. If it does not exist, no cleaning is done
	 * @param keepFilestouched
	 *            a list of filenames corresponding to files that should be kept.
	 * @param monitor
	 *            a progress monitor
	 * @throws CoreException
	 */
	@Override
	public void cleanUntouched(IFolder folder, List<String> keepFiles, IProgressMonitor monitor) throws CoreException {
		for (String fileName : keepFiles) {
			touched.put(fileName, true);
		}
		cleanUntouched(folder, monitor);
	}

	/**
	 * @see org.eclipse.papyrus.designer.languages.common.base.file.IFileExists#existsFile(java.lang.String)
	 *
	 * @param fileName
	 *            a file name
	 * @return true, if the file exists
	 */
	@Override
	public boolean existsFile(String fileName) {
		IFile file = getFile(fileName);
		return file != null && file.exists();
	}
}
