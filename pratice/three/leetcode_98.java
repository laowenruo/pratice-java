package three;

/**
 * @author ryan_coder
 */
public class leetcode_98 {
    long num=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        if (!isValidBST(root.left)){
            return false;
        }
        if (root.val<=num){
            return false;
        }
        num=root.val;
        return isValidBST(root.right);
    }
}
