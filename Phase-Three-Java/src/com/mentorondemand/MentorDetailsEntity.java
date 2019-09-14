package com.mentorondemand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor_details")
public class MentorDetailsEntity {
	
	@Id
	@GeneratedValue
	@Column(name="mentor_id")
	private int mentorId;
	@Column(name="id")
	private int Id;
	@Column(name="mentor_name")
	private int mentorName;
	@Column(name="mentor_email")
	private int mentorEmail;
	@Column(name="mentor_years_exp")
	private int mentorYearsExp;
	@Column(name="mentor_linkdin_url")
	private int mentorLinkdinUrl;
	@Column(name="mentor_phone")
	private Long mentorPhone;
	@Column(name="no_of_trainings")
	private Long trainings;
	@Column(name="rating")
	private Long rating;
	
	public MentorDetailsEntity() {
		super();
	}

}
