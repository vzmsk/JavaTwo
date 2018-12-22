package com.zhukov.marafon;

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int dist);
    boolean isDistance();
    void info();
}
