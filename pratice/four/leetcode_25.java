public class leetcode_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode start=dummy;
        ListNode end=dummy;
        while (end.next!=null){
            for (int i = 0; i < k&&end!=null; i++) {
                end=end.next;
            }
            if (end==null){
                break;
            }
            ListNode Node_begin=start.next;
            ListNode Node_end=end.next;
            start.next=null;
            end.next=null;
            start.next=reverse(Node_begin);
            Node_begin.next=Node_end;
            start=Node_begin;
            end=Node_begin;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        while (head!=null){
            ListNode temp=head.next;
            head.next=pre;
            pre=head;
            head=temp;
        }
        return pre;
    }
}
