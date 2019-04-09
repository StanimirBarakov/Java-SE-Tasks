package com.company;

public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    private Student(){
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }
    Student(String name, String subject){
        this();
        this.name = name;
        this.subject = subject;
    }
    void upYear(){
        if(!isDegree){
            yearInCollege++;
        }
        if(yearInCollege == 4){
            isDegree = true;
        }
    }
    double recieveScholarship(double min, double amount){
        if(this.grade >= min && this.age < 30){
            this.money += amount;
        }
        return this.money;
    }

}
