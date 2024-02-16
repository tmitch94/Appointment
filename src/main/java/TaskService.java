import java.util.HashMap;
import java.util.Map;

public class TaskService {

    HashMap<String, Task> taskServiceHashMap = new HashMap<>();
    Task task = new Task();

    public void addTask(Task task) {
        taskServiceHashMap.put(task.getTaskId(), task);
        if (taskServiceHashMap.isEmpty()) {
            System.out.println("Nothing has been added!");
        } else {
            System.out.println("User has has been added!");
        }

    }

    public void updateTask(String taskID, String updateUserInput) {
        if (taskServiceHashMap.containsKey(taskID)) {
            Task exisitingTask = taskServiceHashMap.get(taskID);
            taskServiceHashMap.replace(taskID, exisitingTask);
            exisitingTask.setName(updateUserInput);
            System.out.println("Updated Successfully!");
        } else {
            System.out.println(taskID + " Does not exist!");
        }

    }

    public void deleteTask(String taskID) {
        if (taskServiceHashMap.containsKey(taskID)) {
            taskServiceHashMap.remove(taskID);

            System.out.println(taskID + " has been removed!");
        } else {
            System.out.println("Id does not exist!");
        }

    }

    public void displayContacts() {
        System.out.println("Contacts: ");
        for (Task task : taskServiceHashMap.values()) {
            System.out.println("Task:" + task.getTaskId() + " Task Name:" + task.getName() +
                    " Task Description:" + task.getDescription());

        }
    }
}


