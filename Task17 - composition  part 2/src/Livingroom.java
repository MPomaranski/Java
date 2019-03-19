public class Livingroom {
    private boolean isBed;
    private boolean isLight;
    private boolean isCarpet;

    public Livingroom(boolean isBed, boolean isLight, boolean isCarpet) {
        this.isBed = isBed;
        this.isLight = isLight;
        this.isCarpet = isCarpet;
    }

    public void sleepWell(){
        System.out.println("Zzz...");
    }

    public boolean isBed() {
        return isBed;
    }

    public boolean isLight() {
        return isLight;
    }

    public boolean isCarpet() {
        return isCarpet;
    }
}
