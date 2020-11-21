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

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    

    @Override
    public String toString() {
        return "\nID: "+ id + "\nFirstname: " + firstName + "\nLastname: " + lastName;
    }

}
