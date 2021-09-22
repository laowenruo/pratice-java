public class leetcode_141 {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
}
