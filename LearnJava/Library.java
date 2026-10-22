public class Library {
    static class Book {
        String title;
        String author;
        int year;
        boolean available;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.available = true;
        }

        @Override
        public String toString() {
            return title + " by " + author + " (" + year + ")" +
                    (available ? " - Available" : " - Issued");
        }
    }

    private Book[] books;
    private int count;

    Library(int capacity) {
        books = new Book[capacity];
    }

    void addBook(String title, String author, int year) {
        if (count < books.length) {
            books[count] = new Book(title, author, year);
            count++;
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Library is full.");
        }
    }

    void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    void searchBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book found: " + books[i]);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public static void main(String[] args) {
        Library library = new Library(3);

        library.addBook("Java Basics", "John Smith", 2020);
        library.addBook("OOP in Java", "Alice Brown", 2022);
        library.addBook("Data Structures", "David Lee", 2021);

        library.displayBooks();
        library.searchBook("oop in java");
    }
}
