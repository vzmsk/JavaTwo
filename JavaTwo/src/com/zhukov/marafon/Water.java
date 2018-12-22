package com.zhukov.marafon;

public class Water extends Obstracle {
    int lenght;

    public Water(int lenght){
        this.lenght = lenght;
    }
    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(lenght);
    }
}
