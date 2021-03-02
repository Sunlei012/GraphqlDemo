package com.example.graphql.demp.demo.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class StudentCourse {

    Integer id;

    Integer studentId;

    Integer courseId;

    public StudentCourse(Integer id, Integer studentId, Integer courseId) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
    }
}
