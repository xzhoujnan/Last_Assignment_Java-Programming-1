package com.example.football;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballPlayer> team = TeamCreator.createPlayer();
        TeamDisplay.display(team);
    }
}
