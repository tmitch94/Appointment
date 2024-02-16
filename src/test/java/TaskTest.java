import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    Task task = new Task();

    @Test
    @DisplayName("Is valid")
    void isValid() {
        assertAll(
                () -> assertTrue(task.isValid("Tacia",10)),
                ()-> assertFalse(task.isValid("hhhhhhhhhhhh",10)),
                ()-> assertFalse(task.isValid("",10)),
                () -> assertFalse(task.isValid("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" +
                        "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",50)),
                ()-> assertTrue(task.isValid("1-2-23",10))
        );
    }

    @Test
    void getTaskId() {
        task.setTaskId("Tacia");
        String id = task.getTaskId();
        assertEquals("Tacia",id);
    }

    @Test
    void setTaskId() {
        task.setTaskId("Tacia");
    }

    @Test
    void getName() {
        task.setName("Tacia");
        String name = task.getName();
        assertEquals("Tacia",name);
    }

    @Test
    void setName() {
        task.setName("Tacia");
    }

    @Test
    void getDescription() {
        task.setDescription("Tacia");
        String description = task.getDescription();
        assertEquals("Tacia",description);
    }

    @Test
    void setDescription() {
        task.setDescription("Tacia");
    }
}

