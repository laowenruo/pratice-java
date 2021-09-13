import org.w3c.dom.Node;

public class leetcode_linklist {
    class Node{
        volatile int val;
        volatile Node next;
        volatile Node prev;
        public Node(int val){
            this.val=val;
        }
    }
    volatile Node head=new Node(-1);
    volatile Node tail=new Node(-1);
    volatile int size=0;
    public leetcode_linklist(){
        head.next=tail;
        tail.prev=head;
        size=0;
    }
    public void addFirst(Node n){
        synchronized (head){
            Node temp=head.next;
            n.next=temp;
            temp.prev=n;
            head.next=n;
            n.prev=head;
            size++;
        }
    }
    public void remove(Node n){
        synchronized (n){
            n.prev.next=n.next;
            n.next.prev=n.prev;
            size--;
        }
    }
    public Node removeLast(){
        Node temp=tail.prev;
        remove(temp);
        return temp;
    }
    public int getSize(){
        return size;
    }
}
