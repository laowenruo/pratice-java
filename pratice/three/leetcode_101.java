package three;

/**
 * @author ryan_coder
 */
public class leetcode_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return false;
        }
        return isBoolean(root.left,root.right);
    }
    public boolean isBoolean(TreeNode left,TreeNode right){
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        if (left.val!=right.val){
            return false;
        }
        return isBoolean(left.left,right.right)&&isBoolean(left.right,right.left);
    }
}
