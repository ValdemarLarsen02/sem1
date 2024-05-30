import java.util.ArrayList;
import java.util.List;

public class Team implements Player {
    private String name;
    private List<Player> players;

    // Constuctor
    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players != null ? players : new ArrayList<>();
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public void addPoints(int points) {
        if (players.isEmpty()) {
            return;
        }
        int pointsPerPlayer = points / players.size();
        for (Player player : players) {
            player.addPoints(pointsPerPlayer);
        }
    }

    @Override
    public int getPoints() {
        int totalPoints = 0;
        for (Player player : players) {
            totalPoints += player.getPoints();
        }
        return totalPoints;
    }

    // Override our toString()
    @Override
    public String toString() {
        return "Name: " + name + ", points: " + getPoints();
    }
}
