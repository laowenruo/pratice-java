import java.util.Arrays;

public class muisc_3 {
    public static void main(String[] args) {
        System.out.println(new muisc_3().minM(10, 10));
    }
    public long minM (int n, int k) {
        // write code here
        int[] ints = new int[k+1];
        int[] numbers=new int[k+1];
        for (int i = 1; i <=k; i++) {
            ints[i]=i;
            int temp=i;
            int index=0;
            while (temp!=0){
                if (temp%k==1){
                    index++;
                }
                temp=temp/k;
            }
            numbers[i]=numbers[i-1]+index;
        }
        int[] result = Arrays.copyOfRange(numbers, 0, k + 1);
        int tries=0;
        while (n>numbers[k]){
            for (int i = 1; i < numbers.length; i++) {
                if (i==1){
                    numbers[i]=numbers[k]+result[i];
                    continue;
                }
                numbers[i]=numbers[i-1]+result[i];
            }
            tries++;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>=n){
                return tries*k+i-1;
            }
        }
        return 0;
    }
}
