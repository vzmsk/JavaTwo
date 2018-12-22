package com.zhukov;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","red", 1);
        cat.info();
        cat.superJump();

        Dog dog = new Dog ("Car", "White", 2);
        dog.info();
        dog.voice();
        dog.run();

        Animals animal = new Cat("Murka","black",5);
        ((Cat) animal).go();

        System.out.println(cat instanceof Cat);

    }
}
