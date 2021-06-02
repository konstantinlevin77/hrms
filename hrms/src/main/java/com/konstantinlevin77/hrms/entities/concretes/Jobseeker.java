package com.konstantinlevin77.hrms.entities.concretes;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	
	@NotNull
	@NotBlank
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@NotBlank
	@Column(name="last_name")
	private String lastName;
	
	@NotNull
	@NotBlank
	@Column(name="national_identity")
	private String nationalIdentity;
	
	@NotNull
	@NotBlank
	@Column(name="birth_of_year")
	private short birthOfYear;
	
	@NotNull
	@NotBlank
	@Column(name="is_verified")
	private boolean verified;

}
