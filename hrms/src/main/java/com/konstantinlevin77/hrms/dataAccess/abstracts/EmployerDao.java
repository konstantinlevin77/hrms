package com.konstantinlevin77.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.konstantinlevin77.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

}
