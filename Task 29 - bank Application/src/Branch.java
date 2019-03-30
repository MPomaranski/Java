import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> listOfCustomers;

    public Branch(String name) {
        this.name = name;
        this.listOfCustomers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public boolean addCustomer(String name, double initialAmount){
        if(findCustomer(name) == null){
            this.listOfCustomers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction (String name, double amount){
        Customer existingCustomer = findCustomer(name);
        if(findCustomer(name) != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for (int i = 0; i < this.listOfCustomers.size(); i++){
            Customer check = this.listOfCustomers.get(i);
            if(this.listOfCustomers.get(i).getName().equals(name) )
                return check;
        }

        return null;

    }
}
