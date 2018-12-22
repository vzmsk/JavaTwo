package com.zhukov.marafon;

public class Course {
    Competitor[] competitors = {new Human("Bob"), new Cat("Vaska"),
            new Dog("Tuzik")};
    Obstracle[] obstracles = {new Cross(80), new Wall(5), new Water(3)};

    String adfg;

    public Course(String adfg) {
        this.adfg = adfg;
        for(Competitor c: competitors) {
            for(Obstracle o: obstracles) {
                o.doIt(c);
                if (!c.isDistance()) {
                    break;
                }
            }
        }
        for(Competitor c:competitors) {
            c.info();
        }
    }
}

