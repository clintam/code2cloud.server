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

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.eclipse.persistence.annotations.Convert;

/**
 * Profiles generated by hbm2java
 */
@Entity
@Table(name = "profiles", uniqueConstraints = { @UniqueConstraint(columnNames = "login_name"),
		@UniqueConstraint(columnNames = "extern_id") })
@SuppressWarnings("serial")
public class Profile extends AbstractIdentified<Integer> implements java.io.Serializable {

	private Integer userid;
	private String loginName;
	private String cryptpassword;
	private String realname;
	private String disabledtext;
	private boolean disableMail;
	private boolean mybugslink;
	private String gravatarHash;
	private Set<Logincookie> logincookieses = new HashSet<Logincookie>(0);
	private Set<Vote> voteses = new HashSet<Vote>(0);
	private Set<UserGroupMap> userGroupMaps = new HashSet<UserGroupMap>(0);
	private Set<Quips> quipses = new HashSet<Quips>(0);
	private Set<NamedqueryLinkInFooter> namedqueriesLinkInFooters = new HashSet<NamedqueryLinkInFooter>(0);
	private Set<Task> assigneeTasks = new HashSet<Task>(0);
	private Set<LoginFailure> loginFailures = new HashSet<LoginFailure>(0);
	private Set<ComponentCc> componentCcs = new HashSet<ComponentCc>(0);
	private Set<EmailSetting> emailSettings = new HashSet<EmailSetting>(0);
	private Set<ProfileSetting> profileSettings = new HashSet<ProfileSetting>(0);
	private Set<Task> reporterTasks = new HashSet<Task>(0);
	private Set<Flags> flagsesForSetterId = new HashSet<Flags>(0);
	private Set<Series> serieses = new HashSet<Series>(0);
	private Set<Component> componentsesForInitialqacontact = new HashSet<Component>(0);
	private Set<Component> initialOwnerComponents = new HashSet<Component>(0);
	private Set<ProfileActivity> profilesActivitiesForWho = new HashSet<ProfileActivity>(0);
	private Set<Watch> watchsForWatched = new HashSet<Watch>(0);
	private Set<TaskActivity> bugsActivities = new HashSet<TaskActivity>(0);
	private Set<ProfileActivity> profilesActivitiesForUserid = new HashSet<ProfileActivity>(0);
	private Set<Cc> ccs = new HashSet<Cc>(0);
	private Set<Flags> flagsesForRequesteeId = new HashSet<Flags>(0);
	private Set<Token> tokenses = new HashSet<Token>(0);
	private Set<WhineEvent> whineEventses = new HashSet<WhineEvent>(0);
	private Set<Watch> watchsForWatcher = new HashSet<Watch>(0);
	private Set<Attachment> attachmentses = new HashSet<Attachment>(0);
	private Set<Namedquery> namedquerieses = new HashSet<Namedquery>(0);
	private Set<Comment> comments = new HashSet<Comment>(0);

