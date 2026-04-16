import java.util.*;

//class TreeNode {
//    int val;
//    TreeNode left, right;
//
//    TreeNode(int val) {
//        this.val = val;
//        left = right = null;
//    }
//}

public class LevelOrderTraversal {

    public static void levelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            System.out.print(current.data + " ");

            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
    }

    public static void main(String[] args) {
        // Input tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        levelOrder(root);
    }
}