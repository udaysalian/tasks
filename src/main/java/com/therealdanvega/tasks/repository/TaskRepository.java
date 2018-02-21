package com.therealdanvega.tasks.repository;

import com.therealdanvega.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by usalian on 2/19/2018.
 */
public interface TaskRepository extends CrudRepository<Task,Long> {
}
