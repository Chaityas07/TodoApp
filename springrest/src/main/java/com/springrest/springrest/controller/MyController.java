package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Todo;
import com.springrest.springrest.service.TodoService;
import com.sun.istack.NotNull;

@RestController
public class MyController {

	@Autowired
	private TodoService TodoService;

	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}

	@GetMapping("/todo")
	public List<Todo> getTodo() {
		return this.TodoService.getTodo();

	}

	@PostMapping("/todo")
	public Todo addTodo(@NotNull @RequestBody Todo todo) {
		return this.TodoService.addTodo(todo);

	}

	@PutMapping("/todo")
	public Todo updateTodo(@NotNull @RequestBody Todo todo) {
		return this.TodoService.updateTodo(todo);

	}

	@DeleteMapping("/todo/{todoId}")
	public ResponseEntity<HttpStatus> deleteTodo(@PathVariable String todoId) {
		try {
			this.TodoService.deleteTodo(Long.parseLong(todoId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
