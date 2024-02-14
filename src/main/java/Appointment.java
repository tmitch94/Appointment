import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Appointment {

    String appointmentID;
    Date date = new Date();
    Date dateChecker = new Date();
    String description;
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
        isValid(date.toString(),10 );
        DateFormat.getDateTimeInstance().format(date);
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

    

    public boolean isValid(String fieldName, int allowedLength) {
        String userInput = checkSpecialCharacters(fieldName);
        if (userInput.trim().isEmpty()) {
            System.out.println("Field can't be Empty! Please try again");
            return false;
        } else if (userInput.length() > allowedLength) {
            System.out.printf("Can only be %d characters or less\n", allowedLength);
            return false;
        } else if (date.before(dateChecker)) {
                System.out.println("Date is before this date, appointment not added");
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
//    private boolean dateChecker(String userInput){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
//
//        try {
//            Date userDate = simpleDateFormat.parse(userInput);
//            Date
//        }
//    }

}


