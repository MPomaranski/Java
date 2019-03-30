import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVistit = new LinkedList<>();
        addInOrder(placesToVistit, "Syndey6");
        addInOrder(placesToVistit, "Syndey5");
        addInOrder(placesToVistit, "Syndey4");
        addInOrder(placesToVistit, "Syndey3");
        addInOrder(placesToVistit, "Syndey2");
        addInOrder(placesToVistit, "Syndey1");
        printList(placesToVistit);

        //printList(placesToVistit);

        //placesToVistit.add(1,"LOL");
        //placesToVistit.remove(4);
        //printList(placesToVistit);
        visit(placesToVistit);

    }
    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int compare = stringListIterator.next().compareTo(newCity);
            if(compare > 0 ) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (compare < 0){
                //stringListIterator.add(newCity);
            }else
                return false;
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goigForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        }else {
            System.out.println(listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goigForward){
                        if(listIterator.hasNext())
                            listIterator.next();
                    }
                    goigForward = true;
                    if(listIterator.hasNext()) {
                        System.out.println(listIterator.next());
                    } else {
                        System.out.println("End of list");
                        goigForward = false;
                    }
                case 2:
                    if (goigForward){
                        if(listIterator.hasPrevious())
                            listIterator.previous();
                    }
                    goigForward = false;
                    if(listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }else {
                        System.out.println("Start of list");
                        goigForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu (){
        System.out.println("Available actions: ");
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 to go next city");
        System.out.println("Press 2 to go previous city");
        System.out.println("Press 3 to print Menu");
    }
}
