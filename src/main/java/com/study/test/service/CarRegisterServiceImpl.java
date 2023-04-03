package com.study.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.study.test.dao.CarRegisterDAO;
import com.study.test.dto.CarRegisterDTO;

@Service
@SpringBootApplication(scanBasePackages = {"com.study.test.dao.CarRegisterDAO"})
public class CarRegisterServiceImpl implements CarRegisterService {
	
	@Autowired(required=false)
	CarRegisterDAO dao;
	
	@Override
	public CarRegisterDTO loginOk(String id, String password) {
		return dao.loginOk(id, password);
	}

}

