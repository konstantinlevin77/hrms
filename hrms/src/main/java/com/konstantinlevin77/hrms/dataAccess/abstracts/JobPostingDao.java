package com.konstantinlevin77.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.konstantinlevin77.hrms.entities.concretes.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {

	@Query("SELECT j FROM JobPosting j WHERE j.active=true")
	public List<JobPosting> findActiveJobPostings();
	
	@Query("SELECT j FROM JobPosting j WHERE j.active=true ORDER BY j.applicationDeadline DESC")
	public List<JobPosting> findActiveJobPostingsOrderedByDate();

	@Query("SELECT j FROM JobPosting j WHERE j.active=true AND j.companyName = :companyName")
	public List<JobPosting> findActiveJobPostingsByCompanyName(String companyName);
}
