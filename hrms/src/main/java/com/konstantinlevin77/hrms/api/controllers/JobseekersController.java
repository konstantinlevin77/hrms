package com.konstantinlevin77.hrms.api.controllers;


import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.konstantinlevin77.hrms.adapters.NationalIdVerifierAdapter.TestNationalIdVerifierAdapter;
import com.konstantinlevin77.hrms.business.abstracts.JobseekerService;
import com.konstantinlevin77.hrms.core.results.concretes.ErrorDataResult;
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
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(this.jobseekerService.getAll());
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<?>  add(@Valid @RequestBody Jobseeker jobseeker) {
		return ResponseEntity.ok(this.jobseekerService.add(jobseeker, new TestNationalIdVerifierAdapter()));
		
	}
	
	@PostMapping("/verify")
	public ResponseEntity<?>  verify(@RequestBody int id) {
		return ResponseEntity.ok(this.jobseekerService.verify(id));
	}
	
	// Validations throw this exception
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(
			MethodArgumentNotValidException exceptions){
			
		Map<String,String> validationErrors = new HashMap<String, String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
		}
			
		return new ErrorDataResult<Object>(validationErrors,"Doğrulamalar başarısız.");
			
	}
		
	

}
