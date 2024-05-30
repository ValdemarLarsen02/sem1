import java.time.LocalDate;
import java.util.ArrayList;

public class FruitTree extends Tree {
    private ArrayList<Float> yields;

    public FruitTree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted, height);
        this.yields = new ArrayList<>();
    }

    public void registerYield(float yield) {
        yields.add(yield);
    }

    public float getAverageYield() {
        if (yields.isEmpty()) {
            return 0;
        }

        float totalYield = 0;
        for (float yield : yields) {
            totalYield += yield;
        }
        return totalYield / yields.size();
    }

    @Override
    public String toString() {
        return "FruitTree:\n" +
                "  Species: " + getSpecies() + "\n" +
                "  Date Planted: " + getDatePlanted() + "\n" +
                "  Height: " + getHeight() + "\n" +
                "  Yields: " + yields + "\n";
    }

}
