package com.sachin.Course.model;
import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course
{
    @Id
    private int courseid;
    private String name;
    private int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public int getCourseId() {
        return courseid;
    }

    public void setCourseId(int courseid) {
        this.courseid = courseid;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
