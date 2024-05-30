import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tournament {
    private List<Player> players;

    // Constructor
    public Tournament() {
        this.players = new ArrayList<>();
    }

    // Adding a player to the tournement
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Getting the top 10 players with the most amount of points.
    public List<Player> getTopTen() {
        // Sorts af players where is shows the point in decreasing row.
        Collections.sort(players, Comparator.comparingInt(Player::getPoints).reversed());

        return players.subList(0, Math.min(players.size(), 10));
    }

    // Gets the average amount of points.
    public double getAverage() {
        if (players.isEmpty()) {
            return 0;
        }
        int totalPoints = 0;
        for (Player player : players) {
            totalPoints += player.getPoints();
        }
        return (double) totalPoints / players.size();
    }
}
