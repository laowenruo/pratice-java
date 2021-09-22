public class leetcode_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null){
            return null;
        }
        ListNode prev=new ListNode(-1);
        prev.next=head;
        ListNode fast=prev;
        ListNode slow=prev;
        while (n--!=0){
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return prev.next;
    }
}
