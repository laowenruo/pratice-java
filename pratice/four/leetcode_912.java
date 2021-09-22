public class leetcode_912 {
    public int[] sortArray(int[] nums) {
        sort(nums,0, nums.length-1);
        return nums;
    }
    public void sort(int[] nums,int left,int right){
        if (left<right){
            int pivot=nums[right];
            int i=left,j=right;
            while (i<j){
                while (i<j&&nums[i]<=pivot) { i++;}
                nums[j]=nums[i];
                while (i<j&&nums[j]>=pivot) { j--;}
                nums[i]=nums[j];
            }
            nums[i]=pivot;
            sort(nums,left,i-1);
            sort(nums,i+1,right);
        }
    }
}
