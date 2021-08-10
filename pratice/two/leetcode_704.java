package pratice.two;

public class leetcode_704 {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while (i<j){
            int middle=i+(j-i)/2;
            int value=nums[middle];
            if (value==target){
                return middle;
            }else if (value>target){
                j=middle-1;
            }else {
                i=middle+1;
            }
        }
        return -1;
    }
}
