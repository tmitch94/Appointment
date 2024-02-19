import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    @DisplayName("Displaying is valid")
    void isValid() {
        Contact contact = new Contact();
        contact.setContactID("123");
        contact.setFirstName("gggggggggggggggggggg");
        contact.setLastName("Mit-chell");
        contact.setAddress(" ");
        contact.setPhoneNumber("724-407-8643");
        assertAll("contact",
                () -> assertTrue(contact.isValid(contact.getContactID(),10)),
                () -> assertFalse(contact.isValid(contact.getFirstName(),10)),
                () -> assertTrue(contact.isValid(contact.getLastName(),10)),
                () -> assertFalse(contact.isValid(contact.getAddress(),50)),
                () -> assertTrue(contact.isValid(contact.getPhoneNumber(),10))
        );
    }
}