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
package com.tasktop.c2c.server.common.web.client.widgets.chooser.person;

import com.tasktop.c2c.server.common.web.client.widgets.chooser.AbstractSuggestOracle;
import com.tasktop.c2c.server.common.web.client.widgets.chooser.ValueSuggestionService;

public class PersonSuggestOracle extends AbstractSuggestOracle {
	public PersonSuggestOracle(ValueSuggestionService personService) {
		super(personService);
	}

	@Override
	protected Suggestion createSuggestion(Object value) {
		return new PersonSuggestion((Person) value);
	}
}
