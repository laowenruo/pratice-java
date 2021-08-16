package three;

/**
 * @author ryan_coder
 */
public class tree_test {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode node=new TreeNode(-1);
        TreeNode node1=new TreeNode(-2);
        root.left=node;
        root.right=node1;
        System.out.println(new tree_test().Serialize(root));
    }
    private String deserializeStr;

    public String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return root.val + " " + Serialize(root.left) + " " + Serialize(root.right);
    }

    public TreeNode Deserialize(String str) {
        deserializeStr = str;
        return Deserialize();
    }

    private TreeNode Deserialize() {
        if (deserializeStr.length()==0){
            return null;
        }
        int index=deserializeStr.indexOf(" ");
        String node=index==-1?deserializeStr:deserializeStr.substring(0,index);
        deserializeStr=index==-1?"":deserializeStr.substring(index+1);
        if (node.equals("#")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(node));
        root.left=Deserialize();
        root.right=Deserialize();
        return root;
    }
}
