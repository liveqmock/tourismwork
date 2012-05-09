package com.opentravelsoft.entity;

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
 * TblPriceFile generated by hbm2java
 */
@Entity
@Table(name = "tbl_price_file", catalog = "tourismwork_db")
public class TblPriceFile implements java.io.Serializable {

	private Integer id;
	private int groupId;
	private String filename;
	private String filepath;
	private Integer filesize;
	private Date overdue;
	private Character del;
	private String note;
	private Date created;
	private Integer createdby;

	public TblPriceFile() {
	}

	public TblPriceFile(int groupId, String filename, String filepath) {
		this.groupId = groupId;
		this.filename = filename;
		this.filepath = filepath;
	}

	public TblPriceFile(int groupId, String filename, String filepath,
			Integer filesize, Date overdue, Character del, String note,
			Date created, Integer createdby) {
		this.groupId = groupId;
		this.filename = filename;
		this.filepath = filepath;
		this.filesize = filesize;
		this.overdue = overdue;
		this.del = del;
		this.note = note;
		this.created = created;
		this.createdby = createdby;
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

	@Column(name = "GROUP_ID", nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Column(name = "FILENAME", nullable = false, length = 120)
	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Column(name = "FILEPATH", nullable = false, length = 120)
	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	@Column(name = "FILESIZE")
	public Integer getFilesize() {
		return this.filesize;
	}

	public void setFilesize(Integer filesize) {
		this.filesize = filesize;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OVERDUE", length = 19)
	public Date getOverdue() {
		return this.overdue;
	}

	public void setOverdue(Date overdue) {
		this.overdue = overdue;
	}

	@Column(name = "DEL", length = 1)
	public Character getDel() {
		return this.del;
	}

	public void setDel(Character del) {
		this.del = del;
	}

	@Column(name = "NOTE", length = 60)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
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

}
