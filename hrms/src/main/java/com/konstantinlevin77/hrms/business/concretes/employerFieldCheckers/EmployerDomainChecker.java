package com.konstantinlevin77.hrms.business.concretes.employerFieldCheckers;

import com.konstantinlevin77.hrms.business.abstracts.FieldChecker;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.core.results.concretes.ErrorResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.EmployerDao;
import com.konstantinlevin77.hrms.entities.concretes.Employer;

import java.net.*;
import java.io.*;

public class EmployerDomainChecker implements FieldChecker<Employer, EmployerDao>{

	
	@Override
	public Result check(Employer data, EmployerDao dao){
		
		try {
			String webDomain = this.getWebsiteDomain(data.getCompanyWebsite());
			String emailDomain = this.getEmailDomain(data.getEmail());
			System.out.println(webDomain);
			System.out.println(emailDomain);
			
			if (!webDomain.equals(emailDomain)) {
				return new ErrorResult("Website ve email'in domaini aynı olmalıdır.");
			}
			
		}
		
		catch(MalformedURLException e){
			return new ErrorResult("Website çözümlenirken bir sorun ile karşılaşıldı.");
		}
		return new SuccessResult();
	}
		
	private String getWebsiteDomain(String url) throws MalformedURLException{
		
		URL websiteUrl = new URL(url);
		String websiteDomain = websiteUrl.getHost().replace("www.", "");
		
		return websiteDomain;
		
	}
	
	private String getEmailDomain(String email)
	{
	    return email.substring(email.indexOf("@") + 1);
	}
		
			
		
	}


