package com.konstantinlevin77.hrms.dataAccess.abstracts.cv;

import org.springframework.data.jpa.repository.JpaRepository;

import com.konstantinlevin77.hrms.entities.concretes.JobseekerSchool;

public interface JobseekerSchoolDao extends JpaRepository<JobseekerSchool,Integer>{

}
