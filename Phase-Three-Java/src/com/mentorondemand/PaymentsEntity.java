package com.mentorondemand;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class PaymentsEntity {
	
	@Id
	@GeneratedValue
	@Column(name="payment_id")
	private Integer paymentId;
	@Column(name="training_id")
	private Integer trainingId;
	@Column(name="payment_date")
	private Date paymentDate;
	@Column(name="paid_amount")
	private Float paidAmount;
	
	public PaymentsEntity() {
		super();
	}

	public PaymentsEntity(Integer paymentId, Integer trainingId, Date paymentDate, Float paidAmount) {
		super();
		this.paymentId = paymentId;
		this.trainingId = trainingId;
		this.paymentDate = paymentDate;
		this.paidAmount = paidAmount;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Float paidAmount) {
		this.paidAmount = paidAmount;
	}

}
