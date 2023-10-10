package com.sarika.mytodo.controller;

import com.sarika.mytodo.entity.TodoItem;
import com.sarika.mytodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
