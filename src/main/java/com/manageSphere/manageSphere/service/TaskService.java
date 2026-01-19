package com.manageSphere.manageSphere.service;
import java.util.List;
import com.manageSphere.manageSphere.dto.TaskRequestDTO;
import com.manageSphere.manageSphere.dto.TaskResponseDTO;

public interface TaskService {

    TaskResponseDTO createTask(TaskRequestDTO dto);

    TaskResponseDTO updateTask(Long id, TaskRequestDTO dto);

    TaskResponseDTO getTask(Long id);

    List<TaskResponseDTO> getAllTasks();

    void deleteTask(Long id);
}

