package com.sarika.mytodo.repository;

import com.sarika.mytodo.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItem, Integer> {

}
