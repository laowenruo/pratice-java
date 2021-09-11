import java.util.Scanner;

/**
 * @author Ryan
 */
public class leetcode_byte2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int[][] dp=new int[a+1][a+1];
        dp[0][0]=1;
        for (int i = 1; i < dp.length; i++) {
            for (int i1 = 0; i1 < dp[0].length; i1++) {
                dp[i][i1]=dp[i-1][(i1-1+a)%a]+dp[i-1][(i1+1)%a];
            }
        }
        System.out.println(dp[2][0]);
    }
}
