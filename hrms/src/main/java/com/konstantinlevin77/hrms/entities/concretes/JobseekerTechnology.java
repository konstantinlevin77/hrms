package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="jobseeker_technologies")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobseekerCv"})
public class JobseekerTechnology {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="cv_id")
	private JobseekerCv jobseekerCv;

}
