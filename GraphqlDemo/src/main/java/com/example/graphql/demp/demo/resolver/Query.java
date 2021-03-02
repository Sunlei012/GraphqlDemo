package com.example.graphql.demp.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.demp.demo.dao.CourseDao;
import com.example.graphql.demp.demo.dao.StudentDao;
import com.example.graphql.demp.demo.dao.TeacherDao;
import com.example.graphql.demp.demo.entity.Course;
import com.example.graphql.demp.demo.entity.Student;
import com.example.graphql.demp.demo.entity.Teacher;
import com.example.graphql.demp.demo.model.TeacherInput;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    StudentDao studentDao;
    @Autowired
    TeacherDao teacherDao;
    @Autowired
    CourseDao courseDao;

    public Student findStudentById(Integer id){
        return studentDao.findStudentById(id);
    }

    public List<Student> findAllStudent(){
        return studentDao.getStudents();
    }

//    public Teacher inset(TeacherInput teacher){
//        Teacher teacher1 = new Teacher(teacher.getId(),teacher.getName());
//        return teacherDao.insertTeacher(teacher1);
//    }
}
