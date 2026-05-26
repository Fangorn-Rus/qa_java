

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class TestLionWithParameters {

    @Parameterized.Parameter(0)
    public String sex;
    @Parameterized.Parameter(1)
    public boolean checkDoesHaveMane;

    @Parameterized.Parameters(name = "Тестовые данные: sex={0}, checkDoesHaveMane={1}")
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
}
