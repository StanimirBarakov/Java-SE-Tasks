package com.company;

public class Person {
    private String name;
    private int age;
    private boolean isMale;
    Person(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    void showPersonInfo(){
        System.out.print("name: " + this.name + " age: " + this.age + " sex: " + (isMale? "male" : "female"));
    }
    void showInfo(){
        showPersonInfo();
    }

    public int getAge() {
        return age;
    }
    boolean isEmployee(){
        return false;
    }

}
