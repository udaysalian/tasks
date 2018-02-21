package com.therealdanvega.tasks.services;

import com.therealdanvega.tasks.domain.Task;
import com.therealdanvega.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * Created by usalian on 2/19/2018.
 */
@Service
public class TaskService_Impl  implements  TaskService{

    private TaskRepository taskRepository;

    public TaskService_Impl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }
}
