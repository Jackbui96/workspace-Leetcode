import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(generate(4));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // First base case; if user requests zero rows, they get zero rows.
        if (numRows == 0) {
            return triangle;
        }

        for (int line = 1; line <= numRows; line++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int i = 1; i <= )

        }

        return triangle;
    }

}