	public Profile() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "userid", unique = true, nullable = false)
	@Override
	public Integer getId() {
		return this.userid;
	}

	@Override
	public void setId(Integer userid) {
		this.userid = userid;
	}

	@Column(name = "login_name", unique = true, nullable = false)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "cryptpassword", length = 128)
	public String getCryptpassword() {
		return this.cryptpassword;
	}

	public void setCryptpassword(String cryptpassword) {
		this.cryptpassword = cryptpassword;
	}

	@Column(name = "realname", nullable = false)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "disabledtext", nullable = false, length = 16777215)
	public String getDisabledtext() {
		return this.disabledtext;
	}

	public void setDisabledtext(String disabledtext) {
		this.disabledtext = disabledtext;
	}

	@Column(name = "disable_mail", nullable = false)
	@Convert("booleanToByte")
	public boolean getDisableMail() {
		return this.disableMail;
	}

	public void setDisableMail(boolean disableMail) {
		this.disableMail = disableMail;
	}

	@Column(name = "mybugslink", nullable = false)
	@Convert("booleanToByte")
	public boolean getMybugslink() {
		return this.mybugslink;
	}

	public void setMybugslink(boolean mybugslink) {
		this.mybugslink = mybugslink;
	}

	/**
	 * the extern_id is used to store the gravatar hash
	 */
	@Column(name = "extern_id", unique = true, length = 64)
	public String getGravatarHash() {
		return this.gravatarHash;
	}

	public void setGravatarHash(String gravatarHash) {
		this.gravatarHash = gravatarHash;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<Logincookie> getLogincookieses() {
		return this.logincookieses;
	}

	public void setLogincookieses(Set<Logincookie> logincookieses) {
		this.logincookieses = logincookieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<Vote> getVoteses() {
		return this.voteses;
	}

	public void setVoteses(Set<Vote> voteses) {
		this.voteses = voteses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<UserGroupMap> getUserGroupMaps() {
		return this.userGroupMaps;
	}

	public void setUserGroupMaps(Set<UserGroupMap> userGroupMaps) {
		this.userGroupMaps = userGroupMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<Quips> getQuipses() {
		return this.quipses;
	}

	public void setQuipses(Set<Quips> quipses) {
		this.quipses = quipses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<NamedqueryLinkInFooter> getNamedqueriesLinkInFooters() {
		return this.namedqueriesLinkInFooters;
	}

	public void setNamedqueriesLinkInFooters(Set<NamedqueryLinkInFooter> namedqueriesLinkInFooters) {
		this.namedqueriesLinkInFooters = namedqueriesLinkInFooters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assignee")
	public Set<Task> getAssigneeTasks() {
		return this.assigneeTasks;
	}

	public void setAssigneeTasks(Set<Task> assigneeTasks) {
		this.assigneeTasks = assigneeTasks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<LoginFailure> getLoginFailures() {
		return this.loginFailures;
	}

	public void setLoginFailures(Set<LoginFailure> loginFailures) {
		this.loginFailures = loginFailures;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<ComponentCc> getComponentCcs() {
		return this.componentCcs;
	}

	public void setComponentCcs(Set<ComponentCc> componentCcs) {
		this.componentCcs = componentCcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<EmailSetting> getEmailSettings() {
		return this.emailSettings;
	}

	public void setEmailSettings(Set<EmailSetting> emailSettings) {
		this.emailSettings = emailSettings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<ProfileSetting> getProfileSettings() {
		return this.profileSettings;
	}

	public void setProfileSettings(Set<ProfileSetting> profileSettings) {
		this.profileSettings = profileSettings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reporter")
	public Set<Task> getReporterTasks() {
		return this.reporterTasks;
	}

	public void setReporterTasks(Set<Task> bugsesForReporter) {
		this.reporterTasks = bugsesForReporter;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilesBySetterId")
	public Set<Flags> getFlagsesForSetterId() {
		return this.flagsesForSetterId;
	}

	public void setFlagsesForSetterId(Set<Flags> flagsesForSetterId) {
		this.flagsesForSetterId = flagsesForSetterId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<Series> getSerieses() {
		return this.serieses;
	}

	public void setSerieses(Set<Series> serieses) {
		this.serieses = serieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilesByInitialqacontact")
	public Set<Component> getComponentsesForInitialqacontact() {
		return this.componentsesForInitialqacontact;
	}

	public void setComponentsesForInitialqacontact(Set<Component> componentsesForInitialqacontact) {
		this.componentsesForInitialqacontact = componentsesForInitialqacontact;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "initialOwner")
	public Set<Component> getInitialOwnerComponents() {
		return this.initialOwnerComponents;
	}

	public void setInitialOwnerComponents(Set<Component> initialOwnerComponents) {
		this.initialOwnerComponents = initialOwnerComponents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilesByWho")
	public Set<ProfileActivity> getProfilesActivitiesForWho() {
		return this.profilesActivitiesForWho;
	}

	public void setProfilesActivitiesForWho(Set<ProfileActivity> profilesActivitiesForWho) {
		this.profilesActivitiesForWho = profilesActivitiesForWho;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilesByWatched")
	public Set<Watch> getWatchsForWatched() {
		return this.watchsForWatched;
	}

	public void setWatchsForWatched(Set<Watch> watchsForWatched) {
		this.watchsForWatched = watchsForWatched;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<TaskActivity> getBugsActivities() {
		return this.bugsActivities;
	}

	public void setBugsActivities(Set<TaskActivity> bugsActivities) {
		this.bugsActivities = bugsActivities;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilesByUserid")
	public Set<ProfileActivity> getProfilesActivitiesForUserid() {
		return this.profilesActivitiesForUserid;
	}

	public void setProfilesActivitiesForUserid(Set<ProfileActivity> profilesActivitiesForUserid) {
		this.profilesActivitiesForUserid = profilesActivitiesForUserid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<Cc> getCcs() {
		return this.ccs;
	}

	public void setCcs(Set<Cc> ccs) {
		this.ccs = ccs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilesByRequesteeId")
	public Set<Flags> getFlagsesForRequesteeId() {
		return this.flagsesForRequesteeId;
	}

	public void setFlagsesForRequesteeId(Set<Flags> flagsesForRequesteeId) {
		this.flagsesForRequesteeId = flagsesForRequesteeId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<Token> getTokenses() {
		return this.tokenses;
	}

	public void setTokenses(Set<Token> tokenses) {
		this.tokenses = tokenses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<WhineEvent> getWhineEventses() {
		return this.whineEventses;
	}

	public void setWhineEventses(Set<WhineEvent> whineEventses) {
		this.whineEventses = whineEventses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilesByWatcher")
	public Set<Watch> getWatchsForWatcher() {
		return this.watchsForWatcher;
	}

	public void setWatchsForWatcher(Set<Watch> watchsForWatcher) {
		this.watchsForWatcher = watchsForWatcher;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<Attachment> getAttachmentses() {
		return this.attachmentses;
	}

	public void setAttachmentses(Set<Attachment> attachmentses) {
		this.attachmentses = attachmentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profiles")
	public Set<Namedquery> getNamedquerieses() {
		return this.namedquerieses;
	}

	public void setNamedquerieses(Set<Namedquery> namedquerieses) {
		this.namedquerieses = namedquerieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profile")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

}