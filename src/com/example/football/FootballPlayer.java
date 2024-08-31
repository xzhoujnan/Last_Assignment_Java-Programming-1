package com.example.football;

public class FootballPlayer extends Athlete {
    private String name;
    private int shirtNo;
    private String position;

    public FootballPlayer(String name, int shirtNo, String position, double weight, double height, int age) {
        super(weight, height, age, "Running, Jumping");
        this.name = name;
        this.shirtNo = shirtNo;
        this.position = position;
    }

    public void shoot() {
        System.out.println(name + " is shooting a ball.");
    }

    public void pass() {
        System.out.println(name + " is passing to Messi.");
    }

    public String getName() { return name; }
    public int getShirtNo() { return shirtNo; }
    public String getPosition() { return position; }
}
