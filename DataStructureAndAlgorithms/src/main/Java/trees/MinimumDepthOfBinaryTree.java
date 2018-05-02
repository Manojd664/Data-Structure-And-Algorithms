package trees;

public class MinimumDepthOfBinaryTree {

    //method :finds the minimum depth of tree recursively
    public int minDepth(TreeNode root)
    {
        if(root==null)
            return 0;
        else
        {
            int leftHeight=minDepth(root.left);
            int rightHeight=minDepth(root.right);
            if(leftHeight<rightHeight)
                return leftHeight+1;
            else
                return rightHeight+1;
        }
    }

    //main method
    public static void main(String[] args)
    {
        MinimumDepthOfBinaryTree tree=new MinimumDepthOfBinaryTree();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);

        System.out.println("Minimum Height of Tree: "+tree.minDepth(root));
    }
}
