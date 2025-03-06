package com.sachin.Student.model;

public class StudentDetail
{
    private int id;
    private String name;
    private String cell;
    private int courseId;
    private Course course;

    @Override
    public String toString() {
        return "StudentDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cell='" + cell + '\'' +
                ", courseId=" + courseId +
                ", course=" + course +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
