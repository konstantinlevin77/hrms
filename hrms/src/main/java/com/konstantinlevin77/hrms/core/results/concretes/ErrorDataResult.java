package com.konstantinlevin77.hrms.core.results.concretes;

import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data) {
		super(data, false);
	}
	
	public ErrorDataResult(T data,String message) {
		super(data,false,message);
	}

}
