import org.junit.Assert;
import org.junit.Test;

public class Main {

    public static void main(String[] arg) {
        int argInput = Integer.parseInt(arg[0]);
        System.out.println(reverse(argInput));
    }

    private static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop == 7)) {
                return 0;
            } else if (result < Integer.MIN_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop == -8)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }

    @Test
    public void testCases() {
        Assert.assertEquals(1, reverse(100));
        Assert.assertEquals(123, reverse(321));
        Assert.assertEquals(0, reverse(1234567899));
        Assert.assertEquals(0, reverse(2147483647));
    }


}
