package librarysystem;

public class Shelf {

    private int shelfNumber;
    private String shelfName;

    public Shelf(int shelfNumber, String shelfName) {
        this.shelfNumber = shelfNumber;
        this.shelfName = shelfName;
    }

    public int shelfNumber() {
        return shelfNumber;
    }

    public void setshelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String getshelfName() {
        return shelfName;
    }

    public void setshelfName(String shelfName) {
        this.shelfName = shelfName;
    }
    
    @Override
    public String toString() {
        return shelfName + "\nShelf Number : "+ shelfNumber + "\nShelf Name : " + shelfName;
    }

}
