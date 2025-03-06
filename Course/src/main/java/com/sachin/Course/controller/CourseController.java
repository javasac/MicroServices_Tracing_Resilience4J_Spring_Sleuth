package com.sachin.Course.controller;
import com.sachin.Course.model.Course;
import com.sachin.Course.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController
{
    @Autowired
    private CourseServiceImpl courseService;

    @PutMapping("/update")
    public Course update(@RequestBody Course c)
    {
        courseService.update(c);
        return c;
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return courseService.delete(id);
    }

    @PostMapping("/create")
    public Course create(@RequestBody Course course)
    {
        return courseService.create(course);
    }

    @GetMapping("/find/{id}")
    public Course findById(@PathVariable int id)
    {
        return courseService.getById(id);
    }

    @GetMapping("/all")
    public List<Course> getAll()
    {
        return courseService.findAll();
    }
}
