package three;

/**
 * @author ryan_coder
 */
public class leetcode_169 {
    public int majorityElement(int[] nums) {
        if (nums==null||nums.length==0){
            return -1;
        }
        int num=nums[0];
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if (num==nums[i]){
                count++;
            }else {
                count--;
                if (count==0){
                    count=1;
                    num=nums[i];
                }
            }
        }
        return num;
    }
}
