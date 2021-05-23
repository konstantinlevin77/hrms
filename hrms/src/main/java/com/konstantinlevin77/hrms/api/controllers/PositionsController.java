package com.konstantinlevin77.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konstantinlevin77.hrms.business.abstracts.PositionService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.entities.concretes.Position;

@RestController
@RequestMapping("api/positions")
public class PositionsController {
	
	private PositionService positionService;
	
	@Autowired
	public PositionsController(PositionService positionService) {
		this.positionService = positionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Position>> getAll(){
		return this.positionService.getAll();
	}

	
	
}
