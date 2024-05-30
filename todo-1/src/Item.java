public class Item {
    private String description;
    private boolean isDone;

    public Item(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public void markAsDone() {
        this.isDone = true;
    }
    public boolean isDone() {
        return isDone;
    }

    public String getDescription() {
        return description;
    }



    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", isDone=" + isDone +
                '}';
    }


}
