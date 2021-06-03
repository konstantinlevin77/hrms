package com.konstantinlevin77.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.konstantinlevin77.hrms.entities.concretes.JobseekerCv;

import java.util.List;

public interface JobseekerCvDao extends JpaRepository<JobseekerCv,Integer>{

	public List<JobseekerCv> getAllByJobseeker_Id(int id);
	
}
