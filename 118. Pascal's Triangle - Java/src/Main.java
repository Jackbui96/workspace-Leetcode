import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    private static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0)
            return triangle;

        List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);

        if (numRows == 1)
            return triangle;

        for (int line = 2; line <= numRows; line++) {
            List<Integer> row2 = new ArrayList<>();
            row2.add(1);
            for (int i = 1; i < line; i++) {
                int num = row2.get(i - 1) * (line - i) / i;
                row2.add(num);
            }
            triangle.add(row2);
        }

        return triangle;
    }
}


