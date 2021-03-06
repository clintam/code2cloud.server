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

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Watch generated by hbm2java
 */
@Entity
@Table(name = "watch", uniqueConstraints = @UniqueConstraint(columnNames = { "watcher", "watched" }))
@SuppressWarnings("serial")
public class Watch implements java.io.Serializable {

	private WatchId id;
	private Profile profilesByWatcher;
	private Profile profilesByWatched;

	public Watch() {
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "watcher", column = @Column(name = "watcher", nullable = false)),
			@AttributeOverride(name = "watched", column = @Column(name = "watched", nullable = false)) })
	public WatchId getId() {
		return this.id;
	}

	public void setId(WatchId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "watcher", nullable = false, insertable = false, updatable = false)
	public Profile getProfilesByWatcher() {
		return this.profilesByWatcher;
	}

	public void setProfilesByWatcher(Profile profilesByWatcher) {
		this.profilesByWatcher = profilesByWatcher;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "watched", nullable = false, insertable = false, updatable = false)
	public Profile getProfilesByWatched() {
		return this.profilesByWatched;
	}

	public void setProfilesByWatched(Profile profilesByWatched) {
		this.profilesByWatched = profilesByWatched;
	}

}
