package com.konstantinlevin77.hrms.business.abstracts;

import java.util.List;

import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.entities.concretes.JobseekerCv;

public interface JobseekerCvService {
	
	public DataResult<List<JobseekerCv>> getAll();
	
	public Result add(JobseekerCv jobseekerCv);
	
	public DataResult<List<JobseekerCv>> getAllByJobseekerId(int id);

}
