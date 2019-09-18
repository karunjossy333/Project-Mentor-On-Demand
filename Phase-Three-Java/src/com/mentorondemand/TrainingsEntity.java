package com.mentorondemand;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="trainings")
public class TrainingsEntity {

	@Id
	@GeneratedValue
	@Column(name="training_id")
	private Integer trainingId;
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
	@Column(name="end_date")
	private Date endDate;
	
	@OneToOne(targetEntity=TechnologiesEntity.class)
	@JoinColumn(name="tech_id")
	private TechnologiesEntity technology;	
	
	public void setTechnology(TechnologiesEntity technology) {
		this.technology = technology;
	}

	@OneToOne(targetEntity=UserDetailsEntity.class)
	@JoinColumn(name="user_id")
	private UserDetailsEntity trainingUser;
	
	public void setTrainingUser(UserDetailsEntity trainingUser) {
		this.trainingUser = trainingUser;
	}

	public void setTrainingMentor(MentorDetailsEntity trainingMentor) {
		this.trainingMentor = trainingMentor;
	}
	
	@OneToOne(targetEntity=MentorDetailsEntity.class)
	@JoinColumn(name="mentor_id")
	private MentorDetailsEntity trainingMentor;
	
	@ManyToMany(targetEntity = PaymentsEntity.class, cascade = { CascadeType.ALL })  
	@JoinTable(name = "training_payments",   
	            joinColumns = { @JoinColumn(name = "training_id") },   
	            inverseJoinColumns = { @JoinColumn(name = "payment_id") })  
	private List<PaymentsEntity> payments;
	
//	@OneToMany(cascade = CascadeType.ALL)  
//	@JoinColumn(name="payment_id")
//	private List<PaymentsEntity> payments;
	
	public void setPayments(List<PaymentsEntity> payments) {
		this.payments = payments;
	}

	public TrainingsEntity(Float fees, Float commission, Date startDate) {
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

	public TrainingsEntity() {
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
