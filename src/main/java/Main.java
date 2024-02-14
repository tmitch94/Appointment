import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2024-01-05");

        //First appointment object
        AppointmentService appointmentService = new AppointmentService();
        Appointment appointment = new Appointment("1234",date,"Testing");
        appointmentService.addAppointment(appointment);

        //second object
        date = LocalDate.parse("2024-02-13");
        appointment = new Appointment("4567",date,"Hi");
        appointmentService.addAppointment(appointment);

        //third object
        date = LocalDate.parse("2024-02-20");
        appointment = new Appointment("7895",date,"Yo");
        appointmentService.addAppointment(appointment);
        appointmentService.deleteAppointment("7895");

    }
}
