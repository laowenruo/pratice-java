package three;

/**
 * @author ryan_coder
 */
public class leetcode_718 {
    public int findLength(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int[][] dp=new int[n+1][m+1];
        int max=0;
        for (int i = 0; i < nums1.length; i++) {
            for (int i1 = 0; i1 < nums2.length; i1++) {
                if (nums1[i]==nums2[i1]){
                    dp[i+1][i1+1]=dp[i][i1]+1;
                }else {
                    dp[i+1][i1+1]=0;
                }
                max=Math.max(dp[i+1][i1+1],max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new leetcode_718().findLength(new int[]{1,2,3,2,1},new int[]{3,2,1,4,7});
    }
}
