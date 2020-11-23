package librarysystem;

import java.util.*;

public class TEST {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Person> users = new ArrayList<Person>();
        ArrayList<Shelf> shelfs = new ArrayList<Shelf>();
        Library a = new Library(books);
        a.printOpeningHours();
        String menu
                = "Option\n"
                + "1. Add shelf\n"
                + "2. Add book\n"
                + "3. Display books\n"
                + "4. Add user\n"
                + "5. Display user\n"
                + "6. Borrow Book\n"
                + "7. Exit\n";
        Scanner input = new Scanner(System.in);
        int Option = 0;
        //test 
        Shelf testShelf = new Shelf("Recommend", 1);
        shelfs.add(testShelf);
        books.add(new Book("Game of Throne", "War", 500, 157812, shelfs.get(0)));

        do {
            System.out.println(menu);
            System.out.print("Option: ");
            Option = input.nextInt();
            input.nextLine();
            switch (Option) {
                case 1:
                    System.out.println("---- Add new shelf ----");
                    System.out.println("Enter shelf name :");
                    String shelfName = input.nextLine();
                    System.out.println("Enter shelf number:");
                    int shelfNumber = input.nextInt();
                    Shelf shelf = new Shelf(shelfName, shelfNumber);
                    shelfs.add(shelf);
                    break;

                case 2:
                    System.out.println(" ---- add new book ----");
                    System.out.println("Enter book name :");
                    String bookName = input.nextLine();
                    System.out.println("Enter book category :");
                    String bookCategory = input.nextLine();
                    System.out.println("Enter book page :");
                    int bookPage = input.nextInt();
                    System.out.println("Enter book ISBN :");
                    int ISBN = input.nextInt();
                    System.out.println("Select a shelf by typing the number:");
                    for (int i = 0; i < shelfs.size(); i++) {
                        System.out.println(i + 1 + " " + shelfs.get(i).getshelfName());
                    }
                    shelfNumber = input.nextInt();
                    books.add(new Book(bookName, bookCategory, bookPage, ISBN, shelfs.get(shelfNumber - 1)));
                    break;

                case 3:
                    System.out.println("---- Display Books ----");
                    for (int i = 0; i < books.size(); i++) {
                        int bookNumber = i + 1;
                        System.out.println("Book Number: " + bookNumber);
                        System.out.println(books.get(i));
                        System.out.println("\n");
                    }
                    System.out.println("End of Books List.\n");
                    break;
                case 4:
                    System.out.println("---- Add user ----");
                    System.out.println("Enter ID number :");
                    long id = input.nextLong();
                    input.nextLine();
                    System.out.println("Enter Firstname :");
                    String firstName = input.nextLine();
                    System.out.println("Enter Lastname :");
                    String lastName = input.nextLine();
                    Person user = new Person(id, firstName, lastName);
                    users.add(user);
                    break;

                case 5:
                    System.out.println("---- Display user ----");
                    for (int i = 0; i < users.size(); i++) {
                        int userCount = i + 1;
                        System.out.println("Number of User: " + userCount);
                        System.out.println(users.get(i));
                    }
                    if (users.size()<1){
                        System.out.println("There is no users");
                    }
                    
                    
                    break;
                case 6:
                    System.out.println("---- List of Available Books ----");
                    a.printAvailableBooks();
                    a.borrowBook("Game of Throne");
                    a.returnBook("Game of Throne");
                    a.borrowBook("Game of Throne");
                    a.borrowBook("Game of Throne");
                    a.borrowBook("booo");
                    a.returnBook("s");
                    break;
            }
        } while (Option != 7);
    }

}
