package com.konstantinlevin77.hrms.adapters.NationalIdVerifierAdapter;

public interface NationalIdVerifier {
	
	public boolean verify(String name,String surname,short birthOfYear);

}
