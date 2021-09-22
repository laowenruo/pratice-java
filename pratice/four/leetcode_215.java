import java.util.PriorityQueue;

public class leetcode_215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> integers=new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            integers.offer(nums[i]);
            if (integers.size()>k){
                integers.poll();
            }
        }
        return integers.peek();
    }
}
