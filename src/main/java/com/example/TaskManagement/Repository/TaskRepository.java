package com.example.TaskManagement.Repository;

import com.example.TaskManagement.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
