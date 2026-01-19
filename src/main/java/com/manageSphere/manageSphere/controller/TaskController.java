package com.manageSphere.manageSphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.manageSphere.manageSphere.dto.TaskRequestDTO;
import com.manageSphere.manageSphere.dto.TaskResponseDTO;
import com.manageSphere.manageSphere.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // CREATE TASK
    @PostMapping
    public TaskResponseDTO createTask(@Valid @RequestBody TaskRequestDTO dto) {
        return taskService.createTask(dto);
    }

    // GET TASK BY ID
    @GetMapping("/{id}")
    public TaskResponseDTO getTask(@PathVariable Long id) {
        return taskService.getTask(id);
    }

    // GET ALL TASKS
    @GetMapping
    public List<TaskResponseDTO> getAllTasks() {
        return taskService.getAllTasks();
    }

    // UPDATE TASK
    @PutMapping("/{id}")
    public TaskResponseDTO updateTask(
            @PathVariable Long id,
            @Valid @RequestBody TaskRequestDTO dto) {

        return taskService.updateTask(id, dto);
    }

    // DELETE TASK
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted";
    }
}
