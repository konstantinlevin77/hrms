package com.konstantinlevin77.hrms.entities.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.konstantinlevin77.hrms.entities.concretes.Employer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerWithoutJobPostingDto {

	private int id;

	@NotNull
	@NotBlank
	private String email;
	
	@NotNull
	@NotBlank
	private String password;
	
	@NotNull
	@NotBlank
	private String companyName;
	
	@NotNull
	@NotBlank
	private String companyWebSite;
	
	@NotNull
	@NotBlank
	private String phoneNumber;
	
	@NotNull
	private boolean emailVerified;
	
	@NotNull
	private boolean systemVerified;
	
	
	
}
