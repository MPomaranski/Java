public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
        this.isDuplex = isDuplex;
    }
    public void fillUpTheToner(int howMuch){
        if(this.tonerLevel < 100) {
            this.tonerLevel += howMuch;
            if(this.tonerLevel > 100)
                this.tonerLevel =100;
        }
        else {
            System.out.println("Toner is already filled");
        }

    }

    public void printPage(int number){
        for(int i = 0; i < number; i++){
            if(this.tonerLevel >= 5 ){
                this.tonerLevel -= 5;
                this.numberOfPages++;
            }else{
                System.out.println("Cardrige is empty");
                break;
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
