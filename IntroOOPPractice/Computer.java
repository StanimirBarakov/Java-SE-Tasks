package com.company;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;

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
