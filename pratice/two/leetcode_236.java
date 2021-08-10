package pratice.two;

import pojo.TreeNode;

public class leetcode_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==p||root==q||root==null){
            return root;
        }
        TreeNode temp=lowestCommonAncestor(root.left,p,q);
        TreeNode temp1=lowestCommonAncestor(root.right,p,q);
        if (temp==null&&temp1!=null){
            return temp1;
        }else if (temp!=null&&temp1==null){
            return temp;
        }else if (temp==null&&temp1==null){
            return null;
        }
        return root;
    }
}
