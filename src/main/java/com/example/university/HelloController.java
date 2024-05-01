package com.example.university;
import java.io.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private TextField student_id;
    @FXML
    private TextField course_code;
    DataBase d=DataBase.getInstance();


    public Course getCoursebyCourseCode(String coursecode)
    {
        Course course=null;
        for (Course c :d.getCourses())
        {
            if (coursecode.equals(c.getCourseCode()))
                course=c;

        }
        return course;
    }


public Student getStudentByID(String ID)
{
    Student student=null;
    for (Student s :d.getStudents())
    {
        if (ID.equals(s.getID()))
             student=s;

    }
    return student;
}


    @FXML
    public void onHelloButtonClick(ActionEvent event) {
        String studentID = student_id.getText();
        String courseCode = course_code.getText();
        Student student = getStudentByID(studentID);
        Course course = getCoursebyCourseCode(courseCode);
        d.EnrollStudentCourse(student, course);
        student.getCourses().forEach(course1 -> {
            System.out.println("course code is " + " " + course1.getCourseCode());
        });
        System.out.println("course registered successfully");
        }
    }
