package pratice.two;

public class leetcode_4_other {

    public int[] sortArray(int[] nums) {
        partition(nums,0,nums.length-1);
        return nums;
    }
    public void partition(int[] nums,int i,int j){
        if (i>=j){
            return;
        }
        int pivot=nums[j];
        int n=i,m=j;
        while (n<m){
            while (n<m&&nums[n]<=pivot){
                n++;
            }
            if (n<m){
                nums[m]=nums[n];
            }
            while (n<m&&nums[m]>=pivot){
                m--;
            }
            if (n<m){
                nums[n]=nums[m];
            }
        }
        nums[n]=pivot;
        partition(nums,i,n-1);
        partition(nums,n+1,j);
    }
}
