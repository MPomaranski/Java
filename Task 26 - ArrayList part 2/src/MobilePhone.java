import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contacts = new ArrayList<>();


    public void printListOfContacts(){
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println(i + ". " + contacts.get(i).getName() + "  number: " + contacts.get(i).getPhoneNumber());
        }
    }

    public void addNewContact(Contacts newContact){

        if(findIndex(newContact.getName()) < 0) {
            contacts.add(newContact);
            System.out.println("Contact added");
        }
        else
            System.out.println("This name already exists");
    }

    public int findIndex(String name){
        for(int i = 0; i < contacts.size(); i++){
            Contacts contact = contacts.get(i);
            if(contact.getName().equals(name))
                return i;
        }
        return -1;
    }

    public void updateContact(String name, int newNumber){
        int check = findIndex(name);

        if(check >= 0) {
            contacts.set(findIndex(name), new Contacts(name, newNumber));
            System.out.println("Contact modified");
        }
        else
            System.out.println("There is no contact named like that");

    }

    public void removeContact (String name){
        if (findIndex(name) >= 0)
            contacts.remove(findIndex(name));
        else
            System.out.println("There is no contact named like that");
    }

    public int getNumber(int index){
        return contacts.get(index).getPhoneNumber();
    }

}
