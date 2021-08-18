package three;

/**
 * @author ryan_coder
 */
public class leetcode_69 {
    public static void main(String[] args) {
        System.out.println(new leetcode_69().mySqrt(9));
    }
    public int mySqrt(int x) {
        double high=x;
        double low=0;
        while (low < high) {
            double mid=low+(high-low)/2.0;
            if (Math.abs(mid*mid-x)<=0.000001){
                return (int) mid;
            }
            if (mid*mid<x){
                low=mid;
            }else {
                high=mid;
            }
        }
        return 0;
    }
}
