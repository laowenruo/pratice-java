package three;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ryan_coder
 */
public class leetcode_4 {
    public static void main(String[] args) {
        System.out.println(new leetcode_4().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
    public int count=0;
    PriorityQueue<Integer> min=new PriorityQueue<>((Integer::compareTo));
    PriorityQueue<Integer> max=new PriorityQueue<>((Comparator.reverseOrder()));
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        add(nums1);
        add(nums2);
        if (max.size()!= min.size()){
            return max.size()>min.size()?max.peek(): min.peek();
        }else {
            return (max.peek()+min.peek())/2.0;
        }
    }
    private void add(int[] nums){
        int i=0;
        while (i<nums.length){
            if (count%2==0){
                max.add(nums[i++]);
                min.add(max.poll());
            }else {
                min.add(nums[i++]);
                max.add(min.poll());
            }
            count++;
        }
    }
}
