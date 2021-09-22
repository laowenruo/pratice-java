import java.util.Stack;

public class leetcode_232 {
    class MyQueue {
        private Stack<Integer> one;
        private Stack<Integer> two;
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
                while (!one.isEmpty()){
                    two.push(one.pop());
                }
            }
            return two.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (two.isEmpty()){
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
}
