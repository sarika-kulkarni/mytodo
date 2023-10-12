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

    @Override
    public TodoItem createTodoItem(TodoItem todoItem) {
        return todoRepository.save(todoItem);
    }

    @Override
    public void deleteTodoItem(Integer id) {
     todoRepository.deleteById(id);
    }

    @Override
    public TodoItem updateTodoItem(Integer id, TodoItem updatedTodoItem) {
    updatedTodoItem.setId(id);
        return todoRepository.save(updatedTodoItem);
    }
}
