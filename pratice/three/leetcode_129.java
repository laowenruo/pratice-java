package three;

/**
 * @author ryan_coder
 */
public class leetcode_129{
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if (root==null){
            return 0;
        }
        return sum;
    }
    public void dfs(TreeNode root,int val){
        if (root==null){
            return ;
        }
        int k=val*10+root.val;
        if (root.left==null&&root.right==null){
            sum+=k;
        }
        dfs(root.left,k);
        dfs(root.right,k);
    }
}
