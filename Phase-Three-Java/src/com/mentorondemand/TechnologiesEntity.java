package com.mentorondemand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technologies")
public class TechnologiesEntity {
	
	@Id
	@GeneratedValue
	@Column(name="tech_id")
	private int techId;
	@Column(name="tech_name")
	private int techName;
	
	public TechnologiesEntity() {
		super();
	}
}
