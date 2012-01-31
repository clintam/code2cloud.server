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

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TsJob generated by hbm2java
 */
@Entity
@Table(name = "ts_job", uniqueConstraints = @UniqueConstraint(columnNames = { "funcid", "uniqkey" }))
@SuppressWarnings("serial")
public class TsJob implements java.io.Serializable {

	private Integer jobid;
	private int funcid;
	private byte[] arg;
	private String uniqkey;
	private Integer insertTime;
	private int runAfter;
	private int grabbedUntil;
	private Short priority;
	private String coalesce;

	public TsJob() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "jobid", unique = true, nullable = false)
	public Integer getJobid() {
		return this.jobid;
	}

	public void setJobid(Integer jobid) {
		this.jobid = jobid;
	}

	@Column(name = "funcid", nullable = false)
	public int getFuncid() {
		return this.funcid;
	}

	public void setFuncid(int funcid) {
		this.funcid = funcid;
	}

	@Column(name = "arg")
	public byte[] getArg() {
		return this.arg;
	}

	public void setArg(byte[] arg) {
		this.arg = arg;
	}

	@Column(name = "uniqkey")
	public String getUniqkey() {
		return this.uniqkey;
	}

	public void setUniqkey(String uniqkey) {
		this.uniqkey = uniqkey;
	}

	@Column(name = "insert_time")
	public Integer getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Integer insertTime) {
		this.insertTime = insertTime;
	}

	@Column(name = "run_after", nullable = false)
	public int getRunAfter() {
		return this.runAfter;
	}

	public void setRunAfter(int runAfter) {
		this.runAfter = runAfter;
	}

	@Column(name = "grabbed_until", nullable = false)
	public int getGrabbedUntil() {
		return this.grabbedUntil;
	}

	public void setGrabbedUntil(int grabbedUntil) {
		this.grabbedUntil = grabbedUntil;
	}

	@Column(name = "priority")
	public Short getPriority() {
		return this.priority;
	}

	public void setPriority(Short priority) {
		this.priority = priority;
	}

	@Column(name = "coalesce")
	public String getCoalesce() {
		return this.coalesce;
	}

	public void setCoalesce(String coalesce) {
		this.coalesce = coalesce;
	}

}