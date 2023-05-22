package com.example.TaskManagement.Repository;

import com.example.TaskManagement.Model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks, Integer> {
}
