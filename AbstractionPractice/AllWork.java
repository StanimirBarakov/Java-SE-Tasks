package com.company;

public class AllWork {
    private Task[] tasks;
    private int freePlacesForTasks;
    private int currentUnassignedTask;

    public AllWork() {
        freePlacesForTasks = 10;
        tasks = new Task[freePlacesForTasks];
        currentUnassignedTask = 0;
    }
    void addTask(Task task){
        if(this.freePlacesForTasks > 0) {
            this.tasks[this.tasks.length - this.freePlacesForTasks] = task;
            this.freePlacesForTasks--;
        }
    }
    Task getNextTask(){
        if(currentUnassignedTask < 10) {
            if(this.currentUnassignedTask > 0 && tasks[currentUnassignedTask-1].getWorkingHours() > 0) {
                return this.tasks[currentUnassignedTask-1];
            }
            return this.tasks[currentUnassignedTask++];
        }
        return this.tasks[tasks.length - 1];
    }
    boolean isAllWorkDone(){
        return currentUnassignedTask == tasks.length && tasks[tasks.length - 1].getWorkingHours() == 0;
    }
}
