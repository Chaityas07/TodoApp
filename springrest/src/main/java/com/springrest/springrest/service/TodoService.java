package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Todo;

public interface TodoService {

	public List<Todo> getTodo();

	public Todo addTodo(Todo todo);

	public Todo updateTodo(Todo todo);

	public Todo deleteTodo(long parseLong);


}