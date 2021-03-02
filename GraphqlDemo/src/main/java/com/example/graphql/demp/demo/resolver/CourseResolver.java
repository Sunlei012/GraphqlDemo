package com.example.graphql.demp.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.demp.demo.dao.StudentCourseDao;
import com.example.graphql.demp.demo.dao.StudentDao;
import com.example.graphql.demp.demo.dao.TeacherDao;
import com.example.graphql.demp.demo.entity.Course;
import com.example.graphql.demp.demo.entity.Student;
import com.example.graphql.demp.demo.entity.StudentCourse;
import com.example.graphql.demp.demo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CourseResolver implements GraphQLResolver<Course> {

    @Autowired
    TeacherDao teacherDao;

    @Autowired
    StudentDao studentDao;

    @Autowired
    StudentCourseDao studentCourseDao;

    public List<StudentCourse> getStudentCourse(Course course){
        return studentCourseDao.findStudentCourseByCourseId(course.getId());
    }

    public List<Student> getStudent(List<StudentCourse> studentCourses){
        List<Student> students = new ArrayList<>();
        for (StudentCourse studentCourse :
                studentCourses) {
            students.add(studentDao.findStudentById(studentCourse.getStudentId()));
        }
        return students;
    }

    public Teacher getTeacher(Course course){
        return teacherDao.getTeacherById(course.getTeacherId());
    }

    public List<Student> getStudent(Course course){
        List<Student> studentList = new ArrayList<>();
        List<StudentCourse> studentCourseList = studentCourseDao.findStudentCourseByCourseId(course.getId());
        for (StudentCourse s :
                studentCourseList) {
            studentList.add(studentDao.findStudentById(s.getStudentId()));
        }
        return studentList;
    }
}
