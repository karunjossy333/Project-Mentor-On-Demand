package com.mentorondemand.model;

import java.sql.Date;

public class PaymentsModel {

	private Integer paymentId;
	private Date paymentDate;
	private Float paidAmount;
	
	public PaymentsModel() {
		super();
	}

	public PaymentsModel(Date paymentDate, Float paidAmount) {
		super();
		this.paymentDate = paymentDate;
		this.paidAmount = paidAmount;
	}

	public Integer getPaymentId() {
		return paymentId;
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
