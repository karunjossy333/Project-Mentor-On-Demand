package com.mentorondemand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor_skills")
public class MentorSkillsEntity {
	
	@Id
	@GeneratedValue
	@Column(name="mentor_skill_id")
	private int mentorSkillId;
	@Column(name="mentor_id")
	private int mentorId;
	@Column(name="skill_id")
	private int skillId;
	@Column(name="commission")
	private float commission;
	@Column(name="mentor_fee")
	private float mentorFee;
	@Column(name="total_fee")
	private float totalFee;
	
	public MentorSkillsEntity() {
		super();
	}

}
