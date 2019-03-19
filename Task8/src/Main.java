public class Main {

    public static void main(String[] args) {
        System.out.println(isSharedDigit(12,20));
    }
    public static boolean isSharedDigit (int number1, int number2){
        if(number1 >= 10 && number1 <=99 && number2 >= 10 && number2 <=99){
            int j1 = number1 % 10;
            int d1 = number1/10;
            int j2 = number2 % 10;
            int d2 = number2/10;
            if(d1 == d2 || d1 == j2 || j1 == j2 || j1 == d2)
                return true;
        }
        return false;
    }
}
