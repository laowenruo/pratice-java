package three;

import java.util.HashMap;

/**
 * Input: preorder = [3,9,20,15,7],
 *        inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 *
 * @author ryan_coder
 */
public class leetcode_105 {
    public HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>(inorder.length);
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        TreeNode treeNode = build(preorder, 0, preorder.length-1 , 0, inorder.length-1);
        return treeNode;
    }
    public TreeNode build(int[] preorder,int preL,int preR,int inL,int inR){
        if (preL>=preR){
            return null;
        }
        int rootVal=preorder[preL];
        Integer integer = map.get(rootVal);
        TreeNode root=new TreeNode(rootVal);
        int length=integer-inL;
        root.left=build(preorder, preL+1, preL+length, inL, integer-1);
        root.right=build(preorder, preL+length+1, preR, integer+1, inR);
        return root;
    }

    public static void main(String[] args) {
        new leetcode_105().buildTree(new int[]{3,9,20,15,7},
new int[]{9,3,15,20,7});
    }
}
