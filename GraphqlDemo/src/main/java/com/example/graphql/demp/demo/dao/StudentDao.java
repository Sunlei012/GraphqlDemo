package com.example.graphql.demp.demo.dao;

import com.example.graphql.demp.demo.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDao {
    List<Student> students;

    public StudentDao(){
        students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student= new Student(i,"Student"+i);
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student findStudentById(Integer id){
        return students.get(id);
    }

    public Student insertStudent(Student student){
        students.add(student);
        return student;
    }
}
