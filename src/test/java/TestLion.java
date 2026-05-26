import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLion {

    @Test
    public void checkDoesHaveManeException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(new Feline(), "Неизвестно").doesHaveMane());
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testGetFood() throws Exception {
        assertEquals(Arrays.asList(new String[]{"Животные", "Птицы", "Рыба"}), new Lion(new Feline(), "Самец").getFood());
    }
}
