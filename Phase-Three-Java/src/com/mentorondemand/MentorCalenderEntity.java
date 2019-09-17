package com.mentorondemand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor_calender")
public class MentorCalenderEntity {

	@Id
	@Column(name="calender_id")
	private Integer calenderId;
}
