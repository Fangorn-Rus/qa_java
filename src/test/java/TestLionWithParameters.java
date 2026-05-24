import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class TestLionWithParameters {
    private final String sex;
    private final boolean checkDoesHaveMane;

    public TestLionWithParameters(String sex, boolean checkDoesHaveMane) {
        this.sex = sex;
        this.checkDoesHaveMane = checkDoesHaveMane;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testGetKittens() throws Exception {
        assertEquals(1, new Lion(new Feline(), sex).getKittens());
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        assertEquals(new Lion(new Feline(), sex).doesHaveMane(), checkDoesHaveMane);
    }

    @Test
    public void checkDoesHaveManeException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(new Feline(), "Неизвестно").doesHaveMane());
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testGetFood() throws Exception {
        assertEquals(Arrays.asList(new String[]{"Животные", "Птицы", "Рыба"}), new Lion(new Feline(), sex).getFood());
    }
}
