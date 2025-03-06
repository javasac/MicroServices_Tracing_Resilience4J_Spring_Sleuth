package com.sachin.Student.service.impl;
import com.sachin.Student.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiCallRestTemplate
{
    @Autowired
    RestTemplate restTemplate;
    private static final String courseMicroServiceBaseURL = "http://Course-Service/course";

    public Course getCourseDetails(int courseId)
    {
        Course c = restTemplate.getForObject(courseMicroServiceBaseURL + "/find/{courseId}", Course.class, courseId);
        return c;
    }
}
