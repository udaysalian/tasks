package com.therealdanvega.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by usalian on 2/19/2018.
 */
@Entity
@Data
@AllArgsConstructor

public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate dueDate;
    @JsonFormat(pattern="MM/dd/yyyy")
    private boolean completed;

    public Task(long l, String test, LocalDate now, boolean b) {
        id = l;
        name = test;
        dueDate = now;
        completed = b;

    }

    public Task() {
    }
}
