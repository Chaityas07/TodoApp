# TodoApp

# Todo Application


This application is Build on Restful APIs and JSON with the spring boot framework
and MySQL database

This app helps me to keep track of things I need to do.

It has an auto-generated Id, Title for the task title and Desc or a brief for Todos 

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

  
