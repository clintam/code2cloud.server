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
 * UserGroupMapId generated by hbm2java
 */
@Embeddable
@SuppressWarnings("serial")
public class UserGroupMapId implements java.io.Serializable {

	private int userId;
	private int groupId;
	private byte isbless;
	private byte grantType;

	public UserGroupMapId() {
	}

	public UserGroupMapId(int userId, int groupId, byte isbless, byte grantType) {
		this.userId = userId;
		this.groupId = groupId;
		this.isbless = isbless;
		this.grantType = grantType;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "group_id", nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Column(name = "isbless", nullable = false)
	public byte getIsbless() {
		return this.isbless;
	}

	public void setIsbless(byte isbless) {
		this.isbless = isbless;
	}

	@Column(name = "grant_type", nullable = false)
	public byte getGrantType() {
		return this.grantType;
	}

	public void setGrantType(byte grantType) {
		this.grantType = grantType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserGroupMapId))
			return false;
		UserGroupMapId castOther = (UserGroupMapId) other;

		return (this.getUserId() == castOther.getUserId()) && (this.getGroupId() == castOther.getGroupId())
				&& (this.getIsbless() == castOther.getIsbless()) && (this.getGrantType() == castOther.getGrantType());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getGroupId();
		result = 37 * result + this.getIsbless();
		result = 37 * result + this.getGrantType();
		return result;
	}

}