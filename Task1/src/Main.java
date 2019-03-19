
public class Main {

    public static void main(String[] args) {
        printConversion(0.0);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0)
            return -1;
        kilometersPerHour = kilometersPerHour/1.609;
        kilometersPerHour=Math.round(kilometersPerHour);
        return (long)kilometersPerHour;
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            milesPerHour = Math.round(milesPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }else {
            System.out.println("Invalid Value");
        }
    }
}
