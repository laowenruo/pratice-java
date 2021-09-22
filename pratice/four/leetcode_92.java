public class leetcode_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode begin=dummy;
        for (int i = 1; i < left; i++) {
            begin=begin.next;
        }
        ListNode end=begin;
        for (int i = left; i <=right; i++) {
            end=end.next;
        }
        ListNode node_begin=begin.next;
        ListNode node_end=end.next;
        begin.next=null;
        end.next=null;
        begin.next=reversed(node_begin);
        node_begin.next=node_end;
        return dummy.next;
    }
    private ListNode reversed(ListNode node){
        if (node==null){
            return null;
        }
        ListNode prev=null;
        while (node!=null){
            ListNode temp=node.next;
            node.next=prev;
            prev=node;
            node=temp;
        }
        return prev;
    }
}
