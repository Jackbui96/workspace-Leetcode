import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }

    private static List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        row.add(1);
        stack.add(1);

        if(rowIndex == 0)
            return row;
        if(rowIndex == 1) {
            row.add(stack.pop());
            return row;
        }

        for(int i = 1; i <= rowIndex / 2; i++) {
            int num = row.get(i - 1) * (rowIndex + 1 - i) / i;
            row.add(num);
            stack.add(num);
        }

        if(rowIndex % 2 == 0)
            stack.pop();

        while(!stack.isEmpty()) {
            row.add(stack.pop());
        }

        return row;
    }
}
