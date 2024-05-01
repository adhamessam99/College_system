package com.example.university;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Course> courses=new ArrayList<>();

    private String ID;

   public Student(String Name, String PhoneNumber, String Address, String Age,String ID) {
        super(Name, PhoneNumber, Address, Age);

        this.ID=ID;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public void addcourse(Course course)
    {
        courses.add(course);
    }


}
