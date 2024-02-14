import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        DateFormat.getInstance().format(date);

        AppointmentService appointmentService = new AppointmentService();
        Appointment appointment = new Appointment();
        appointment.setAppointmentID("1234");
        appointment.setDate(date);
        appointment.setDescription("Testing");
        appointmentService.addAppointment(appointment);
    }
}
