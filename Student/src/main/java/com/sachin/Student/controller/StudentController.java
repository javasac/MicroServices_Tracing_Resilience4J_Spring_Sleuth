package com.sachin.Student.controller;
import com.sachin.Student.model.Student;
import com.sachin.Student.model.StudentDetail;
import com.sachin.Student.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController
{
    @Autowired
    private StudentServiceImpl simpl;

    @GetMapping("/webclient/{id}")
    public StudentDetail StudentDetailsWebClient(@PathVariable int id)
    {
        return simpl.StudentDetailsWebClient(id);
    }

    @GetMapping("/studentdetails/{id}")
    public StudentDetail findStudentDetails(@PathVariable int id)
    {
        return simpl.getStudentDetailById(id);
    }

    @GetMapping("/id")
    public Student getById(@RequestParam(value="id", defaultValue = "1") int id)
    {
        return simpl.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public Student getByName(@RequestParam(value="name", defaultValue = "Sachin") String name)
    {
        return simpl.getByName(name);
    }

    @PutMapping("/update")
    public Student update(@RequestBody(required = true) Student s)
    {
        return simpl.update(s);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return simpl.delete(id);
    }

    @GetMapping("/all")
    public List<Student> findAll()
    {
        return simpl.findAll();
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody(required = true) Student s)
    {
        //System.out.println(s.getCell() + "==" + s.getStd() + "==" + s.getName() + "==" + s.getId());
        return simpl.save(s);
    }
}
