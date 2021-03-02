package com.example.graphql.demp.demo.entity;

import com.example.graphql.demp.demo.dao.TeacherDao;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

@Entity
@Data
public class Course {


    Integer id;

    String name;

    Integer teacherId;

    public Course(int i, String s,int teacherId) {
        this.id = i;
        name = s;
        this.teacherId = teacherId;
    }

}
