package com.yash.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am being a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man" );
    }
}
