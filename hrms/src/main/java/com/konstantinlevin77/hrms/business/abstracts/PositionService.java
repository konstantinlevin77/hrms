package com.konstantinlevin77.hrms.business.abstracts;

import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.abstracts.Result;
import com.konstantinlevin77.hrms.entities.concretes.*;
import java.util.List;


public interface PositionService {
	
	public DataResult<List<Position>> getAll();
	public Result add(Position position);

}
