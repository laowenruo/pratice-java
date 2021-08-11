package pratice.one.one;


import java.util.ArrayList;

public class ncJZ3 {
    private ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode==null){
            return list;
        }else {
            add(listNode);
        }
        return list;
    }
    public void add(ListNode listNode){
        if (listNode==null){
            return;
        }
        add(listNode.next);
        list.add(listNode.val);
    }
}
