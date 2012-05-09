package com.opentravelsoft.entity.finance;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * Outcome generated by hbm2java
 */
@Entity
@Table(name = "tbl_outcome", catalog = "tourismwork_db")
public class Outcome implements java.io.Serializable {

	private Integer outcomeId;
	private int customerId;
	private String tourNo;
	private String note;
	private Date payDate;
	private Character payMode;
	private String billNo;
	private Date payRegisterDate;
	private String payRegisterby;
	private BigDecimal amount;
	private Short carryTicket;
	private Short carryStatus;
	private Date carryStart;
	private String carryUserid;
	private String carryWorker;
	private Date carryWorkday;
	private Date carryComplete;
	private Date carryLastdate;
	private String carryNote;
	private String flightNo;
	private String planNo;
	private String workflowId;
	private Date created;
	private Integer createdby;
	private Date opApproved;
	private Integer opApprovedby;
	private Character opApprovedFlag;
	private Date frRead;
	private Integer frReadby;
	private Character frReadFlag;
	private Date frApproved;
	private Integer frApprovedby;
	private Character frApprovedFlag;
	private Date updated;
	private Integer updatedby;

	public Outcome() {
	}

	public Outcome(int customerId, Date updated) {
		this.customerId = customerId;
		this.updated = updated;
	}

	public Outcome(int customerId, String tourNo, String note, Date payDate,
			Character payMode, String billNo, Date payRegisterDate,
			String payRegisterby, BigDecimal amount, Short carryTicket,
			Short carryStatus, Date carryStart, String carryUserid,
			String carryWorker, Date carryWorkday, Date carryComplete,
			Date carryLastdate, String carryNote, String flightNo,
			String planNo, String workflowId, Date created, Integer createdby,
			Date opApproved, Integer opApprovedby, Character opApprovedFlag,
			Date frRead, Integer frReadby, Character frReadFlag,
			Date frApproved, Integer frApprovedby, Character frApprovedFlag,
			Date updated, Integer updatedby) {
		this.customerId = customerId;
		this.tourNo = tourNo;
		this.note = note;
		this.payDate = payDate;
		this.payMode = payMode;
		this.billNo = billNo;
		this.payRegisterDate = payRegisterDate;
		this.payRegisterby = payRegisterby;
		this.amount = amount;
		this.carryTicket = carryTicket;
		this.carryStatus = carryStatus;
		this.carryStart = carryStart;
		this.carryUserid = carryUserid;
		this.carryWorker = carryWorker;
		this.carryWorkday = carryWorkday;
		this.carryComplete = carryComplete;
		this.carryLastdate = carryLastdate;
		this.carryNote = carryNote;
		this.flightNo = flightNo;
		this.planNo = planNo;
		this.workflowId = workflowId;
		this.created = created;
		this.createdby = createdby;
		this.opApproved = opApproved;
		this.opApprovedby = opApprovedby;
		this.opApprovedFlag = opApprovedFlag;
		this.frRead = frRead;
		this.frReadby = frReadby;
		this.frReadFlag = frReadFlag;
		this.frApproved = frApproved;
		this.frApprovedby = frApprovedby;
		this.frApprovedFlag = frApprovedFlag;
		this.updated = updated;
		this.updatedby = updatedby;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "OUTCOME_ID", unique = true, nullable = false)
	public Integer getOutcomeId() {
		return this.outcomeId;
	}

	public void setOutcomeId(Integer outcomeId) {
		this.outcomeId = outcomeId;
	}

	@Column(name = "CUSTOMER_ID", nullable = false)
	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Column(name = "TOUR_NO", length = 100)
	public String getTourNo() {
		return this.tourNo;
	}

	public void setTourNo(String tourNo) {
		this.tourNo = tourNo;
	}

	@Column(name = "NOTE", length = 1000)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PAY_DATE", length = 19)
	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	@Column(name = "PAY_MODE", length = 1)
	public Character getPayMode() {
		return this.payMode;
	}

	public void setPayMode(Character payMode) {
		this.payMode = payMode;
	}

	@Column(name = "BILL_NO", length = 30)
	public String getBillNo() {
		return this.billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PAY_REGISTER_DATE", length = 19)
	public Date getPayRegisterDate() {
		return this.payRegisterDate;
	}

	public void setPayRegisterDate(Date payRegisterDate) {
		this.payRegisterDate = payRegisterDate;
	}

	@Column(name = "PAY_REGISTERBY", length = 20)
	public String getPayRegisterby() {
		return this.payRegisterby;
	}

	public void setPayRegisterby(String payRegisterby) {
		this.payRegisterby = payRegisterby;
	}

	@Column(name = "AMOUNT", precision = 10)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "CARRY_TICKET")
	public Short getCarryTicket() {
		return this.carryTicket;
	}

