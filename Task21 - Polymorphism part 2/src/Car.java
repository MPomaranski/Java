public class Car {
    private int wheels;
    private int doors;
    private int cilinders;
    private boolean engine;

    public Car(int doors, int cilinders) {
        this.wheels = 4;
        this.doors = doors;
        this.cilinders = cilinders;
        this.engine = true;
    }

    public void startEngine(){
        System.out.println("Wruuum");
    }
    public void accelerate(){
        System.out.println("Accelerating");
    }
    public void brake(){
        System.out.println("Breaking");
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getCilinders() {
        return cilinders;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Daewoo extends Car{
    public Daewoo(int doors, int cilinders) {
        super(doors, cilinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Wrrrrrrururururm");
    }
}

class Renault extends Car{
    public Renault(int doors, int cilinders) {
        super(doors, cilinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Kle kle kle");
    }
}

class Lexus extends Car{
    public Lexus(int doors, int cilinders) {
        super(doors, cilinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Brrrrum");;
    }
}
