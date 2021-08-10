package pratice.two;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_94 {
    List<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list=new ArrayList<>();
        if (root==null){
            return list;
        }
        dfs(root);
        return list;
    }
    public void dfs(TreeNode root){
        if (root==null){
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
