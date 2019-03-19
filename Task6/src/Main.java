public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-122323221));
    }
    public static boolean isPalindrome(int number){
        String digitString1 = "";
        String digitString2 = ""+number;
        int digit = 0;
        if(number == 0)
            return false;
        if (number < 0) {
            digitString1 = "-";
            number = number*(-1);
            while (number > 0) {
                digit = number % 10;
                digitString1 += digit;
                number = number / 10;
            }
        }
        while(number > 0){
            digit = number%10;
            digitString1 += digit;
            number=number/10;
        }
        int i1 = Integer.parseInt(digitString1);
        int i2 = Integer.parseInt(digitString2);
        if(i1 == i2)
            return true;
        return false;

    }
}
