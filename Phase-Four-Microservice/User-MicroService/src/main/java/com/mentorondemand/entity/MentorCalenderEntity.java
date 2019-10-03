package com.mentorondemand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mentor_calender")
public class MentorCalenderEntity {

	@Id
	@GeneratedValue
	@Column(name="calender_id")
	private Integer calenderId;
	@Column(name="time_slot")
	private String timeSlot;
	
	@ManyToOne(targetEntity=MentorDetailsEntity.class)
	@JoinColumn(name="mentor_id")
	private MentorDetailsEntity mentorDetails;

	public MentorCalenderEntity() {
		super();
	}

	public MentorCalenderEntity(String timeSlot, MentorDetailsEntity mentorDetails) {
		super();
		this.timeSlot = timeSlot;
		this.mentorDetails = mentorDetails;
	}

	public Integer getCalenderId() {
		return calenderId;
	}

	public void setCalenderId(Integer calenderId) {
		this.calenderId = calenderId;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public MentorDetailsEntity getMentorDetails() {
		return mentorDetails;
	}

	public void setMentorDetails(MentorDetailsEntity mentorDetails) {
		this.mentorDetails = mentorDetails;
	}	
	
}
