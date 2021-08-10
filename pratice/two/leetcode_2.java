package pratice.two;

import pratice.two.pojo.ListNode;

public class leetcode_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        int count=0;
        while (l1!=null||l2!=null){
            int a=l1==null?0: l1.val;
            int b=l2==null?0: l2.val;
            int sum=a+b+count;
            count=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
        }
        if (count==1){
            temp.next=new ListNode(1);
        }
        return prev.next;
    }
}
