package Day12_4.ThucHanh2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AbsoluteNumberCalculatorTest {
    @Test
    public void findAbsolute() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
   public void testFindAbsolute1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}