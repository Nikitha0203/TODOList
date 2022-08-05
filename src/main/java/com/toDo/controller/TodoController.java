package com.toDo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toDo.entity.Todo;
import com.toDo.service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	
	@PostMapping("/addtask")
	public Todo addtask(@RequestBody Todo todo) {
		return todoService.saveTask(todo);
		
	}
	@GetMapping("/task")
    public List<Todo> getAllCourses() {
        return todoService.getTask();
    }
    
    @GetMapping("/task/{name}")
    public List<Todo> getTaskByName(@PathVariable String name){
		return todoService.getTaskByUser(name);
    	
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        return todoService.deleteTask(id);
    }
	

}
