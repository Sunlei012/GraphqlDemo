package com.example.graphql.demp.demo.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Student {

    Integer id;

    String name;

    public Student(int i, String s) {
        this.id = i;
        this.name = s;
    }
}
