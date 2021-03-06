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
 * SeriesData generated by hbm2java
 */
@Entity
@Table(name = "series_data", uniqueConstraints = @UniqueConstraint(columnNames = { "series_id", "series_date" }))
@SuppressWarnings("serial")
public class SeriesData implements java.io.Serializable {

	private SeriesDataId id;
	private Series series;

	public SeriesData() {
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "seriesId", column = @Column(name = "series_id", nullable = false)),
			@AttributeOverride(name = "seriesDate", column = @Column(name = "series_date", nullable = false, length = 19)),
			@AttributeOverride(name = "seriesValue", column = @Column(name = "series_value", nullable = false)) })
	public SeriesDataId getId() {
		return this.id;
	}

	public void setId(SeriesDataId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "series_id", nullable = false, insertable = false, updatable = false)
	public Series getSeries() {
		return this.series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

}
