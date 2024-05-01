package com.example.university;
//singleton design pattern
import java.util.ArrayList;
public class DataBase implements ManipulateCourses {
    private static DataBase dataBase ;
    private ArrayList<Course> courses=new ArrayList<>();
    private ArrayList<Student> students=new ArrayList<>();
    private ArrayList<Doctor> doctors=new ArrayList<>();

    private DataBase() {
    }
    public static DataBase getInstance(){
        if (dataBase==null)
        {
            dataBase=new DataBase();
        }
        return dataBase;
    }

    //Override methods
    @Override
    public void EnrollStudentCourse(Student student,Course course)
    {
        student.addcourse(course);
        course.addStudent(student);
    };

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
