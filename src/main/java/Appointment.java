import java.util.Date;

public class Appointment {
    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Appointment(String appointmentID, Date date, String description) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.description = description;
    }

    public Appointment(){

    }

    String appointmentID;
    Date date = new Date();
    String description;

}
