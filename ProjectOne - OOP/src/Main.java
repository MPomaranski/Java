public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("brown", "chicken");
        burger.addBekon();
        burger.addMushrooms();
        burger.addSalat();
        burger.addTomato();
        burger.addCheese();
        burger.getPrice();
        burger.getListOfAdditions();

        HealthyBurger healthyBurger = new HealthyBurger("beef");
        healthyBurger.getPrice();
        healthyBurger.getListOfAdditions();

        DeluxHamburger deluxHamburger = new DeluxHamburger("brown","chicken");
        deluxHamburger.getListOfAdditions();
        deluxHamburger.addCheese();
    }
}
