package pratice.two;

import pojo.TreeNode;

import java.util.*;

public class leetcode_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root==null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> lists=new ArrayList<>();
        queue.add(root);
        while (true){
            List<Integer> list=new ArrayList<>();
            int count=queue.size();
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
            if (lists.size()%2==1){
                Collections.reverse(list);
            }
            lists.add(new ArrayList<>(list));
            if (queue.isEmpty()){
                break;
            }
        }
        return lists;
    }
}
