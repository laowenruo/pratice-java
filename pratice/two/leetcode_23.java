package pratice.two;

import pratice.two.pojo.ListNode;

import java.util.PriorityQueue;

public class leetcode_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        PriorityQueue<ListNode> queue=new PriorityQueue<ListNode>((o1, o2) -> o1.val-o2.val);
        for (ListNode list : lists) {
            while (list!=null){
                queue.add(list);
                list=list.next;
            }
        }
        while (!queue.isEmpty()){
            ListNode poll = queue.poll();
            poll.next=null;
            temp.next=poll;
            temp=poll;
        }
        return prev.next;
    }
}
