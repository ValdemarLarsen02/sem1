import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating objetcs for s player and j player.
        StandardPlayer player1 = new StandardPlayer("Micke");
        StandardPlayer player2 = new StandardPlayer("Markus");
        JuniorPlayer player3 = new JuniorPlayer("Valdemar");
        JuniorPlayer player4 = new JuniorPlayer("Frederik");


        player1.addPoints(10);
        player2.addPoints(20);
        player3.addPoints(10);
        player4.addPoints(20);

        //Creating a list to hold the players and after that adding them to it.
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        //Creating a team object
        Team team = new Team("Team A", players);

        // Adding points to the team, that gets split between each player.
        team.addPoints(40);

        // Points/Data after we created our Team object.
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

        // using toString method from team class.
        System.out.println(team);

        // Tournament object and adding players:
        Tournament tournament = new Tournament();
        tournament.addPlayer(player1);
        tournament.addPlayer(player2);
        tournament.addPlayer(player3);
        tournament.addPlayer(player4);

        // Little for loop to crate some more test players.
        for (int i = 5; i <= 14; i++) {
            StandardPlayer player = new StandardPlayer("Player" + i);
            player.addPoints(i * 10); // Adds random points to the players depending on thir index value.
            tournament.addPlayer(player);
        }

        // Showing top 10 list.
        List<Player> topTen = tournament.getTopTen();
        System.out.println("Top 10 players:");
        for (Player player : topTen) {
            System.out.println(player.getName() + " " + player.getPoints()); // Can also just use System.out.println(player);
        }

        // Average point
        System.out.println("Average points: " + tournament.getAverage());

    }
}
