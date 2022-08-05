package com.toDo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDo.entity.UserDetails;
import com.toDo.entity.Todo;
import com.toDo.repo.ToDoRepo;
import com.toDo.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userrepo; 
	
	public List<UserDetails> getUser()
	{
		return userrepo.findAll();
	}
	
	public UserDetails saveUser(UserDetails user) {
		return userrepo.save(user);
    }
	

	


}
