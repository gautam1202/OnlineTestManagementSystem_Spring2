package com.capgemini.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.User;

@Repository
public interface IUserDao {
	public User addUser(User u);
	public List retrive();
	public User findById(long userId);
}