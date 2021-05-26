package com.konstantinlevin77.hrms.business.concretes.jobseekerFieldCheckers;

import com.konstantinlevin77.hrms.business.abstracts.FieldChecker;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.ErrorResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.JobseekerDao;
import com.konstantinlevin77.hrms.entities.concretes.Jobseeker;

public class JobseekerNationalIdFieldChecker implements FieldChecker<String, JobseekerDao>{

	@Override
	public Result check(String data, JobseekerDao dao) {
		// TODO Auto-generated method stub
		for (Jobseeker jobseeker : dao.findAll()) {
			
			if (jobseeker.getNationalIdentity().equals(data)) {
				return new ErrorResult("Bu kimlik numarası ile bir hesap bulunmaktadır.");
			}
			
		}
		return new SuccessResult("Bu kimlik numarası ile hesap bulunmamaktadır.");
	}

}
