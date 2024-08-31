package com.example.football;

public class Athlete extends HomoSapien {
    private String skills;

    public Athlete(double weight, double height, int age, String skills) {
        super(weight, height, age);
        this.skills = skills;
    }

    public String getSkills() { return skills; }
}
