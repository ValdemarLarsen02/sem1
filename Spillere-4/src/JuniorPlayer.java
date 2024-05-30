public class JuniorPlayer implements Player {
    private String name;
    private int points;

    public JuniorPlayer(String name) {
        this.name = name;
        this.points = 0; // Starts with 0 points.
    }


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
        this.points += points * 1.5; // Ensure that a JuniorPlayer receives extra points.
    }


    @Override
    public String toString() {
        return "Name: " + name + ", points: " + points;
    }




}
