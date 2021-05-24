package com.konstantinlevin77.hrms.business.abstracts;

import com.konstantinlevin77.hrms.core.results.abstracts.Result;

public interface FieldChecker<T,Dao> {

	public Result check(T data,Dao dao); 

}
