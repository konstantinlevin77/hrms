package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="jobseeker_schools")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobseekerCv"})
public class JobseekerSchool {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name="name")
	private String name;
	
	@NotNull
	@NotBlank
	@Column(name="start_year")
	private short startYear;
	
	@Column(name="graduate_year",nullable=true)
	private Short graduateYear;
	
	@ManyToOne
	@JoinColumn(name="cv_id")
	private JobseekerCv jobseekerCv;
	
	
	
	
	
	

}
