package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person[] people = new Person[10];
        people[0] = new Person("gosho",18,true);
        people[1] = new Person("penka",44,false);
        people[2] = new Student("ivaka",20,true,5);
        people[3] = new Student("qna", 21,false,4.5);
        people[4] = new Employee("leni", 35,false,100);
        people[5] = new Employee("MISHO",55,true,85);
        for(int i = 0; i < people.length; i++){
            if(people[i] != null){
                people[i].showInfo();
                System.out.println();
            }
        }
        for(int i = 0; i < people.length; i++){
            if(people[i] != null && people[i].isEmployee()){
                System.out.println("additional payment: " + ( (Employee) people[i]).calculateOvertime(2));
            }
        }

        /*
         възможно е само ако в default_ния конструктор на student извикваме конструктора с параметри
         или извикаме конструктора с параментри за Person в него и сложим някакви default-ни стойности за параметрите
         */
    }
}
