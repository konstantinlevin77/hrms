package com.konstantinlevin77.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konstantinlevin77.hrms.business.abstracts.PositionService;
import com.konstantinlevin77.hrms.core.results.abstracts.DataResult;
import com.konstantinlevin77.hrms.core.results.concretes.SuccessDataResult;
import com.konstantinlevin77.hrms.dataAccess.abstracts.PositionDao;
import com.konstantinlevin77.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		this.positionDao = positionDao;
	}
	
	@Override
	public DataResult<List<Position>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Position>>(
		this.positionDao.findAll(),
		"Tüm pozisyonlar başarı ile döndürüldü.");
	}

}
