import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LCA {

    // Build tree from level order input
    public static TreeNode buildTree(String[] arr) {
        if (arr.length == 0 || arr[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();

            // left child
            if (!arr[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;

            // right child
            if (i < arr.length && !arr[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

    // LCA function
    public static TreeNode LCA(TreeNode root, int p, int q) {
        if (root == null) return null;

        if (root.val == p || root.val == q) {
            return root;
        }

        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input tree (level order)
        String line = sc.nextLine();
        String[] arr = line.split(" ");

        TreeNode root = buildTree(arr);

        // input nodes
        int p = sc.nextInt();
        int q = sc.nextInt();

        TreeNode ans = LCA(root, p, q);

        if (ans != null)
            System.out.println("LCA: " + ans.val);
        else
            System.out.println("LCA not found");
    }
}