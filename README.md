# TodoApp

# Todo Application


This application is Build on Restful APIs and JSON with the spring boot framework
and MySQL database

This app helps me to keep track of things I need to do.

It has an auto-generated Id, Title for the task title , Desc or a brief for Todos and 

task complete which shows the todo is completed or not completed

## API Reference

### home

```http
 Get localhost:8080/todo/home
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `/home` | `string` | `home` |

#### Get All Todos 

```http
  GET localhost:8080/todo/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `/todo`      | `string` | `GET all the items from the database `|


#### Add Todo 

```http
  POST localhost:8080/todo/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `/todo`      | `string` | `POST the item into the database `|


  
#### Update Todo 

```http
  PUT localhost:8080/todo/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `/todo`      | `string` | `Update the task into the database` |


#### DELETE Todo 

```http
  DELETE localhost:8080/todo/{todoid}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `/todoid`      | `int` | `DELETE the task from the database`|


## Features

- Adds a task
- Modifys a task
- Deletes a task


## src\main\java\com\springrest\springrest\entities\Todo
 It contains Constructor and the Getters Setters method   

```java
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

  
