package com.example.TaskManagement.Resource;


import com.example.TaskManagement.Model.Tasks;
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
    public List<Tasks> listAll(){
        return taskService.listAll();
    }

    @GetMapping("/{id}")
    public Optional<Tasks> getById(@PathVariable Integer id){
        if(taskService.exist(id)) {
            return taskService.getById(id);
        }
        else
            return null;
    }

    @PostMapping("/save")
    public Tasks saveTask(@RequestBody Tasks tasks){
        return taskService.save(tasks);
    }

    @PutMapping("/update/{id}")
    public Tasks updateTask(@RequestBody Tasks tasks, @PathVariable Integer id){
        Optional<Tasks> task1 = taskService.getById(id);
        tasks.setId(id);
        return taskService.save(tasks);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Integer id){
        if(taskService.exist(id)) {
            taskService.delete(id);
        }
    }
}
