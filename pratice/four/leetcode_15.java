import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                break;
            }
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int target=0-nums[i];
            int left=i+1;
            int right= nums.length-1;
            while (left<right){
                int sum=nums[left] + nums[right];
                if (sum== target) {
                    lists.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;right--;
                    while (left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right+1]){
                        right--;
                    }
                }else if (sum>target){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return lists;
    }
}
