package com.konstantinlevin77.hrms.entities.dtos;

import com.konstantinlevin77.hrms.entities.concretes.Employer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerWithoutJobPostingDto {

	private int id;
	
	private String email;
	
	private String password;
	
	private String companyName;
	
	private String companyWebSite;
	
	private String phoneNumber;
	
	private boolean emailVerified;
	
	private boolean systemVerified;
	
	
	
}
