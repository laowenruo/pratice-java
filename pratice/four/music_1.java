import java.util.*;

public class music_1 {


    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>(Arrays.asList(1,2,3,0,0,4,5));
        TreeNode treeNode = new music_1().buildTree(objects);
        TreeNode treeNode1 = new music_1().cyclicShiftTree(treeNode, 1);
        System.out.println(treeNode);
    }
    public TreeNode cyclicShiftTree (TreeNode root, int k) {
        ArrayList<Integer> lists=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (true){
            LinkedList<Integer> list=new LinkedList<>();
            int size=queue.size();
            if (size==0){
                break;
            }
            while(--size>=0){
                TreeNode poll = queue.poll();
                if (poll==null){
                    list.addLast(0);
                    continue;
                }else {
                    list.addLast(poll.val);
                    queue.add(poll.left);
                    queue.add(poll.right);
                }
            }
            int index=0;
            while (index!=k){
                Integer integer = list.pollLast();
                list.addFirst(integer);
                index++;
            }
            for (Integer integer : list) {
                lists.add(integer);
            }
        }
        TreeNode treeNode = buildTree(lists);
        return treeNode;

    }
    public TreeNode buildTree(ArrayList<Integer> list){
        ArrayList<TreeNode> root=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==0){
                root.add(null);
                continue;
            }
            root.add(new TreeNode(list.get(i)));
        }
        for (int i = root.size()/2-1; i >=0; i--) {
            if (root.get(i)==null){
                continue;
            }
            root.get(i).left=root.get(2*i+1);
            root.get(i).right=root.get(2*i+2);
        }
        return root.get(0);
    }


}
