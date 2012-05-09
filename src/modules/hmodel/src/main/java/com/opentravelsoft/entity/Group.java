package com.opentravelsoft.entity;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Group generated by hbm2java
 */
@Entity
@Table(name = "tbl_group", catalog = "tourismwork_db")
public class Group implements java.io.Serializable {

	private int groupId;
	private Group group;
	private String dptCn;
	private String fullName;
	private String linkman;
	private String tel;
	private String fax;
	private Set<Group> groups = new HashSet<Group>(0);
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Group() {
	}

	public Group(int groupId, String dptCn) {
		this.groupId = groupId;
		this.dptCn = dptCn;
	}

	public Group(int groupId, Group group, String dptCn, String fullName,
			String linkman, String tel, String fax, Set<Group> groups,
			Set<Employee> employees) {
		this.groupId = groupId;
		this.group = group;
		this.dptCn = dptCn;
		this.fullName = fullName;
		this.linkman = linkman;
		this.tel = tel;
		this.fax = fax;
		this.groups = groups;
		this.employees = employees;
	}

	@Id
	@Column(name = "GROUP_ID", unique = true, nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_ID")
	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Column(name = "DPT_CN", nullable = false, length = 20)
	public String getDptCn() {
		return this.dptCn;
	}

	public void setDptCn(String dptCn) {
		this.dptCn = dptCn;
	}

	@Column(name = "FULL_NAME", length = 60)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "LINKMAN", length = 20)
	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	@Column(name = "TEL", length = 40)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "FAX", length = 40)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "group")
	public Set<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "group")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
