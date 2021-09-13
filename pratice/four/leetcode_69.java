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
}
