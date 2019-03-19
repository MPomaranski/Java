public class Main {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays (long minutes){
        if(minutes < 0)
            System.out.println("Invalid Value");
        else{
            long years = 0;
            long days = 0;
            days = minutes/(60*24);
            if(days >= 365){
                years = days/365;
                days=days-365*years;
            }
            System.out.println(minutes +" min =" + years + " y and "+days+" d");
        }
    }
}
