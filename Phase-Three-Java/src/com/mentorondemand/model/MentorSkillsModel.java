package com.mentorondemand.model;

public class MentorSkillsModel {
	
	private Integer mentorSkillId;
	private Float commission;
	private Float mentorFee;
	private Float totalFee;
	
	public MentorSkillsModel() {
		super();
	}

	public MentorSkillsModel(Float commission, Float mentorFee, Float totalFee) {
		super();
		this.commission = commission;
		this.mentorFee = mentorFee;
		this.totalFee = totalFee;
	}
	
	public Integer getMentorSkillId() {
		return mentorSkillId;
	}

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}

	public Float getMentorFee() {
		return mentorFee;
	}

	public void setMentorFee(Float mentorFee) {
		this.mentorFee = mentorFee;
	}

	public Float getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Float totalFee) {
		this.totalFee = totalFee;
	}

}
