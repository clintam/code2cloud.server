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
package com.tasktop.c2c.server.common.service;

/**
 * @author cmorgan (Tasktop Technologies Inc.)
 * 
 */
public class HttpStatusCodeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public HttpStatusCodeException() {
		super();

	}

	public HttpStatusCodeException(Integer statusCode) {
		super("" + statusCode);

	}

	public HttpStatusCodeException(String statusCodeString) {
		super(statusCodeString);

	}

	/**
	 * @return the statusCode
	 */
	public Integer getStatusCode() {
		try {
			return Integer.parseInt(getMessage());
		} catch (NumberFormatException e) {
			return null;
		}
	}

}
