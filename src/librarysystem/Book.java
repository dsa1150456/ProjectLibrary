package librarysystem;

public class Book {

    private String bookName;
    private Category bookCategory;
    private int bookPage, bookISBN;

    public Book(String bookName, Category bookCategory, int bookPage, int bookISBN) {
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.bookPage = bookPage;
        this.bookISBN = bookISBN;
    }


    public void setBookName(String BookName) {
        this.bookName = BookName;
    }

    public void setCategory(Category BookCategory) {
        this.bookCategory = BookCategory;
    }

    public void setBookPage(int BookPage) {
        this.bookPage = BookPage;
    }

    public void setBookISBN(int BookISBN) {
        this.bookISBN = BookISBN;

    }

    public String getBookName() {
        return bookName;
    }

    public Category getBookCategory() {
        return bookCategory;
    }

    public int getBookPage() {
        return bookPage;
    }

    public int getBookISBN() {
        return bookISBN;
    }
        @Override
    public String toString() {
        return bookName+"\nName :" + bookName + "\nBook Category :" + bookCategory + "\nBook Page :" + bookPage + "\nBook ISBN :" + bookISBN;
    }
}
