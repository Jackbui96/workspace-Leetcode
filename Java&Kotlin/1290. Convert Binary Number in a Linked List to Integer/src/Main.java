import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        ListNode newList = new ListNode(1);
        newList.next = new ListNode(0);
        newList.next.next = new ListNode(1);
        System.out.println(getDecimalValue(newList));

//        byte[] bytesArray =


//        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
//        byteBuffer.put();


    }

    private static int getDecimalValue(ListNode head) {
        return 0;
    }



    @Test
    private void testCases() {
        ListNode newList = new ListNode(1);
        newList.next = new ListNode(0);
        newList.next.next = new ListNode(1);
        Assertions.assertEquals(5, getDecimalValue(newList));
    }

}
