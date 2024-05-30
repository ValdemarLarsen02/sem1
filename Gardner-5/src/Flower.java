import java.time.LocalDate;

public class Flower extends Plant {
    public String colour;

    public Flower(String species, LocalDate datePlanted, String colour) {
        super(species, datePlanted);
        this.colour = colour;
    }

    public String getColor() {
        return colour;
    }


    @Override
    public String toString() {
        return "Flower:\n" +
                "  Species: " + getSpecies() + "\n" +
                "  Date Planted: " + getDatePlanted() + "\n" +
                "  colour: " + colour  + "\n";
    }
}
