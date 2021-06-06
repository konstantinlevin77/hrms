package com.konstantinlevin77.hrms.business.abstracts;

import java.util.List;

import com.konstantinlevin77.hrms.adapters.NationalIdVerifierAdapter.NationalIdVerifier;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.dataAccess.abstracts.JobseekerDao;
import com.konstantinlevin77.hrms.entities.concretes.Jobseeker;
import com.konstantinlevin77.hrms.entities.dtos.JobseekerWithoutCvDto;

public interface JobseekerService {
	
	public DataResult<List<Jobseeker>> getAll();
	
	public Result add(JobseekerWithoutCvDto jobseeker,NationalIdVerifier nationalIdVerifier);

	public Result verify(int id);
	
}
