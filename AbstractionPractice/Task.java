package com.company;

public class Task {
    private String name;
    private int workingHours;

    public String getName() {
        return name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
        if(this.workingHours < 0)
            this.workingHours = 0;
    }

    Task(String name, int workingHours){
        if(name != null && !name.isEmpty() && workingHours > 0){
            this.name = name;
            this.workingHours = workingHours;
        }
        else{
            this.name = "task";
            this.workingHours = 1;
        }

    }
}
