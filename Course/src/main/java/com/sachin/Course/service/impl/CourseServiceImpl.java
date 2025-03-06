package com.sachin.Course.service.impl;
import com.sachin.Course.model.Course;
import com.sachin.Course.repository.CourseRepository;
import com.sachin.Course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService
{
    @Autowired
    private CourseRepository cr;

    @Override
    public Course create(Course c)
    {
        cr.save(c);
        return c;
    }

    @Override
    public Course getById(int id)
    {
        return cr.findById(id).orElse(null);
    }

    @Override
    public List<Course> findAll()
    {
        return cr.findAll();
    }

    @Override
    public Course update(Course c)
    {
        cr.save(c);
        return c;
    }

    @Override
    public boolean delete(int id)
    {
        cr.deleteById(id);
        return true;
    }
}
