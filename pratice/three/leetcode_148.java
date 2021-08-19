package three;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ryan_coder
 */
public class leetcode_148 {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> queue=new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        while(head!=null){
            queue.add(head);
            head=head.next;
        }
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        while (!queue.isEmpty()){
            ListNode poll = queue.poll();
            poll.next=null;
            prev.next=poll;
            prev=prev.next;
        }
        return temp.next;
    }
}
