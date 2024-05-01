package com.example.university;
public class Person {
   protected String Name;
    protected String PhoneNumber;
   protected String Address;
       protected String Age;
    public Person(){
    };

    public Person(String Name,String PhoneNumber, String Address,String Age){   //Overloading
        this.Name=Name;
        this.PhoneNumber=PhoneNumber;
        this.Address=Address;
        this.Age=Age;

    };


}
