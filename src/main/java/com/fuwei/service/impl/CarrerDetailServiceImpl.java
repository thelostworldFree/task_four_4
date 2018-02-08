package com.fuwei.service.impl;

import com.fuwei.mapper.CarrerDetailMapper;
import com.fuwei.pojo.CarrerDetail;
import com.fuwei.service.CarrerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrerDetailServiceImpl implements CarrerDetailService {
	@Autowired
    CarrerDetailMapper carrerDetailMapper;
	
	
	public List<CarrerDetail> list1(String carrerDetail){
		return carrerDetailMapper.list1(carrerDetail);
	}

	@Override
	public void add1(CarrerDetail c) {
		carrerDetailMapper.add1(c);
		
	}


	@Override
	public void update1(CarrerDetail c) {
		carrerDetailMapper.update1(c);
	}


	@Override
	public void delete1(CarrerDetail c) {
		carrerDetailMapper.delete1(c.getCid());
	}


	@Override
	public CarrerDetail get1(int cid) {
		// TODO Auto-generated method stub
		return carrerDetailMapper.get1(cid);
	};

}
