package com.zhukov;

abstract class Animals {
    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    private String name;
    private String color;
    private int age;

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Its wrong age < 0");
        }
    }

    abstract void voice();


}