public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(12342348));
    }
    public static int sumFirstAndLastDigit(int number){
        int sum=0;
        int first;
        int last;
        if(number <0 )
            return -1;
        else {
            last = number % 10;
            first = last;
            number = number / 10;
            while (number > 0){
                first = number % 10;
                if (number == 0)
                    first = number;
                number = number / 10;
            }
        }
        sum=last+first;
        return sum;
    }

}

