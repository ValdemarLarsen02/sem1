import java.util.List;

public class Main {
    public static void main(String[] args) {

        //creating instances for our objects
        Die terning = new Die(6);

        Statistics terningStats = new Statistics(terning);


        //Calling our method to return x amount of rools
        //Argument = how many times do we want our dice to rool
        List<Integer> fundetResultater = terningStats.results(100);



        int max = 0;
        int total = 0;
        //Showing our results in a loop for my list
        //Using .get(i) to retrieve the number of times (i + 1) has been rolled from the fundetResultater list.
        for (int i = 0; i < fundetResultater.size(); i++) {
            //Only does it until we match the amount of sides the dice have.
            System.out.println("Number of " + (i + 1) + "s: " + fundetResultater.get(i));

            int amount = fundetResultater.get(i);

            if (amount >= max) {
                max = amount;
                total = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(total);

    }
}