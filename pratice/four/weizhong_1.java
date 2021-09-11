import java.util.Scanner;

public class weizhong_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n>0){
            int k= in.nextInt();
            get(k);
            n--;
        }
    }
    public static void get(int k){
        for (int x=1;x<200;x++){
            for (int y=1;y<=x;y++){
                for (int z=1;z<=y;z++){
                    int result= (int) (Math.pow(x,3)+Math.pow(y,4)+Math.pow(z,5));
                    if (result==k){
                        System.out.println("YES");
                        return;
                    }else if (result>k){
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
    }
}
