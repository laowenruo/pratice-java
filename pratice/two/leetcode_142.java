package pratice.two;

import pojo.ListNode;

public class leetcode_142 {
    public ListNode detectCycle(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        try{
            do {
                fast=fast.next.next;
                slow=slow.next;
            }while (fast!=slow);
        }catch (NullPointerException e){
            return null;
        }
        fast=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
