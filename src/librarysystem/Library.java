package librarysystem;

public class Library {

    private Book books[];
    private Person users[];
    private Shelf user[];

    public Library(int size) {
        size = size > 0 ? size : 10;
        users = new Person[size];
        books = new Book[size];
    }
    
}
