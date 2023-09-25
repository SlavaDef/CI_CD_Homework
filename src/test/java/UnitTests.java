import org.example.Convector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTests {

    private Convector convector;

    @BeforeEach
    public void beforeEach() {
        convector = new Convector();
    }

    @Test
    public void testSimWithFive() {
        int actual = convector.convertTimeIntoSeconds(5);
        int expected = 18000;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSimWithEight() {
        int actual = convector.convertTimeIntoSeconds(8);
        int expected = 28800;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumConvectorWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> convector.convertTimeIntoSeconds(0));
    }

    @Test
    public void sumNumbers() {
        int actual = convector.sumDigitsInNumber(555);
        int expected = 15;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sumNumbers2() {
        int actual = convector.sumDigitsInNumber(231);
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void mussIndexForFet() {
        String actual = convector.massIndex(105.2,1.8);
        String expected = "to fet";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void mussIndexForLight() {
        String actual = convector.massIndex(55.5,1.8);
        String expected = "light";
        Assertions.assertEquals(expected, actual);

    }
}
