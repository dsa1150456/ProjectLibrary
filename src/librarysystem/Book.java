package librarysystem;

public class Book {

    private String bookName, bookCategory;
    private int bookPage, ISBN;
    private Shelf shelfs;

    public Book(String bookName, String bookCategory, int bookPage, int ISBN, Shelf shelfs) {

        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.bookPage = bookPage;
        this.ISBN = ISBN;
        this.shelfs = shelfs;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public int getBookPage() {
        return bookPage;
    }

    public int getBookISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return  "\nName :" + bookName + "\nBook Category :" + bookCategory + "\nBook Page :" + bookPage + "\nBook ISBN :" + ISBN;
    }
}
