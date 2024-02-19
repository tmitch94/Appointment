import java.util.HashMap;
import java.util.Scanner;

public class ContactService {
    HashMap<String, Contact> Contacts = new HashMap<>();

    public boolean deleteContact(String id) {
        if (Contacts.containsKey(id)) {
            Contacts.remove(id);
            System.out.println(id + " Has been removed");
            return true;
        } else {
            System.out.println( id + " Doesnt Exist");
            return false;
        }
    }

    public boolean updateContact(String field,Contact contact){
        if (Contacts.containsKey(field)){
            Contacts.put(field,contact);
            System.out.println(field + " has been updated");
            return true;
        }else{
            System.out.println("Could not be updated");
            return false;
        }
    }


    public void addContact(Contact contact) {
                Contacts.put(contact.getContactID(),contact);
                displayAllContacts();
    }

    private void displayAllContacts() {
        for (Contact contact : Contacts.values()) {
            System.out.printf("Contact Id: %s\n" +
                    "First Name: %s\n" +
                    "Last Name: %s\n" +
                    "Phone Number: %s\n" +
                    "Address: %s\n",contact.getContactID(),contact.getFirstName(),contact.getLastName(),
                    contact.getPhoneNumber(), contact.getAddress());
        }
    }

}
