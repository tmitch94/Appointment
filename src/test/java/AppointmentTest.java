import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @Test
    void isValid() {
        LocalDate date = LocalDate.of(2024,1,14);
        Appointment appointment = new Appointment("1234",date,"");
        //should pass. Meets all requirements
        appointment.setAppointmentID("1234");
        assertTrue(appointment.isValid(appointment.getAppointmentID(),10));
    }
    @Test
    void isNotValidDate(){
        LocalDate date = LocalDate.of(2024,1,14);
        Appointment appointment = new Appointment("1234",date,"Testing");
        appointment.setDate(date);
        assertTrue(appointment.getDate().isBefore(LocalDate.now()));
    }

    @Test
    void isValidDate(){
        Appointment appointment = new Appointment();
        //checking to see if date is before the local date. Should return false
        LocalDate date = LocalDate.of(2024,2,14);
        appointment.setDate(date);
        assertFalse(appointment.getDate().isBefore(LocalDate.now()));
    }

    @Test
    void isNotValidLength(){
        Appointment appointment = new Appointment();
        //should return false because its greater than 10 characters
        assertFalse(appointment.isValid("tehrituyjiwerer",10));
    }
    @Test
    void isEmpty(){
        Appointment appointment = new Appointment();
        //Should fail, description is empty
        appointment.setDescription("");
        assertFalse(appointment.isValid(appointment.getDescription(),50));

    }
}