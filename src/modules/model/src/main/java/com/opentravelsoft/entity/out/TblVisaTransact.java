package com.opentravelsoft.entity.out;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblVisaTransact generated by hbm2java
 */
@Entity
@Table(name = "tbl_visa_transact", catalog = "tourismwork_db")
public class TblVisaTransact implements java.io.Serializable {

	private Integer applyId;
	private Integer applyUser;
	private Date applyDate;
	private Character status;
	private Integer chkUser;
	private Date chkDate;

	public TblVisaTransact() {
	}

	public TblVisaTransact(Integer applyUser, Date applyDate, Character status,
			Integer chkUser, Date chkDate) {
		this.applyUser = applyUser;
		this.applyDate = applyDate;
		this.status = status;
		this.chkUser = chkUser;
		this.chkDate = chkDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "APPLY_ID", unique = true, nullable = false)
	public Integer getApplyId() {
		return this.applyId;
	}

	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}

	@Column(name = "APPLY_USER")
	public Integer getApplyUser() {
		return this.applyUser;
	}

	public void setApplyUser(Integer applyUser) {
		this.applyUser = applyUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "APPLY_DATE", length = 19)
	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	@Column(name = "STATUS", length = 1)
	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	@Column(name = "CHK_USER")
	public Integer getChkUser() {
		return this.chkUser;
	}

	public void setChkUser(Integer chkUser) {
		this.chkUser = chkUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CHK_DATE", length = 19)
	public Date getChkDate() {
		return this.chkDate;
	}

	public void setChkDate(Date chkDate) {
		this.chkDate = chkDate;
	}

}