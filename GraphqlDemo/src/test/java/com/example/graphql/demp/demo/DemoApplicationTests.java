package com.example.graphql.demp.demo;

import com.example.graphql.demp.demo.dao.StudentCourseDao;
import com.example.graphql.demp.demo.dao.TeacherDao;
import com.example.graphql.demp.demo.resolver.Query;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    TeacherDao teacherDao;

    @Autowired
    StudentCourseDao studentCourseDao;

    @Autowired
    Query query;

    @Test
    void contextLoads() {
//        System.out.println(teacherDao.getTeachers());
//        System.out.println(teacherDao.getTeacherById(2));

        System.out.println(studentCourseDao.findStudentCourseByCourseId(2));

    }

}
