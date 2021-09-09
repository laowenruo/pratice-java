import java.util.Stack;

/**
 * @author Ryan
 */
public class leetcode_42 {
    public int trap(int[] height) {
        if (height==null){
            return 0;
        }
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()&&height[stack.peek()]<height[i]) {
                Integer pop = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int current_width=i-stack.peek()-1;
                int current_height=Math.min(height[i],height[stack.peek()])-pop;
                sum+=current_height*current_width;
            }
            stack.push(i);
        }
        return sum;
    }
}
