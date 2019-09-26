package com.mentorondemand.model;

import java.sql.Date;

public class TrainingsModel {

	private Integer trainingId;
	private String status;
	private Integer progress;
	private Float fees;
	private Float amountWithdrawn;
	private Float commission;
	private Date startDate;
	private Date endDate;
	
	public TrainingsModel(Float fees, Float commission, Date startDate) {
		super();
		this.status = "Booked for Training.";
		this.progress = 0;
		this.fees = fees;
		this.commission = commission;
		this.startDate = startDate;
	}

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

	public TrainingsModel() {
		super();
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
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
