import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        String pattern = "02/11/2024";
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = format.parse(pattern);
        Date date2 = new Date(Calendar.YEAR,Calendar.FEBRUARY,Calendar.DAY_OF_MONTH);
        AppointmentService appointmentService = new AppointmentService();
        Appointment appointment = new Appointment("1234 ",date," Test");
        Appointment appointment2 = new Appointment("4567 ",date," Tests");
        Appointment appointment3 = new Appointment("8945 ",date," Testing");
        appointmentService.addAppointment(appointment);
        appointmentService.addAppointment(appointment2);
        appointmentService.addAppointment(appointment3);
        appointmentService.deleteAppointment(appointment.getAppointmentID());
        appointmentService.deleteAppointment(appointment2.getAppointmentID());
        if (date2.before(date)){
            System.out.println("Could not calculate date");
            System.exit(0);
        }else {
            System.out.println("Date Added!");
        }
    }
}
