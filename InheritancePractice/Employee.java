package com.company;

public class Employee extends Person{
    private double daySalary;

    public Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
    }
    double calculateOvertime(double hours){
        if(super.getAge() < 18) {
            return 0;
        }
        return daySalary * 1.5 * hours;
    }
    void showEmployeeInfo(){
        super.showPersonInfo();
        System.out.print(" salary: " + this.daySalary);
    }
    void showInfo(){
        showEmployeeInfo();
    }
    boolean isEmployee(){
        return true;
    }
}
