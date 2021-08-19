package three;

/**
 * @author ryan_coder
 */
public class leetcode_72 {
    public int minDistance(String word1, String word2) {
        char[] chars = word1.toCharArray();
        char[] chars1 = word2.toCharArray();
        int m=chars.length;
        int n=chars1.length;
        int[][] dp=new int[n+1][m+1];
        for (int i=0;i<=m;i++){
            dp[0][i]=i;
        }
        for (int j=0;j<=n;j++){
            dp[j][0]=j;
        }
        for (int i=1;i<=chars.length;i++){
            for (int j=1;j<=chars1.length;j++){
                if (chars[i-1]==chars1[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[n][m];
    }
}