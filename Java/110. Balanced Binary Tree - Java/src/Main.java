
public class Main {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
            left = right = null;
        }
    }

    public static class Tree {
        TreeNode root;

        // Constructors
        Tree(int key)
        {
            root = new TreeNode(key);
        }

        Tree()
        {
            root = null;
        }

    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(7);
    }
}
