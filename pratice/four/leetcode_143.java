import java.util.ArrayList;

/**
 * @author Ryan
 */
public class leetcode_143 {
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        ArrayList<ListNode> listNodes=new ArrayList<>();
        ListNode temp=head;
        while (temp!=null){
            listNodes.add(temp);
            temp=temp.next;
        }
        int i=0,j=listNodes.size()-1;
        while (i<j){
            ListNode node_temp=listNodes.get(i).next;
            listNodes.get(j-1).next=null;
            listNodes.get(i).next= listNodes.get(j);
            listNodes.get(j).next=node_temp;
            i++;j--;
        }
        listNodes.get(i).next=null;
    }
}
