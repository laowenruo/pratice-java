public class leetcode_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head==null){
            return null;
        }
        ListNode prev=new ListNode(-1);
        prev.next=head;
        ListNode fast=prev;
        while (k!=0){
            if (fast==null){
                return null;
            }
            fast=fast.next;
            k--;
        }
        while (fast!=null){
            fast=fast.next;
            prev=prev.next;
        }
        return prev;
    }
}