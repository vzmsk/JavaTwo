package com.zhukov.marafon;

public class Animal implements Competitor{
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + "  " +name+ " Complete RUN!");
        }else{
            System.out.println("Fail");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + "  " +name+ " Complete SWIM!");
        }else{
            System.out.println("Fail");
            onDistance = false;
        }

    }

    @Override
    public void jump(int dist) {
        if (dist <= maxJumpHeight) {
            System.out.println(type + "  " +name+ " Complete JUMP!");
        }else{
            System.out.println("Fail");
            onDistance = false;
        }

    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " +name + " " + onDistance);
        }

    }
