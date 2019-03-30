import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> listOfBranches;

    public Bank(String name) {
        this.name = name;
        this.listOfBranches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            this.listOfBranches.add(new Branch(name));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String nameBranch, String nameCustomer, double initialAmount ){
        Branch branch = findBranch(nameBranch);
        if(branch != null){
            return branch.addCustomer(nameCustomer, initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if( branch != null){
            return branch.addTransaction(customerName, amount);
        }
        return false;
    }
    private Branch findBranch(String name){
        for(int i = 0; i < listOfBranches.size(); i++){
            Branch branchCheck = this.listOfBranches.get(i);
            if (branchCheck.getName().equals(name)){
                return branchCheck;
            }
        }
        return null;
    }

    public boolean listCustmores(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getListOfCustomers();
            for (int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "["+i+"]");
                if(showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for( int j = 0; j < transactions.size(); j++ ){
                        System.out.println("["+(j+1)+"] Amount "+transactions.get(j));
                    }
                }
            }
            return true;
        }else
            return false;
    }











}
