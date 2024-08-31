package com.example.football;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamCreator {

    public static List<FootballPlayer> createPlayer() {
        Scanner scanner = new Scanner(System.in);
        List<FootballPlayer> team = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Shirt number: ");
            int shirtNo = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Position: ");
            String position = scanner.nextLine();

            System.out.print("Height: ");
            double height = scanner.nextDouble();

            System.out.print("Weight: ");
            double weight = scanner.nextDouble();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            FootballPlayer player = new FootballPlayer(name, shirtNo, position, weight, height, age);
            team.add(player);
        }

        return team;
    }
}
