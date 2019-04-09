package com.company;

public class Employee {
    private String name;
    private Task currentTask;
    private int hoursLeft;
    static private AllWork allWork;

    public Employee(String name) {
        if(name != null && !name.isEmpty())
            this.name = name;
        else
            this.name = "bobinka";
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(Task currentTask) {
        this.currentTask = currentTask;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(int hoursLeft) {
        this.hoursLeft = hoursLeft;
    }

    public static AllWork getAllWork() {
        return allWork;
    }

    public static void setAllWork(AllWork allWork) {
        Employee.allWork = allWork;
    }

    public String getName() {
        return name;
    }

    void startWorkingDay(){
        this.hoursLeft = 8;
        work();
    }

    void work(){
        do {
            if(this.hoursLeft <= 0){
                System.out.println(this.name + " has finished his shift!");
                break;
            }
            else if (allWork.isAllWorkDone()){
                System.out.println(this.name + " has finished the final task!");
                break;
            }
            else{
                if(this.currentTask == null){
                    this.currentTask = allWork.getNextTask();
                }
                System.out.println(this.name + " has started working on " + this.currentTask.getName());
                int hoursToWork = currentTask.getWorkingHours();
                if(hoursToWork > this.hoursLeft){
                    this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
                    this.hoursLeft = 0;
                    this.currentTask = null;
                }
                else{
                    this.hoursLeft -= hoursToWork;
                    this.currentTask.setWorkingHours(0);
                    System.out.println(this.name + " has finished working on " + this.currentTask.getName());
                    this.currentTask = null;
                }
            }
        } while (true);
    }
}
