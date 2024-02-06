import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldCompareSimpleTaskWithTitle() {
        SimpleTask simpletask = new SimpleTask(1, "Сделать покупки");
        //simpletask.matches("Сделать покупки");
        boolean expected = true;
        boolean actual = simpletask.matches("Сделать покупки");
        Assertions.assertEquals(expected, actual);
    }

}
