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
package com.tasktop.c2c.server.profile.web.ui.server.action;

import net.customware.gwt.dispatch.server.ExecutionContext;
import net.customware.gwt.dispatch.shared.DispatchException;

import org.springframework.stereotype.Component;

import com.tasktop.c2c.server.tasks.shared.action.RenderWikiTextAction;
import com.tasktop.c2c.server.tasks.shared.action.RenderWikiTextResult;

/**
 * @author cmorgan (Tasktop Technologies Inc.)
 * 
 */
@Component
public class RenderWikiTextActionHandler extends AbstractTaskActionHandler<RenderWikiTextAction, RenderWikiTextResult> {

	@Override
	public RenderWikiTextResult execute(RenderWikiTextAction action, ExecutionContext context) throws DispatchException {
		return new RenderWikiTextResult(getService(action.getProjectId()).renderWikiMarkupAsHtml(action.getWikiText()));
	}

}
