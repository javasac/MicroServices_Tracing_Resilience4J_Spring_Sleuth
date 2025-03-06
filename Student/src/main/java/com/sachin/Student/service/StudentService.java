package com.sachin.Student.service;
import com.sachin.Student.model.Student;
import com.sachin.Student.model.StudentDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentService
{
    List<Student> findAll();
    Student getById(int id);
    Student getByName(String name);
    Student save(Student stud);
    Student update(Student s);
    boolean delete(int id);
    StudentDetail getStudentDetailById(int id);
    StudentDetail StudentDetailsWebClient(int id);
}
