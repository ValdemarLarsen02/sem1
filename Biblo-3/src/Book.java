public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    //Creating our constuctor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    //Getter and setter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }


    @Override
    public String toString() {
        String borrowStatus = borrowed ? "borrowed" : "not borrowed";
        return title + ", " + author + ", status: " + borrowStatus;
    }


}