	public void setCarryTicket(Short carryTicket) {
		this.carryTicket = carryTicket;
	}

	@Column(name = "CARRY_STATUS")
	public Short getCarryStatus() {
		return this.carryStatus;
	}

	public void setCarryStatus(Short carryStatus) {
		this.carryStatus = carryStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CARRY_START", length = 19)
	public Date getCarryStart() {
		return this.carryStart;
	}

	public void setCarryStart(Date carryStart) {
		this.carryStart = carryStart;
	}

	@Column(name = "CARRY_USERID", length = 10)
	public String getCarryUserid() {
		return this.carryUserid;
	}

	public void setCarryUserid(String carryUserid) {
		this.carryUserid = carryUserid;
	}

	@Column(name = "CARRY_WORKER", length = 20)
	public String getCarryWorker() {
		return this.carryWorker;
	}

	public void setCarryWorker(String carryWorker) {
		this.carryWorker = carryWorker;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CARRY_WORKDAY", length = 19)
	public Date getCarryWorkday() {
		return this.carryWorkday;
	}

	public void setCarryWorkday(Date carryWorkday) {
		this.carryWorkday = carryWorkday;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CARRY_COMPLETE", length = 19)
	public Date getCarryComplete() {
		return this.carryComplete;
	}

	public void setCarryComplete(Date carryComplete) {
		this.carryComplete = carryComplete;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CARRY_LASTDATE", length = 19)
	public Date getCarryLastdate() {
		return this.carryLastdate;
	}

	public void setCarryLastdate(Date carryLastdate) {
		this.carryLastdate = carryLastdate;
	}

	@Column(name = "CARRY_NOTE", length = 1000)
	public String getCarryNote() {
		return this.carryNote;
	}

	public void setCarryNote(String carryNote) {
		this.carryNote = carryNote;
	}

	@Column(name = "FLIGHT_NO", length = 10)
	public String getFlightNo() {
		return this.flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	@Column(name = "PLAN_NO", length = 20)
	public String getPlanNo() {
		return this.planNo;
	}

	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	@Column(name = "WORKFLOW_ID")
	public String getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED", length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "CREATEDBY")
	public Integer getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OP_APPROVED", length = 19)
	public Date getOpApproved() {
		return this.opApproved;
	}

	public void setOpApproved(Date opApproved) {
		this.opApproved = opApproved;
	}

	@Column(name = "OP_APPROVEDBY")
	public Integer getOpApprovedby() {
		return this.opApprovedby;
	}

	public void setOpApprovedby(Integer opApprovedby) {
		this.opApprovedby = opApprovedby;
	}

	@Column(name = "OP_APPROVED_FLAG", length = 1)
	public Character getOpApprovedFlag() {
		return this.opApprovedFlag;
	}

	public void setOpApprovedFlag(Character opApprovedFlag) {
		this.opApprovedFlag = opApprovedFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FR_READ", length = 19)
	public Date getFrRead() {
		return this.frRead;
	}

	public void setFrRead(Date frRead) {
		this.frRead = frRead;
	}

	@Column(name = "FR_READBY")
	public Integer getFrReadby() {
		return this.frReadby;
	}

	public void setFrReadby(Integer frReadby) {
		this.frReadby = frReadby;
	}

	@Column(name = "FR_READ_FLAG", length = 1)
	public Character getFrReadFlag() {
		return this.frReadFlag;
	}

	public void setFrReadFlag(Character frReadFlag) {
		this.frReadFlag = frReadFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FR_APPROVED", length = 19)
	public Date getFrApproved() {
		return this.frApproved;
	}

	public void setFrApproved(Date frApproved) {
		this.frApproved = frApproved;
	}

	@Column(name = "FR_APPROVEDBY")
	public Integer getFrApprovedby() {
		return this.frApprovedby;
	}

	public void setFrApprovedby(Integer frApprovedby) {
		this.frApprovedby = frApprovedby;
	}

	@Column(name = "FR_APPROVED_FLAG", length = 1)
	public Character getFrApprovedFlag() {
		return this.frApprovedFlag;
	}

	public void setFrApprovedFlag(Character frApprovedFlag) {
		this.frApprovedFlag = frApprovedFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED", nullable = false, length = 19)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Column(name = "UPDATEDBY")
	public Integer getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

}
