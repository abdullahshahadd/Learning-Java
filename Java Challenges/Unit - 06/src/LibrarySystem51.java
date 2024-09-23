public class LibrarySystem51 {

    static int totalNoOfBooks;

    String title;

    String author;

    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    { // Object initialization
        totalNoOfBooks++;
    }

    LibrarySystem51(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    LibrarySystem51(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is unavailable");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title );
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book.");
        } else {
            System.out.println("The book is already returned.");
        }
    }

    public static void main(String[] args) {
        LibrarySystem51 designOfThings = new LibrarySystem51("1", "Design", "Author");

        LibrarySystem51 myBook = new LibrarySystem51("2");

        System.out.println(LibrarySystem51.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
}

}