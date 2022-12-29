package com.yash.Chaining;

import java.util.Locale;

class Student{
    String name;
    int grade;

    public Student setName(String name){
        this.name=name;
        return this;

    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;

    }
}
public class ChainMail {
    public static void main(String[] args) {
     Student s =new Student();
     s.setGrade(99).setName("Yash");
        System.out.println(s.name);
        System.out.println(s.grade);


    }
}
