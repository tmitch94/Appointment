import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Appointment {

    String appointmentID;
    LocalDate date;
    String description;
    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        isValid(appointmentID,10);
        this.appointmentID = appointmentID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        if (dateChecker(date)){
            System.out.println("The date is in the past!");
        }else{
            isValid(String.valueOf(date),30);
            this.date = date;
        }

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        isValid(description,50);
        this.description = description;
    }

    public Appointment(String appointmentID, LocalDate date, String description) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.description = description;
    }

    public Appointment(){

    }

    

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
    private boolean dateChecker(LocalDate date){
        //SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        LocalDate userDate = LocalDate.of(2024,2,01);

        return date.isBefore(userDate);
    }

}


