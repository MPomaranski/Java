public class Main {

    public static void main(String[] args) {
        House house = new House(new Bathroom(true,true,true), new Livingroom(true,true,true));
        house.enterRommAndGetSleep();
        house.enterRoomAndGetShower();
        house.getBathroom().getShower();

    }
}
