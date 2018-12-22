package com.zhukov;

 public class Cat extends Animals implements JumpInterface {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("New object");
    }

    @Override
    void voice() {
        System.out.println("meou");

    }

    public void go(){
        System.out.println("cot is go");
    }

     @Override
     public void jump() {


     }

     @Override
     public void run() {

     }
 }
