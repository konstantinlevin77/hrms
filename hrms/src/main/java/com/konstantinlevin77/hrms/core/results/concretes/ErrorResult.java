package com.konstantinlevin77.hrms.core.results.concretes;

import com.konstantinlevin77.hrms.core.results.abstracts.Result;

public class ErrorResult extends Result{
	
	public ErrorResult() {
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false,message);
	}

}
