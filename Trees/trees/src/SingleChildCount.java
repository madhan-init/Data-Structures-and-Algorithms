class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class SingleChildCount {

    // Function to count nodes with exactly one child
    public static int countSingleChildNodes(TreeNode root) {
        if (root == null) return 0;

        int count = 0;

        // Check if exactly one child exists (XOR)
        if (root.left != null ^ root.right != null) {
            count = 1;
        }

        // Recur for left and right
        return count
                + countSingleChildNodes(root.left)
                + countSingleChildNodes(root.right);
    }

    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             /
            4
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int result = countSingleChildNodes(root);

        System.out.println("Single-child parent count: " + result);
    }
}