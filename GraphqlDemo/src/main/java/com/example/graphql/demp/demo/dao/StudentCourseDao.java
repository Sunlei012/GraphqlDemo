package com.example.graphql.demp.demo.dao;

import com.example.graphql.demp.demo.entity.StudentCourse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentCourseDao {
    List<StudentCourse> studentCourses;
    public StudentCourseDao(){
        studentCourses = new ArrayList<>();
        StudentCourse studentCourse = new StudentCourse(1,1,2);
        studentCourses.add(studentCourse);
        studentCourse = new StudentCourse(1,1,3);
        studentCourses.add(studentCourse);
        studentCourse = new StudentCourse(1,2,2);
        studentCourses.add(studentCourse);
    }
    public List<StudentCourse> findStudentCourseByStudentId(Integer studentId){
        List<StudentCourse> studentCourseList = new ArrayList<>();
        for (StudentCourse studentCourse : studentCourses) {
            if (studentId.equals(studentCourse.getStudentId()))
                studentCourseList.add(studentCourse);
        }
        return studentCourseList;
    }

    public List<StudentCourse> findStudentCourseByCourseId(Integer courseId){
        List<StudentCourse> studentCourseList = new ArrayList<>();
        for (StudentCourse studentCourse : studentCourses) {
            if (courseId.equals(studentCourse.getCourseId()))
                studentCourseList.add(studentCourse);
        }
        return studentCourseList;
    }


}
