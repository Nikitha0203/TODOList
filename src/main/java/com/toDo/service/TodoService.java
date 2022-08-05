package com.toDo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDo.entity.Todo;
import com.toDo.repo.ToDoRepo;

@Service
public class TodoService {
	@Autowired
	ToDoRepo repo;
	
	public Todo saveTask(Todo todo) {
		return repo.save(todo);
	}
	
	public List<Todo> getTask(){
		return repo.findAll();
	}
	
	public List<Todo> getTaskByUser(String username) {
        return repo.findAllByName(username);
    }
	
	public String deleteTask(int id) {
        repo.deleteById(id);
        return id + " id -> Task removed/completed";
    }
}
