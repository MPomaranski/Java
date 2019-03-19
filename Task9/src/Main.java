public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number){
        int prime = 0;
        int counter = 0;
        if(number <= 1)
            return -1;
        for(int i=2; i<number+1;i++){
            if(number % i == 0){
                //System.out.println(i);
                for(int j=2; j<i+1;j++){
                    if(i % j == 0) {
                        counter++;
                    }
                }
                if(counter == 1) {
                    prime = i;
                }
            }
            counter = 0;
        }
        return prime;
    }
}
