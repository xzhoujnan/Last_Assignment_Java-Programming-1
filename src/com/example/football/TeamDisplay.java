package com.example.football;

import java.util.List;

public class TeamDisplay {

    public static void display(List<FootballPlayer> team) {
        for (FootballPlayer player : team) {
            System.out.println("Name: " + player.getName());
            System.out.println("Shirt No: " + player.getShirtNo());
            System.out.println("Position: " + player.getPosition());
            System.out.println("Height: " + player.getHeight());
            System.out.println("Weight: " + player.getWeight());
            System.out.println("Age: " + player.getAge());
            System.out.println();
        }
    }
}
