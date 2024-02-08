import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        String pattern = "MM/dd/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date = format.parse("02/05/24");
        AppointmentService appointmentService = new AppointmentService();
        Appointment appointment = new Appointment("1234 ",date," Test");
        Appointment appointment2 = new Appointment("4567 ",date," Tests");
        Appointment appointment3 = new Appointment("8945 ",date," Testing");
        appointmentService.addAppointment(appointment);
        appointmentService.addAppointment(appointment2);
        appointmentService.addAppointment(appointment3);
        appointmentService.deleteAppointment(appointment.getAppointmentID());
        appointmentService.deleteAppointment(appointment2.getAppointmentID());
    }
}
