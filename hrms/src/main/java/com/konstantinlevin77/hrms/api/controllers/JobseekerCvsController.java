package com.konstantinlevin77.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konstantinlevin77.hrms.business.abstracts.JobseekerCvService;

@RestController
@RequestMapping("/jobseekerCvs")
public class JobseekerCvsController {
	
	private JobseekerCvService jobseekerCvService;
	
	@Autowired
	public JobseekerCvsController(JobseekerCvService jobseekerCvService) {
		this.jobseekerCvService = jobseekerCvService;
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {
		
		return ResponseEntity.ok(this.jobseekerCvService.getAll());
		
	}

}
