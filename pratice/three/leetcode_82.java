package three;

import java.util.Stack;

/**
 * @author ryan_coder
 */
public class leetcode_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode next=head.next;
        if (head.val!=next.val){
            head.next=deleteDuplicates(next);
        }else {
            ListNode temp=next;
            while (next!=null&&temp.val==next.val){
                next=next.next;
            }
            if (next==null){
                return null;
            }
            return deleteDuplicates(next);
        }
        return head;
    }
    public ListNode deleteDuplicates1(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        Stack<ListNode> stack=new Stack<>();
        int temp=Integer.MAX_VALUE;
        while(head!=null){
            if (temp==head.val){
                while (!stack.isEmpty()&&temp==stack.peek().val){
                    stack.pop();
                }
                head=head.next;
                continue;
            }
            else {
                temp=head.val;
                stack.push(head);
            }
            head=head.next;
        }
        ListNode pre=null;
        while (!stack.isEmpty()){
            ListNode poll = stack.pop();
            poll.next=pre;
            pre=poll;
        }
        return pre;
    }
}
