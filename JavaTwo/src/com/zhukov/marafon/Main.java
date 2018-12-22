package com.zhukov.marafon;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Bob"), new Cat("Vaska"),
                new Dog("Tuzik")};
        Obstracle[] obstracles = {new Cross(80), new Wall(5), new Water(3)};

        Course c = new Course("Set 1");

        Team team = new Team();
        team.showResults();

    }
}
