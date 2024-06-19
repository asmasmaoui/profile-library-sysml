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
package com.cea.afpvn.arrowhead.handler;

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
import com.cea.afpvn.arrowhead.wizards.Messages;
import com.google.common.collect.Sets;

/**
 * The handler to run AASX import action when a file is selected.
 */
public class TransfoSysmlHandler {

	/**
	 * the extensions of the files to import
	 */
	private Set<String> extensionOfFilesToImport;

	IResource project;

	/**
	 * Constructor.
	 */
	public TransfoSysmlHandler() {

		extensionOfFilesToImport = Sets.newHashSet(Messages.RELS_FILE_EXTENSION);
	}

	public void importFiles(Set<IFile> filesToImport) {

		Control baseControl = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		runTransformation(null, baseControl, filesToImport);

	}

	public IFile getAASXRelationshipRootFile(IResource project) {

		this.project = project;
		IFile returnedfile = null;
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IPath path = project.getLocation();
		System.out.println(path);
		IContainer container = myWorkspaceRoot.getContainerForLocation(path);

		IResource[] iResources;
		try {
			iResources = container.members();

			for (IResource iR : iResources) {

				if (iR.getType() == IResource.FOLDER && iR.getName().equals("aasx")) {

					IPath path2 = iR.getLocation();
					IContainer container2 = myWorkspaceRoot.getContainerForLocation(path2);
					IResource[] iResources2 = container2.members();
					for (IResource iR2 : iResources2) {

						if (iR2.getType() == IResource.FOLDER && iR2.getName().equals("_rels")) {
							IPath path3 = iR2.getLocation();
							IContainer container3 = myWorkspaceRoot.getContainerForLocation(path3);
							IResource[] iResources3 = container3.members();
							for (IResource iR3 : iResources3) {
								if (iR3 instanceof IFile) {
									if ("rels".equalsIgnoreCase(iR3.getFileExtension())
											&& iR3.getName().equals("aasx-origin.rels"))
										returnedfile = (IFile) iR3;
								}
							}
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

	public Object execute(IProject project) throws ExecutionException {

		// get the Project and parse its sub folder

		Set<IFile> filesToImport = new HashSet<IFile>();

		IFile selectedFile = getAASXRootFile(project);

		filesToImport.add(selectedFile);

		importFiles(filesToImport);

		return null;
	}

	private IFile getAASXRootFile(IProject project) {
		IFile aasx_origin = getAASXRelationshipRootFile(project);
		IFile aasx_root = null;
		String aasx_path = null;
		try {
			if (aasx_origin != null) {
				File fXmlFile = new File(aasx_origin.getLocationURI());
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder;
				dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);

				// optional, but recommended
				// read this -
				// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
				doc.getDocumentElement().normalize();

				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				NodeList relationships = doc.getElementsByTagName("Relationship");
				for (int temp = 0; temp < relationships.getLength(); temp++) {
					Node nNode = relationships.item(temp);
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						if (eElement.getAttribute("Type")
								.equals("http://www.admin-shell.io/aasx/relationships/aas-spec")) {
							aasx_path = eElement.getAttribute("Target");
							IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
							IProject myProject = myWorkspaceRoot.getProject(project.getName());
							IContainer container = (IContainer) myProject;
							IResource file = container.findMember(aasx_path);

							if (file != null && file instanceof IFile) {
								// set the result to be the first file found
								aasx_root = (IFile) file;
							}

						}	            

					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(aasx_root.getLocationURI());
		System.out.println(aasx_root.getFullPath());
		System.out.println(aasx_root.getFileExtension());
		return aasx_root;
	}

	private IFile getFileInProject(IContainer myProject, String file_name) {
		IFile returnedfile = null;
		IResource[] iResources;
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		try {
			iResources = myProject.members();

			for (IResource iR : iResources) {

				if (iR.getType() == IResource.FOLDER) {

					IPath path2 = iR.getLocation();
					IContainer container2 = myWorkspaceRoot.getContainerForLocation(path2);
					IResource[] iResources2 = container2.members();
					for (IResource iR2 : iResources2) {

						if (iR2.getType() == IResource.FOLDER) {
							IPath path3 = iR2.getLocation();
							IContainer container3 = myWorkspaceRoot.getContainerForLocation(path3);
							IResource[] iResources3 = container3.members();
							for (IResource iR3 : iResources3) {
								if (iR3 instanceof IFile) {
									if ("rels".equalsIgnoreCase(iR3.getFileExtension())
											&& iR3.getName().equals(file_name))
										returnedfile = (IFile) iR3;
								}
							}
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
		Sysml2fromSysml1TransformationLauncher launcher = new Sysml2fromSysml1TransformationLauncher(config, baseControl,
				project);
		launcher.run(urisToImport);
	}
}
