import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readingInput();
    }
    public static void readingInput(){
        int counter = 0;
        int sum = 0;
        int integer;
        boolean hasNextInt;
        Scanner scanner = new Scanner(System.in);
        while(counter<10){
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                integer = scanner.nextInt();
                sum += integer;
                counter ++;

            }else{
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
    }
}
