import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(4)));
        int[] tab1 = readIntegers(4);
        int[] tab2 = reverseArray(tab1);

        System.out.println(Arrays.toString(tab2));

    }

    public static int[] readIntegers(int count){
        System.out.println("Reading integers: ");
        int[] tab = new int[count];
        for(int i = 0; i < count; i++){
            tab[i]=scanner.nextInt();
            scanner.nextLine();
        }
        return tab;

    }
    public static int findMin(int[] tab){
        int min = tab[0];

        for(int i = 0; i < tab.length; i++){
            if(tab[i] < min)
                min=tab[i];
        }
        return min;
    }
    public static int[] reverseArray(int[] tab){
        int[] newTab = new int[tab.length];

        for(int i=0; i<newTab.length; i++){
            newTab[i]=tab[tab.length - 1 - i];
        }
        return newTab;
    }
}
