import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldCompareSimpleTaskWithTitle() {
        SimpleTask simpletask = new SimpleTask(1, "Сделать покупки");
        boolean expected = true;
        boolean actual = simpletask.matches("Сделать покупки");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCompareSimpleTaskWithTitle() {
        SimpleTask simpletask = new SimpleTask(1, "Сделать");
        boolean expected = false;
        boolean actual = simpletask.matches("Сделать покупки");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareEpicWithSubtask() {
        String[] tasks = {"Сделать покупки", "Собраться в дорогу"};
        Epic epic = new Epic(1, tasks);
        boolean expected = true;
        boolean actual = epic.matches("Сделать покупки");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCompareEpicWithSubtask() {
        String[] tasks = {"Сделать", "Собраться в дорогу"};
        Epic epic = new Epic(1, tasks);
        boolean expected = false;
        boolean actual = epic.matches("Сделать покупки");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareMeetingWithTopic() {
        Meeting meeting = new Meeting(1, "Сделать покупки", "Дом", "После работы");
        boolean expected = true;
        boolean actual = meeting.matches("Сделать покупки");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCompareMeetingWithTopic() {
        Meeting meeting = new Meeting(1, "Сделать", "Дом", "После работы");
        boolean expected = false;
        boolean actual = meeting.matches("Сделать покупки");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareMeetingWithProject() {
        Meeting meeting = new Meeting(1, "Сделать покупки", "Дом", "После работы");
        boolean expected = true;
        boolean actual = meeting.matches("Дом");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCompareMeetingWithProject() {
        Meeting meeting = new Meeting(1, "Сделать покупки", "Работа", "После работы");
        boolean expected = false;
        boolean actual = meeting.matches("Дом");
        Assertions.assertEquals(expected, actual);
    }
}
