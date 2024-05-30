import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int usernumber;
    private List<Book> borrowedBooks;


    //Constuctor
    public User(String name, int usernumber) {
        this.name = name;
        this.usernumber = usernumber;
        this.borrowedBooks = new ArrayList<>();
    }



    //Getter
    public String getName() {

        return name;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }



    // Borrow and returning methods.
    public boolean borrowBook(Book book) {
        if (!book.isBorrowed()) {
            System.out.println(book);
            borrowedBooks.add(book);
            book.setBorrowed(true); // Setting the book to borrowed then the book object is added to the list.
            return true;
        }
        return false;
    }


    public boolean returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setBorrowed(false);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "Number: " + usernumber + ", Name: " + name;
    }



}
