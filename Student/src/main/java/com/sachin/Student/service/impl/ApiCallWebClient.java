package com.sachin.Student.service.impl;
import com.sachin.Student.model.Course;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiCallWebClient
{
    private WebClient.Builder webClient = WebClient.builder();
    private static final String courseMicroServiceBaseURL = "http://Course-Service/course";

    public ApiCallWebClient(WebClient.Builder wc, ReactorLoadBalancerExchangeFilterFunction lbFunction)
    {
        this.webClient = wc;
    }

    public Mono<Course> getCourseDetails(int courseId)
    {
        return webClient.build().get()
                .uri(courseMicroServiceBaseURL + "/find/{courseId}")
                .retrieve().bodyToMono(Course.class);
    }
}
