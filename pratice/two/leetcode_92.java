package pratice.two;

import pojo.ListNode;

public class leetcode_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode dummyFirst=dummy,dummyLast=dummy;
        for (int i=0;i<left-1;i++){
            dummyFirst=dummyFirst.next;
        }
        dummyLast=dummyFirst;
        for (int i=left-1;i<right;i++){
            dummyLast=dummyLast.next;
        }
        ListNode next = dummyFirst.next;
        ListNode last = dummyLast.next;

        dummyFirst.next=null;
        dummyLast.next=null;

        reverse(next);

        dummyFirst.next=dummyLast;
        next.next=last;
        return dummy.next;
    }
    public void reverse(ListNode root){
        ListNode prev=null;
        while (root!=null){
            ListNode temp=root.next;
            root.next=prev;
            prev=root;
            root=temp;
        }
    }
}
