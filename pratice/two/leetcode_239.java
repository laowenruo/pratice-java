import java.util.LinkedList;

public class leetcode_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null||nums.length<2){
            return nums;
        }
        LinkedList<Integer> lists=new LinkedList<>();
        int[] result=new int[nums.length-k+1];
        for (int i = 0; i < nums.length; i++) {
            while (!lists.isEmpty()&&nums[lists.peekLast()]<nums[i]){
                lists.pollLast();
            }
            lists.add(i);
            if (lists.peek()<=i-k){
                lists.poll();
            }
            if (i-k+1>=0){
                result[i-k+1]=nums[lists.peek()];
            }
        }
        return result;
    }

}
