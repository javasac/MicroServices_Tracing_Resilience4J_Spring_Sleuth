package com.sachin.Student.service.impl;
import com.sachin.Student.model.Course;
import com.sachin.Student.model.Student;
import com.sachin.Student.model.StudentDetail;
import com.sachin.Student.repository.StudentRepository;
import com.sachin.Student.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ApiCallRestTemplate apiCall;
    @Autowired
    private ApiCallWebClient webClient;

    @Override
    public StudentDetail StudentDetailsWebClient(int id)
    {
        Student s = studentRepository.findById(id).orElse(null);
        System.out.println("StudentServiceImpl " + s.getName() + "=" + s.getCourseId());
        Mono<Course> courseMono = webClient.getCourseDetails(s.getCourseId());
        Course course = courseMono.block();

        StudentDetail sd = new StudentDetail();
        BeanUtils.copyProperties(s, sd);
        sd.setCourse(course);
        return sd;
    }

    @Override
    public StudentDetail getStudentDetailById(int id)
    {
        Student s = studentRepository.findById(id).orElse(null);
        Course c = apiCall.getCourseDetails(s.getCourseId());

        StudentDetail sd = new StudentDetail();
        BeanUtils.copyProperties(s, sd);
        sd.setCourse(c);
        return sd;
    }

    @Override
    public Student update(Student s)
    {
        studentRepository.save(s);
        return s;
    }

    @Override
    public boolean delete(int id)
    {
        studentRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Student> findAll()
    {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(int id)
    {
        Student s = studentRepository.findById(id).orElse(null);
        return s;
    }

    @Override
    public Student getByName(String name)
    {
        Student s = studentRepository.findByName(name);
        return s;
    }

    @Override
    public Student save(Student stud)
    {
        studentRepository.save(stud);
        return stud;
    }
}
