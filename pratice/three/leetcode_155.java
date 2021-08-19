package three;

import java.util.Stack;

/**
 * @author ryan_coder
 */
public class leetcode_155 {
    class MinStack {
        Stack<Integer> num;
        Stack<Integer> min;
        /** initialize your data structure here. */
        public MinStack(){
            num=new Stack<>();
            min=new Stack<>();
        }

        public void push(int val) {
            num.push(val);
            if (min.isEmpty()){
                min.push(val);
            }else {
                min.push(Math.min(val,min.peek()));
            }
        }

        public void pop() {
            num.pop();
            min.pop();
        }

        public int top() {
            return num.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
}
