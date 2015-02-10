/*-
 *******************************************************************************
 * Copyright (c) 2011, 2014 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Peter Chang - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.eclipse.dawnsci.analysis.api.tree;

/**
 * Top level node that holds entire tree in a file
 */
public interface TreeFile extends Tree {

	/**
	 * @return full path to file (including name)
	 */
	public String getFilename();

	/**
	 * @return full path of parent directory
	 */
	public String getParentDirectory();
}