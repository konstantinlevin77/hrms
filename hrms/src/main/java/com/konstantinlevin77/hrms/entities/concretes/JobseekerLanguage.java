package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="jobseeker_languages")
public class JobseekerLanguage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="cv_id")
	private JobseekerCv jobseekerCv;
	
	@Column(name="name")
	private String name;
	
	@Column(name="level")
	private String level;
	
	
	

}
