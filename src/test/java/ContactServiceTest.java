import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    HashMap<String, Contact> Contacts = new HashMap<>();



    @Test
    @DisplayName("adds the contact")
    void addContact() {
        Contact contact = new Contact("123","test","test","123456789","Testing again");
        ContactService service = new ContactService();
        service.addContact(contact);
        assertAll("contact",
                ()-> assertEquals("123",contact.getContactID()),
                ()->assertEquals("test",contact.getFirstName()),
                ()-> assertNotEquals("Testing",contact.getLastName())
        );
    }

    @Test
    @DisplayName("Will delete")
    public void delete()  {
        Contact contact1 = new Contact("123","test","test","123456789","Testing again");
        ContactService service = new ContactService();
        service.addContact(contact1);
        assertTrue(service.deleteContact("123"));
    }

    @Test
    @DisplayName("This should not delete")
    public void doesNotDelete(){
        Contact contact1 = new Contact("123","test","test","123456789",
                "Testing does not delete method");
        ContactService service = new ContactService();
        service.addContact(contact1);
        assertFalse(service.deleteContact("789"));
    }


    @Test
    @DisplayName("Update Contact")
    void updateContact() {
        Contact contact = new Contact("123","test","test","7244078643","Testing");
        ContactService service = new ContactService();
        service.addContact(contact);
        assertTrue(service.updateContact("123",new Contact("123","Tacia","Mitchell","123456789",
                "This should update.")));
    }

    @Test
    @DisplayName("Won't update")
    void doesNotUpdate(){
        Contact contact = new Contact("123","test","test","7244078643","Testing");
        ContactService service = new ContactService();
        service.addContact(contact);
        assertFalse(service.updateContact("456",new Contact("123","Tacia","Mitchell","123456789",
                "This should update.")));
    }
}