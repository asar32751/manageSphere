package com.manageSphere.manageSphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manageSphere.manageSphere.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
