import java.util.Scanner;

public class xiaomi_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] split = in.nextLine().split(",");
        int m=Integer.parseInt(split[0].replace("m=",""));
        int n=Integer.parseInt(split[1].replace("n=",""));
        int[] temp=new int[m];
        int[] temp1=new int[n];
        int i=0;
        int j=0;
        for (String s : in.nextLine().split(",")) {
            temp[i++]=Integer.parseInt(s);
        }
        for (String s : in.nextLine().split(",")) {
            temp1[j++]=Integer.parseInt(s);
        }
        int[] result=new int[m+n];
        i=0;j=0;
        int index=0;
        while (i<=m-1&&j<=n-1){
            if (temp[i]<=temp1[j]){
                result[index++]=temp[i++];
            }else {
                result[index++]=temp1[j++];
            }
        }
        while (i<=m-1){
            result[index++]=temp[i++];
        }
        while (j<=n-1){
            result[index++]=temp1[j++];
        }
        for (int i1 : result) {
            if (i1==result[m+n-1]){
                System.out.println(i1);
                break;
            }else {
                System.out.print(i1+" ");
            }
        }
    }
}
