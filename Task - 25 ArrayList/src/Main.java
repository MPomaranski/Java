 import java.util.ArrayList;
 import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }

    }

    public static void printInstruction(){
        System.out.println("Press");
        System.out.println("0 - Instructions");
        System.out.println("1 - Print Array List");
        System.out.println("2 - Add Item");
        System.out.println("3 - Modify the list");
        System.out.println("4 - Remove item");
        System.out.println("5 - Search Item");
        System.out.println("6 - quit");
    }
    public static void addItem(){
        System.out.print("Add Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter old item: ");
        String x = scanner.nextLine();
        System.out.print("Enter item new: ");
        String str = scanner.nextLine();
        groceryList.modifyGroceryItem(x, str);
    }
    public static void removeItem(){
        System.out.print("Enter the number to remove item: ");
        String x = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(x);
    }
    public static void searchForItem(){
        System.out.print("Enter item that you want to search for: ");
        String item = scanner.nextLine();
        if(groceryList.findItem(item)>=0)
            System.out.println("List contain "+ item);
        else
            System.out.println("List doesn't contain "+ item);

    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
