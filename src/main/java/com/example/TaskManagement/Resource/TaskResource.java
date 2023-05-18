package com.example.TaskManagement.Resource;


import com.example.TaskManagement.Model.Task;
import com.example.TaskManagement.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskResource {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> listAll(){
        return taskService.listAll();
    }
}
