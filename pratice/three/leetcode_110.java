package three;

/**
 * @author ryan_coder
 */
public class leetcode_110 {
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        if (!isBalanced(root.left)){
            return false;
        }
        if (!isBalanced(root.right)){
            return false;
        }
        int l=Max(root.left);
        int r=Max(root.right);
        return Math.abs(l-r)<=1;
    }
    public int Max(TreeNode root){
        if (root==null){
            return 0;
        }
        int left=Max(root.left);
        int right=Max(root.right);
        return Math.max(left,right)+1;
    }
}
