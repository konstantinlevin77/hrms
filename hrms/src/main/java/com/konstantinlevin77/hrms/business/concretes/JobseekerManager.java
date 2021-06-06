package com.konstantinlevin77.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konstantinlevin77.hrms.adapters.NationalIdVerifierAdapter.NationalIdVerifier;
import com.konstantinlevin77.hrms.business.abstracts.FieldChecker;
import com.konstantinlevin77.hrms.business.abstracts.JobseekerService;
import com.konstantinlevin77.hrms.business.concretes.jobseekerFieldCheckers.JobseekerEmailFieldChecker;
import com.konstantinlevin77.hrms.business.concretes.jobseekerFieldCheckers.JobseekerNationalIdFieldChecker;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.ErrorResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessDataResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.JobseekerDao;
import com.konstantinlevin77.hrms.entities.concretes.Jobseeker;
import com.konstantinlevin77.hrms.entities.concretes.JobseekerCv;
import com.konstantinlevin77.hrms.entities.dtos.JobseekerWithoutCvDto;



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

	@Override
	public Result add(JobseekerWithoutCvDto jobseekerDto,NationalIdVerifier nationalIdVerifier) {
		
		// Data transfer object to entity
		Jobseeker jobseeker = new Jobseeker();
		jobseeker.setEmail(jobseekerDto.getEmail());
		jobseeker.setPassword(jobseekerDto.getPassword());
		jobseeker.setFirstName(jobseekerDto.getFirstName());
		jobseeker.setLastName(jobseekerDto.getLastName());
		jobseeker.setNationalIdentity(jobseekerDto.getNationalIdentity());
		jobseeker.setBirthOfYear(jobseekerDto.getBirthOfYear());
		jobseeker.setVerified(false);
		
		
		
		String name = jobseeker.getFirstName();
		String surname = jobseeker.getLastName();
		short birthOfYear = jobseeker.getBirthOfYear();
		if (nationalIdVerifier.verify(name, surname, birthOfYear)) {
			
			JobseekerEmailFieldChecker jobseekerEmailFieldChecker = new JobseekerEmailFieldChecker();
			Result emailResult = jobseekerEmailFieldChecker.check(jobseeker.getEmail(), jobseekerDao);
			
			if (emailResult.isSuccess()) {
				
				JobseekerNationalIdFieldChecker jobseekerNationalIdFieldChecker = new JobseekerNationalIdFieldChecker();
				Result idResult = jobseekerNationalIdFieldChecker.check(jobseeker.getNationalIdentity(),jobseekerDao);
				
				if (idResult.isSuccess()) {
					// User will have to verify his email to use his account.
					jobseeker.setVerified(false);
					this.jobseekerDao.save(jobseeker);
					return new SuccessResult("Kullanıcı sisteme eklendi. E-postanızı onaylamayı unutmayın.");
				}
				
				else {
					return idResult;
				}
				
			}
			
			else {
				return emailResult;
			}
			
			
		
		}
		else {
			return new ErrorResult("Tc kimlik doğrulaması başarısız.");
		}
		
	}
	
	public Result verify(int id) {
		
		Jobseeker jobseeker = this.jobseekerDao.findById(id).get();
		
		if(jobseeker.isVerified()) {
			return new ErrorResult("Bu hesap zaten onaylanmış!");
		}
		
		jobseeker.setVerified(true);
		this.jobseekerDao.save(jobseeker);
		
		return new SuccessResult("Hesap başarı ile onaylandı!");
		
	}

}
