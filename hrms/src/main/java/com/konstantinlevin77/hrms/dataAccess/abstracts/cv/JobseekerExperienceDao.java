package com.konstantinlevin77.hrms.dataAccess.abstracts.cv;

import org.springframework.data.jpa.repository.JpaRepository;

import com.konstantinlevin77.hrms.entities.concretes.JobseekerExperience;

public interface JobseekerExperienceDao extends JpaRepository<JobseekerExperience, Integer>{

	
	
}
