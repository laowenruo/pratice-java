public class leetcode_69 {
    public static void main(String[] args) {
        double x=15;
        double a=x/2.0;
        while (true){
            if (Math.abs(a*a-x)<=1e-10){
                System.out.println(a);
                return;
            }
            a=(a+x/a)/2.0;
        }
    }
    public int mySqrt(int x) {
        if (x==1||x==0){
            return x;
        }
        long a=x/2;
        while (a*a>x){
            a=(a+x/a)/2;
        }
        return (int) a;
    }
}
