package com.zhukov.enums;

public enum Fruit {
    Orange("Apelsin", 150), Apple("Yabloko", 200), Banana("banan", 70), Chery("vishnya", 25);

    private int weight;
    private String rus;

    Fruit(String rus, int weight ) {
        this.weight = weight;
        this.rus = rus;
    }

    Fruit(int weight) {
        this.weight = weight;
    }

    Fruit() {
        this.weight = -1;
    }

    public int getWeight() {
        return weight;
    }

    public String getRus() {
        return rus;
    }
}
