public class vip_2 {
    public int maxProfit (int[] prices) {
        // write code here
        int min=prices[0];
        int sum=0;
        for (int i = 1; i < prices.length; i++) {
            int temp=prices[i]-min;
            min=Math.min(min,prices[i]);
            sum=Math.max(temp,sum);
        }
        return sum;
    }
}
