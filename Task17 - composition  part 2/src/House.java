public class House {
    private Bathroom bathroom;
    private Livingroom livingroom;

    public House(Bathroom bathroom, Livingroom livingroom) {
        this.bathroom = bathroom;
        this.livingroom = livingroom;
    }
    public void enterRoomAndGetShower(){
        bathroom.getShower();
    }
    public void enterRommAndGetSleep(){
        livingroom.sleepWell();
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public Livingroom getLivingroom() {
        return livingroom;
    }
}
