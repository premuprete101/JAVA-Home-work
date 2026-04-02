import java.util.*;

class Book {
    String title, author, ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }

    void display() {
        System.out.println(title + " - " + author + " - " + ISBN);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.ISBN.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("After removing:");
        lib.displayBooks();
    }
}