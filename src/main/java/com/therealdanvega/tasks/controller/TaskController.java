package com.therealdanvega.tasks.controller;

import com.therealdanvega.tasks.domain.Task;
import com.therealdanvega.tasks.services.TaskService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by usalian on 2/19/2018.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value={"","/"})
    public Iterable<Task> list() {
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }

}
