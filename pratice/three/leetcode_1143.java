package three;

/**
 * @author ryan_coder
 */
public class leetcode_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] chars = text1.toCharArray();
        char[] chars1 = text2.toCharArray();
        int m=chars.length;
        int n=chars1.length;
        int[][] dp=new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int i1 = 1; i1 <= n; i1++) {
                if (chars[i-1]==chars1[i1-1]){
                    dp[i][i1]=dp[i-1][i1-1]+1;
                }else {
                    dp[i][i1]=Math.max(dp[i-1][i1],dp[i][i1-1]);
                }
            }
        }
        return dp[m][n];
    }
}
