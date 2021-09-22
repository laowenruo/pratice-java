import java.util.PriorityQueue;

public class leetcode_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        PriorityQueue<ListNode> queue=new PriorityQueue<>((o1, o2) ->o1.val-o2.val);
        for (ListNode list : lists) {
            while (list!=null){
                queue.add(list);
                list=list.next;
            }
        }
        while (queue.isEmpty()){
            ListNode node=queue.poll();
            node.next=null;
            temp.next=node;
            temp=temp.next;
        }
        return prev.next;
    }
}
