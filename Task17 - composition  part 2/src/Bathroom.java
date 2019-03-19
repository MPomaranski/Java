public class Bathroom {
    private boolean isBath;
    private boolean isShower;
    private boolean isMirror;

    public Bathroom(boolean isBath, boolean isShower, boolean isMirror) {
        this.isBath = isBath;
        this.isShower = isShower;
        this.isMirror = isMirror;
    }
    public void getShower(){
        System.out.println("Plum Plum");
    }

    public boolean isBath() {
        return isBath;
    }

    public boolean isShower() {
        return isShower;
    }

    public boolean isMirror() {
        return isMirror;
    }
}
