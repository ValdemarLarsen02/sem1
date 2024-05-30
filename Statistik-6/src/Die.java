import java.util.Random;

public class Die {
    private int sides;

    // Constructor
    public Die(int sides) {
        this.sides = sides;
    }

    //
    public int getSides() {
        return sides;
    };

    public int throwDie() {
        Random random = new Random();
        return random.nextInt(sides) + 1; // Starts from 0 so to match the correct amount do we add 1.
    }


}
