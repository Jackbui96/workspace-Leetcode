import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] arg) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5, new TreeNode(6), new TreeNode(2));
        root1.right = new TreeNode(1, new TreeNode(9), new TreeNode(8));
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5, new TreeNode(6), new TreeNode(7));
        root2.right = new TreeNode(1, new TreeNode(4), new TreeNode(2));
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        ArrayList<Integer> listNode1 = new ArrayList<>();
        ArrayList<Integer> listNode2 = new ArrayList<>();
        dfsHelper(root1, listNode1);
        dfsHelper(root2, listNode2);
        System.out.println("result: " + listNode1.equals(listNode2));
    }

    private static void dfsHelper(TreeNode root, List<Integer> listNode) {
        if (root.left == null && root.right == null) listNode.add(root.val);
        if (root.left != null) dfsHelper(root.left, listNode);
        if (root.right != null) dfsHelper(root.right, listNode);
    }
}
