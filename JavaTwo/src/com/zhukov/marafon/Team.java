package com.zhukov.marafon;

public class Team {
    public String team = "Team A";
            Animal[] zveri = {new Cat("Vaska"), new Dog("Tuxik")};

            public void infoTeam() {
                System.out.println("Team: " + zveri);
                System.out.println();
            }

            public void showResults() {
                System.out.println(team + "\n");
                for (Animal a: zveri) {
                    if(a.onDistance) {
                        System.out.println(a + " successfully passed the distance.\n");
                    } else {
                        System.out.println(a + " did not pass the distance.\n");
                    }
        }
    }

}
