package com.cea.afpvn.arrowhead.wizards;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
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

import com.cea.afpvn.arrowhead.transformations.Sysml2fromSysml1TransformationLauncher;

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

		Set<IFile> filesToImport = new HashSet<IFile>();
        importFiles(filesToImport);

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