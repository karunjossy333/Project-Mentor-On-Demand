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
	private int paymentId;
	@Column(name="training_id")
	private int trainingId;
	@Column(name="payment_date")
	private Date paymentDate;
	@Column(name="paid_amount")
	private float paidAmount;
	
	public PaymentsEntity() {
		super();
	}

}
