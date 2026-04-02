class Book {
    String title;
    String author;
    double price;

    
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        
        Book[] books = new Book[3];


        books[0] = new Book("Java Basics", "Author A", 250);
        books[1] = new Book("Python Guide", "Author B", 300);
        books[2] = new Book("C Programming", "Author C", 200);

    
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}