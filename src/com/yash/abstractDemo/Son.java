package com.yash.abstractDemo;

public class Son extends Parent {
    public Son(int age){
        super(age);

    }

    @Override
    void career() {
        System.out.println("I am being a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Pots");

    }
}
