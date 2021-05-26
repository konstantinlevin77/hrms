package com.konstantinlevin77.hrms.business.concretes.jobseekerFieldCheckers;

import com.konstantinlevin77.hrms.business.abstracts.FieldChecker;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.ErrorResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.JobseekerDao;
import com.konstantinlevin77.hrms.entities.concretes.Jobseeker;

public class JobseekerEmailFieldChecker implements FieldChecker<String,JobseekerDao>{

	@Override
	public Result check(String data,JobseekerDao jobseekerDao) {
		for (Jobseeker jobseeker : jobseekerDao.findAll()) {
			if (jobseeker.getEmail().equals(data)) {
				return new ErrorResult("Bu eposta ile üye olmuş bir hesap sistemde bulunmaktadır.");
			}
		}
		return new SuccessResult("Bu eposta ile üye olmuş bir hesap bulunmamaktadır.");
		
	}

}
