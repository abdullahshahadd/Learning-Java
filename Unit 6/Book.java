public class Book {

    static int totalBooks;

    String title;

    String author;

    String isbn;

    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }
}
