package pratice.two;

import java.util.Stack;

public class leetcode_42 {
    public int trap(int[] height) {
        if(height==null||height.length<3){
            return 0;
        }
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()&&height[stack.peek()]<height[i]){
                //次栈顶元素
                Integer pop = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int currentWidth = i - stack.peek() - 1;
                int currentHeight = Math.min(height[i], height[stack.peek()]) - height[pop];
                sum += currentWidth * currentHeight;
            }
            stack.push(i);
        }
        return sum;
    }
}
