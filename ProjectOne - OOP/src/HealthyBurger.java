public class HealthyBurger extends Burger {
    public HealthyBurger(String meatType) {
        super("brown", meatType);
        setMaxAdditions(6);
        setPrice(22);
    }
}
