package com.example.g46todo_api.service;


import com.example.g46todo_api.domain.dto.TaskDTOForm;
import com.example.g46todo_api.domain.dto.TaskDTOView;

import java.time.LocalDate;
import java.util.List;

public interface TaskService {
    TaskDTOView create(TaskDTOForm taskDTOForm);

    TaskDTOView findById(Long todoItemId);

    void update(TaskDTOForm taskDTOForm);

    void delete(Long id);

    List<TaskDTOView> findTasksByPersonId(Long personId);

    List<TaskDTOView> findTasksBetweenStartAndEndDate(LocalDate start, LocalDate end);

    List<TaskDTOView> findAllUnassignedTodoItems();

    List<TaskDTOView> findAllUnfinishedAndOverdue();
}