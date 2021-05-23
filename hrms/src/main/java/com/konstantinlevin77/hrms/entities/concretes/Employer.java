package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.*;

import com.konstantinlevin77.hrms.entities.abstracts.User;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employer_users")
@Data
@PrimaryKeyJoinColumn(name="user_id")
public class Employer extends User{
	
	@Id

	@Column(name="user_id")
	private int userId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_website")
	private String companyWebsite;
	
	@Column(name="phone_number")
	private String phoneNumber;

}
