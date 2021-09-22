import java.util.HashMap;

public class leetcode_146 {
    private class Node{
        Node prev;
        Node next;
        int val;
        int key;
        public Node(int key,int val){
            this.val=val;
            this.key=key;
        }
    }
    private class DoubleList{
        Node head=new Node(0,0);
        Node tail=new Node(0,0);
        int size;
        public DoubleList(){
            head.next=tail;
            tail.prev=head;
            size=0;
        }
        private void addFirst(Node node){
            Node temp=head.next;
            node.next=temp;
            temp.prev=node;
            head.next=node;
            node.prev=head;
            size++;
        }
        private void remove(Node node){
            node.prev.next=node.next;
            node.next.prev=node.prev;
            size--;
        }
        private Node removeLast(){
            Node temp=tail.prev;
            remove(temp);
            return temp;
        }
    }

    private HashMap<Integer,Node> map;
    private DoubleList cache;
    private int capacity;
    public leetcode_146(int capacity) {
        map=new HashMap<>(capacity);
        cache=new DoubleList();
        this.capacity=capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)){
            int value=map.get(key).val;
            put(key,value);
            return value;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Node temp=new Node(key,value);
        if (map.containsKey(key)){
            cache.remove(map.get(key));
        }else {
            if (cache.size==capacity){
                Node last=cache.removeLast();
                map.remove(last.key);
            }
        }
        cache.addFirst(temp);
        map.put(key,temp);
    }
}
