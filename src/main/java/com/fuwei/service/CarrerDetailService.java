package com.fuwei.service;

import com.fuwei.pojo.CarrerDetail;

import java.util.List;

public interface CarrerDetailService {

	List<CarrerDetail> list1(String carrerDetail);
	void add1(CarrerDetail c);
	void update1(CarrerDetail c);
	void delete1(CarrerDetail c);
	CarrerDetail get1(int cid);

}
