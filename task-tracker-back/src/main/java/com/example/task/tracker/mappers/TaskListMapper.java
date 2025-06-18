package com.example.task.tracker.mappers;

import com.example.task.tracker.domain.dto.TaskListDto;
import com.example.task.tracker.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);

}


