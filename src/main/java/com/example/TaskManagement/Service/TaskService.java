package com.example.TaskManagement.Service;


import com.example.TaskManagement.Model.Task;
import com.example.TaskManagement.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepo;

    public List<Task> listAll(){
        return taskRepo.findAll();
    }

    public void save(Task task){
        taskRepo.save(task);
    }

    public void delete(Task task){
        taskRepo.delete(task);
    }
}
