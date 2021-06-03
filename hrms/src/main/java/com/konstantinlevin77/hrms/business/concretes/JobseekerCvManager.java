package com.konstantinlevin77.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konstantinlevin77.hrms.business.abstracts.JobseekerCvService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessDataResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.JobseekerCvDao;
import com.konstantinlevin77.hrms.entities.concretes.JobseekerCv;

@Service
public class JobseekerCvManager implements JobseekerCvService {

	private JobseekerCvDao jobseekerCvDao;
	
	@Autowired
	public JobseekerCvManager(JobseekerCvDao jobseekerCvDao) {
		this.jobseekerCvDao = jobseekerCvDao;
	}
	
	@Override
	public DataResult<List<JobseekerCv>> getAll() {
		
		return new SuccessDataResult<List<JobseekerCv>>(this.jobseekerCvDao.findAll());
	}

}
