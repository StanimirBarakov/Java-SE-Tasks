package com.company;

public class Student extends Person{
    private double score;

    public Student(String name, int age, boolean isMale, double score) {
        super(name, age, isMale);
        this.score = score;
    }
    void showStudentInfo(){
        super.showPersonInfo();
        System.out.print(" score: " + this.score);
    }
    void showInfo(){
        showStudentInfo();
    }
}
