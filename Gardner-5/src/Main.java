import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creating out instance.
        Garden garden = new Garden();


        Plant tree1 = new Tree("Oak", LocalDate.of(1910, 1, 1), 10);
        Plant tree2 = new Tree("Pine", LocalDate.of(1950, 6, 15), 12);
        Plant flower1 = new Flower("Rose", LocalDate.of(2010, 9, 1), "Red");
        Plant flower2 = new Flower("Tulip", LocalDate.of(2010, 11, 1), "Red");
        FruitTree fruitTree1 = new FruitTree("Apple", LocalDate.of(2000, 4, 20), 5);
        FruitTree fruitTree2 = new FruitTree("Orange", LocalDate.of(2005, 5, 30), 6);

        // Creating the previous harvest for our fruitTree1 and fruitTree2.
        fruitTree1.registerYield(2.5f);
        fruitTree1.registerYield(3.0f);
        fruitTree1.registerYield(2.8f);

        fruitTree2.registerYield(1.2f);
        fruitTree2.registerYield(1.5f);
        fruitTree2.registerYield(1.8f);

        //Adding our created plant objects to our garden object
        garden.addPlant(tree1);
        garden.addPlant(tree2);
        garden.addPlant(flower1);
        garden.addPlant(flower2);
        garden.addPlant(fruitTree1);
        garden.addPlant(fruitTree2);

        // Showing our total yield from our fruittrees
        float totalGarden = garden.getTotalYield();
        System.out.println("The total yield from our garden is: " + totalGarden + "kg");

        // Showing the flowers who match our argument.
        garden.displayFlowersOfColor("Red");


        //Showing the trees that are higher than our argument.
        int meter = 2;
        garden.getTreesHigherThan(meter);

        // Oldest plant in the garden.
        Plant oldestPlant = garden.getOldestPlant();
        System.out.println("The oldest plant in the garden is of the " + oldestPlant.getSpecies() + " species, and was planted in the year of " + oldestPlant.getDatePlanted().getYear());

    }
}
