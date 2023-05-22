package com.example.TaskManagement.Service;


import com.example.TaskManagement.Model.Tasks;
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

    public List<Tasks> listAll(){
        return taskRepo.findAll();
    }

    public Optional<Tasks> getById(Integer taskId){
        return taskRepo.findById(taskId);
    }

    public Tasks save(Tasks tasks){
        return taskRepo.save(tasks);
    }


    public void delete(Integer taskId){
        taskRepo.deleteById(taskId);
    }
}
