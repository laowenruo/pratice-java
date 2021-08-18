package three;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ryan_coder
 */
public class leetcode_144 {
    List<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        list=new ArrayList<>();
        if (root==null){
            return list;
        }
        preOrder(root);
        return list;
    }
    public void preOrder(TreeNode root){
        if (root==null){
            return;
        }
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
