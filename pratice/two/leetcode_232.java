package pratice.two;

import java.util.Stack;

public class leetcode_232 {
    class MyQueue {
        Stack<Integer> one;
        Stack<Integer> two;
        /** Initialize your data structure here. */
        public MyQueue() {
            one=new Stack<>();
            two=new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            one.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (two.isEmpty()){
                if (one.isEmpty()){
                    return -1;
                }
                while (!one.isEmpty()){
                    two.push(one.pop());
                }
            }
            return two.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (two.isEmpty()){
                if (one.isEmpty()){
                    return -1;
                }
                while (!one.isEmpty()){
                    two.push(one.pop());
                }
            }
            return two.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return one.isEmpty()&&two.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
