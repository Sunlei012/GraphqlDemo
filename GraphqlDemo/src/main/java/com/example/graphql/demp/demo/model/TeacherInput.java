package com.example.graphql.demp.demo.model;

import lombok.Data;

@Data
public class TeacherInput {
    Integer id;

    String name;

    public TeacherInput(int i, String s) {
        this.id = i;
        this.name = s;
    }

    public TeacherInput(){}
}
