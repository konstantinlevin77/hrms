package com.konstantinlevin77.hrms.services.testNationalIdVerification.concretes;

import com.konstantinlevin77.hrms.services.testNationalIdVerification.abstracts.TestNationalIdVerificationService;

public class TestNationalIdVerificationManager implements TestNationalIdVerificationService{

	@Override
	public boolean verify(String name, String surname, short birthOfYear) {
		
		// This is a test service so without checking
		// the values, it just returns true.
		return true;
	}

}
