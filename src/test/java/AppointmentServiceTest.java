import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {


    @Test
    void addAppointment() {
        Appointment appointment = new Appointment("1234", LocalDate.now(),"Testing");
        AppointmentService appointmentService = new AppointmentService();
        appointmentService.addAppointment(appointment);
        assertEquals("1234",appointment.getAppointmentID());
    }

    @Test
    void deleteAppointment() {
        Appointment appointment = new Appointment("1234", LocalDate.now(),"Testing");
        AppointmentService appointmentService = new AppointmentService();
        appointmentService.addAppointment(appointment);
        appointmentService.deleteAppointment("1234");
        assertEquals("1234",appointment.getAppointmentID());
    }

    @Test
    void doesNotDelete(){
        Appointment appointment = new Appointment("1234", LocalDate.now(),"Testing");
        AppointmentService appointmentService = new AppointmentService();
        appointmentService.addAppointment(appointment);
        appointmentService.deleteAppointment("7895");
        assertNotEquals("7895",appointment.getAppointmentID());
    }
}