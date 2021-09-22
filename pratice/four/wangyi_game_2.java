import java.util.Scanner;

public class wangyi_game_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (i--!=0){
            int n=in.nextInt();
            int m=in.nextInt();
            int[] nums=new int[n];
            int max=0;
            for (int j = 0; j < n; j++) {
                nums[j]= in.nextInt();
                max=Math.max(max,nums[j]);
            }
            System.out.println(nums[m-1]==max?0:max-1);
        }
    }
}
