package com.example.graphql.demp.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.demp.demo.dao.CourseDao;
import com.example.graphql.demp.demo.dao.StudentCourseDao;
import com.example.graphql.demp.demo.entity.Course;
import com.example.graphql.demp.demo.entity.Student;
import com.example.graphql.demp.demo.entity.StudentCourse;
import graphql.schema.GraphQLCompositeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentResolver implements GraphQLResolver<Student> {

    @Autowired
    StudentCourseDao studentCourseDao;

    @Autowired
    CourseDao courseDao;

    public List<StudentCourse> getStudentCourse(Student student){
        return studentCourseDao.findStudentCourseByStudentId(student.getId());
    }

    public List<Course> getCourse(List<StudentCourse> studentCourses){
        List<Course> courseList = new ArrayList<>();
        for (StudentCourse studentCourse :
                studentCourses) {
             courseList.add(courseDao.findCourseById(studentCourse.getCourseId()));
        }
        return courseList;
    }

    public List<Course> getCourse(Student student){
        List<Course> courseList = new ArrayList<>();
        List<StudentCourse> studentCourseList = studentCourseDao.findStudentCourseByStudentId(student.getId());
        for (StudentCourse studentCourse :
                studentCourseList) {
            courseList.add(courseDao.findCourseById(studentCourse.getCourseId()));
        }
        return courseList;
    }

}
