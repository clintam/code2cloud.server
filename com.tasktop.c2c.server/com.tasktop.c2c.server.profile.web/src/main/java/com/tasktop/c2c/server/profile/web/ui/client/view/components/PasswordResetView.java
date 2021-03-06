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
package com.tasktop.c2c.server.profile.web.ui.client.view.components;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.tasktop.c2c.server.common.web.client.view.AbstractComposite;

public class PasswordResetView extends AbstractComposite {

	interface Binder extends UiBinder<Widget, PasswordResetView> {
	}

	private static Binder uiBinder = GWT.create(Binder.class);

	@UiField
	public TextBox password;
	@UiField
	public TextBox passwordConfirm;
	@UiField
	public Button submitButton;

	public PasswordResetView() {
		initWidget(uiBinder.createAndBindUi(this));
		hookDefaultButton(submitButton);
	}
}
