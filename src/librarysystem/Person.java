package librarysystem;

public class Person {

    private long id;
    private String firstName;
    private String lastName;

    public Person(long idCard, String firstName, String lastName) {
        this.id = idCard;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getIdCard() {
        return id;
    }

    public void setIdCard(long idCard) {
        this.id = idCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + "\nID: "+ id + "\nFirstname: " + firstName + "\nLastname: " + lastName;
    }

}
