import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Appointment {
    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        isValid(appointmentID,10);
        this.appointmentID = appointmentID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        isValid(DateFormat.getDateInstance().format(date),10 );
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
    SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
    String appointmentID;
    Date date = new Date();
    String description;
    

    public boolean isValid(String fieldName, int allowedLength) {
        String userInput = checkSpecialCharacters(fieldName);
        if (userInput.trim().isEmpty()) {
            System.out.println("Field can't be Empty! Please try again");
            return false;
        } else if (userInput.length() > allowedLength) {
            System.out.printf("Can only be %d characters or less\n", allowedLength);
            return false;
        }
        return true;
    }

    //method to remove
    private String checkSpecialCharacters(String fieldName) {
        // Define the regex for special characters
        String regex = "[!@#$%^&*:()\"{}_\\[\\]|\\?/<>,.-]";

        // Replace special characters with an empty string
        fieldName = fieldName.replaceAll(regex, "");

        // Replace spaces with an empty string
        fieldName = fieldName.replaceAll(" ", "");

        return fieldName;
    }

}


