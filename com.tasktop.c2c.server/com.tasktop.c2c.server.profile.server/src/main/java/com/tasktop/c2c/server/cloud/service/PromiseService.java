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

import com.tasktop.c2c.server.common.service.ValidationException;

/**
 * Responsible for keeping track of outstanding promises for build slaves.
 * 
 * @author cmorgan (Tasktop Technologies Inc.)
 * 
 */
public interface PromiseService {

	int getNumberOfOutstandingPromises();

	boolean isNextPromise(String promiseToken);

	void extendPromise(String promiseToken, long durationInMiliseconds) throws ValidationException;

	void redeem(String promiseToken) throws ValidationException;

	void validateToken(String promiseToken) throws ValidationException;

	String getNewPromiseToken(long durationInMilli);

	boolean hasOutstandingPromises();

	void clearAllPromises();

}