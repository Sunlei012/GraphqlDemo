package com.example.graphql.demp.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.demp.demo.dao.CourseDao;
import com.example.graphql.demp.demo.entity.Course;
import com.example.graphql.demp.demo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeacherResolver implements GraphQLResolver<Teacher> {

    @Autowired
    CourseDao courseDao;

    public List<Course> getCourse(Teacher teacher){
        return courseDao.findCourseByTeacherId(teacher.getId());
    }
}
