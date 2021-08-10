package pratice.two;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        if (root==null){
            return lists;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
            }
            lists.add(new ArrayList<>(list));
        }
        return lists;
    }
}
