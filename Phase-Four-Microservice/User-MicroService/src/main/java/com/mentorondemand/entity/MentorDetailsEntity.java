package com.mentorondemand.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mentor_details")
public class MentorDetailsEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mentor_id")
	private Integer mentorId;
	@Column(name="mentor_name")
	private String mentorName;
	@Column(name="mentor_email")
	private String mentorEmail;
	@Column(name="mentor_years_exp")
	private Integer mentorYearsExp;
	@Column(name="video")
	private Boolean video;
	@Column(name="presentation")
	private Boolean presentation;
	@Column(name="mentor_linkdin_url")
	private String mentorLinkdinUrl;
	@Column(name="mentor_phone")
	private String mentorPhone;
	@Column(name="no_of_trainings")
	private Integer trainings;
	@Column(name="rating")
	private float rating;
	
	@OneToOne(targetEntity=ActorsEntity.class,cascade=CascadeType.ALL)
	@JoinColumn(name="actor_id")
	private ActorsEntity actor;
	
	public MentorDetailsEntity() {
		super();
	}

	public MentorDetailsEntity(String mentorName, String mentorEmail, Integer mentorYearsExp, Boolean video, Boolean presentation, String mentorLinkdinUrl, String mentorPhone, Integer trainings, float rating) {
		this.mentorName = mentorName;
		this.mentorEmail = mentorEmail;
		this.mentorYearsExp = mentorYearsExp;
		this.video = video;
		this.presentation = presentation;
		this.mentorLinkdinUrl = mentorLinkdinUrl;
		this.mentorPhone = mentorPhone;
		this.trainings = trainings;
		this.rating = rating;
	}

	public void setActor(ActorsEntity actor) {
		this.actor = actor;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public String getMentorEmail() {
		return mentorEmail;
	}

	public void setMentorEmail(String mentorEmail) {
		this.mentorEmail = mentorEmail;
	}

	public Integer getMentorYearsExp() {
		return mentorYearsExp;
	}

	public void setMentorYearsExp(Integer mentorYearsExp) {
		this.mentorYearsExp = mentorYearsExp;
	}

	public String getMentorLinkdinUrl() {
		return mentorLinkdinUrl;
	}

	public void setMentorLinkdinUrl(String mentorLinkdinUrl) {
		this.mentorLinkdinUrl = mentorLinkdinUrl;
	}

	public String getMentorPhone() {
		return mentorPhone;
	}

	public void setMentorPhone(String mentorPhone) {
		this.mentorPhone = mentorPhone;
	}

	public Integer getTrainings() {
		return trainings;
	}

	public void setTrainings(Integer trainings) {
		this.trainings = trainings;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Boolean getVideo() {
		return video;
	}

	public void setVideo(Boolean video) {
		this.video = video;
	}

	public Boolean getPresentation() {
		return presentation;
	}

	public void setPresentation(Boolean presentation) {
		this.presentation = presentation;
	}
}
