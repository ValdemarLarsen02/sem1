import java.util.ArrayList;
import java.util.List;

public class Statistics {
   private Die die;

    // Creating our constructor.
    public Statistics(Die die) {
        this.die = die;
    }

    // Method for gettings the results for every side of the dice.
    public List<Integer> results(int numRolls) {
        List<Integer> counts = new ArrayList<>();

        // we set 0(default value) for every side of the dice(getSides)
        for (int i = 0; i < die.getSides(); i++) {
            counts.add(0);
        }


        // Kast terningen numRolls gange
        //Throwing our dice in a loop for numRoolls amounts.
        for (int i = 0; i < numRolls; i++) {
            int result = die.throwDie();
            //Updateing our list counts with the value of result
            //So where are getting the results from current counts and setting the new results in it.
            counts.set(result - 1, counts.get(result - 1) + 1);
        }

        return counts;
    }


}
