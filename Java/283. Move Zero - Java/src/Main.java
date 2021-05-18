import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void moveZeroes(int[] nums) {

        Queue<Integer> queue = new LinkedList();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                queue.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!queue.isEmpty())
                nums[i] = queue.poll();
            else
                nums[i] = 0;
        }
    }
}
