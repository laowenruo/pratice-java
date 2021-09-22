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
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (true){
            if (queue.isEmpty()){
                break;
            }
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp=queue.poll();
                list.add(temp.val);
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
            }
            lists.add(new ArrayList<>(list));
            list=new ArrayList<>();
        }
        return lists;
    }
}
