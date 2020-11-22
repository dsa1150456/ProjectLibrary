package librarysystem;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    public static final String openTime = "9am";
    public static final String closeTime = "5pm";

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from " + openTime + " to " + closeTime);
    }

    public void printAvailableBooks() {
        boolean bookPresent = false;
        for (Book b : books) {
            if (!b.isBorrowed()) {
                System.out.println(b.getBookName());
                bookPresent = true;
            }
        }
        if (!bookPresent) {
            System.out.println("No book in catalog");
        }
    }

    public void borrowBook(String title) {
        int found = 0;
        for (Book b : books) {
            if (b.getBookName().equals(title)) {
                if (found == 0) {
                    found = 1;
                }
                if (b.isBorrowed() == false) {
                    b.borrowed = true;
                    found = 2;
                    break;
                }
            }
        }
        if (found == 0) {
            System.out.println("Sorry, this book is not in our catalog.");
        } else if (found == 1) {
            System.out.println("Sorry, this book is already borrowed.");
        } else if (found == 2) {
            System.out.println("You successfully borrowed " + title);
        }
    }

    public void returnBook(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.getBookName().equals(title) && b.isBorrowed()) {
                b.returned();
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("You successfully returned " + title);
        }
    }

}
