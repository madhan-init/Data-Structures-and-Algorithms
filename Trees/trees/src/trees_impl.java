import java.util.TreeSet;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class trees_impl {
    static TreeNode root;
    public static TreeNode insert(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        if(data< root.data){
            root.left=insert(root.left,data );
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        System.out.println(root.data);
        postorder(root.right);
    }

    public static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void main(String[] args) {
    trees_impl tr=new trees_impl();
        tr.root=insert(tr.root,5);
        tr.root=insert(tr.root,6);
        tr.root=insert(tr.root,1);
        tr.root=insert(tr.root,7);
        tr.root=insert(tr.root,8);
        tr.postorder(root);
    }
}
