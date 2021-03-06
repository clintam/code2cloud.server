/*******************************************************************************
 * Copyright (c) 2010, 2012 Tasktop Technologies
 * Copyright (c) 2010, 2011 SpringSource, a division of VMware
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Tasktop Technologies - initial API and implementation
 ******************************************************************************/
package com.tasktop.c2c.server.cloud.service;

import com.tasktop.c2c.server.cloud.domain.Node;
import com.tasktop.c2c.server.cloud.domain.Task;

/**
 * Allocation process: creates a node by copying a given template, then add a disk, then start, then check that the node
 * is ready.
 * 
 */
public class NodeWithExtraDiskCreationService extends BasicNodeCreationService {

	private int diskSize = 26214400;

	protected void configureNodeBeforeStarting(Node node) {
		logger.info("Allocating disk for node " + node.getName());
		Task diskAlocationTask = cloudService.allocateDisk(node, diskSize);
		waitForTask(diskAlocationTask);
		logger.info("Allocation done for node " + node.getName());
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

}
