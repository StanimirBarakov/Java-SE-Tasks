package com.company;

public class StudentsGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;

    private StudentsGroup(){
        this.students = new Student[5];
        freePlaces = 5;
    }
    StudentsGroup(String groupSubject){
        this();
        this.groupSubject = groupSubject;
    }
    void emptyGroup(){
        this.students = new Student[5];
        this.freePlaces = 5;
    }
    String theBestStudent(){
        int index = 0;
        for(int i =1 ; i < students.length; i++){
            if(students[i].grade > students[index].grade){
                index = i;
            }
        }
        return students[index].name;
    }
    void printStudentsInGroup(){
        for(int i = 0; i < students.length; i++){
            System.out.println("name: " + students[i].name + " age: " + students[i].age + " has degree: "
                    + students[i].isDegree + "  " + " year in college: " + students[i].yearInCollege +
                    " subject: " + students[i].subject +  " grade: " + students[i].grade);
        }
    }

}
