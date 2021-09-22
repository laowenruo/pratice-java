public class leetcode_53 {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int num : nums) {
            sum=sum+num;
            max=Math.max(sum,max);
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }
}