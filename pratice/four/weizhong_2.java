import java.util.Scanner;

public class weizhong_2 {
    static boolean left=false;
    static boolean right=false;
    static boolean top=false;
    static boolean bottom=false;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int x= in.nextInt();
        int y= in.nextInt();
        int[][] nums=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j]= in.nextInt();
            }
        }
        char[] chars = in.next().toCharArray();
        int start_x=0;
        int start_y=0;
        int sum=0;
        for (int i = 0; i < chars.length; i++) {
            int before=nums[start_x][start_y];
            if (chars[i]=='k'){
                start_x--;
                if (!top){
                    sum=sum+x;
                    left=false;
                    right=false;
                    bottom=false;
                }
                top=true;
            }else if (chars[i]=='j'){
                start_x++;
                if (!bottom){
                    sum=sum+x;
                    left=false;
                    right=false;
                    top=false;
                }
                bottom=true;
            }else if (chars[i]=='l'){
                start_y++;
                if (!right){
                    sum=sum+x;
                    left=false;
                    top=false;
                    bottom=false;
                }
                right=true;
            }else if (chars[i]=='h'){
                start_y--;
                if (!left){
                    sum=sum+x;
                    top=false;
                    right=false;
                    bottom=false;
                }
                left=true;
            }

            if (start_x>=n){
                sum+=y;
                start_x--;
            }else if (start_x<0){
                sum+=y;
                start_x++;
            } else if (start_y>=m){
                sum+=y;
                start_y--;
            }else if (start_y<0){
                sum+=y;
                start_y++;
            } else if (nums[start_x][start_y]==-1){
                sum+=y;
            } else{
                sum=sum+Math.max(before,nums[start_x][start_y]);
            }
        }
        System.out.println(sum-x);
    }
}
