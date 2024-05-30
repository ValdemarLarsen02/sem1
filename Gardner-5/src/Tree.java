import java.time.LocalDate;

public class Tree extends Plant {
    public float height;

    public Tree(String species, LocalDate datePlanted, float height) {
        super(species, datePlanted);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Tree:\n" +
                "  Species: " + getSpecies() + "\n" +
                "  Date Planted: " + getDatePlanted() + "\n" +
                "  Height: " + height  + "\n";
    }

}
