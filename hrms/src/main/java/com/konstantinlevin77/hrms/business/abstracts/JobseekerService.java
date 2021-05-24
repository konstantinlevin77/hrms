package com.konstantinlevin77.hrms.business.abstracts;

import java.util.List;

import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.entities.concretes.Jobseeker;

public interface JobseekerService {
	
	public DataResult<List<Jobseeker>> getAll();

}
