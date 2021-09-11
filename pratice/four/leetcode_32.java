import java.util.Stack;

public class leetcode_32 {
    public static int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        int max=0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i]==')'){
                if (chars[i-1]=='('){
                    dp[i]=i>2?dp[i-2]+2:0;
                }
            }
        }
        return max;
    }
}
