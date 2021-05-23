package com.konstantinlevin77.hrms.core.results.concretes;

import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;

public class SuccessDataResult<T> extends DataResult<T>{

	public SuccessDataResult(T data) {
		super(data, true);
	}
	
	public SuccessDataResult(T data,String message) {
		super(data,true,message);
	}
	
	

}
