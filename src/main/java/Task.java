import java.util.Scanner;

public class Task {
    private String name;
    private String description;

    private String taskId;

    public Task(String taskId,String name, String description) {
        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    public Task() {

    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        while (!isValid(taskId, 10)) {
            Scanner scanner = new Scanner(System.in);
            taskId = scanner.nextLine();
        }
        this.taskId = taskId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        while (!isValid(name,10)) {
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
        }
        this.name = name;
    }

    public String getDescription() {
        return description;

    }

    public void setDescription(String description) {
        while (!isValid(description,50)) {
            Scanner scanner = new Scanner(System.in);
            description = scanner.nextLine();
        }
        this.description = description;

    }

    //Method to check if user input matches requirements
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
