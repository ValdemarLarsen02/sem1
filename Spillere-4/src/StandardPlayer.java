public class StandardPlayer implements Player {
    private String name;
    private int points;

    // Constuctor
    public StandardPlayer(String name) {
        this.name = name;
        this.points = 0; // Starts with 0 points
    }

    // Implementation of our methods from the interface.
    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", points: " + points;
    }
}
