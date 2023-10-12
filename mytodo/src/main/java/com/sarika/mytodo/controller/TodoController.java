package com.sarika.mytodo.controller;

import com.sarika.mytodo.entity.TodoItem;
import com.sarika.mytodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mytodo")
public class TodoController {
private TodoService todoService;

@Autowired
    public TodoController(TodoService todoService){
    this.todoService = todoService;
}
@GetMapping
    public List<TodoItem> getAllTodoItems(){
    return todoService.getAllTodoItems();
}
@PostMapping
    public TodoItem createTodoItem(@RequestBody TodoItem todoItem){
    return todoService.createTodoItem(todoItem);
}

    @PutMapping("/{id}")
    public TodoItem updateTodoItem(@PathVariable Integer id, @RequestBody TodoItem updatedTodoItem){
    return todoService.updateTodoItem(id, updatedTodoItem);
    }
    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Integer id){
    todoService.deleteTodoItem(id);
    }
}
