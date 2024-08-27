package com.cea.afpvn.arrowhead.handler;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.uml.m2m.qvto.common.MigrationParameters.ThreadConfig;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import com.cea.afpvn.arrowhead.transformations.Sysml2fromSysml1TransformationLauncher;
import com.cea.afpvn.arrowhead.transformations.SysmtoSysml2Switch;
import com.cea.afpvn.arrowhead.wizards.ImportAFPVNWizard;

public class ImportSysml2Handler {
	IResource project;
	
	public ImportSysml2Handler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void importFiles(Set<IFile> filesToImport) {

		Control baseControl = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		runTransformation(null, baseControl, filesToImport);

	}

	public Object execute(IProject project) throws ExecutionException {

		// get the Project and parse its sub folder
		SysmtoSysml2Switch transformation = new SysmtoSysml2Switch();
		ImportAFPVNWizard  addfile = new ImportAFPVNWizard();
		Set<IResource> sysmlElements = new HashSet<IResource>();
		Set<IFile> filesToImport = new HashSet<IFile>();
        importFiles(filesToImport);
        try {
			IResource[] elements = project.members();
			for (IResource elem : elements) {

				System.out.println( elem.getName());
				
				if (elem.getName().endsWith(".uml"))
						{
					sysmlElements.add(elem);
					addfile.saveInProject(project, elem.getName());
					transformation.doTransform(elem);
						}
				
				
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      

		return null;
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
		Sysml2fromSysml1TransformationLauncher launcher = new Sysml2fromSysml1TransformationLauncher(config, baseControl,
				project);
		launcher.run(urisToImport);
	}

}
