import java.util.Scanner;

public class Contact {

    // declare private variables to hold contact information. Contact information
    // will be set by users
    private String contactID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Contact(String contactID,String firstName, String lastName, String phoneNumber, String address) {
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Contact() {
    }

    public void setContactID(String id) {
        isValid(id,10);
        this.contactID = id;
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        isValid(firstName,10);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        isValid(lastName,10);
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        isValid(phoneNumber,10);
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        isValid(address,30);
        this.address = address;
    }

    // Method to add contacts using a unique ID


    public boolean isValid(String fieldName, int allowedLength) {
        fieldName = checkSpecialCharacters(fieldName);
        if (fieldName.trim().isBlank()) {
            System.out.println("Field can't be Empty!");
            return false;
        } else if (fieldName.length() > allowedLength) {
            System.out.printf("Can only be %d characters or less\n", allowedLength);
            return false;
        } else {
            return true;
        }
    }
    private String checkSpecialCharacters(String fieldName) {
        // Define the regex for special characters
        String regex = "[!@#$%^&*()\"{}_\\[\\]|\\?/<>,.-]";
        // Replace special characters with an empty string
        if (fieldName.trim().isBlank()){
            fieldName = fieldName.replaceAll(" ", "");
        }else {
            fieldName = fieldName.replaceAll(regex, "");
        }
        return fieldName;
    }

}
