import java.util.Arrays;

public class shenxinfu_1 {
    public int[] shuffle (int[] arr, int i) {
        int[] one = Arrays.copyOfRange(arr, i, arr.length);
        int[] two = Arrays.copyOfRange(arr, 0, i);
        int[] result = new int[arr.length];
        int m=0,n=0,index=0;
        while (m<one.length&&n<two.length){
            result[index++]=two[n++];
            result[index++]=one[m++];
        }
        while (m<one.length){
            result[index++]=one[m++];
        }
        while (n<two.length){
            result[index++]=two[n++];
        }
        return result;
    }

    public static void main(String[] args) {
        new shenxinfu_1().shuffle(new int[]{9,3,4,3,5,6},4);
    }
}
