package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.*;


import com.konstantinlevin77.hrms.entities.abstracts.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="jobseeker_users")
public class Jobseeker extends User{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="national_identity")
	private String nationalIdentity;
	
	@Column(name="birth_of_year")
	private short birthOfYear;
	
	@Column(name="is_verified")
	private boolean verified;

}
