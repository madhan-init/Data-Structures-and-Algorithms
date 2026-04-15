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
static TreeNode delete(TreeNode root,int data){
        if(root ==null){
            return root;
        }
        if(data< root.data){
            root.left=delete(root.left,data);
        } else if (data> root.data) {
            root.right=delete(root.right,data);
        }else {
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }
            TreeNode temp=findmin(root.right);
            root.data= temp.data;
            root.right=delete(root.right, temp.data);
        }
        return root;
}
static TreeNode findmin(TreeNode root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
}
static void displayleaf(TreeNode root){
        if (root==null){
            return;
        }
        if (root.right==null && root.left==null){
            System.out.println(root.data);
            return;
        }
        displayleaf(root.left);
        displayleaf(root.right);
}
static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh>rh){
            return lh+1;
        }
        else {
            return rh+1;
        }
}
 static  void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }
     static void printGivenLevel(TreeNode root, int level) {
        if(root==null){
            return;
        }
        if(level==1){
            System.out.println(root.data);
        }
        else if(level>1){
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
    static boolean ismirror(TreeNode leftsub, TreeNode rightsub){
        if(leftsub == null && rightsub == null){
            return true;
        }
        if(leftsub == null || rightsub == null){
            return false;
        }

        return (leftsub.data == rightsub.data)
                && ismirror(leftsub.left, rightsub.right)
                && ismirror(leftsub.right, rightsub.left);
    }
    static void main(String[] args) {
    trees_impl tr=new trees_impl();
        tr.root=insert(tr.root,6);
        tr.root=insert(tr.root,2);
        tr.root=insert(tr.root,8);
        tr.root=insert(tr.root,1);
        tr.root=insert(tr.root,4);
        tr.root=insert(tr.root,7);
        tr.root=insert(tr.root,9);
//        tr.postorder(root);
//        tr.delete(tr.root,7);
//      tr.inorder(root);
//        tr.displayleaf(tr.root);
        tr.printLevelOrder();

    }
}
