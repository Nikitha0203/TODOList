package com.toDo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.toDo.repo.ToDoRepo;
import com.toDo.service.TodoService;
import com.toDo.entity.Todo;

@RunWith(SpringRunner.class)
@SpringBootTest
class ToDoAppApplicationTests {
	@Autowired
	private TodoService todo;
	@MockBean
	private ToDoRepo repo;
	

	@Test
	public void getTaskTest() {
		when(repo.findAll()).thenReturn(
				Stream.of(new Todo(2, "sooraj", "project", false), new Todo(3, "Michel", "make todo app", false),
						new Todo(4, "Michel", "test app", false)).collect(Collectors.toList()));
		assertEquals(3,todo.getTask().size());
	}
	
	@Test
	public void getTaskByUser() {
		String name="sooraj";
		when(repo.findAllByName(name)).thenReturn(Stream.of(new Todo(2, "sooraj", "project", false)).collect(Collectors.toList()));
		assertEquals(1,todo.getTaskByUser("sooraj").size());
	}
	
	@Test
	public void saveTaskTest() {
		Todo task = new Todo(5, "Phil", "do laundry", false);
		when(repo.save(task)).thenReturn(task);
		assertEquals(task, todo.saveTask(task));
	}
    
	@Test
	public void deleteTaskTest() {
		Todo task=new Todo(2,  "sooraj", "project", false);
		todo.deleteTask(task.getID());
		verify(repo,times(1)).delete(task);
	}
}
