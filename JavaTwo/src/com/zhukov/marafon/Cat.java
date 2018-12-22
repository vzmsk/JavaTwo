package com.zhukov.marafon;

public class Cat extends Animal {
    public Cat(String name) {
        super("Cat", name, 200, 1, 20);

    }

    @Override
    public void swim(int dist) {
        super.swim(dist);
        System.out.println("Cat cant swim!!!");
    }
}
