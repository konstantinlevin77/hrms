package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.*;

import com.konstantinlevin77.hrms.entities.abstracts.User;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employer_users")
@Data
public class Employer extends User{
	
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_website")
	private String companyWebsite;
	
	@Column(name="phone_number")
	private String phoneNumber;

}
