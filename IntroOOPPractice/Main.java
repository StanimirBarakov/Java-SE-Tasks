package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        computer1.year = 1994;
        computer1.price = 4562;
        computer1.hardDiskMemory = 5000;
        computer1.freeMemory = 5000;
        computer1.isNotebook = true;
        computer1.operationSystem = "Kali";
        computer2.year = 2015;
        computer2.isNotebook = false;
        computer2.price = 500;
        computer2.hardDiskMemory = 50000;
        computer2.freeMemory = 50000;
        computer2.operationSystem = "Windows 10";
        computer2.useMemory(100);
        computer1.changeOperationSystem("Windows 98");
        System.out.println(computer1.year + " " + computer1.price + " " + computer1.hardDiskMemory + " "
                           + computer1.freeMemory + "\n" + computer1.isNotebook + " " + computer1.operationSystem);
        System.out.println(computer2.year + " " + computer2.price + " " + computer2.hardDiskMemory + " "
                + computer2.freeMemory + "\n" + computer2.isNotebook + " " + computer2.operationSystem);
    }
}
