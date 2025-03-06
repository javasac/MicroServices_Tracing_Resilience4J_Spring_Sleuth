package com.sachin.Course.service;
import com.sachin.Course.model.Course;
import java.util.List;

public interface CourseService
{
    Course create(Course c);

    Course getById(int id);

    List<Course> findAll();

    Course update(Course c);

    boolean delete(int id);
}
