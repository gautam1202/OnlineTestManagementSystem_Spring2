package com.capgemini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.entity.User;



@Service
public interface IUserService {
	public User addUser(User u);
	public User findById(long userId);
	public List retrive();
}