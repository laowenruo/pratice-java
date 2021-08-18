package three;

/**
 * @author ryan_coder
 */
public class leetcode_124 {
    public int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root==null){
            return -1;
        }
        dfs(root);
        return max;
    }
    public int dfs(TreeNode root){
        if (root==null){
            return 0;
        }
        int left=Math.max(dfs(root.left),0);
        int right=Math.max(dfs(root.right),0);
        max=Math.max(left+right+root.val,max);
        return Math.max(left,right)+root.val;
    }
}
