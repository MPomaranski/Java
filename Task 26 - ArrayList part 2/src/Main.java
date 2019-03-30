import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = true;
        int choice;
        instructions();

        while (quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 0:
                    instructions();
                    break;
                case 1:
                    mobilePhone.printListOfContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5 :
                    searchContact();
                    break;
                case 6:
                    quit = false;
                    break;

            }

        }
    }
    public static void instructions (){
        System.out.println("----------------------------");
        System.out.println("0 - Instructions");
        System.out.println("1 - Print list of contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Update existing contact");
        System.out.println("4 - Remove contact");
        System.out.println("5 - Search contact");
        System.out.println("6 - quit");
        System.out.println("----------------------------");
    }

    public static void addContact(){
        System.out.print("Write number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Write name of contact: ");
        String name = scanner.nextLine();
        mobilePhone.addNewContact(new Contacts(name, number));
    }
    public static void updateContact(){
        System.out.print("Write name of contact: ");
        String name = scanner.nextLine();
        System.out.print("Write new number: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.updateContact(name, x);
    }
    public static void removeContact(){
        System.out.print("Enter contact that you want to remove: ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }
    public static void searchContact(){
        System.out.print("Enter contact that you want to search for: ");
        String name = scanner.nextLine();
        if(mobilePhone.findIndex(name) >= 0)
            System.out.println(name + "  number: " +mobilePhone.getNumber(mobilePhone.findIndex(name)));
        else
            System.out.println("Contact doesn't found.");
    }
}
