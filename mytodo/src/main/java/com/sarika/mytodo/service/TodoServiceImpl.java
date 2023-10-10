package com.sarika.mytodo.service;

import com.sarika.mytodo.entity.TodoItem;
import com.sarika.mytodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
private TodoRepository todoRepository;
@Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
}
@Override
    public List<TodoItem> getAllTodoItems(){
    return todoRepository.findAll();
}
}
