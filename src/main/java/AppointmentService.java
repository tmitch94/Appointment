import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class AppointmentService {

    HashMap<String,Appointment> appointmentHashMap = new HashMap<>();

    public void addAppointment(Appointment appointment){
            appointmentHashMap.put(appointment.getAppointmentID(),appointment);
    }



    public void deleteAppointment(String key){
        if (appointmentHashMap.containsKey(key)){
            appointmentHashMap.remove(key);
            System.out.println( key + "Removed");
            displayAppointments();
        }else {
            System.out.println("Not removed");
        }
    }
    private void displayAppointments(){
        for (Appointment appointments: appointmentHashMap.values()) {
            System.out.println(appointments.getAppointmentID() + appointments.getDate() + appointments.getDescription());

        }
    }

}
