package com.konstantinlevin77.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konstantinlevin77.hrms.adapters.NationalIdVerifierAdapter.NationalIdVerifier;
import com.konstantinlevin77.hrms.business.abstracts.FieldChecker;
import com.konstantinlevin77.hrms.business.abstracts.JobseekerService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.ErrorResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessDataResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
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

	@Override
	public Result add(Jobseeker jobseeker,NationalIdVerifier nationalIdVerifier) {
		// TODO Auto-generated method stub
		
	
		
		
		
		
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

}
