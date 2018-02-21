package com.therealdanvega.tasks.services;

import com.therealdanvega.tasks.domain.Task;
import org.springframework.stereotype.Service;

/**
 * Created by usalian on 2/19/2018.
 */
@Service
public interface TaskService {
    Iterable<Task> list();
    Task save(Task task);
}
