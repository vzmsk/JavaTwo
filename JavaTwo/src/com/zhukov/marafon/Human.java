package com.zhukov.marafon;

public class Human implements Competitor {

       String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxSwimDistance = 200;
        this.maxJumpHeight = 30;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println("Human" + "  " +name+ " Complete RUN!");
        }else{
            System.out.println("Fail");
            active = false;
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxRunDistance) {
            System.out.println("Human" + "  " +name+ " Complete JUMP!");
        }else{
            System.out.println("Fail");
            active = false;
        }

    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println("Human" + "  " +name+ " Complete SWIM!");
        }else{
            System.out.println("Fail");
            active = false;

    }




    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name+" "+ active);

    }
}
