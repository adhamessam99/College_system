package com.example.university;

import java.util.ArrayList;
import java.util.Date;

public class Course {
    private ArrayList<Student> students=new ArrayList<>();
   private String CourseName;
   private String CourseCode;


    public Course(String CourseName,String CourseCode) {
        this.CourseName=CourseName;
        this.CourseCode=CourseCode;
    }

    public String getCourseName() {
        return this.CourseName;
    }

    public void setCourseName(String courseName) {
        this.CourseName = courseName;
    }

    public String getCourseCode() {
        return this.CourseCode;
    }

    public void setCourseCode(String courseCode) {
        this.CourseCode = courseCode;
    }


    public void addStudent(Student student)
    {
        students.add(student);
    }
}
