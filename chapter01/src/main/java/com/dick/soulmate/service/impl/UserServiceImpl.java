package com.dick.soulmate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dick.soulmate.dao.cluster.CityDao;
import com.dick.soulmate.dao.master.UserDao;
import com.dick.soulmate.entity.City;
import com.dick.soulmate.entity.User;
import com.dick.soulmate.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Autowired
	private CityDao cityDao;
	
	@Override
	public List<User> finaAllUsers() {
		List<City> citys = cityDao.findAllCity();
		return userDao.findAllUser();
	}

}
