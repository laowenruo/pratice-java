import java.util.Scanner;

/**
 * @author Ryan
 */
public class shunfen_1 {
    public static String str="1111111111";
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            int temp= in.nextInt();
            int weight=getNumber(temp);
            while (temp!=0&&weight!=0){
                int num=get(weight);
                if (num>temp){
                    num=get(weight-1);
                }
                temp=temp-num;
                weight=getNumber(temp);
            }
            if (temp==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int getNumber(int nums){
        int temp=nums;
        int weight=0;
        while (temp!=0){
            temp=temp/10;
            weight++;
        }
        if (weight==1){
            return 0;
        }
        return weight;
    }
    public static int get(int weight){
        return Integer.parseInt(str.substring(0,weight));
    }
}
