package com.konstantinlevin77.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konstantinlevin77.hrms.business.abstracts.JobseekerService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobseekersController {
	
	private JobseekerService jobseekerService;
	
	@Autowired
	public JobseekersController(JobseekerService jobseekerService) {
		
		this.jobseekerService = jobseekerService;
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Jobseeker>> getAll(){
		
		return this.jobseekerService.getAll();
		
	}
		
	

}
