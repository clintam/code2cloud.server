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
package com.tasktop.c2c.server.profile.tests.domain.mock;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;


import com.tasktop.c2c.server.cloud.domain.ServiceType;
import com.tasktop.c2c.server.profile.domain.internal.ProjectService;


public class MockProjectServiceFactory {

	private static int created = 0;

	public static ProjectService create(EntityManager entityManager) {
		return create(entityManager, 1).get(0);
	}

	public static List<ProjectService> create(EntityManager entityManager, int count) {
		List<ProjectService> mocks = new ArrayList<ProjectService>(count);
		for (int x = 0; x < count; ++x) {
			ProjectService mock = populate(new ProjectService());
			if (entityManager != null) {
				entityManager.persist(mock);
			}
			mocks.add(mock);
		}
		return mocks;
	}

	private synchronized static ProjectService populate(ProjectService mock) {
		++created;
		mock.setType(ServiceType.SCM);
		mock.setUriPattern("/git/.+\\.git.*");
		return mock;
	}

}
