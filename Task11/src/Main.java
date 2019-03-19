import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        findMinAndMax();
    }
    public static void findMinAndMax(){
        int min = 0;
        int max = 0;
        int counter = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean check = scanner.hasNextInt();
            if (check) {
                number = scanner.nextInt();
                if(counter == 0){
                    min = number;
                    max = number;
                    counter++;
                }
                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            } else {
                System.out.println("Min value is " + min + " max value is " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
