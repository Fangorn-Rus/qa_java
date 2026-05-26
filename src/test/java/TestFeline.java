import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestFeline {

    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        Assertions.assertEquals(Arrays.asList(new String[]{"Животные", "Птицы", "Рыба"}), feline.eatMeat());
    }

    @Test
    public void testGetFamily(){
        Assertions.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens(){
        Assertions.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount(){
        Assertions.assertEquals(5, feline.getKittens(5));
    }
}
