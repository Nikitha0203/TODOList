package com.toDo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	public int ID;
	public String name;
	public String task;
	public boolean status;
	public Todo() {
		super();
	}
	
	
	
	public Todo(int iD, String name, String task, boolean status) {
		super();
		ID = iD;
		this.name = name;
		this.task = task;
		this.status = status;
	}



	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
