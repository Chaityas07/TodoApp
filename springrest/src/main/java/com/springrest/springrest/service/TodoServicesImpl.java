package com.springrest.springrest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.TodoRepo;
import com.springrest.springrest.entities.Todo;

@Service
public class TodoServicesImpl implements TodoService {

	@Autowired
	private TodoRepo todorepo;

	public TodoServicesImpl() {

	}

	@Override
	public List<Todo> getTodo() {
		return todorepo.findAll();
	}

	@Override
	public Todo addTodo(Todo todo) {

		todorepo.save(todo);
		return todo;
	}

	@Override
	public Todo updateTodo(Todo todo) {
		todorepo.save(todo);
		return todo;
	}

	@Override
	public Todo deleteTodo(long parseLong) {
		Todo e = todorepo.getOne(parseLong);
		todorepo.delete(e);
		return e;
	}
	
}
