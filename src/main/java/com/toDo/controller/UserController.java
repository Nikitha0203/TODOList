package com.toDo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toDo.entity.UserDetails;
import com.toDo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userservice;
	
	 @GetMapping("/login")
	    public List<UserDetails> getCurrentUser() {
	        return userservice.getUser();
	    }
	 @PostMapping("/addUser")
	 public UserDetails addUser(@RequestBody UserDetails user) {
		return userservice.saveUser(user);
		 
	 }
	 

	
	
	

}
