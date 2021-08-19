package three;

import java.util.HashSet;

/**
 * @author ryan_coder
 */
public class leetcode_41 {
    public int firstMissingPositive(int[] nums){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        for (int i=1;i< nums.length;i++){
            if (!hashSet.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }
    public int firstMissingPositive1(int[] nums){
        int n= nums.length;
        for (int i=0;i<n;i++){
            while (nums[i]>0&&nums[i]<=n&&nums[nums[i]-1]!=nums[i]){
                swap(nums,nums[i]-1,i);
            }
        }
        for (int i=0;i<n;i++){
            if (i+1!=nums[i]){
                return i+1;
            }
        }
        return n+1;
    }

    private void swap(int[] nums, int i, int i1) {
        int temp=nums[i];
        nums[i]=nums[i1];
        nums[i1]=temp;
    }
}
