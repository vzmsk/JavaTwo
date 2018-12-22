package com.zhukov.enums;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.Chery;
        System.out.println(fruit);
        System.out.println(fruit.ordinal());
        for (Fruit f : Fruit.values()) {
            System.out.println(f.getRus()+" ves "+f.getWeight());
        }

        if (fruit == Fruit.Chery) {
            System.out.println("Vishnya");
        }else{
            System.out.println("dont vishnya");
        }


    }


}
