package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Todo {

	@Id
	private long id;
	@NotNull
	private String title;
	private String description;
	private boolean done;

	public Todo(long id, String title, String description,boolean done) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.done=done;
	}

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", done=" + done + "]";
	}
	

}
