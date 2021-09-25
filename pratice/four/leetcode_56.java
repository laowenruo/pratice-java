import java.util.Arrays;

public class leetcode_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(o1, o2) ->o1[0]-o1[0]);
        int[][] nums=new int[intervals.length][2];
        int index=-1;
        for (int i = 0; i < intervals.length; i++) {
            if (index==-1||nums[index][1]<intervals[i][0]){
                nums[++index]=intervals[i];
            }else {
                nums[index][i]=Math.max(intervals[i][1],nums[index][1]);
            }
        }
        return Arrays.copyOf(nums,index+1);
    }
}
