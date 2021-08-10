package pratice.two;

import java.util.Arrays;

public class leetcode_300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        int max=Integer.MIN_VALUE;
        Arrays.fill(dp,1);
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < i; i1++) {
                if (nums[i]>=nums[i1]){
                    dp[i]=Math.max(dp[i1]+1,dp[i]);
                }
                max=Math.max(dp[i],max);
            }
        }
        return max;
    }
}
