public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("PBS BANK POLSKA");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Maciek1", 150.1);
        bank.addCustomer("Adelaide","Piotr1", 110.8 );
        bank.addCustomer("Adelaide", "Maciek2", 120.2);
        bank.addCustomer("Adelaide","Piotr2", 130.8 );
        bank.addCustomer("Adelaide", "Maciek3", 140.2);
        bank.addCustomer("Adelaide","Piotr3", 160.8 );

        bank.addBranch("Alior");

        bank.addCustomer("Alior", "Maciek4", 250.1);
        bank.addCustomer("Alior","Piotr4", 210.8 );
        bank.addCustomer("Alior", "Maciek5", 220.2);
        bank.addCustomer("Alior","Piotr5", 230.8 );
        bank.addCustomer("Alior", "Maciek6", 240.2);
        bank.addCustomer("Alior","Piotr6", 260.8 );

        bank.addCustomerTransaction("Alior", "Maciek4", 520.1);
        bank.addCustomerTransaction("Alior", "Maciek1", 420.1);
        bank.addCustomerTransaction("Alior", "Piotr5", 320.1);
        bank.addCustomerTransaction("Alior", "Piotr4", 220.1);
        bank.addCustomerTransaction("Alior", "Piotr6", 120.1);

        bank.listCustmores("Alior", true);
        bank.listCustmores("Adelaide", true);



    }
}
