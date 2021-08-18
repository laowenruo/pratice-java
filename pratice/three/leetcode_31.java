package three;

import java.util.Arrays;

/**
 * @author ryan_coder
 */
public class leetcode_31 {

    public void nextPermutation(int[] nums) {
        int n= nums.length;
        for (int i=n-1;i>0;i--){
            if (nums[i]>nums[i-1]){
                Arrays.sort(nums,i,n);
                for (int j=i;j<n;j++){
                    if (nums[i-1]<nums[j]){
                        swap(i-1,j,nums);
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return;
    }
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
