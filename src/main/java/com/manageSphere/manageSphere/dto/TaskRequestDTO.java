package com.manageSphere.manageSphere.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import com.manageSphere.manageSphere.entity.enums.Status;
import com.manageSphere.manageSphere.entity.enums.Priority;


public class TaskRequestDTO {

    @NotBlank
    private String title;

    private String description;

    @NotNull
    private Status status;

    @NotNull
    private Priority priority;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    // getters and setters
    
}

