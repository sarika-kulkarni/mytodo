package com.sarika.mytodo.service;

import com.sarika.mytodo.entity.TodoItem;

import java.util.List;

public interface TodoService {
    List<TodoItem> getAllTodoItems();
    TodoItem createTodoItem(TodoItem todoItem);
    void deleteTodoItem(Integer id);
    TodoItem updateTodoItem(Integer id, TodoItem updatedTodoItem);

}
