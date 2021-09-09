import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ryan
 */
public class shunfen_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }
        int count=0;
        int sum=0;
        Arrays.sort(nums);
        for (int i = nums.length-1; i >=0; i--) {
            sum=nums[i]+sum;
            count++;
            if (sum<0){
                System.out.println(count-1);
                return;
            }
        }
    }
}
