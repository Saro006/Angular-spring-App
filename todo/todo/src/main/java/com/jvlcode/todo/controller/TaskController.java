package com.jvlcode.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvlcode.todo.model.Task;
import com.jvlcode.todo.repository.TaskRepositary;

@RestController
@CrossOrigin
@RequestMapping("/api/tasks")
public class TaskController {
	@Autowired
	private TaskRepositary taskRepository;
	@GetMapping("/heloworld")
	public String Hello_world() {
		return "hello hi";
	}
	
	@PostMapping
	public Task  createtask(@RequestBody Task task) {
		taskRepository.save(task);
		return task;	

	}
	
	@GetMapping                    
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}
	
	@PutMapping("/{id}")
	public Task updateTask(@PathVariable Long id,@RequestBody Task task) {
		task.setId(id);
		return taskRepository.save(task);
	
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
		taskRepository.deleteById(id);
		
		
		
	}
}
	