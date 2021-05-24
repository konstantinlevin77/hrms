package com.konstantinlevin77.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konstantinlevin77.hrms.business.abstracts.JobseekerService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessDataResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.JobseekerDao;
import com.konstantinlevin77.hrms.entities.concretes.Jobseeker;



@Service
public class JobseekerManager implements JobseekerService{

	private JobseekerDao jobseekerDao;
	
	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao) {
		this.jobseekerDao = jobseekerDao;
	}
	
	@Override
	public DataResult<List<Jobseeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Jobseeker>>
		(this.jobseekerDao.findAll(),"Başarı ile getirildi.");
		
	}

}
