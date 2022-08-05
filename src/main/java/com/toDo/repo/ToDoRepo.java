package com.toDo.repo;

import org.springframework.stereotype.Repository;

import com.toDo.entity.Todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ToDoRepo extends JpaRepository<Todo,Integer>{
	List<Todo> findAllByName(String username);
	

}
