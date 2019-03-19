public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("York", 8,20,2,4,1,20,"long silky");
        dog.eat();
        dog.run();
        dog.walk();
        dog.move(5);
        Fish fish = new Fish("Nemo", 5, 5, 1,2,4);
        fish.swim(4);
    }
}
