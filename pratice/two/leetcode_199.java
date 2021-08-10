package pratice.two;

import pratice.two.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_199{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(0,root,list);
        return list;
    }
    public void dfs(int depth,TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        if (list.size()==depth){
            list.add(root.val);
        }
        depth++;
        dfs(depth,root.right,list);
        dfs(depth,root.left,list);
    }
}
