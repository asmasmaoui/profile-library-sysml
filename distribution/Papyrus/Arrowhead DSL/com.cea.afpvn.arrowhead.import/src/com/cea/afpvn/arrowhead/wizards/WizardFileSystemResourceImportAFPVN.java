package com.cea.afpvn.arrowhead.wizards;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.internal.wizards.datatransfer.WizardFileSystemResourceImportPage1;


public class WizardFileSystemResourceImportAFPVN extends WizardResourceImportPage {
	
	public WizardFileSystemResourceImportAFPVN(String aWorkbench, IStructuredSelection selection) {
		super(aWorkbench, selection);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * public WizardFileSystemResourceImportAFPVN() { // TODO Auto-generated
	 * constructor stub }
	 */

	public java.util.List getSelectedResourcesAfpvn()
	{
		return getSelectedResources();
	}
	
	@Override
	protected void createSourceGroup(Composite parent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected ITreeContentProvider getFileProvider() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected ITreeContentProvider getFolderProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
