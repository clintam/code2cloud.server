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
package com.tasktop.c2c.server.internal.tasks.domain;

// Generated May 26, 2010 11:31:55 AM by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * KeywordsId generated by hbm2java
 */
@Embeddable
@SuppressWarnings("serial")
public class KeywordId implements java.io.Serializable {

	private int bugId;
	private short keywordid;

	public KeywordId() {
	}

	public KeywordId(int bugId, short keywordid) {
		this.bugId = bugId;
		this.keywordid = keywordid;
	}

	@Column(name = "bug_id", nullable = false)
	public int getBugId() {
		return this.bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
	}

	@Column(name = "keywordid", nullable = false)
	public short getKeywordid() {
		return this.keywordid;
	}

	public void setKeywordid(short keywordid) {
		this.keywordid = keywordid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KeywordId))
			return false;
		KeywordId castOther = (KeywordId) other;

		return (this.getBugId() == castOther.getBugId()) && (this.getKeywordid() == castOther.getKeywordid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBugId();
		result = 37 * result + this.getKeywordid();
		return result;
	}

}
