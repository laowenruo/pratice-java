import java.util.ArrayList;
import java.util.List;

public class leetcode_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(list,root,0);
        return list;
    }
    public void dfs(List<Integer> list,TreeNode root,int depth){
        if (root==null){
            return;
        }
        if (depth==list.size()){
            list.add(root.val);
        }
        dfs(list,root.right,depth+1);
        dfs(list,root.left,depth+1);
    }
}
