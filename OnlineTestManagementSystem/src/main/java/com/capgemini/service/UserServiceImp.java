package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.IUserDao;
import com.capgemini.entity.User;



@Service
public class UserServiceImp implements IUserService {

	@Autowired
	IUserDao userDao;
	
	@Override
	public User addUser(User u) {
		return userDao.addUser(u);
	}

	@Override
	public User findById(long userId) {
		return userDao.findById(userId);
	}

	@Override
	public List retrive() {
		return userDao.retrive();
	}

}