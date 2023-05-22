package com.example.TaskManagement.Resource;


import com.example.TaskManagement.Model.Task;
import com.example.TaskManagement.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/task")
public class TaskResource {

    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public List<Task> listAll(){
        return taskService.listAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable Integer id){
        if(taskService.exist(id)) {
            return taskService.getById(id);
        }
        else
            return null;
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return taskService.save(task);
    }

    @PutMapping("/update/{id}")
    public Task updateTask(@RequestBody Task task, @PathVariable Integer id){
        Optional<Task> task1 = taskService.getById(id);
        task.setIdtest(id);
        return taskService.save(task);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Integer id){
        if(taskService.exist(id)) {
            taskService.delete(id);
        }
    }
}
