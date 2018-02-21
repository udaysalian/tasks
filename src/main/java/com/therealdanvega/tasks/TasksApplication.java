package com.therealdanvega.tasks;

import com.therealdanvega.tasks.domain.Task;
import com.therealdanvega.tasks.services.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(TasksApplication.class, args);
	}

	// command line runner
	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args->{

			taskService.save(new Task(3L,"test",LocalDate.now(),false));

			taskService.save(new Task(1L,"create spring bool application", LocalDate.now(), true));

			taskService.save(new Task(2L,"create spring Project Package", LocalDate.now(), false));

		};
	}
}
