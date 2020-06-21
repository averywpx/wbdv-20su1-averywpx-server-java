package com.example.wbdv20su1averywpxserverjava.models;

import javax.persistence.*;

@Entity
@Table(name="tasks")
@idClass(TaskId.class)
public class Task {

    @Id
    private long userId;

    @Id
    private long sectionId;

    private String content;
}
