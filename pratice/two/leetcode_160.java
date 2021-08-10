package pratice.two;

import pojo.ListNode;

public class leetcode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp1=headB;
        while (temp!=temp1){
            temp=temp==null?headB:temp.next;
            temp1=temp1==null?headA:temp1.next;
        }
        return temp;
    }
}
