package librarysystem;

public class Shelf {

    private int shelfNumber;
    private String shelfName;

    public Shelf(String shelfName, int shelfNumber) {
        this.shelfNumber = shelfNumber;
        this.shelfName = shelfName;
    }
    public String getshelfName() {
        return shelfName;
    }


@Override
    public String toString() {
        return shelfName + "\nShelf Number : "+ shelfNumber + "\nShelf Name : " + shelfName;
    }
}
