package com.example.graphql.demp.demo.dao;

import com.example.graphql.demp.demo.entity.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseDao {
    List<Course> courses;
    public CourseDao(){
        courses = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Course course = new Course(i,"Course"+i,i+1);
            courses.add(course);
        }
    }

    public Course findCourseById(Integer id){
        return courses.get(id);
    }

    public List<Course> findCourseByTeacherId(Integer teacherId){
        List<Course> courseList = new ArrayList<>();
        for (Course course : courses) {
            if (teacherId == course.getTeacherId())
                courseList.add(course);
        }
        return courseList;
    }

}
