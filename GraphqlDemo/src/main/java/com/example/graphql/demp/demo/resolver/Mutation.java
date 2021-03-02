package com.example.graphql.demp.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.demp.demo.dao.CourseDao;
import com.example.graphql.demp.demo.dao.StudentDao;
import com.example.graphql.demp.demo.dao.TeacherDao;
import com.example.graphql.demp.demo.entity.Teacher;
import com.example.graphql.demp.demo.model.TeacherInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    StudentDao studentDao;
    @Autowired
    TeacherDao teacherDao;
    @Autowired
    CourseDao courseDao;

    public Teacher insert(TeacherInput teacherInput){
        Teacher teacher1 = new Teacher(teacherInput.getId(),teacherInput.getName());
        return teacherDao.insertTeacher(teacher1);
    }
}
