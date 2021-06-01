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
        int t1 = solution.removeDuplicates(new int[] {1, 1, 2, 2, 2, 3, 6, 6, 6, 6, 6, 8});
        int t2 = solution.removeDuplicates(new int[] {1, 2, 3});
        int t3 = solution.removeDuplicates(new int[] {1});
        int t4 = solution.removeDuplicates(new int[] {});
        int t5 = solution.removeDuplicates(new int[] {1, 1, 1, 1, 1});

        assertEquals(5, t1);
        assertEquals(3, t2);
        assertEquals(1, t3);
        assertEquals(0, t4);
        assertEquals(1, t5);
    }


}
