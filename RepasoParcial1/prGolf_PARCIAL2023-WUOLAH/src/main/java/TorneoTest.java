import golf.*;
import java.util.ArrayList;
import java.util.List;

public class TorneoTest {

    public static void main(String[] args) {
        testTorneo();
    }

    public static void testTorneo() {
        // Creating players
        Jugador player1 = new Jugador("Player 1");
        Jugador player2 = new Jugador("Player 2");
        Jugador player3 = new Jugador("Player 3");

        // Creating a list of players
        List<Jugador> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        // Creating a tournament with the list of players and par
        Torneo torneo = new Torneo(players, 72);

        // Adding hits for each player
        torneo.addHits("Player 1", 70);
        torneo.addHits("Player 2", 72);
        torneo.addHits("Player 3", 74);

        // Testing cardOf method
        int scorePlayer1 = torneo.cardOf("Player 1");
        int scorePlayer2 = torneo.cardOf("Player 2");
        int scorePlayer3 = torneo.cardOf("Player 3");

        System.out.println("Player 1 score: " + scorePlayer1); // Expected output: -2
        System.out.println("Player 2 score: " + scorePlayer2); // Expected output: 0
        System.out.println("Player 3 score: " + scorePlayer3); // Expected output: 2

        // Testing classification method
        List<Jugador> classification = torneo.classification();
        System.out.println("Tournament Classification:");
        for (int i = 0; i < classification.size(); i++) {
            System.out.println((i + 1) + ". " + classification.get(i) + ", tarjeta = " + torneo.cardOf(classification.get(i).getName()));
        }
        // Expected output: Player 1, Player 2, Player 3 (sorted by score)
    }
}
