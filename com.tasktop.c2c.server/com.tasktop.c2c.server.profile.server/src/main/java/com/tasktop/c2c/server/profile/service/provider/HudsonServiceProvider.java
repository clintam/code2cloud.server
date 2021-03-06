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
package com.tasktop.c2c.server.profile.service.provider;

import org.springframework.stereotype.Service;

import com.tasktop.c2c.server.profile.service.HudsonService;
import com.tasktop.c2c.server.profile.service.HudsonServiceClient;

@Service("hudsonServiceProvider")
public class HudsonServiceProvider extends AbstractPreAuthServiceProvider<HudsonServiceClient> {

	protected HudsonServiceProvider() {
		super("/hudson");
	}

	@Override
	protected HudsonServiceClient getNewService() {
		// TODO autowire with a factory
		return new HudsonServiceClient();
	}

	public HudsonService getHudsonService(String projectIdentifier) {
		return getService(projectIdentifier);
	}

}
