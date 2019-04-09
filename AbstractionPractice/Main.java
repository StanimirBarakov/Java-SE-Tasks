package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AllWork job = new AllWork();
        Task task1 = new Task("task1",5);
        Task task2 = new Task("task2",7);
        Task task3 = new Task("task3",8);
        Task task4 = new Task("task4",2);
        Task task5 = new Task("task5",12);
        Task task6 = new Task("task6",9);
        Task task7 = new Task("task7",22);
        Task task8 = new Task("task8",7);
        Task task9 = new Task("task9",13);
        Task task10 = new Task("task10",50);
        job.addTask(task1);
        job.addTask(task2);
        job.addTask(task3);
        job.addTask(task4);
        job.addTask(task5);
        job.addTask(task6);
        job.addTask(task7);
        job.addTask(task8);
        job.addTask(task9);
        job.addTask(task10);
        Employee[] employees = new Employee[3];
        Employee.setAllWork(job);
        employees[0] = new Employee("lili");
        employees[1] = new Employee("didi");
        employees[2] =  new Employee("tedi");
        int numberOfWorkingDays = 0;
        boolean workIsDone = false;
        do{
            numberOfWorkingDays++;
            System.out.println("----------------------------------------");
            System.out.println("day " + numberOfWorkingDays + ": ");
            for(int i = 0; i < employees.length; i++){
                if(Employee.getAllWork().isAllWorkDone()){
                    System.out.println("all work is done! VACATION!!!");
                    workIsDone = true;
                    break;
                }
                employees[i].startWorkingDay();
            }
            if(workIsDone){
                break;
            }
        }while(true);
    }
}
