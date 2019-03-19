public class Burger {
    private String breadRollType;
    private String meatType;
    private int price;
    private String listOfAdditions;
    private int counter;
    private int maxAdditions;

    public Burger(String breadRollType, String meatType) {
        breadRollType = breadRollType.toLowerCase();
        if(breadRollType == "brown" || breadRollType =="light"){
            this.breadRollType = breadRollType;
        }else {
            System.out.println("There is no " + breadRollType + " type of bread roll. Light giving as default.");
            this.breadRollType = "light";
        }
        meatType = meatType.toLowerCase();
        if(meatType == "beef" || meatType == "chicken") {
            this.meatType = meatType;
        }else {
            System.out.println("There is no " + meatType + " type of meat. Beef giving as default.");
            this.meatType = "light";
        }
        this.price = 20;
        this.listOfAdditions = "";
        this.counter = 0;
        this.maxAdditions = 4;
    }

    public void addCheese(){
        if(this.counter < maxAdditions) {
            this.price += 2;
            this.listOfAdditions += "Cheese,  "+ 2+"$,";
            this.counter++;
        }else
            System.out.println("You can't add more than "+counter+ " additions.");
    }

    public void addTomato(){
        if(this.counter < maxAdditions) {
            this.price += 1;
            this.listOfAdditions += "Tomato, "+ 1+"$,";
            this.counter++;
        }else
            System.out.println("You can't add more than "+counter+ " additions.");
    }

    public void addSalat(){
        if(this.counter < maxAdditions) {
            this.price += 2;
            this.listOfAdditions += "Salat, "+ 2+"$,";
            this.counter++;
        }else
            System.out.println("You can't add more than "+counter+ " additions.");
    }

    public void addBekon(){
        if(this.counter < maxAdditions) {
            this.price += 6;
            this.listOfAdditions += "Bekon, "+ 6+"$,";
            this.counter++;
        }else
            System.out.println("You can't add more than "+counter+ " additions.");
    }

    public void addMushrooms(){
        if(this.counter < maxAdditions) {
            this.price += 3;
            this.listOfAdditions += "Mushrooms, "+ 3+"$,";
            this.counter++;
        }else
            System.out.println("You can't add more than "+counter+ " additions.");
    }

    public void addEgg(){
        if(this.counter < maxAdditions) {
            this.price += 5;
            this.listOfAdditions += "Egg, "+ 5+"$,";
            this.counter++;
        }else
            System.out.println("You can't add more than "+counter+ " additions.");
    }

    public void addOnion(){
        if(this.counter < maxAdditions) {
            this.price += 1;
            this.listOfAdditions += "Onion - " + 1+"$,";
            this.counter++;
        }else
            System.out.println("You can't add more than "+counter+ " additions.");
    }


    public void getPrice() {
        System.out.println("Your burger cost: "+this.price+"$.");
    }

    public void getListOfAdditions() {
        System.out.println("Your burger contains "+ counter+ " additions: "+ this.listOfAdditions+"costs "+this.price+"$.");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaxAdditions(int maxAdditions) {
        this.maxAdditions = maxAdditions;
    }

    public void setListOfAdditions(String listOfAdditions) {
        this.listOfAdditions = listOfAdditions;
    }
}
