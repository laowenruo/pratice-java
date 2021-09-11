import java.util.Arrays;

/**
 * @author Ryan
 */
public class leetcode_31 {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length-1 ;i > 0; i--) {
            if (nums[i]>nums[i-1]){
                Arrays.sort(nums,i,nums.length);
                for (int j = i; j <= nums.length-1; j++) {
                    if (nums[i-1]<nums[j]){
                        swap(nums,i-1,j);
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
    }

    private void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
