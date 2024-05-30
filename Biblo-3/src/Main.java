public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Test bog 1", "Person 1");
        Book book2 = new Book("Test bog 2", "Valdemar");
        Book book3 = new Book("Java bog", "Brian Goetz");



        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //New instance for user object.
        User user = new User("Valdemar", 91);


        Book borrowedBook = library.borrowBook(2);
        if (borrowedBook != null) {
            boolean success = user.borrowBook(borrowedBook);
            System.out.println("Borrowing successful: " + success);
            System.out.println(user.getName() + " borrowed " + borrowedBook.getTitle() + " made by " + borrowedBook.getAuthor());
        } else {
            System.out.println("The book is not available atm.");
        }

        //Show all books borrowed by a user.
        System.out.println("Borrowed books: " + user.getBorrowedBooks());


        if (user.returnBook(borrowedBook)) {
            library.returnBook(borrowedBook);
            System.out.println(user.getName() + " returned " + borrowedBook.getTitle());
        } else {
            System.out.println("Failed to return the book.");
        }

        // Display borrowed books after returning
        System.out.println("Borrowed books after returning: " + user.getBorrowedBooks());



    }
}