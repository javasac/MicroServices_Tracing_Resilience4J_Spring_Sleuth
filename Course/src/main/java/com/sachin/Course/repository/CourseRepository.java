package com.sachin.Course.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sachin.Course.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>
{
    Course findByName(String name);
}
