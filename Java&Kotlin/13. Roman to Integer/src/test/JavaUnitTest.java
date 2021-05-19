package test;

import main.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaUnitTest {

    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testDriver() {
        int t1 = solution.romanToInt("XIV");
        int t2 = solution.romanToInt("I");
        int t3 = solution.romanToInt("III");
        int t4 = solution.romanToInt("IV");
        int t5 = solution.romanToInt("MCMXCIV");

        assertEquals(14, t1);
        assertEquals(1, t2);
        assertEquals(3, t3);
        assertEquals(4, t4);
        assertEquals(1994, t5);
    }


}
