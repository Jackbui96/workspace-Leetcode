package MinimumScoreTriangulationOfPolygon;

import java.util.*;

class Solution {

    static int[] A = new int[] {3, 7, 4, 5, 4};
    static int[][] dp = new int[A.length][A.length];

    public static void main(String[] arg) {
        Collection<String> a = new ArrayList<>();
        Collection<String> b = new LinkedList<>();
//        Collections map = new HashMap<Integer, Integer>();
        a.add("test");
//        System.out.println("Result: " + minScoreHelper(A, 0, A.length - 1));
    }

    private static int minScoreHelper( int[] A, int i, int j ) {
        if (i + 1 == j) return 0; // meaning no triangle.
        if (dp[i][j] != 0) {
            System.out.println("dp[" + i + "][" + j + "]: " + dp[i][j]);
            return dp[i][j];
        }
        int res = Integer.MAX_VALUE;
        for ( int k = i + 1; k < j; k++ ) {
            int thisTriangleScore = A[i]*A[k]*A[j];
            System.out.println("thisTriangleScore: " + thisTriangleScore);
            int leftPolygonScore = minScoreHelper( A, i, k );
            System.out.println("leftPolygonScore: " + leftPolygonScore);
            int rightPolygonScore = minScoreHelper( A, k, j );
            System.out.println("rightPolygonScore: " + rightPolygonScore);
            res = Math.min( res, thisTriangleScore + leftPolygonScore + rightPolygonScore );
            System.out.println("res: " + res);
        }
        dp[i][j] = res;
        return res;
    }
}
