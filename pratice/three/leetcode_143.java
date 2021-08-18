package three;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ryan_coder
 */
public class leetcode_143 {
    /**
     * 重排序
     * @param head
     */
    public void reorderList1(ListNode head) {
        if (head==null){
            return;
        }
        PriorityQueue<ListNode> queue=new PriorityQueue<ListNode>((Comparator.comparingInt(o -> o.val)));
        while (head!=null){
            queue.add(head);
            head=head.next;
        }
        ListNode prev=new ListNode(-1);
        while (!queue.isEmpty()){
            prev.next=queue.poll();
            prev=prev.next;
        }
    }
    /**
     * 重排链表
     */
    public void reorderList(ListNode head){
        if (head==null){
            return;
        }
        ArrayList<ListNode> list=new ArrayList<>();
        while (head!=null){
            list.add(head);
            head=head.next;
        }
        int i=0,j=list.size()-1;
        while (i<j){
            list.get(j).next=list.get(i).next;
            list.get(i).next=list.get(j);
            i++;
            j--;
            if (i==j){
                break;
            }
        }
        list.get(i).next=null;
    }
}
