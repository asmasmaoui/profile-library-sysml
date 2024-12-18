/*****************************************************************************
 * Copyright (c) 2018 CEA LIST and others.
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

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Subset of apache.commons.io.IOUtils (copy that avoid dependency on nightly Papyrus)
 */
public class IOUtilsTmp {

	/**
	 * @param input1
	 *            an input stream
	 * @param input2
	 *            another input stream
	 * @return true, iff the contents of the two streams is equal
	 * @throws IOException
	 */
	static boolean contentEquals(InputStream input1, InputStream input2)
			throws IOException {
		if (input1 == input2) {
			return true;
		}
		if (!(input1 instanceof BufferedInputStream)) {
			input1 = new BufferedInputStream(input1);
		}
		if (!(input2 instanceof BufferedInputStream)) {
			input2 = new BufferedInputStream(input2);
		}

		int ch = input1.read();
		while (-1 != ch) {
			final int ch2 = input2.read();
			if (ch != ch2) {
				return false;
			}
			ch = input1.read();
		}

		final int ch2 = input2.read();
		return ch2 == -1;
	}
}
