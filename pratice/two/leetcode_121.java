package pratice.two;

public class leetcode_121 {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=prices[0];
        for (int i = 1; i < prices.length; i++) {
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
