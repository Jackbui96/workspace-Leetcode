import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] arg) {

        ListNode link11 = new ListNode(1);
        ListNode link12 = new ListNode(2);
        ListNode link13 = new ListNode(4);

        ListNode link21 = new ListNode(1);
        ListNode link22 = new ListNode(3);
        ListNode link23 = new ListNode(4);

        link11.next = link12;
        link12.next = link13;

        link21.next = link22;
        link22.next = link23;


    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {



        return null;
    }

    @Test
    public void testCases() {
        ListNode head = new ListNode(3, new ListNode(4));
        head = head.next;
        System.out.println(head.val);
    }
}
