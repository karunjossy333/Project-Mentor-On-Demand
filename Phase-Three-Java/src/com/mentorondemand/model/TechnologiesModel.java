package com.mentorondemand.model;

public class TechnologiesModel {

	private Integer techId;
	private String techName;
	
	public TechnologiesModel() {
		super();
	}

	public TechnologiesModel(String techName) {
		super();
		this.techName = techName;
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}
}
