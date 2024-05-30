import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plants;

    // Arraylist to hold the plants created in Main.
    public Garden() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant p) {
        plants.add(p);
    }

    // Using instanceof to check if x Plant is an instance of FruitTree.
    public float getTotalYield() {
        float totalYield = 0;
        for (Plant plant : plants) {
            if (plant instanceof FruitTree) {
                totalYield += ((FruitTree) plant).getAverageYield();
            }
        }
        return totalYield;
    }

    public void displayFlowersOfColor(String colour) {
        System.out.println("The flowers of colour " + colour + " are:");

        // Iterate through the list of all plants
        for (Plant plant : plants) {
            // Check if the current plant is an instance of Flower
            if (plant instanceof Flower) {
                // Cast the plant to a Flower object so we have acces to att and methods in the Class.
                Flower flower = (Flower) plant;
                // Check if the flower's color matches the specified color.
                if (flower.getColor().equalsIgnoreCase(colour)) {
                    // Print the flower's species and the date it was planted
                    System.out.println("Flower: " + flower.getSpecies() + " planted on " + flower.getDatePlanted());
                }
            }
        }
    }


    public int getTreesHigherThan(float meter) {
        int count = 0;
        System.out.println("Trees higher than " + meter + " metres:");
        for (Plant plant : plants) {
            if (plant instanceof Tree) {
                Tree tree = (Tree) plant;
                if (tree.getHeight() > meter) {
                    count++;
                    if (plant instanceof FruitTree) {
                        System.out.println("FruitTree: " + tree.getSpecies() + " planted on " + tree.getDatePlanted() + " with height " + tree.getHeight());
                    } else {
                        System.out.println("Tree: " + tree.getSpecies() + " planted on " + tree.getDatePlanted() + " with height " + tree.getHeight());
                    }
                }
            }
        }
        return count;
    }

    public Plant getOldestPlant() {
        if (plants.isEmpty()) {
            return null;
        }

        Plant oldest = plants.get(0);
        for (Plant plant : plants) {
            if (plant.getDatePlanted().isBefore(oldest.getDatePlanted())) {
                oldest = plant;
            }
        }
        return oldest;
    }
}
