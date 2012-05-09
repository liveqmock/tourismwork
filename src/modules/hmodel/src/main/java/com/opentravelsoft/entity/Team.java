package com.opentravelsoft.entity;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Team generated by hbm2java
 */
@Entity
@Table(name = "tbl_teams", catalog = "tourismwork_db")
public class Team implements java.io.Serializable {

	private Integer id;
	private Team team;
	private String name;
	private String code;
	private short type;
	private boolean active;
	private String description;
	private Boolean private_;
	private Set<Plan> plans = new HashSet<Plan>(0);
	private Set<Line> lines = new HashSet<Line>(0);
	private Set<Team> teams = new HashSet<Team>(0);

	public Team() {
	}

	public Team(String name, short type, boolean active) {
		this.name = name;
		this.type = type;
		this.active = active;
	}

	public Team(Team team, String name, String code, short type,
			boolean active, String description, Boolean private_,
			Set<Plan> plans, Set<Line> lines, Set<Team> teams) {
		this.team = team;
		this.name = name;
		this.code = code;
		this.type = type;
		this.active = active;
		this.description = description;
		this.private_ = private_;
		this.plans = plans;
		this.lines = lines;
		this.teams = teams;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_")
	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Column(name = "NAME", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "TYPE", nullable = false)
	public short getType() {
		return this.type;
	}

	public void setType(short type) {
		this.type = type;
	}

	@Column(name = "ACTIVE", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "DESCRIPTION", length = 20)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "PRIVATE")
	public Boolean getPrivate_() {
		return this.private_;
	}

	public void setPrivate_(Boolean private_) {
		this.private_ = private_;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	public Set<Plan> getPlans() {
		return this.plans;
	}

	public void setPlans(Set<Plan> plans) {
		this.plans = plans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	public Set<Line> getLines() {
		return this.lines;
	}

	public void setLines(Set<Line> lines) {
		this.lines = lines;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	public Set<Team> getTeams() {
		return this.teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

}
