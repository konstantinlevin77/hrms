package com.konstantinlevin77.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konstantinlevin77.hrms.business.abstracts.JobseekerCvService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessDataResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.JobseekerCvDao;
import com.konstantinlevin77.hrms.dataAccess.abstracts.cv.JobseekerExperienceDao;
import com.konstantinlevin77.hrms.dataAccess.abstracts.cv.JobseekerLanguageDao;
import com.konstantinlevin77.hrms.dataAccess.abstracts.cv.JobseekerSchoolDao;
import com.konstantinlevin77.hrms.dataAccess.abstracts.cv.JobseekerTechnologyDao;
import com.konstantinlevin77.hrms.entities.concretes.JobseekerCv;
import com.konstantinlevin77.hrms.entities.concretes.JobseekerExperience;
import com.konstantinlevin77.hrms.entities.concretes.JobseekerLanguage;
import com.konstantinlevin77.hrms.entities.concretes.JobseekerSchool;
import com.konstantinlevin77.hrms.entities.concretes.JobseekerTechnology;

@Service
public class JobseekerCvManager implements JobseekerCvService {

	private JobseekerCvDao jobseekerCvDao;
	
	private JobseekerExperienceDao jobseekerExperienceDao;
	private JobseekerLanguageDao jobseekerLanguageDao;
	private JobseekerTechnologyDao jobseekerTechnologyDao;
	private JobseekerSchoolDao jobseekerSchoolDao;
	
	@Autowired
	public JobseekerCvManager(JobseekerCvDao jobseekerCvDao,
			JobseekerExperienceDao jobseekerExperienceDao,
			JobseekerLanguageDao jobseekerLanguageDao,
			JobseekerTechnologyDao jobseekerTechnologyDao,
			JobseekerSchoolDao jobseekerSchoolDao
			) {
		this.jobseekerCvDao = jobseekerCvDao;
		this.jobseekerExperienceDao = jobseekerExperienceDao;
		this.jobseekerLanguageDao = jobseekerLanguageDao;
		this.jobseekerSchoolDao = jobseekerSchoolDao;
		this.jobseekerTechnologyDao = jobseekerTechnologyDao;
		
	}
	
	@Override
	public DataResult<List<JobseekerCv>> getAll() {
		
		return new SuccessDataResult<List<JobseekerCv>>(this.jobseekerCvDao.findAll());
	}

	@Override
	public Result add(JobseekerCv jobseekerCv) {
		

		this.jobseekerCvDao.save(jobseekerCv);
		
		// Iterating over the experiences and saving them
		for (JobseekerExperience jobseekerExperience : jobseekerCv.getJobseekerExperiences()) {
			jobseekerExperience.setId(0);
			this.jobseekerExperienceDao.save(jobseekerExperience);
		}
		
		// Iterating over the languages and saving them
		for (JobseekerLanguage jobseekerLanguage : jobseekerCv.getJobseekerLanguages()) {
			jobseekerLanguage.setId(0);
			this.jobseekerLanguageDao.save(jobseekerLanguage);
		}
		
		for (JobseekerSchool jobseekerSchool : jobseekerCv.getJobseekerSchools()) {
			jobseekerSchool.setId(0);
			this.jobseekerSchoolDao.save(jobseekerSchool);
		}
		
		for (JobseekerTechnology jobseekerTechnology : jobseekerCv.getJobseekerTechnologies()) {
			jobseekerTechnology.setId(0);
			this.jobseekerTechnologyDao.save(jobseekerTechnology);
		}
		
		return new SuccessResult();
	}

	@Override
	public DataResult<List<JobseekerCv>> getAllByJobseekerId(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobseekerCv>>
		(this.jobseekerCvDao.getAllByJobseeker_Id(id));
	}

}
