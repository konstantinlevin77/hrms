package com.konstantinlevin77.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.konstantinlevin77.hrms.business.abstracts.JobPostingService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/jobPostings")
public class JobPostingsController {
	
	private JobPostingService jobPostingService;
	
	@Autowired
	public JobPostingsController(JobPostingService jobPostingService) {
		this.jobPostingService = jobPostingService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosting>> getAll() {
		return this.jobPostingService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}
	
	@PostMapping("/changeActiveById")
	public Result changeActiveById(@RequestParam int id, @RequestParam boolean active) {
		return this.jobPostingService.changeActiveById(id, active);
	}
	
	@GetMapping("/getActiveAll")
	public DataResult<List<JobPosting>> getActiveAll() {
		return this.jobPostingService.getActiveAll();
	}
	
	@GetMapping("/getActiveAllOrderedByDate")
	public DataResult<List<JobPosting>> getActiveJobPostingsOrderedByDate() {
		return this.jobPostingService.getActiveJobPostingsOrderedByDate();
	}
	
	@GetMapping("/getActiveAllByCompanyName")
	public DataResult<List<JobPosting>> getActiveJobPostingsByCompanyName(@RequestParam String companyName){
		return this.jobPostingService.getActiveJobPostingsByCompanyName(companyName);
	}
	
	@GetMapping("/getById")
	public DataResult<JobPosting> getById(@RequestParam int id) {
		return this.jobPostingService.getById(id);
	}

}
