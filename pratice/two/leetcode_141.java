package pratice.two;

import pojo.ListNode;

public class leetcode_141 {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode fast=head,slow=head;
        try{
            while (fast!=slow){
                fast=fast.next.next;
                slow=slow.next;
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
