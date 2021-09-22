public class leetcode_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        while (l1!=null&&l2!=null){
            if (l1.val> l2.val){
                temp.next=l2;
                l2=l2.next;
            }else {
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
        }
        if (l1!=null){
            temp.next=l1;
        }
        if (l2!=null){
            temp.next=l2;
        }
        return prev.next;
    }
}
