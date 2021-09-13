import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_111 {
    public static void main(String[] args) {
        int[] nums=new int[]{2, 3, 1, 8, 9, 20, 12};
        int n= nums.length;
        int[] leftMax=new int[n];
        int[] RightMin=new int[n];
        Arrays.fill(RightMin,Integer.MAX_VALUE);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(nums[i-1],leftMax[i-1]);
        }
        for (int i=n-2; i >= 0;i--){
            RightMin[i]=Math.min(nums[i+1],RightMin[i+1]);
        }
        for (int i = 0; i < n; i++) {
            if (leftMax[i]<nums[i]&&nums[i]<RightMin[i]){
                list.add(nums[i]);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
