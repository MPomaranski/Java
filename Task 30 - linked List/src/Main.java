import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Maciek", 64.96);
        Customer customer1 = customer;
        customer1.setBalance(12.18);
        System.out.println(customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        for (int i = 0; i < intList.size(); i++){
            System.out.println(intList.get(i));
        }
        intList.add(1,3);
        System.out.println(intList.get(1));



    }
}
