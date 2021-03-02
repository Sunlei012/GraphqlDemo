package com.example.graphql.demp.demo.dao;

import com.example.graphql.demp.demo.entity.Teacher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherDao {
    List<Teacher> teachers;
    public TeacherDao(){
        teachers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Teacher teacher = new Teacher(i,"teacher"+i);
            teachers.add(teacher);
        }
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Teacher getTeacherById(Integer id){
        return teachers.get(id);
    }

    public Teacher insertTeacher(Integer id, String name){
        Teacher teacher = new Teacher(id, name);
        teachers.add(teacher);
        return teacher;
    }

    public Teacher insertTeacher(Teacher teacher){
        teachers.add(teacher);
        return teacher;
    }

    public Teacher delectTeacher(Integer id){
        Teacher teacher = teachers.get(id);
        teachers.remove(id);
        return teacher;
    }
}
