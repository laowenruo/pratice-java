package three;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ryan_coder
 */
public class leetcode_113 {
    public List<List<Integer>> lists;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        lists=new ArrayList<>();
        if (root==null){
            return lists;
        }
        ArrayList<Integer> list=new ArrayList<>();
        dfs(root,targetSum,list);
        return lists;
    }
    public void dfs(TreeNode root,int targetSum,ArrayList<Integer> list){
        if (root==null||targetSum<0){
            return;
        }
        targetSum=targetSum-root.val;
        list.add(root.val);
        if (targetSum==0&&root.left==null&&root.right==null){
            lists.add(new ArrayList<>(list));
        }
        dfs(root.left,targetSum,list);
        dfs(root.right,targetSum,list);
        list.remove(list.size()-1);
    }
}
