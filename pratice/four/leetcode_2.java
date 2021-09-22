public class leetcode_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null||l2==null){
            return l1==null?l2:l1;
        }
        int count=0;
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        while (l1!=null||l2!=null){
            int one=l1==null?0:l1.val;
            int two=l2==null?0:l2.val;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
            int sum=one+two+count;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            count=sum/10;
        }
        if (count!=0){
            temp.next=new ListNode(count);
        }
        return prev.next;
    }
}
