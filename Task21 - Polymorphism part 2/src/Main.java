public class Main {

    public static void main(String[] args) {
        Car car = new Lexus(2,8);
        car.startEngine();
        Car car1 = new Daewoo(4,4);
        car1.startEngine();
        Car car2 = new Renault(2,4);
        car2.startEngine();
    }
}
