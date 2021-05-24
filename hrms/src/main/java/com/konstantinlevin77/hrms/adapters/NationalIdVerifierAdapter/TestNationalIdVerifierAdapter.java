package com.konstantinlevin77.hrms.adapters.NationalIdVerifierAdapter;

import com.konstantinlevin77.hrms.services.testNationalIdVerification.abstracts.TestNationalIdVerificationService;

public class TestNationalIdVerifierAdapter implements NationalIdVerifier{
	
	private TestNationalIdVerificationService testNationalIdVerificationService;
	
	public TestNationalIdVerifierAdapter(TestNationalIdVerificationService testNationalIdVerificationService){ 
		
		this.testNationalIdVerificationService = testNationalIdVerificationService;
		
	}

	@Override
	public boolean verify(String name, String surname, short birthOfYear) {
		// TODO Auto-generated method stub
		return this.testNationalIdVerificationService.verify(name, surname, birthOfYear);
	}

}
