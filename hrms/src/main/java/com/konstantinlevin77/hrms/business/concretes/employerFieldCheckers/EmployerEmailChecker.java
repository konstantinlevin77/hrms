package com.konstantinlevin77.hrms.business.concretes.employerFieldCheckers;

import com.konstantinlevin77.hrms.business.abstracts.FieldChecker;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.ErrorResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.EmployerDao;
import com.konstantinlevin77.hrms.entities.concretes.Employer;

public class EmployerEmailChecker implements FieldChecker<Employer, EmployerDao>{

	@Override
	public Result check(Employer data, EmployerDao dao) {
		
		for (Employer currentEmployer : dao.findAll()) {
			if (currentEmployer.getEmail().equals(data.getEmail())) {
				return new ErrorResult("Bu email ile kaydolmuş bir kullanıcı bulunmaktadır.");
			}
		}
		
		return new SuccessResult();
	}

}
