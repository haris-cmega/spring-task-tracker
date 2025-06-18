package com.example.task.tracker.mappers;

import com.example.task.tracker.domain.dto.TaskDto;
import com.example.task.tracker.domain.entities.Task;


public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);


}
