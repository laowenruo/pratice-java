package three;

import java.util.Stack;

/**
 * @author ryan_coder
 */
public class leetcode_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        while (head != null) {
            if (head.val != stack.pop().val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public boolean isPalindrome1(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if (fast!=null){
            slow=slow.next;
        }
        ListNode reverse = reverse(slow);
        while (reverse!=null){
            if (reverse.val!=head.val){
                return false;
            }
            reverse=reverse.next;
            head=head.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while (head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}