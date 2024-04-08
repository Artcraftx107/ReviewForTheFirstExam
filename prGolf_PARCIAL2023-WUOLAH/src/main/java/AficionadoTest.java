import golf.*;

import java.util.ArrayList;
import java.util.List;

public class AficionadoTest {

    public static void main(String[] args) {
        testAficionado();
    }

    public static void testAficionado() {
        // Creating players
        Jugador player1 = new Jugador("Sergio");
        Jugador player2 = new Jugador("Arturo");
        Jugador player3 = new Jugador("Sau");
        Aficionado aficionado1 = new Aficionado("Manutay", 10);
        Aficionado aficionado2 = new Aficionado("Juanan", 35);
        Aficionado aficionado3 = new Aficionado("ManuTheGhost", 20);

        // Creating a list of players
        List<Jugador> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(aficionado1);
        players.add(aficionado2);
        players.add(aficionado3);

        // Creating a tournament with the list of players and par
        Torneo torneo = new Torneo(players, 73);

        // Adding hits for each player
        torneo.addHits(player1.getName(), 72);
        torneo.addHits(player2.getName(), 73);
        torneo.addHits(player3.getName(), 77);
        torneo.addHits(aficionado1.getName(), 80);
        torneo.addHits(aficionado2.getName(), 97);
        torneo.addHits(aficionado3.getName(), 99);
        System.out.println("Torneo con profesionales y aficionados: \n");
        for (int i = 0; i<players.size(); i++){
            System.out.println(players.get(i)+", tarjeta= "+torneo.cardOf(players.get(i).getName()));
        }
    }
}
