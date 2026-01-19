package com.manageSphere.manageSphere.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manageSphere.manageSphere.dto.TaskRequestDTO;
import com.manageSphere.manageSphere.dto.TaskResponseDTO;
import com.manageSphere.manageSphere.entity.Task;
import com.manageSphere.manageSphere.exception.ResourceNotFoundException;
import com.manageSphere.manageSphere.repository.TaskRepository;
import com.manageSphere.manageSphere.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{
@Autowired
    private TaskRepository taskRepository;

@Override
public TaskResponseDTO createTask(TaskRequestDTO dto) {

    Task task = new Task();
    task.setTitle(dto.getTitle());
    task.setDescription(dto.getDescription());
    task.setStatus(dto.getStatus());
    task.setPriority(dto.getPriority());

    Task saved = taskRepository.save(task);

    return mapToResponse(saved);
}
    

    @Override
public TaskResponseDTO updateTask(Long id, TaskRequestDTO dto) {

    Task task = taskRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Task not found"));

    task.setTitle(dto.getTitle());
    task.setDescription(dto.getDescription());
    task.setStatus(dto.getStatus());
    task.setPriority(dto.getPriority());

    Task updated = taskRepository.save(task);

    return mapToResponse(updated);
}

    @Override
    public TaskResponseDTO getTask(Long id) {
    Task task = taskRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Task not found"));

    return mapToResponse(task);
}


   @Override
    public List<TaskResponseDTO> getAllTasks() {
    return taskRepository.findAll()
            .stream()
            .map(this::mapToResponse)
            .toList();
}


    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
private TaskResponseDTO mapToResponse(Task task) {

    TaskResponseDTO dto = new TaskResponseDTO();
    dto.setId(task.getId());
    dto.setTitle(task.getTitle());
    dto.setDescription(task.getDescription());
    dto.setStatus(task.getStatus());
    dto.setPriority(task.getPriority());

    return dto;
}


}
