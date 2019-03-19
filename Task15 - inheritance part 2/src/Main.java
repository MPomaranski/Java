public class Main {

    public static void main(String[] args) {
        Model model = new Model(36);
        model.steer(45);
        model.accelerate(30);
        model.accelerate(20);
        model.accelerate(-40);
    }

}
