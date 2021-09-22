public class leetcode_142 {
    public ListNode detectCycle(ListNode head) {
        if (head==null||head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                fast=head;
                while (fast!=slow){
                    fast=fast.next;
                    slow=slow.next;
                }
            }
        }
        return null;
    }
}
