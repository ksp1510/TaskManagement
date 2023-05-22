package com.example.TaskManagement.Service;


import com.example.TaskManagement.Model.Task;
import com.example.TaskManagement.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepo;

    public Boolean exist(Integer taskId){
        return taskRepo.existsById(taskId);
    }

    public List<Task> listAll(){
        return taskRepo.findAll();
    }

    public Optional<Task> getById(Integer taskId){
        return taskRepo.findById(taskId);
    }

    public Task save(Task task){
        return taskRepo.save(task);
    }


    public void delete(Integer taskId){
        taskRepo.deleteById(taskId);
    }
}
