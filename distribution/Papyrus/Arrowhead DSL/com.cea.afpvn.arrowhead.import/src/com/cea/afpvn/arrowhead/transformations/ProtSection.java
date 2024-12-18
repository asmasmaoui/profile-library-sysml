/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Yoann Farre (CIL4Sys) - Bug 553420
 *****************************************************************************/

package com.cea.afpvn.arrowhead.transformations;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

import org.eclipse.core.runtime.IPath;


/**
 * Handling of protected sections as in Acceleo, i.e. code sections
 * that are not overwritten by the generator.
 */
public class ProtSection {
	/**
	 * Tag for start of protected section
	 */
	private static final String START_OF_USER_CODE = "Start of user code "; //$NON-NLS-1$

	/**
	 * Tag for end of protected section
	 */
	private static final String END_OF_USER_CODE = "End of user code"; //$NON-NLS-1$

	/**
	 * start of protected section
	 */
	public static String protSection(String header) {
		return String.format(START_OF_USER_CODE + "%s", header); //$NON-NLS-1$
	}

	/**
	 * Return the content with protected sections
	 * @param location the location of an existing file on disk
	 * @param content the content that should be written (from generator)
	 * @return the content enriched with sections from existing file
	 */
	public static String mergeProtectedSections(IPath location, String content) {
		int idx = 0;
		boolean inProtSection = false;
		String protSection = ""; //$NON-NLS-1$

		FileInputStream input;

		try {
			input = new FileInputStream(location.toFile());
			// avoid error in files using special chars
			CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder(); //$NON-NLS-1$
			decoder.onMalformedInput(CodingErrorAction.IGNORE);
			InputStreamReader inputStreamReader = new InputStreamReader(input, decoder);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			String line = null;

			while ((line = bufferedReader.readLine()) != null) {

				if (line.contains(START_OF_USER_CODE)) {
					int newIdx = content.indexOf(line.trim(), idx);
					if (newIdx == -1) {
						idx = 0;
					} else {
						inProtSection = true;
						protSection = ""; //$NON-NLS-1$
						idx = newIdx + line.trim().length() + 1;
					}
				} else if (inProtSection) {
					if (line.contains(END_OF_USER_CODE) && inProtSection) {
						inProtSection = false;
						int endIdx = content.indexOf(END_OF_USER_CODE, idx);
						// scan back to start of line
						while ((endIdx >= 0) && content.charAt(endIdx) != '\n') {
							endIdx--;
						}
						content = content.substring(0, idx) + protSection + content.substring(endIdx + 1);
						idx += protSection.length();
					} else {
						protSection += line + '\n';
					}
				}
			}
			bufferedReader.close();

		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		return content;
	}

	/**
	 * A protected section (TODO: find old code - specific Acceleo keyword?)
	 */
	public static String protSection() {
		return END_OF_USER_CODE;
	}
}
