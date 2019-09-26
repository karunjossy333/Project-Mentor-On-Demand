package com.mentorondemand.model;

public class MentorCalenderModel {

	private Integer calenderId;
	private String timeSlot;

	public MentorCalenderModel() {
		super();
	}

	public MentorCalenderModel(String timeSlot) {
		super();
		this.timeSlot = timeSlot;
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
	
}
