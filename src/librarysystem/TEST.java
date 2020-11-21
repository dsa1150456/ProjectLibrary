package librarysystem;

import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {
        int option = 0;
        Scanner select = new Scanner(System.in);
        do {
            System.out.println("Library");
            System.out.println("1 testPerson");
            System.out.println("2 bye");
            System.out.print("Enter Option: \n");
            option = select.nextInt();

            if (option == 1) {
                testPerson();
            }
            if (option == 2) {
                System.out.println("bye");
            }
        
        }
        while(option !=2);
        }
    

    public static void testPerson() {
        Person a = new Person(0, "firstName", "lastName");
        System.out.println(a + "\n");
        a.setFirstName("John");
        a.setLastName("Davis");
        a.setIdCard(1);
        System.out.println(a + "\n");
    }

    public static void testBook() {
        Book a = new Book("bookName", Category.MYSTERY, 0, 0);
        System.out.println(a + "\n");
        a.setCategory(Category.DYSTOPIAN);
        a.setBookISBN(15151);
        a.setBookName("GameOfThones");
        a.setBookPage(200);
        System.out.println(a + "\n");
    }




    
}
