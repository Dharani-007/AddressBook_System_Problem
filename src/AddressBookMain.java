import java.util.Scanner;


public class AddressBookMain {

    MultipleAddressBook books = new MultipleAddressBook();

    public void addNewAddressBook() {
        System.out.println("Add new AddressBook \n(Yes/No)");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while (str.equals("yes")) {
            books.newAddressBook();
            System.out.println("Add new AddressBook \n(Yes/No)");
            str = sc.next();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookMain ab = new AddressBookMain();
        int input = 0;
        do {
            System.out.println("1.Add AddressBook\n2.Display\n3.Exit");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    ab.addNewAddressBook();
                    break;
                case 2:
                    ab.books.displayBook();
                case 3:
                    System.exit(0);
            }
        } while (input > 0 || input < 4);
    }
}