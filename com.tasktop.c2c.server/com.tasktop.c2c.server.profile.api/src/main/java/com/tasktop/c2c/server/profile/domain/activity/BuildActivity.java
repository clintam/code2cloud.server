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
package com.tasktop.c2c.server.profile.domain.activity;

import java.util.Date;

import com.tasktop.c2c.server.profile.domain.build.BuildDetails;
import com.tasktop.c2c.server.profile.domain.build.JobSummary;

@SuppressWarnings("serial")
public class BuildActivity extends ProjectActivity {
	private BuildDetails buildDetails;
	private JobSummary jobSummary;

	public BuildActivity() {
		// nothing
	}

	public BuildActivity(BuildDetails buildDetails, JobSummary jobSummary) {
		this.buildDetails = buildDetails;
		this.jobSummary = jobSummary;
		super.setActivityDate(new Date(buildDetails.getTimestamp()));
	}

	public void setJobSummary(JobSummary jobSummary) {
		this.jobSummary = jobSummary;
	}

	public JobSummary getJobSummary() {
		return jobSummary;
	}

	public void setBuildDetails(BuildDetails buildDetails) {
		this.buildDetails = buildDetails;
	}

	public BuildDetails getBuildDetails() {
		return buildDetails;
	}
}
