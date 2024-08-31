package com.example.football;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballPlayer> team = TeamCreator.createPlayer();
        TeamDisplay.display(team);
    }
}
package com.example.football;

public class Main {
    public static void main(String[] args) {
        // Create a FootballPlayer object
        FootballPlayer cristiano = new FootballPlayer("Cristiano Ronaldo", 7, "Center Forward", 80.5, 185, 39);

        // Call the shoot and pass methods
        cristiano.shoot(); // Output: Cristiano Ronaldo is shooting a ball.
        cristiano.pass();  // Output: Cristiano Ronaldo is passing to Messi.
    }
}
