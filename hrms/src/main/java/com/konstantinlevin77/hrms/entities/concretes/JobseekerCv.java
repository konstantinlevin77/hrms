package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.*;



import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="jobseeker_cvs")
public class JobseekerCv {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@ManyToOne
	@JoinColumn(name="jobseeker_id")
	private Jobseeker jobseeker;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@OneToMany(mappedBy="jobseekerCv", fetch = FetchType.LAZY)
	private List<JobseekerSchool> jobseekerSchools;
	
	@OneToMany(mappedBy="jobseekerCv", fetch = FetchType.LAZY)
	private List<JobseekerLanguage> jobseekerLanguages;
	
	@OneToMany(mappedBy="jobseekerCv", fetch = FetchType.LAZY)
	private List<JobseekerExperience> jobseekerExperiences;
	
	@OneToMany(mappedBy="jobseekerCv", fetch = FetchType.LAZY)
	private List<JobseekerTechnology> jobseekerTechnologies;
	
	
	

}
