package com.opentravelsoft.entity.vacation;


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
 * 行程链
 */
@Entity
@Table(name = "tbl_route_chain")
public class RouteChain implements java.io.Serializable {

	private Integer chainId;
	private String lineNo;
	private int rank;
	private int stay;
	private String outCity;
	private String toCity;
	private Integer prevChain;
	private Integer nextChain;
	private boolean canDefer;
	private int maxDefer;
	private String createdby;
	private Date created;
	private String createdbyip;
	private String updatedby;
	private Date updated;
	private String updatedbyip;
	private char trafficType;
	private Boolean isDeleted;

	public RouteChain() {
	}

	public RouteChain(String lineNo, int rank, int stay, boolean canDefer,
			int maxDefer, char trafficType) {
		this.lineNo = lineNo;
		this.rank = rank;
		this.stay = stay;
		this.canDefer = canDefer;
		this.maxDefer = maxDefer;
		this.trafficType = trafficType;
	}

	public RouteChain(String lineNo, int rank, int stay, String outCity,
			String toCity, Integer prevChain, Integer nextChain,
			boolean canDefer, int maxDefer, String createdby, Date created,
			String createdbyip, String updatedby, Date updated,
			String updatedbyip, char trafficType, Boolean isDeleted) {
		this.lineNo = lineNo;
		this.rank = rank;
		this.stay = stay;
		this.outCity = outCity;
		this.toCity = toCity;
		this.prevChain = prevChain;
		this.nextChain = nextChain;
		this.canDefer = canDefer;
		this.maxDefer = maxDefer;
		this.createdby = createdby;
		this.created = created;
		this.createdbyip = createdbyip;
		this.updatedby = updatedby;
		this.updated = updated;
		this.updatedbyip = updatedbyip;
		this.trafficType = trafficType;
		this.isDeleted = isDeleted;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CHAIN_ID", unique = true, nullable = false)
	public Integer getChainId() {
		return this.chainId;
	}

	public void setChainId(Integer chainId) {
		this.chainId = chainId;
	}

	@Column(name = "LINE_NO", nullable = false, length = 20)
	public String getLineNo() {
		return this.lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	@Column(name = "RANK", nullable = false)
	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Column(name = "STAY", nullable = false)
	public int getStay() {
		return this.stay;
	}

	public void setStay(int stay) {
		this.stay = stay;
	}

	@Column(name = "OUT_CITY", length = 20)
	public String getOutCity() {
		return this.outCity;
	}

	public void setOutCity(String outCity) {
		this.outCity = outCity;
	}

	@Column(name = "TO_CITY", length = 20)
	public String getToCity() {
		return this.toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	@Column(name = "PREV_CHAIN")
	public Integer getPrevChain() {
		return this.prevChain;
	}

	public void setPrevChain(Integer prevChain) {
		this.prevChain = prevChain;
	}

	@Column(name = "NEXT_CHAIN")
	public Integer getNextChain() {
		return this.nextChain;
	}

	public void setNextChain(Integer nextChain) {
		this.nextChain = nextChain;
	}

	@Column(name = "CAN_DEFER", nullable = false)
	public boolean isCanDefer() {
		return this.canDefer;
	}

	public void setCanDefer(boolean canDefer) {
		this.canDefer = canDefer;
	}

	@Column(name = "MAX_DEFER", nullable = false)
	public int getMaxDefer() {
		return this.maxDefer;
	}

	public void setMaxDefer(int maxDefer) {
		this.maxDefer = maxDefer;
	}

	@Column(name = "CREATEDBY", length = 10)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED", length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "CREATEDBYIP", length = 50)
	public String getCreatedbyip() {
		return this.createdbyip;
	}

	public void setCreatedbyip(String createdbyip) {
		this.createdbyip = createdbyip;
	}

	@Column(name = "UPDATEDBY", length = 10)
	public String getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED", length = 19)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Column(name = "UPDATEDBYIP", length = 50)
	public String getUpdatedbyip() {
		return this.updatedbyip;
	}

	public void setUpdatedbyip(String updatedbyip) {
		this.updatedbyip = updatedbyip;
	}

	@Column(name = "TRAFFIC_TYPE", nullable = false, length = 1)
	public char getTrafficType() {
		return this.trafficType;
	}

	public void setTrafficType(char trafficType) {
		this.trafficType = trafficType;
	}

	@Column(name = "IsDeleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}