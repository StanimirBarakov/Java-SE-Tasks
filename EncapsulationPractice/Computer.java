package com.company;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;

     Computer(){
        this.isNotebook = false;
        this.operationSystem = "Windows XP";
    }
    Computer(int year,double price,int hardDiskMemory, int freeMemory){
         this();
         this.year = year;
         this.price = price;
         this.hardDiskMemory = hardDiskMemory;
         this.freeMemory = freeMemory;
    }
    Computer(boolean isNotebook, int year,double price,int hardDiskMemory, int freeMemory,String operationSystem){
        this.isNotebook = isNotebook;
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }
    int comparePrice(Computer c){
         if(this.price > c.price){
             return  - 1;
         }
         else if(this.price == c.price){
             return 0;
         }
         else
             return 1;
    }
    public void changeOperationSystem(String newOperationSystem){
        operationSystem = newOperationSystem;
    }
    public void useMemory(int memory){
        if(memory <= freeMemory){
            freeMemory -=memory;
        }
        else{
            System.out.println("not enough free memory!");
        }
    }
}
