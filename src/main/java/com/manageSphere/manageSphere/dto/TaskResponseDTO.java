package com.manageSphere.manageSphere.dto;
import com.manageSphere.manageSphere.entity.enums.Status;
import com.manageSphere.manageSphere.entity.enums.Priority;

public class TaskResponseDTO {

    private Long id;
    private String title;
    private String description;
    private Status status;
    private Priority priority;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
