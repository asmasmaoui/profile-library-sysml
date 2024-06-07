package com.cea.afpvn.arrowhead.wizards;
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


import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.wizards.datatransfer.WizardArchiveFileResourceImportPage1;
import org.eclipse.ui.internal.wizards.datatransfer.WizardFileSystemResourceImportPage1;

/**
 *
 * Import page
 *
 */
public class ImportFilePage extends WizardFileSystemResourceImportPage1 {

	
	private static final String STORE_SOURCE_NAMES_ID = "WizardZipFileResourceImportPage1.STORE_SOURCE_NAMES_ID"; //$NON-NLS-1$
	/**
	 * the selected file path
	 */
	public IPath selectedFilePath;

	
	/**
	 *
	 * Constructor.
	 * @param allowedfiles2 
	 *
	 * @param pageName
	 *            the name of the import page
	 * @param title
	 *            the title of the page
	 * @param titleImage
	 *            the image for this page
	 * @param tableManager
	 *            the table manager where the import will be done
	 */
	public ImportFilePage(IWorkbench name,
			IStructuredSelection selection, String[] allowedfiles) {
		super(name,selection);
		
		this.selectedFilePath = null;
	}

	public ImportFilePage(IWorkbench workbench, IStructuredSelection selection, String[] allowedfiles,
			IPath newFilePath) {
		super(workbench,selection);
		this.selectedFilePath = newFilePath;
		setContainerFieldValue(newFilePath.lastSegment());
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	protected void saveWidgetValues() {
		IDialogSettings settings = super.getDialogSettings();
		if (settings != null) {
			// update source names history
			String[] sourceNames = settings.getArray(STORE_SOURCE_NAMES_ID);
			if (sourceNames == null) {
				sourceNames = new String[0];
			}

			sourceNames = addToHistory(sourceNames, sourceNameField.getText());
			
			
		}
	}

	public IPath getFilePath ()
	{
		return selectedFilePath;
	}


	@Override
	protected void restoreWidgetValues() {
		
	}

	
	public void setFilePath (IPath projectPath)
	{
		selectedFilePath= projectPath;
	}


}
