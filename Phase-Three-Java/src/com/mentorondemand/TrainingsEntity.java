package com.mentorondemand;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="trainings")
public class TrainingsEntity {

	@Id
	@GeneratedValue
	@Column(name="training_id")
	private Integer trainingId;
	@Column(name="mentor_id")
	private Integer mentorId;
	@Column(name="user_id")
	private Integer userId;
	@Column(name="tech_id")
	private Integer techId;
	@Column(name="status")
	private String status;
	@Column(name="progress")
	private Integer progress;
	@Column(name="fees")
	private Float fees;
	@Column(name="amount_withdrawn")
	private Float amountWithdrawn;
	@Column(name="commission")
	private Float commission;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="payment_date")
	private Date endDate;
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public TrainingsEntity() {
		super();
	}

	public TrainingsEntity(Integer trainingId, Integer mentorId, Integer userId, Integer techId, String status,
			Integer progress, Float fees, Float amountWithdrawn, Float commission, Date startDate, Date endDate) {
		super();
		this.trainingId = trainingId;
		this.mentorId = mentorId;
		this.userId = userId;
		this.techId = techId;
		this.status = status;
		this.progress = progress;
		this.fees = fees;
		this.amountWithdrawn = amountWithdrawn;
		this.commission = commission;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	public Float getAmountWithdrawn() {
		return amountWithdrawn;
	}

	public void setAmountWithdrawn(Float amountWithdrawn) {
		this.amountWithdrawn = amountWithdrawn;
	}

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}
	
}
