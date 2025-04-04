package com.cea.afpvn.arrowhead.handler;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;

import org.eclipse.papyrus.uml.m2m.qvto.common.MigrationParameters.ThreadConfig;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.common.collect.Sets;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.uml.m2m.qvto.common.MigrationParameters.ThreadConfig;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;

import com.cea.afpvn.arrowhead.transformations.Sysml2fromSysml1TransformationLauncher;
import com.cea.afpvn.arrowhead.transformations.Sysml2fromSysml1TransformationLauncherAFPVN;

public class ImportSysml2HandlerAFPVN {
	IResource project;

	public ImportSysml2HandlerAFPVN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void importFiles(Set<IFile> filesToImport) {

		Control baseControl = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		runTransformation(null, baseControl, filesToImport);

	}

	@SuppressWarnings("static-access")
	public Object execute(IProject project) throws ExecutionException {

		// get the Project and parse its sub folder

				Set<IFile> filesToImport = new HashSet<IFile>();

				IFile selectedFile = getUMLRootFile(project);

				filesToImport.add(selectedFile);

				importFiles(filesToImport);

		return null;
	}





	private IFile getUMLRootFile(IProject project) {
		this.project = project;
		IFile returnedfile = null;
		IWorkspace myWorkspaceRoot = ResourcesPlugin.getWorkspace();
		IPath path =myWorkspaceRoot.getRoot().getLocation();
		IContainer container = myWorkspaceRoot.getRoot().getContainerForLocation(path);
		IResource[] iResources;
		try {
			iResources = container.members();

			for (IResource iR : iResources) {
				
				
				if (iR.getType() == IResource.PROJECT) {

					IPath path2 = iR.getLocation();
					IContainer container2 = myWorkspaceRoot.getRoot().getContainerForLocation(path2);
					IResource[] iResources2 = container2.members();
					for (IResource iR2 : iResources2) {
						if (iR2 instanceof IFile) {
							if ("uml".equalsIgnoreCase(iR2.getFileExtension()))
								returnedfile = (IFile) iR2;
						}
					}
				}
								
								

			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnedfile;

		}

	protected void runTransformation(final ThreadConfig config, final Control baseControl,
			final Set<IFile> filesToImport) {
		List<URI> urisToImport = new LinkedList<URI>();

		for (IFile selectedFile : filesToImport) {

			URI uri = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);

			urisToImport.add(uri);
		}
		runTransformation(config, baseControl, urisToImport, project);
	}

	protected void runTransformation(final ThreadConfig config, final Control baseControl, final List<URI> urisToImport,
			IResource project) {
		Sysml2fromSysml1TransformationLauncherAFPVN launcher = new Sysml2fromSysml1TransformationLauncherAFPVN(config, baseControl,
				project);
		launcher.run(urisToImport);
	}

}
