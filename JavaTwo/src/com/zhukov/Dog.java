package com.zhukov;

public class Dog extends Animals implements MyInterface{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice() {
        System.out.println("Woof");

    }

    @Override
    public void run() {
        System.out.println("Dog is Run");

    }
}
