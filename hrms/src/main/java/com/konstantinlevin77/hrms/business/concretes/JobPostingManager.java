package com.konstantinlevin77.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.konstantinlevin77.hrms.business.abstracts.JobPostingService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessDataResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.JobPostingDao;
import com.konstantinlevin77.hrms.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements JobPostingService {

	private JobPostingDao jobPostingDao;
	
	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		this.jobPostingDao = jobPostingDao;
	}
	
	
	@Override
	public DataResult<List<JobPosting>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.findAll());
	}


	@Override
	public Result add(JobPosting jobPosting) {
		// TODO Auto-generated method stub
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("Başarı ile eklendi.");
	}


	@Override
	public Result changeActiveById(int id, boolean active) {
		JobPosting jobPosting = this.jobPostingDao.findById(id).get();
		jobPosting.setActive(active);
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("Aktiflik durumu başarı ile değiştirildi.");
	}


	@Override
	public DataResult<List<JobPosting>> getActiveAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.findActiveJobPostings());
	}


	@Override
	public DataResult<List<JobPosting>> getActiveJobPostingsOrderedByDate() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.findActiveJobPostingsOrderedByDate());
	}


	@Override
	public DataResult<List<JobPosting>> getActiveJobPostingsByCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.findActiveJobPostingsByCompanyName(companyName));
	}


	

}
