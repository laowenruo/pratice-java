package pratice.two;

import pojo.ListNode;

public class leetcode_25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;
        while (end.next!=null){
            for (int i = 0; i < k&&end!=null; i++) {
                end=end.next;
            }
            if (end==null){
                break;
            }
            ListNode start=pre.next;
            ListNode next=end.next;
            pre.next=null;
            end.next=null;
            pre.next=reverse(start);
            start.next=next;
            pre=start;
            end=pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
          ListNode prev=null;
          while (head!=null){
              ListNode temp=head.next;
              head.next=prev;
              prev=head;
              head=temp;
          }
          return prev;
    }
}
