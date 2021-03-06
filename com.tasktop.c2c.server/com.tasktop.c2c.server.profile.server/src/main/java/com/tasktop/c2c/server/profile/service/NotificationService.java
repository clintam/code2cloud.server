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
package com.tasktop.c2c.server.profile.service;

import java.util.List;


import com.tasktop.c2c.server.profile.domain.internal.NotificationSettings;
import com.tasktop.c2c.server.tasks.domain.TaskActivity;

/**
 * @author Clint Morgan <clint.morgan@tasktop.com> (Tasktop Technologies Inc.)
 *
 */
public interface NotificationService {

	NotificationSettings constructDefaultSettings();

	void processTaskActivity(List<TaskActivity> activities);

}
