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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Components generated by hbm2java
 */
@Entity
@Table(name = "components", uniqueConstraints = @UniqueConstraint(columnNames = { "product_id", "name" }))
@SuppressWarnings("serial")
public class Component extends AbstractIdentified<Short> implements java.io.Serializable, ReferenceEntity {

	private Short id;
	private Profile profilesByInitialqacontact;
	private Profile initialOwner;
	private Product product;
	private String name;
	private String description;
	private Set<Flaginclusions> flaginclusionses = new HashSet<Flaginclusions>(0);
	private Set<Task> tasks = new HashSet<Task>(0);
	private Set<Flagexclusions> flagexclusionses = new HashSet<Flagexclusions>(0);
	private Set<ComponentCc> componentCcs = new HashSet<ComponentCc>(0);

	public Component() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	@Override
	public Short getId() {
		return this.id;
	}

	@Override
	public void setId(Short id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "initialqacontact")
	public Profile getProfilesByInitialqacontact() {
		return this.profilesByInitialqacontact;
	}

	public void setProfilesByInitialqacontact(Profile profilesByInitialqacontact) {
		this.profilesByInitialqacontact = profilesByInitialqacontact;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "initialowner", nullable = false)
	public Profile getInitialOwner() {
		return this.initialOwner;
	}

	public void setInitialOwner(Profile initialOwner) {
		this.initialOwner = initialOwner;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", nullable = false, length = 16777215)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "components")
	public Set<Flaginclusions> getFlaginclusionses() {
		return this.flaginclusionses;
	}

	public void setFlaginclusionses(Set<Flaginclusions> flaginclusionses) {
		this.flaginclusionses = flaginclusionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "component")
	public Set<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "components")
	public Set<Flagexclusions> getFlagexclusionses() {
		return this.flagexclusionses;
	}

	public void setFlagexclusionses(Set<Flagexclusions> flagexclusionses) {
		this.flagexclusionses = flagexclusionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "components")
	public Set<ComponentCc> getComponentCcs() {
		return this.componentCcs;
	}

	public void setComponentCcs(Set<ComponentCc> componentCcs) {
		this.componentCcs = componentCcs;
	}
}
