package com.konstantinlevin77.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konstantinlevin77.hrms.business.abstracts.EmployerService;
import com.konstantinlevin77.hrms.business.concretes.employerFieldCheckers.EmployerDomainChecker;
import com.konstantinlevin77.hrms.business.concretes.employerFieldCheckers.EmployerEmailChecker;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.ErrorResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessDataResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.EmployerDao;
import com.konstantinlevin77.hrms.entities.concretes.Employer;
import com.konstantinlevin77.hrms.entities.concretes.JobPosting;
import com.konstantinlevin77.hrms.entities.dtos.EmployerWithoutJobPostingDto;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll());
		
		
	}

	@Override
	public Result add(EmployerWithoutJobPostingDto employerDto) {
		// TODO Auto-generated method stub
		
		EmployerDomainChecker domainChecker = new EmployerDomainChecker();
		EmployerEmailChecker emailChecker = new EmployerEmailChecker();
		
		// Data transfer object to entity 	
		
		Employer employer = new Employer();
		employer.setEmail(employerDto.getEmail());
		employer.setPassword(employerDto.getPassword());
		employer.setCompanyName(employerDto.getCompanyName());
		employer.setCompanyWebsite(employerDto.getCompanyWebSite());
		employer.setPhoneNumber(employerDto.getPhoneNumber());
		employer.setJobPostings(new ArrayList<JobPosting>());
		
		
		
		if (domainChecker.check(employer, this.employerDao).isSuccess()) {
			
			if (emailChecker.check(employer, this.employerDao).isSuccess()) {
				employer.setEmailVerified(false);
				employer.setSystemVerified(false);
				this.employerDao.save(employer);
				return new SuccessResult("Hesabınız onaylandı, lütfen emailinizi onaylayın ve sistem personellerinin hesabınızı onaylamasını bekleyin.");
				
			}
			
			else {
				return emailChecker.check(employer, this.employerDao);
			}
			
		}
		else {
			return domainChecker.check(employer, this.employerDao);
		}
		
	}

	@Override
	public Result verifyEmail(int id) {
		Employer employer = this.employerDao.findById(id).get();
		
		if(employer.isEmailVerified()) {
			return new ErrorResult("Bu hesabın maili zaten onaylanmış!");
		}
		
		employer.setEmailVerified(true);
		this.employerDao.save(employer);
		
		return new SuccessResult("Bu hesabın maili başarı ile onaylandı!");
	}
	
	
	
	

}
