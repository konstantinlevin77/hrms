package com.konstantinlevin77.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.konstantinlevin77.hrms.entities.abstracts.User;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employer_users")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})
public class Employer extends User{
	
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_website")
	private String companyWebsite;
	
	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="is_email_verified")
	private boolean emailVerified;
	
	@OneToMany(mappedBy="employer")
	private List<JobPosting> jobPostings;
}
