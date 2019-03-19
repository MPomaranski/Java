public class DeluxHamburger extends Burger {
    public DeluxHamburger(String breadRollType, String meatType) {
        super(breadRollType, meatType);
        setPrice(35);
        setMaxAdditions(0);
        setListOfAdditions("chips, drinks, ");
    }

    @Override
    public void getListOfAdditions() {
        System.out.println("Additional addition are not allowed in this type of burger. ");
    }
}
