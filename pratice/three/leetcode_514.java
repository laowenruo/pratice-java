package three;

/**
 * @author ryan_coder
 */
public class leetcode_514 {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        return max;
    }
    public int dfs(TreeNode root){
        if (root==null){
            return 0;
        }
        int left=dfs(root.left);
        int right=dfs(root.right);
        max=Math.max(left+right+1,max);
        return Math.max(left,right)+1;
    }
}
