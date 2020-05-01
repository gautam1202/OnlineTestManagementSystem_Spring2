package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.User;
import com.capgemini.service.IUserService;



@RestController
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping(value="/user")
	public List<User> fetchUser() {
		return userService.retrive();
	}
	
	@GetMapping(value="/user/(userId)")
	public User fetchUserById( @PathVariable long userId) {
		return userService.findById(userId);
	}
	
	@PostMapping(value="/user/new",consumes= {"application/json"})
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "success";
	}

}