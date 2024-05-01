package com.example.university;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloApplication extends Application {
    DataBase d = DataBase.getInstance();

    @Override
    public void start(Stage stage) throws IOException {

        loadStudents();
        loadcourses();


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


    }

    public void loadStudents()  {
        try {


            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("D:\\OOP Project\\src\\main\\java\\com\\example\\university\\student.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] student = line.split(splitBy);    // use comma as separator
                Student student1 = new Student(student[0], student[1], student[2], student[3], student[4]);
                d.getStudents().add(student1);
            }
            br.close();
        }
        catch (Exception e){

        };
    }

    public void loadcourses() {
        //exceptions
        try {


            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("D:\\OOP Project\\src\\main\\java\\com\\example\\university\\course.csv"));


            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] course = line.split(splitBy);    // use comma as separator
                Course courses = new Course(course[0], course[1]);
                d.getCourses().add(courses);
            }

            br.close();
        } catch (Exception e) {}

    }


    public static void main(String[] args) {
        launch();
    }
    {

    }
}