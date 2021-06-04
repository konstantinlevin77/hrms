package com.konstantinlevin77.hrms.business.abstracts;

import java.util.List;

import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.entities.concretes.Employer;
import com.konstantinlevin77.hrms.entities.dtos.EmployerWithoutJobPostingDto;

public interface EmployerService {
	
	public DataResult<List<Employer>> getAll();
	
	public Result add(EmployerWithoutJobPostingDto employer);
	
	public Result verifyEmail(int id);

}
