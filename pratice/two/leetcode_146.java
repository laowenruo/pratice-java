package pratice.two;

import java.util.HashMap;
import java.util.LinkedList;

public class leetcode_146 {
    private class Node{
        Node prev;
        Node next;
        int val;
        int key;
        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    private class Doublelist{
        Node head=new Node(0,0);
        Node tail=new Node(0,0);
        int size;
        public Doublelist(){
            head.next=tail;
            tail.prev=head;
            size=0;
        }
        private void addFirst(Node n){
            Node temp=head.next;
            n.next=temp;
            temp.prev=n;
            head.next=n;
            n.prev=head;
            size++;
        }
        private void remove(Node n){
            n.prev.next=n.next;
            n.next.prev=n.prev;
            size--;
        }
        private Node removeLast(){
            Node last=tail.prev;
            remove(last);
            return last;
        }
        private int size(){
            return size;
        }
    }
    private HashMap<Integer,Node> map;
    private Doublelist cache;
    private int capacity;
    public leetcode_146(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>(capacity);
        cache=new Doublelist();
    }

    public int get(int key) {
        if (map.containsKey(key)){
            int val = map.get(key).val;
            put(key,val);
            return val;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Node n=new Node(key,value);
        if (map.containsKey(key)){
            cache.remove(map.get(key));
            cache.addFirst(n);
            map.put(key,n);
        }else {
            if (cache.size==capacity){
                Node last=cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(n);
            map.put(key,n);
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */