package com.mentorondemand;

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
	private int trainingId;
	@Column(name="mentor_id")
	private int mentorId;
	@Column(name="user_id")
	private int userId;
	@Column(name="tech_id")
	private int techId;
	@Column(name="status")
	private String status;
	@Column(name="progress")
	private int progress;
	@Column(name="fees")
	private float fees;
	@Column(name="amount_withdrawn")
	private float amountWithdrawn;
	@Column(name="commission")
	private float commission;
	
	public TrainingsEntity() {
		super();
	}
	
}
