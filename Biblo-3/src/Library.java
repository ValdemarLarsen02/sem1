import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Adding a new book to the library class
    public boolean addBook(Book book) {
        return books.add(book);
    }

    //borrow book
    public Book borrowBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (!book.isBorrowed()) {
                return book; // retuner book så vi kan sætte den som udlånet i User.
            }
        }
        return null;
    }

    //Returning book
    public boolean returnBook(Book book) {
        if (books.contains(book)) {
            book.setBorrowed(false);
            return true;
        }
        return false;
    }

    //Getting the books.
    public List<Book> getBooks() {
        return books;
    }

}
