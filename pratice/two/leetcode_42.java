package pratice.two;

import java.util.Stack;

public class leetcode_42 {
    public int trap(int[] height) {
//        输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
//        输出：6
        if(height==null){
            return 0;
        }
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()&&height[stack.peek()]<height[i]){
                int current=stack.pop();
                while (!stack.isEmpty()&&height[current]==height[stack.peek()]){
                    stack.pop();
                }
                if (!stack.isEmpty()){
                    int index=stack.peek();
                    sum=sum+(Math.min(height[i],height[index])-height[current])*(i-index-1);
                }
            }
            stack.add(i);
        }
        return sum;
    }
}
