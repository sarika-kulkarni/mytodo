package com.sarika.mytodo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TodoItem {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean status;

    public String getStatus () {
        if (dueDate == null) {
            return "no due date set";
        } else if (dueDate == LocalDate.now()) {
            return "done";
        } else if (dueDate.isBefore(LocalDate.now())) {
            return "past due";
        } else {
            return "pending";
        }
    }
}