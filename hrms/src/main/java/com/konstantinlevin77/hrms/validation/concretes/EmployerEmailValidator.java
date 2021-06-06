package com.konstantinlevin77.hrms.validation.concretes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.konstantinlevin77.hrms.dataAccess.abstracts.EmployerDao;
import com.konstantinlevin77.hrms.entities.concretes.Employer;
import com.konstantinlevin77.hrms.validation.abstracts.EmployerEmailConstraint;

public class EmployerEmailValidator implements ConstraintValidator<EmployerEmailConstraint, String> {

	@Autowired
	private EmployerDao employerDao;
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		for (Employer currentEmployer : this.employerDao.findAll()) {
			if (currentEmployer.getEmail().equals(value)) {
				return false;
			}
		}	
		return true;
	
	}

}
