import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {


    @Test
    @DisplayName("Add task method")
    void addTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("123","Clean","Clean the house before going out.");
        taskService.addTask(task);
        assertAll(
                ()->assertEquals("123",task.getTaskId()),
                ()->assertEquals("Clean",task.getName()),
                ()->assertEquals("Clean the house before going out.",task.getDescription())
        );
        TaskService taskService1 = new TaskService();
        Task task1 = new Task();
        taskService1.addTask(task1);
        assertAll(
                ()-> assertNull(task1.getName()),
                ()-> assertNull(task1.getTaskId()),
                ()-> assertNull(task1.getDescription())
        );


    }

    @Test
    @DisplayName("update task method")
    void updateTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("123","Clean","Clean the house before going out.");
        taskService.addTask(task);
        assertAll(
                ()->assertEquals("123",task.getTaskId()),
                ()->assertEquals("Clean",task.getName()),
                ()->assertEquals("Clean the house before going out.",task.getDescription())
        );
        task.setName("Tacia");
        taskService.updateTask(task.getTaskId(),task.getName());
        assertNotEquals("Clean","Tacia");
        taskService.updateTask("789",task.getDescription());

    }

    @Test
    @DisplayName("Delete task method")
    void deleteTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("123","Clean","Clean the house before going out.");
        taskService.addTask(task);
        assertAll(
                ()->assertEquals("123",task.getTaskId()),
                ()->assertEquals("Clean",task.getName()),
                ()->assertEquals("Clean the house before going out.",task.getDescription())
        );
        taskService.deleteTask(task.getTaskId());
        taskService.deleteTask("456");

    }

    @Test
    @DisplayName("Display task method")
    void displayContacts() {
        TaskService taskService = new TaskService();
        Task task = new Task("123","Clean","Clean the house before going out.");
        taskService.addTask(task);
        assertAll(
                ()->assertEquals("123",task.getTaskId()),
                ()->assertEquals("Clean",task.getName()),
                ()->assertEquals("Clean the house before going out.",task.getDescription())
        );
        taskService.displayContacts();
    }
}