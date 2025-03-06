package com.sachin.Student.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sachin.Student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
    Student findByName(String name);
}
