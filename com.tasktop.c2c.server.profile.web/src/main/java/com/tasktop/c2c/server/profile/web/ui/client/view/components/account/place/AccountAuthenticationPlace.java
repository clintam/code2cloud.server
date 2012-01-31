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
package com.tasktop.c2c.server.profile.web.ui.client.view.components.account.place;

import com.google.gwt.place.shared.Place;

public class AccountAuthenticationPlace extends Place {

	private boolean changePassword = false;
	private boolean addSshKey = false;

	public AccountAuthenticationPlace(boolean changePassword, boolean addSshKey) {
		this.changePassword = changePassword;
		this.addSshKey = addSshKey;
	}

	public boolean isChangePassword() {
		return changePassword;
	}

	public boolean isAddSshKey() {
		return addSshKey;
	}
}