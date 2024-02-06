import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class AppointmentService {

    HashMap<String,Appointment> appointmentHashMap = new HashMap<>();



    public void addAppointment(){
        String pattern = "MM/dd/yy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);

        try {
            Date date = format.parse("02/05/24");
            Appointment appointment = new Appointment("1234", date,"");
            appointmentHashMap.put(appointment.getAppointmentID(),appointment);
            for (Appointment appointments: appointmentHashMap.values()){
                System.out.println(appointments.getAppointmentID() + appointments.getDate() + appointments.getDescription());
            }
        }catch (ParseException e){
            System.out.println("Could not read date");
        }
    }



    public void deleteAppointment(String key){
        if (appointmentHashMap.containsKey(key)){

        }

    }
}
