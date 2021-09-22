public class leetcode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null){
            return null;
        }
        ListNode temp=headA;
        ListNode temp2=headB;
        while (temp!=temp2){
            temp=temp==null?headA:temp.next;
            temp2=temp2==null?headB:temp2.next;
        }
        return temp;
    }
}
